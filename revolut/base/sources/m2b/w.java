package m2b;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.cfd.impl.flows.withdraw.CfdWithdrawFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class w implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CfdWithdrawFlowContract$InputData f201938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f201939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f201940c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f201941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f201942h;

    public w(v vVar, ViewController viewController, CfdWithdrawFlowContract$InputData cfdWithdrawFlowContract$InputData) {
        this.f201939b = vVar;
        this.f201938a = cfdWithdrawFlowContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 12;
        this.e = e4m.b.b(new lzk.b(vVar, this, 2, i));
        this.f = e4m.b.b(new lzk.b(vVar, this, 1, i));
        this.f201941g = e4m.b.b(new lzk.b(vVar, this, 0, i));
        this.f201942h = e4m.b.b(new lzk.b(vVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f201941g.get());
    }
}
