package xb6;

import com.revolut.data.model.Data;
import com.revolut.feature.donations.impl.ui.kompot.screen.collection.details.CharitiesCollectionDetailsScreenContract$InputData;
import efm.r;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import s65.o;
import y99.x;
import ya6.k;
import ya6.l;
import ya6.u;
import ya6.z;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sa6.b f304006p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CharitiesCollectionDetailsScreenContract$InputData f304007q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f304008r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p stateMapper, sa6.b collectionsInteractor, CharitiesCollectionDetailsScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(collectionsInteractor, "collectionsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f304006p = collectionsInteractor;
        this.f304007q = inputData;
        this.f304008r = new c(new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        CharitiesCollectionDetailsScreenContract$InputData charitiesCollectionDetailsScreenContract$InputData = this.f304007q;
        String id10 = charitiesCollectionDetailsScreenContract$InputData.f72079a;
        boolean z = charitiesCollectionDetailsScreenContract$InputData.f72080b;
        sa6.b bVar = this.f304006p;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        l lVar = (l) bVar.f261302a;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        r map = r.combineLatest(nim.a.w(lVar.d.f(new k(id10), z), new x(12)), nim.a.w(((z) bVar.f261303b).i.f(u.a.f311983a, z), new s8h.h(17)), new o(new k5e.h(z, bVar, 2), 28)).map(new o(new s8h.h(16), 29));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        yji.l.a1(this, rd0.e.b(map), null, null, new g(this, null), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f304008r;
    }
}
