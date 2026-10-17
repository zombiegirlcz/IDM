package cwi;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.modals.help.AirportLoungesHomeHelpScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class y0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109819a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AirportLoungesHomeHelpScreenContract$InputData f109820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f109821c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f109822g;

    public y0(h0 h0Var, p0 p0Var, ViewController viewController, AirportLoungesHomeHelpScreenContract$InputData airportLoungesHomeHelpScreenContract$InputData) {
        this.f109821c = h0Var;
        this.f109820b = airportLoungesHomeHelpScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 14;
        this.e = e4m.b.b(new d0(h0Var, this, 0, i));
        this.f = e4m.b.b(new d0(h0Var, this, 2, i));
        this.f109822g = e4m.b.b(new d0(h0Var, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f109819a) {
        }
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f109819a) {
        }
        return ImmutableSet.of((yji.d) this.e.get());
    }

    public y0(h0 h0Var, b0 b0Var, ViewController viewController, AirportLoungesHomeHelpScreenContract$InputData airportLoungesHomeHelpScreenContract$InputData) {
        this.f109821c = h0Var;
        this.f109820b = airportLoungesHomeHelpScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 13;
        this.e = e4m.b.b(new d0(h0Var, this, 0, i));
        this.f = e4m.b.b(new d0(h0Var, this, 2, i));
        this.f109822g = e4m.b.b(new d0(h0Var, this, 1, i));
    }
}
