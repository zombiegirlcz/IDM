package joh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth_discovery.impl.screener.screens.filter_calibrator.ScreenerFilterCalibratorScreenContract$Input;
import java.util.Set;
import jm4.z3;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yph.g f177032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScreenerFilterCalibratorScreenContract$Input f177033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f177034c;
    public final e4m.e d;
    public final e4m.e e;

    public n(w wVar, ScreenerFilterCalibratorScreenContract$Input screenerFilterCalibratorScreenContract$Input, yph.g gVar) {
        this.f177034c = wVar;
        this.f177032a = gVar;
        this.f177033b = screenerFilterCalibratorScreenContract$Input;
        this.d = e4m.b.b(new z3(wVar, this, 1, 21));
        this.e = e4m.b.b(new z3(wVar, this, 0, 21));
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
