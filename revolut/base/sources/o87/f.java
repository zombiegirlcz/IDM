package o87;

import bof.r;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import j87.j;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vkm.j2;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends h implements dli.b {
    public final h87.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final aah.h f222955p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j87.a f222956q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f222957r;

    public f(r stateMapper, h87.c globalMarketsCollectionWidgetControllerModel, aah.h wealthDisclaimersControllerModelExtension, j87.a globeControllerModelExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(globalMarketsCollectionWidgetControllerModel, "globalMarketsCollectionWidgetControllerModel");
        Intrinsics.checkNotNullParameter(wealthDisclaimersControllerModelExtension, "wealthDisclaimersControllerModelExtension");
        Intrinsics.checkNotNullParameter(globeControllerModelExtension, "globeControllerModelExtension");
        this.o = globalMarketsCollectionWidgetControllerModel;
        this.f222955p = wealthDisclaimersControllerModelExtension;
        this.f222956q = globeControllerModelExtension;
        this.f222957r = mra.d.b(this, new b((j87.f) ((j2) ((j) globeControllerModelExtension).f172151q.f22677a).getValue(), null, null, null, new Data(null, null, false, 7, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, (j2) ((j) this.f222956q).f172151q.f22677a, null, null, new d(this, null, 4), 3);
        h87.f fVar = h87.f.GLOBAL_INDEXES;
        h87.c cVar = this.o;
        l.a1(this, cVar.Z2(fVar), null, null, new d(this, null, 3), 3);
        l.a1(this, cVar.Z2(h87.f.GLOBAL_COMMODITIES), null, null, new d(this, null, 1), 3);
        l.a1(this, cVar.Z2(h87.f.GLOBAL_CURRENCIES), null, null, new d(this, null, 2), 3);
        l.a1(this, nim.a.v(this.f222955p.f2828l.w0(), new o69.b(23)), null, null, new d(this, null, 0), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f222957r;
    }
}
