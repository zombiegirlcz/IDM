package xab;

import com.revolut.core.extensions.rx.BreadcrumbException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class l0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f303833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BreadcrumbException f303834b;

    public /* synthetic */ l0(BreadcrumbException breadcrumbException, int i) {
        this.f303833a = i;
        this.f303834b = breadcrumbException;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f303833a) {
            case 0:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                te0.w.c(error, this.f303834b);
                return efm.r.error(error);
            case 1:
                Throwable error2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error2, "error");
                te0.w.c(error2, this.f303834b);
                return efm.r.error(error2);
            default:
                Throwable error3 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error3, "error");
                te0.w.c(error3, this.f303834b);
                return efm.r.error(error3);
        }
    }
}
