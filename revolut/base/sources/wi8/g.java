package wi8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior_payment_links.impl.ui.screen.custom_amount.JuniorPaymentLinkCustomAmountScreenContract$Input;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import whc.t;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f297856a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JuniorPaymentLinkCustomAmountScreenContract$Input f297857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f297858c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f297859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f297860h;

    public g(e eVar, a aVar, ViewController viewController, JuniorPaymentLinkCustomAmountScreenContract$Input juniorPaymentLinkCustomAmountScreenContract$Input) {
        this.f297858c = eVar;
        this.f297857b = juniorPaymentLinkCustomAmountScreenContract$Input;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 3;
        this.e = e4m.b.b(new t(eVar, this, 1, i));
        this.f = e4m.b.b(new t(eVar, this, 0, i));
        this.f297859g = e4m.b.b(new t(eVar, this, 3, i));
        this.f297860h = e4m.b.b(new t(eVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f297856a) {
        }
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f297856a) {
        }
        return ImmutableSet.of((yji.d) this.f.get());
    }

    public g(e eVar, ViewController viewController, JuniorPaymentLinkCustomAmountScreenContract$Input juniorPaymentLinkCustomAmountScreenContract$Input) {
        this.f297858c = eVar;
        this.f297857b = juniorPaymentLinkCustomAmountScreenContract$Input;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 4;
        this.e = e4m.b.b(new t(eVar, this, 1, i));
        this.f = e4m.b.b(new t(eVar, this, 0, i));
        this.f297859g = e4m.b.b(new t(eVar, this, 3, i));
        this.f297860h = e4m.b.b(new t(eVar, this, 2, i));
    }
}
