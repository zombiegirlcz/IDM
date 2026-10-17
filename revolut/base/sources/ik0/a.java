package ik0;

import e8.i0;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;
import retrofit2.SkipCallbackExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class a extends CallAdapter.Factory {
    @Override // retrofit2.CallAdapter.Factory
    public final CallAdapter get(Type returnType, Annotation[] annotations, Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        if (!Intrinsics.f(CallAdapter.Factory.getRawType(returnType), Call.class) || !(returnType instanceof ParameterizedType)) {
            return null;
        }
        boolean z = false;
        Type parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) returnType);
        Intrinsics.checkNotNullExpressionValue(parameterUpperBound, "getParameterUpperBound(...)");
        int length = annotations.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (annotations[i] instanceof SkipCallbackExecutor) {
                z = true;
                break;
            }
            i++;
        }
        return new i0(parameterUpperBound, z);
    }
}
