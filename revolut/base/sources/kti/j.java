package kti;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.widget.AsftWidgetFlowContract$InputData;
import java.util.Set;
import jm4.c3;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsftWidgetFlowContract$InputData f189558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f189559b;

    public j(i iVar, AsftWidgetFlowContract$InputData.PassAvailableSoon passAvailableSoon) {
        this.f189558a = passAvailableSoon;
        this.f189559b = e4m.b.b(new c3(iVar, this, 18));
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
