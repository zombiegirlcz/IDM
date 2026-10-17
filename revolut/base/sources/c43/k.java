package c43;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_payment_method.impl.flows.link_card.screens.chooser.ChooserScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChooserScreenContract$InputData f21037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f21038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f21039c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f21040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f21041h;

    public k(h hVar, l lVar, ViewController viewController, ChooserScreenContract$InputData chooserScreenContract$InputData) {
        this.f21038b = hVar;
        this.f21037a = chooserScreenContract$InputData;
        this.f21039c = e4m.b.b(e4m.c.a(viewController));
        int i = 10;
        this.d = e4m.b.b(new bt7.e(hVar, this, 2, i));
        this.e = e4m.b.b(new bt7.e(hVar, this, 1, i));
        this.f = e4m.b.b(new bt7.e(hVar, this, 0, i));
        this.f21040g = e4m.b.b(new bt7.e(hVar, this, 4, i));
        this.f21041h = e4m.b.b(new bt7.e(hVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
