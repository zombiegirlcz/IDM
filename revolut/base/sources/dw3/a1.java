package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.close.flow.CreditApplicationCloseFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a1 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f118241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditApplicationCloseFlowContract$InputData f118242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f118243c;
    public final a1 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118245h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118246j;
    public final e4m.e k;

    public a1(c1 c1Var, iq3.a aVar, ViewController viewController, CreditApplicationCloseFlowContract$InputData creditApplicationCloseFlowContract$InputData) {
        this.f118243c = c1Var;
        this.f118241a = aVar;
        this.f118242b = creditApplicationCloseFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 26;
        this.f = e4m.b.b(new dmc.b0(c1Var, this, 2, i));
        this.f118244g = e4m.b.b(new dmc.b0(c1Var, this, 1, i));
        this.f118245h = e4m.b.b(new dmc.b0(c1Var, this, 0, i));
        this.i = e4m.b.b(new dmc.b0(c1Var, this, 4, i));
        this.f118246j = e4m.b.b(new dmc.b0(c1Var, this, 3, i));
        this.k = e4m.b.b(new dmc.b0(c1Var, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        Object extension = (j54.f) this.f118246j.get();
        i64.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        yji.n nVar = (yji.n) extension;
        vc.s.k(nVar);
        Object extension2 = (j54.v) this.i.get();
        Intrinsics.checkNotNullParameter(extension2, "extension");
        yji.n nVar2 = (yji.n) extension2;
        vc.s.k(nVar2);
        return ImmutableSet.of(nVar, nVar2);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f118245h.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new n7(this.f118243c, this.d, 11);
    }
}
