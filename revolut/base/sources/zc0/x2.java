package zc0;

import com.revolut.core.extensions.rx.BreadcrumbException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f321154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BreadcrumbException f321155b;

    public /* synthetic */ x2(BreadcrumbException breadcrumbException, int i) {
        this.f321154a = i;
        this.f321155b = breadcrumbException;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f321154a) {
            case 0:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                te0.w.c(error, this.f321155b);
                return efm.b.n(error);
            case 1:
                Throwable error2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error2, "error");
                te0.w.c(error2, this.f321155b);
                return efm.r.error(error2);
            case 2:
                Throwable error3 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error3, "error");
                te0.w.c(error3, this.f321155b);
                return efm.d0.l(error3);
            case 3:
                Throwable error4 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error4, "error");
                te0.w.c(error4, this.f321155b);
                return efm.b.n(error4);
            case 4:
                Throwable error5 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error5, "error");
                te0.w.c(error5, this.f321155b);
                return efm.r.error(error5);
            case 5:
                Throwable error6 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error6, "error");
                te0.w.c(error6, this.f321155b);
                return efm.d0.l(error6);
            case 6:
                Throwable error7 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error7, "error");
                te0.w.c(error7, this.f321155b);
                return efm.r.error(error7);
            case 7:
                Throwable error8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error8, "error");
                te0.w.c(error8, this.f321155b);
                return efm.r.error(error8);
            case 8:
                Throwable error9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error9, "error");
                te0.w.c(error9, this.f321155b);
                return efm.r.error(error9);
            case 9:
                Throwable error10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error10, "error");
                te0.w.c(error10, this.f321155b);
                return efm.r.error(error10);
            case 10:
                Throwable error11 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error11, "error");
                te0.w.c(error11, this.f321155b);
                return efm.r.error(error11);
            case 11:
                Throwable error12 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error12, "error");
                te0.w.c(error12, this.f321155b);
                return efm.r.error(error12);
            case 12:
                Throwable error13 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error13, "error");
                te0.w.c(error13, this.f321155b);
                return efm.r.error(error13);
            case 13:
                Throwable error14 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error14, "error");
                te0.w.c(error14, this.f321155b);
                return efm.r.error(error14);
            case 14:
                Throwable error15 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error15, "error");
                te0.w.c(error15, this.f321155b);
                return efm.r.error(error15);
            case 15:
                Throwable error16 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error16, "error");
                te0.w.c(error16, this.f321155b);
                return efm.b.n(error16);
            case 16:
                Throwable error17 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error17, "error");
                te0.w.c(error17, this.f321155b);
                return efm.r.error(error17);
            case 17:
                Throwable error18 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error18, "error");
                te0.w.c(error18, this.f321155b);
                return efm.b.n(error18);
            default:
                Throwable error19 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error19, "error");
                te0.w.c(error19, this.f321155b);
                return efm.b.n(error19);
        }
    }
}
