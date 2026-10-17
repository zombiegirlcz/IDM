package g9g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.TravelHotelsHomeFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class v implements xki.c, lbg.a, ucg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsHomeFlowContract$InputData f141831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f141832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f141833c = this;
    public final e4m.e d;

    public v(d dVar, TravelHotelsHomeFlowContract$InputData travelHotelsHomeFlowContract$InputData) {
        this.f141832b = dVar;
        this.f141831a = travelHotelsHomeFlowContract$InputData;
        this.d = e4m.b.b(new g2j.k(dVar, this, 8));
    }

    @Override // ucg.a
    public final y0 D() {
        return new y0(this.f141832b, this.f141833c, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // lbg.a
    public final q0 q() {
        return new q0(this.f141832b, this.f141833c, 0);
    }
}
