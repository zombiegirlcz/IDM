package sz3;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import k7i.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends CallAdapter.Factory {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final py3.b f266750c;

    public c(py3.b bVar) {
        this.f266750c = bVar;
    }

    @Override // retrofit2.CallAdapter.Factory
    public final CallAdapter get(Type returnType, Annotation[] annotations, Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        if (!Intrinsics.f(CallAdapter.Factory.getRawType(returnType), Call.class) || !(returnType instanceof ParameterizedType)) {
            return null;
        }
        Type parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) returnType);
        Intrinsics.checkNotNullExpressionValue(parameterUpperBound, "getParameterUpperBound(...)");
        return new i(parameterUpperBound, this.f266750c);
    }
}
