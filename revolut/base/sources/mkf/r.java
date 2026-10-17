package mkf;

import elf.j2;
import klf.m1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f206266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1 f206267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j2 f206268c;

    public r(klf.h0 commonDataSource, m1 juniorDataSource, j2 userCommentClickHandler, q availabilityChecker, v mapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(userCommentClickHandler, "userCommentClickHandler");
        Intrinsics.checkNotNullParameter(availabilityChecker, "availabilityChecker");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f206266a = commonDataSource;
        this.f206267b = juniorDataSource;
        this.f206268c = userCommentClickHandler;
    }

    public final cmf.p a() {
        klf.h0 h0Var = this.f206266a;
        return new cmf.p(ta6.a.h(h0Var.d(), h0Var.c(), this.f206267b.a(), new ate.b(this, null, 9)), new mfl.b(29), zhm.u.c(this.f206268c), "BankTransferReference");
    }
}
