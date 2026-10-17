package hx2;

import e93.o;
import efm.d0;
import efm.r;
import h93.j0;
import h93.l0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public interface c {
    static ufm.i a(hy2.f fVar, c93.f cardDesignType, String str, b93.b bVar, hha.d plan, boolean z, j0 j0Var, l0 l0Var, int i) {
        String str2;
        boolean z3;
        hy2.f fVar2;
        Object obj2;
        boolean z4;
        b93.b bVar2;
        ufm.i iVar;
        String str3 = (i & 4) != 0 ? null : str;
        boolean z6 = false;
        if ((i & 8) != 0) {
            str2 = str3;
            z3 = false;
        } else {
            str2 = str3;
            z3 = true;
        }
        b93.b bVar3 = (i & 32) != 0 ? null : bVar;
        boolean z11 = (i & 2048) != 0 ? false : z;
        j0 j0Var2 = (i & 4096) != 0 ? null : j0Var;
        l0 l0Var2 = (i & 8192) != 0 ? null : l0Var;
        Intrinsics.checkNotNullParameter(cardDesignType, "cardDesignType");
        Intrinsics.checkNotNullParameter(plan, "plan");
        switch (hy2.d.f156702a[cardDesignType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                j0 j0Var3 = j0Var2;
                fVar2 = fVar;
                boolean z12 = z3;
                String str4 = str2;
                b93.b bVar4 = bVar3;
                l0 l0Var3 = l0Var2;
                if (cardDesignType == c93.f.FREELANCER_VIRTUAL || cardDesignType == c93.f.FREELANCER_DISPOSABLE) {
                    obj2 = null;
                    z4 = true;
                } else {
                    obj2 = null;
                    z4 = false;
                }
                r rVarFilter = nim.a.w(hy2.f.m(fVar2, str4, z12, z4, false, z11, j0Var3, l0Var3, null, null, false, false, null, null, null, 8576), new hy2.a(fVar2, cardDesignType, 0)).filter(new hy1.m(18, new hy1.i(21)));
                Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
                d0 d0VarFirstOrError = m70.a.g(rVarFilter, null, new ht1.l(29), 1).firstOrError();
                bVar2 = bVar4;
                hy1.m mVar = new hy1.m(19, new ha3.e(bVar2, 1));
                d0VarFirstOrError.getClass();
                iVar = new ufm.i(d0VarFirstOrError, mVar, 1);
                break;
            case 6:
            case 7:
            case 8:
                if (cardDesignType == c93.f.FREELANCER) {
                    z6 = true;
                }
                b93.b bVar5 = bVar3;
                fVar2 = fVar;
                r rVarFilter2 = hy2.f.k(fVar2, str2, z3, z6, j0Var2, l0Var2, null, null, null, plan.f152287a, null, null, false, false, null, null, 29792).filter(new hy1.m(20, new hy1.i(22)));
                Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
                d0 d0VarFirstOrError2 = m70.a.g(rVarFilter2, null, new hy2.b(0), 1).firstOrError();
                hy1.m mVar2 = new hy1.m(15, new hsa.l(fVar2, 6, plan, bVar5));
                d0VarFirstOrError2.getClass();
                iVar = new ufm.i(d0VarFirstOrError2, mVar2, 0);
                bVar2 = bVar5;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        ufm.i iVar2 = new ufm.i(iVar, new hy1.m(16, new hy1.i(bVar2, fVar2)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return iVar2;
    }

    static r b(c cVar, String str, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, String str2, j0 j0Var, l0 l0Var, List list, int i) {
        boolean z29 = (i & 32) != 0 ? false : z11;
        boolean z31 = (i & 64) != 0 ? false : z12;
        String str3 = (i & 128) != 0 ? null : str2;
        j0 j0Var2 = (i & 256) != 0 ? null : j0Var;
        l0 l0Var2 = (i & 512) != 0 ? null : l0Var;
        List list2 = (i & 2048) != 0 ? null : list;
        hy2.f fVar = (hy2.f) cVar;
        fVar.getClass();
        return hy2.f.m(fVar, str, z, z3, z4, z31, j0Var2, l0Var2, null, null, z6, z29, str3, null, list2, 384);
    }

    static r c(c cVar, String str, boolean z, boolean z3, String str2, String str3, j0 j0Var, l0 l0Var, List list, boolean z4, int i) {
        String str4 = (i & 32) != 0 ? null : str3;
        j0 j0Var2 = (i & 64) != 0 ? null : j0Var;
        l0 l0Var2 = (i & 128) != 0 ? null : l0Var;
        List list2 = (i & 256) != 0 ? null : list;
        boolean z6 = (i & 512) != 0 ? false : z4;
        o entryPoint = o.DEFAULT;
        hy2.f fVar = (hy2.f) cVar;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        return hy2.f.k(fVar, str, z, z3, j0Var2, l0Var2, null, null, null, str2, str4, list2, z6, false, entryPoint, null, 96);
    }
}
