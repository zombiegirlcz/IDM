package ufg;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.miles.impl.ui.screen.transfer.TravelMilesTransferScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class l0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279762a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelMilesTransferScreenContract$InputData f279763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f279764c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f279765g;

    public l0(g gVar, b bVar, ViewController viewController, TravelMilesTransferScreenContract$InputData travelMilesTransferScreenContract$InputData) {
        this.f279764c = gVar;
        this.f279763b = travelMilesTransferScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 1;
        this.e = e4m.b.b(new k0(gVar, this, 1, i));
        this.f = e4m.b.b(new k0(gVar, this, 0, i));
        this.f279765g = e4m.b.b(new k0(gVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f279762a) {
        }
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f279762a) {
        }
        return ImmutableSet.of((yji.d) this.f.get());
    }

    public l0(g gVar, t tVar, ViewController viewController, TravelMilesTransferScreenContract$InputData travelMilesTransferScreenContract$InputData) {
        this.f279764c = gVar;
        this.f279763b = travelMilesTransferScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 0;
        this.e = e4m.b.b(new k0(gVar, this, 1, i));
        this.f = e4m.b.b(new k0(gVar, this, 0, i));
        this.f279765g = e4m.b.b(new k0(gVar, this, 2, i));
    }
}
