package jg5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.crypto.features.impl.ui.features.CryptoFeaturesControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import jdi.i;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoFeaturesControllerContract$InputData f173918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f173919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f173920c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f173921g;

    public f(g gVar, ViewController viewController, CryptoFeaturesControllerContract$InputData cryptoFeaturesControllerContract$InputData) {
        this.f173918a = cryptoFeaturesControllerContract$InputData;
        this.f173919b = e4m.b.b(e4m.c.a(viewController));
        int i = 7;
        this.f173920c = e4m.b.b(new i(gVar, this, 2, i));
        this.d = e4m.b.b(new i(gVar, this, 1, i));
        this.e = e4m.b.b(new i(gVar, this, 0, i));
        this.f = e4m.b.b(new i(gVar, this, 4, i));
        this.f173921g = e4m.b.b(new i(gVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
