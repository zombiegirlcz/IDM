package lpd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.edit.EditCycleScreenContract$InputData;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends jki.g implements n {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final EditCycleScreenContract$InputData f198986p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b80.c f198987q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l f198988r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(EditCycleScreenContract$InputData inputData, u stateMapper, b80.c networkStateRepository) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.f198986p = inputData;
        this.f198987q = networkStateRepository;
        this.f198988r = new l(y2(inputData.f87672a, true), new HashMap());
    }

    public static k y2(lzi.h hVar, boolean z) {
        h hVar2;
        d dVar;
        if (hVar instanceof lzi.g) {
            lzi.g gVar = (lzi.g) hVar;
            return new j(gVar, z ? gVar.f200979a : null);
        }
        if (!(hVar instanceof lzi.c)) {
            if (!(hVar instanceof lzi.e)) {
                throw new NoWhenBranchMatchedException();
            }
            lzi.e eVar = (lzi.e) hVar;
            lzi.f fVar = eVar.f200977a;
            int i = q.f198983a[eVar.f200978b.ordinal()];
            if (i == 1) {
                hVar2 = f.values()[fVar.getDayOfWeek() - 1];
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                hVar2 = g.values()[fVar.getDayOfWeek() - 1];
            }
            return new i(eVar, hVar2, z);
        }
        lzi.c cVar = (lzi.c) hVar;
        int i2 = cVar.f200975a;
        if (z) {
            int i3 = q.d[cVar.f200976b.ordinal()];
            if (i3 == 1) {
                dVar = d.ON_THE_DAY;
            } else if (i3 == 2) {
                dVar = d.WEEK_DAY_BEFORE;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar = d.WEEK_DAY_AFTER;
            }
        } else {
            dVar = d.ON_THE_DAY;
        }
        return new e(cVar, z, i2, false, dVar);
    }

    @Override // yji.l
    public final void I1() {
        String str;
        lzi.h hVar = this.f198986p.f87672a;
        if (hVar instanceof lzi.g) {
            return;
        }
        if (hVar instanceof lzi.c) {
            str = "TAB_ID_DATE";
        } else {
            if (!(hVar instanceof lzi.e)) {
                throw new NoWhenBranchMatchedException();
            }
            int i = q.f198983a[((lzi.e) hVar).f200978b.ordinal()];
            if (i == 1) {
                str = "TAB_ID_FIRST";
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "TAB_ID_LAST";
            }
        }
        ((l) t2()).f198978b.put(str, this.f198988r.f198977a);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f198988r;
    }
}
