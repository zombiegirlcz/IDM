package g9g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.property.TravelHotelsPropertyFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class z implements xki.c, fdg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsPropertyFlowContract$InputData f141861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f141862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f141863c = this;
    public final e4m.e d = e4m.b.b(new g2j.m(this, 11));

    public z(d dVar, TravelHotelsPropertyFlowContract$InputData travelHotelsPropertyFlowContract$InputData) {
        this.f141862b = dVar;
        this.f141861a = travelHotelsPropertyFlowContract$InputData;
    }

    @Override // fdg.a
    public final a1 b() {
        return new a1(this.f141862b, this.f141863c, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
