package cwi;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.amenities.AirportLoungesAmenitiesScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class w0 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109784a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AirportLoungesAmenitiesScreenContract$InputData f109785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f109786c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f109787g;

    public w0(h0 h0Var, p0 p0Var, BaseScreen baseScreen, AirportLoungesAmenitiesScreenContract$InputData airportLoungesAmenitiesScreenContract$InputData) {
        this.f109786c = h0Var;
        this.f109785b = airportLoungesAmenitiesScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(baseScreen));
        int i = 12;
        this.e = e4m.b.b(new d0(h0Var, this, 0, i));
        this.f = e4m.b.b(new d0(h0Var, this, 2, i));
        this.f109787g = e4m.b.b(new d0(h0Var, this, 1, i));
    }

    @Override // sji.b
    public final Set f() {
        switch (this.f109784a) {
        }
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        switch (this.f109784a) {
        }
        return ImmutableSet.of((yji.d) this.e.get());
    }

    public w0(h0 h0Var, f0 f0Var, BaseScreen baseScreen, AirportLoungesAmenitiesScreenContract$InputData airportLoungesAmenitiesScreenContract$InputData) {
        this.f109786c = h0Var;
        this.f109785b = airportLoungesAmenitiesScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(baseScreen));
        int i = 10;
        this.e = e4m.b.b(new d0(h0Var, this, 0, i));
        this.f = e4m.b.b(new d0(h0Var, this, 2, i));
        this.f109787g = e4m.b.b(new d0(h0Var, this, 1, i));
    }
}
