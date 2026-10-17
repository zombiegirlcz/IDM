package kj0;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes19.dex */
public final class l extends CallAdapter.Factory {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f184271c;
    public final kh4.b d;
    public final Function1 f;

    public l(List domains, Function1 requestToCircuitBreaker) {
        kh4.b responseSuccess = new kh4.b(16);
        Intrinsics.checkNotNullParameter(domains, "domains");
        Intrinsics.checkNotNullParameter(responseSuccess, "responseSuccess");
        Intrinsics.checkNotNullParameter(requestToCircuitBreaker, "requestToCircuitBreaker");
        this.f184271c = domains;
        this.d = responseSuccess;
        this.f = requestToCircuitBreaker;
    }

    @Override // retrofit2.CallAdapter.Factory
    public final CallAdapter get(Type returnType, Annotation[] annotations, Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        CallAdapter<?, ?> callAdapterNextCallAdapter = retrofit.nextCallAdapter(this, returnType, annotations);
        Intrinsics.i(callAdapterNextCallAdapter, "null cannot be cast to non-null type retrofit2.CallAdapter<kotlin.Any?, kotlin.Any?>");
        return new a5h.g(callAdapterNextCallAdapter, this.f184271c, this.d, this.f);
    }
}
