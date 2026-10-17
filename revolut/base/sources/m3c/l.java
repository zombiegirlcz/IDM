package m3c;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.revolut_shop.ui.screen.orderconfirmation.OrderConfirmationScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202357a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OrderConfirmationScreenContract$InputData f202358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f202359c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public l(j jVar, e eVar, ViewController viewController, OrderConfirmationScreenContract$InputData orderConfirmationScreenContract$InputData) {
        this.f202358b = orderConfirmationScreenContract$InputData;
        this.f202359c = e4m.b.b(new lzk.b(jVar, this, 0, 21));
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 21;
        this.e = e4m.b.b(new lzk.b(jVar, this, 2, i));
        this.f = e4m.b.b(new lzk.b(jVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f202357a) {
        }
        return ImmutableSet.of((yji.n) this.f202359c.get());
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f202357a) {
        }
        return ImmutableSet.of();
    }

    public l(j jVar, g gVar, ViewController viewController, OrderConfirmationScreenContract$InputData orderConfirmationScreenContract$InputData) {
        this.f202358b = orderConfirmationScreenContract$InputData;
        this.f202359c = e4m.b.b(new lzk.b(jVar, this, 0, 20));
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 20;
        this.e = e4m.b.b(new lzk.b(jVar, this, 2, i));
        this.f = e4m.b.b(new lzk.b(jVar, this, 1, i));
    }
}
