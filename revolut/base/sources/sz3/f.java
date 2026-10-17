package sz3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends CallAdapter.Factory {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final py3.b f266753c;
    public final RxJava2CallAdapterFactory d;

    public f(py3.b creditApplicationErrorHandlerChecker) {
        Intrinsics.checkNotNullParameter(creditApplicationErrorHandlerChecker, "creditApplicationErrorHandlerChecker");
        this.f266753c = creditApplicationErrorHandlerChecker;
        this.d = RxJava2CallAdapterFactory.create();
    }

    @Override // retrofit2.CallAdapter.Factory
    public final CallAdapter get(Type returnType, Annotation[] annotations, Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        CallAdapter<?, ?> callAdapter = this.d.get(returnType, annotations, retrofit);
        if (callAdapter == null) {
            return null;
        }
        return new kdh.b(callAdapter, this.f266753c);
    }
}
