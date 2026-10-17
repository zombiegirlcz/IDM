package lti;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.AsftTerminalSelectionScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsftTerminalSelectionScreenContract$InputData f199941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f199942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f199943c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public p(g gVar, k kVar, ViewController viewController, AsftTerminalSelectionScreenContract$InputData asftTerminalSelectionScreenContract$InputData) {
        this.f199942b = gVar;
        this.f199941a = asftTerminalSelectionScreenContract$InputData;
        this.f199943c = e4m.b.b(e4m.c.a(viewController));
        int i = 3;
        this.d = e4m.b.b(new l(gVar, this, 0, i));
        this.e = e4m.b.b(new l(gVar, this, 2, i));
        this.f = e4m.b.b(new l(gVar, this, 1, i));
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
