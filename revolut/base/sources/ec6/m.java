package ec6;

import com.revolut.data.model.Data;
import ebg.o;
import efm.r;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import ya6.j;
import ya6.u;
import ya6.z;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends jki.g implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dc6.c f124455p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f124456q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(dc6.c presentationModel, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f124455p = presentationModel;
        this.f124456q = new e(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        dc6.c cVar = this.f124455p;
        r rVarW = nim.a.w(aa6.c.a(cVar.f112804a, true), new dak.c(9));
        sa6.b bVar = cVar.e;
        int i = 17;
        r rVarCombineLatest = r.combineLatest(((ya6.l) bVar.f261302a).d.f(j.a.f311971a, true), nim.a.w(((z) bVar.f261303b).i.f(u.a.f311983a, false), new s8h.h(i)), new sa6.a(new s42.f(bVar, i), 0));
        Intrinsics.checkNotNullExpressionValue(rVarCombineLatest, "combineLatest(...)");
        r rVarDistinctUntilChanged = nim.a.w(u1.d(rVarW, rVarCombineLatest), new ebi.i(3)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        yji.l.a1(this, rd0.e.b(rVarDistinctUntilChanged), null, null, new k(this, null, 0), 3);
        r rVarDistinctUntilChanged2 = nim.a.w(aa6.c.a(cVar.f112804a, false), new dak.c(9)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
        yji.l.a1(this, rd0.e.b(rVarDistinctUntilChanged2), null, null, new k(this, null, 1), 3);
        l2(new o(this, null, 3), new yi5.b(26));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f124456q;
    }
}
