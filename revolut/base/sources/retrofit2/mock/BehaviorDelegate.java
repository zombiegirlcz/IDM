package retrofit2.mock;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;
import retrofit2.Call;
import retrofit2.KotlinExtensions;
import retrofit2.Response;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes14.dex */
public final class BehaviorDelegate<T> {
    private final NetworkBehavior behavior;
    private final ExecutorService executor;
    final Retrofit retrofit;
    private final Class<T> service;

    public static final class CallParameterizedTypeImpl implements ParameterizedType {
        private final Type bodyType;

        public CallParameterizedTypeImpl(Type type) {
            this.bodyType = type;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return new Type[]{this.bodyType};
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return null;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return Call.class;
        }
    }

    public static class ServiceMethodAdapterInfo {
        final boolean isSuspend;
        final Type responseType;
        final boolean wantsResponse;

        public ServiceMethodAdapterInfo(boolean z, boolean z3, Type type) {
            this.isSuspend = z;
            this.wantsResponse = z3;
            this.responseType = type;
        }
    }

    public BehaviorDelegate(Retrofit retrofit, NetworkBehavior networkBehavior, ExecutorService executorService, Class<T> cls) {
        this.retrofit = retrofit;
        this.behavior = networkBehavior;
        this.executor = executorService;
        this.service = cls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$returning$0(Call call, Object obj2, Method method, Object[] objArr) throws Throwable {
        ServiceMethodAdapterInfo serviceMethodAdapterInfo = parseServiceMethodAdapterInfo(method);
        Object objAdapt = this.retrofit.callAdapter(serviceMethodAdapterInfo.responseType, method.getAnnotations()).adapt(call);
        if (!serviceMethodAdapterInfo.isSuspend) {
            return objAdapt;
        }
        Call call2 = (Call) objAdapt;
        Continuation continuation = (Continuation) objArr[objArr.length - 1];
        try {
            return serviceMethodAdapterInfo.wantsResponse ? KotlinExtensions.awaitResponse(call2, continuation) : KotlinExtensions.await(call2, continuation);
        } catch (Exception e) {
            return KotlinExtensions.suspendAndThrow(e, continuation);
        }
    }

    private static ServiceMethodAdapterInfo parseServiceMethodAdapterInfo(Method method) {
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        if (genericParameterTypes.length != 0) {
            Type type = genericParameterTypes[genericParameterTypes.length - 1];
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                try {
                    if (parameterizedType.getRawType() == Continuation.class) {
                        Type type2 = parameterizedType.getActualTypeArguments()[0];
                        if (type2 instanceof WildcardType) {
                            type2 = ((WildcardType) type2).getLowerBounds()[0];
                        }
                        if (type2 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                            if (parameterizedType2.getRawType() == Response.class) {
                                return new ServiceMethodAdapterInfo(true, true, new CallParameterizedTypeImpl(parameterizedType2.getActualTypeArguments()[0]));
                            }
                        }
                        return new ServiceMethodAdapterInfo(true, false, new CallParameterizedTypeImpl(type2));
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
        }
        return new ServiceMethodAdapterInfo(false, false, method.getGenericReturnType());
    }

    public <R> T returning(Call<R> call) {
        final BehaviorCall behaviorCall = new BehaviorCall(this.behavior, this.executor, call);
        return (T) Proxy.newProxyInstance(this.service.getClassLoader(), new Class[]{this.service}, new InvocationHandler() { // from class: retrofit2.mock.a
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj2, Method method, Object[] objArr) {
                return this.f253660a.lambda$returning$0(behaviorCall, obj2, method, objArr);
            }
        });
    }

    public T returningResponse(Object obj2) {
        return returning(Calls.response(obj2));
    }
}
