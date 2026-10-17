package cwi;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_details.AirportDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class u0 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109774a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AirportDetailsScreenContract$InputData f109775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f109776c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f109777g;

    public u0(h0 h0Var, p0 p0Var, BaseScreen baseScreen, AirportDetailsScreenContract$InputData airportDetailsScreenContract$InputData) {
        this.f109776c = h0Var;
        this.f109775b = airportDetailsScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(baseScreen));
        int i = 11;
        this.e = e4m.b.b(new d0(h0Var, this, 0, i));
        this.f = e4m.b.b(new d0(h0Var, this, 2, i));
        this.f109777g = e4m.b.b(new d0(h0Var, this, 1, i));
    }

    @Override // sji.b
    public final Set f() {
        switch (this.f109774a) {
        }
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        switch (this.f109774a) {
        }
        return ImmutableSet.of((yji.d) this.e.get());
    }

    public u0(h0 h0Var, f0 f0Var, BaseScreen baseScreen, AirportDetailsScreenContract$InputData airportDetailsScreenContract$InputData) {
        this.f109776c = h0Var;
        this.f109775b = airportDetailsScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(baseScreen));
        int i = 9;
        this.e = e4m.b.b(new d0(h0Var, this, 0, i));
        this.f = e4m.b.b(new d0(h0Var, this, 2, i));
        this.f109777g = e4m.b.b(new d0(h0Var, this, 1, i));
    }
}
