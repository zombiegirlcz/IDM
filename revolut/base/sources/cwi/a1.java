package cwi;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.lounge_details.AirportLoungeDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class a1 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109631a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AirportLoungeDetailsScreenContract$InputData f109632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f109633c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f109634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f109635h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f109636j;

    public a1(h0 h0Var, p0 p0Var, BaseScreen baseScreen, AirportLoungeDetailsScreenContract$InputData airportLoungeDetailsScreenContract$InputData) {
        this.f109633c = h0Var;
        this.f109632b = airportLoungeDetailsScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(baseScreen));
        int i = 16;
        this.e = e4m.b.b(new d0(h0Var, this, 2, i));
        this.f = e4m.b.b(new d0(h0Var, this, 1, i));
        this.f109634g = e4m.b.b(new d0(h0Var, this, 0, i));
        this.f109635h = e4m.b.b(new d0(h0Var, this, 3, i));
        this.i = e4m.b.b(new d0(h0Var, this, 5, i));
        this.f109636j = e4m.b.b(new d0(h0Var, this, 4, i));
    }

    @Override // sji.b
    public final Set f() {
        switch (this.f109631a) {
        }
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        switch (this.f109631a) {
        }
        return ImmutableSet.of((yji.d) this.f109634g.get(), (yji.d) this.f109635h.get());
    }

    public a1(h0 h0Var, f0 f0Var, BaseScreen baseScreen, AirportLoungeDetailsScreenContract$InputData airportLoungeDetailsScreenContract$InputData) {
        this.f109633c = h0Var;
        this.f109632b = airportLoungeDetailsScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(baseScreen));
        int i = 15;
        this.e = e4m.b.b(new d0(h0Var, this, 2, i));
        this.f = e4m.b.b(new d0(h0Var, this, 1, i));
        this.f109634g = e4m.b.b(new d0(h0Var, this, 0, i));
        this.f109635h = e4m.b.b(new d0(h0Var, this, 3, i));
        this.i = e4m.b.b(new d0(h0Var, this, 5, i));
        this.f109636j = e4m.b.b(new d0(h0Var, this, 4, i));
    }
}
