package lti;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.price_info.AsftTerminalPriceInfoScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsftTerminalPriceInfoScreenContract$InputData f199938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f199939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f199940c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public o(g gVar, k kVar, ViewController viewController, AsftTerminalPriceInfoScreenContract$InputData asftTerminalPriceInfoScreenContract$InputData) {
        this.f199939b = gVar;
        this.f199938a = asftTerminalPriceInfoScreenContract$InputData;
        this.f199940c = e4m.b.b(e4m.c.a(viewController));
        this.d = e4m.b.b(new l(gVar, this, 0, 2));
        this.e = e4m.b.b(new l(gVar, this, 2, 2));
        this.f = e4m.b.b(new l(gVar, this, 1, 2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
