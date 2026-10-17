package androidx.window.core;

import android.app.Activity;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\u000f\u001a\u00020\u0001\"\b\b\u0000\u0010\t*\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\bJ[\u0010\u001a\u001a\u00020\u0019\"\b\b\u0000\u0010\t*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001c¨\u0006\u001f"}, d2 = {"Landroidx/window/core/ConsumerAdapter;", "", "Ljava/lang/ClassLoader;", "loader", "<init>", "(Ljava/lang/ClassLoader;)V", "Ljava/lang/Class;", "unsafeConsumerClass", "()Ljava/lang/Class;", "T", "Lkotlin/reflect/KClass;", "clazz", "Lkotlin/Function1;", "", "consumer", "buildConsumer", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "consumerClassOrNull$window_release", "consumerClassOrNull", "obj", "", "addMethodName", "removeMethodName", "Landroid/app/Activity;", "activity", "Landroidx/window/core/ConsumerAdapter$Subscription;", "createSubscription", "(Ljava/lang/Object;Lkotlin/reflect/KClass;Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Lkotlin/jvm/functions/Function1;)Landroidx/window/core/ConsumerAdapter$Subscription;", "Ljava/lang/ClassLoader;", "Subscription", "ConsumerHandler", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConsumerAdapter {

    @NotNull
    private final ClassLoader loader;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0010\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0002\u0010\u0014J#\u0010\u0015\u001a\u00020\u0016*\u00020\u000e2\u0010\u0010\u0017\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u0010H\u0002¢\u0006\u0002\u0010\u0018J#\u0010\u0019\u001a\u00020\u0016*\u00020\u000e2\u0010\u0010\u0017\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u0010H\u0002¢\u0006\u0002\u0010\u0018J#\u0010\u001a\u001a\u00020\u0016*\u00020\u000e2\u0010\u0010\u0017\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u0010H\u0002¢\u0006\u0002\u0010\u0018J#\u0010\u001b\u001a\u00020\u0016*\u00020\u000e2\u0010\u0010\u0017\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u0010H\u0002¢\u0006\u0002\u0010\u0018R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Landroidx/window/core/ConsumerAdapter$ConsumerHandler;", "T", "", "Ljava/lang/reflect/InvocationHandler;", "clazz", "Lkotlin/reflect/KClass;", "consumer", "Lkotlin/Function1;", "", "<init>", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "invoke", "obj", "method", "Ljava/lang/reflect/Method;", "parameters", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "invokeAccept", "parameter", "(Ljava/lang/Object;)V", "isEquals", "", "args", "(Ljava/lang/reflect/Method;[Ljava/lang/Object;)Z", "isHashCode", "isAccept", "isToString", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ConsumerHandler<T> implements InvocationHandler {

        @NotNull
        private final KClass clazz;

        @NotNull
        private final Function1<T, Unit> consumer;

        /* JADX WARN: Multi-variable type inference failed */
        public ConsumerHandler(@NotNull KClass clazz, @NotNull Function1<? super T, Unit> consumer) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            this.clazz = clazz;
            this.consumer = consumer;
        }

        private final boolean isAccept(Method method, Object[] objArr) {
            return Intrinsics.f(method.getName(), "accept") && objArr != null && objArr.length == 1;
        }

        private final boolean isEquals(Method method, Object[] objArr) {
            return Intrinsics.f(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1;
        }

        private final boolean isHashCode(Method method, Object[] objArr) {
            return Intrinsics.f(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null;
        }

        private final boolean isToString(Method method, Object[] objArr) {
            return Intrinsics.f(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.reflect.InvocationHandler
        @NotNull
        public Object invoke(@NotNull Object obj2, @NotNull Method method, Object[] parameters) {
            Intrinsics.checkNotNullParameter(obj2, "obj");
            Intrinsics.checkNotNullParameter(method, "method");
            if (isAccept(method, parameters)) {
                KClass kClass = this.clazz;
                Object obj3 = parameters != null ? parameters[0] : null;
                Intrinsics.checkNotNullParameter(kClass, "<this>");
                if (kClass.l(obj3)) {
                    Intrinsics.i(obj3, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
                    invokeAccept(obj3);
                    return Unit.f186387a;
                }
                throw new ClassCastException("Value cannot be cast to " + kClass.e());
            }
            if (isEquals(method, parameters)) {
                return Boolean.valueOf(obj2 == (parameters != null ? parameters[0] : null));
            }
            if (isHashCode(method, parameters)) {
                return Integer.valueOf(this.consumer.hashCode());
            }
            if (isToString(method, parameters)) {
                return this.consumer.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj2 + ", method: " + method + ", args: " + parameters);
        }

        public final void invokeAccept(@NotNull T parameter) {
            Intrinsics.checkNotNullParameter(parameter, "parameter");
            this.consumer.invoke(parameter);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/window/core/ConsumerAdapter$Subscription;", "", "dispose", "", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Subscription {
        void dispose();
    }

    public ConsumerAdapter(@NotNull ClassLoader loader) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        this.loader = loader;
    }

    private final <T> Object buildConsumer(KClass clazz, Function1<? super T, Unit> consumer) {
        Object objNewProxyInstance = Proxy.newProxyInstance(this.loader, new Class[]{unsafeConsumerClass()}, new ConsumerHandler(clazz, consumer));
        Intrinsics.checkNotNullExpressionValue(objNewProxyInstance, "newProxyInstance(...)");
        return objNewProxyInstance;
    }

    private final Class<?> unsafeConsumerClass() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass("java.util.function.Consumer");
        Intrinsics.checkNotNullExpressionValue(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    public final Class<?> consumerClassOrNull$window_release() {
        try {
            return unsafeConsumerClass();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @NotNull
    public final <T> Subscription createSubscription(@NotNull final Object obj2, @NotNull KClass clazz, @NotNull String addMethodName, @NotNull String removeMethodName, @NotNull Activity activity, @NotNull Function1<? super T, Unit> consumer) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(obj2, "obj");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(addMethodName, "addMethodName");
        Intrinsics.checkNotNullParameter(removeMethodName, "removeMethodName");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        final Object objBuildConsumer = buildConsumer(clazz, consumer);
        obj2.getClass().getMethod(addMethodName, Activity.class, unsafeConsumerClass()).invoke(obj2, activity, objBuildConsumer);
        final Method method = obj2.getClass().getMethod(removeMethodName, unsafeConsumerClass());
        return new Subscription() { // from class: androidx.window.core.ConsumerAdapter.createSubscription.1
            @Override // androidx.window.core.ConsumerAdapter.Subscription
            public void dispose() throws IllegalAccessException, InvocationTargetException {
                method.invoke(obj2, objBuildConsumer);
            }
        };
    }
}
