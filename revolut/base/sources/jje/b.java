package jje;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.tab.crypto.impl.ui.settings.CryptoSettingsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoSettingsScreenContract$InputData f174821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f174822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f174823c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f174824g;

    public b(c cVar, ViewController viewController, CryptoSettingsScreenContract$InputData cryptoSettingsScreenContract$InputData) {
        this.f174822b = cVar;
        this.f174821a = cryptoSettingsScreenContract$InputData;
        this.f174823c = e4m.b.b(e4m.c.a(viewController));
        int i = 8;
        this.d = e4m.b.b(new jdi.i(cVar, this, 2, i));
        this.e = e4m.b.b(new jdi.i(cVar, this, 1, i));
        this.f = e4m.b.b(new jdi.i(cVar, this, 0, i));
        this.f174824g = e4m.b.b(new jdi.i(cVar, this, 3, i));
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
