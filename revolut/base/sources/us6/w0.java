package us6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.sales.refund.screen.FreelancerRefundScreenContract$InputData;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerRefundScreenContract$InputData f282784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f282785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f282786c;

    public w0(q qVar, v0 v0Var, FreelancerRefundScreenContract$InputData freelancerRefundScreenContract$InputData) {
        this.f282785b = qVar;
        this.f282784a = freelancerRefundScreenContract$InputData;
        this.f282786c = e4m.b.b(new o0(qVar, this, 1));
    }

    public final w80.b b() {
        qd0.b languageProvider = this.f282785b.f282691m.n();
        vc.s.j(languageProvider);
        p27.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        return v80.b.b(languageProvider, false, false, 58);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
