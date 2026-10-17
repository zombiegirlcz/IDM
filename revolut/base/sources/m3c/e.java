package m3c;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.revolut_shop.ui.flow.ipp_shop.IppShopFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import ljl.y;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements xki.c, k4c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IppShopFlowContract$InputData f202331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f202332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f202333c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public e(j jVar, ViewController viewController, IppShopFlowContract$InputData ippShopFlowContract$InputData) {
        this.f202332b = jVar;
        this.f202331a = ippShopFlowContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 24;
        this.e = e4m.b.b(new y(this, 1, i));
        this.f = e4m.b.b(new y(this, 0, i));
    }

    @Override // k4c.a
    public final k b() {
        return new k(this.f202332b, this.f202333c, 1);
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
