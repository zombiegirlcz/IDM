package wz2;

import ack.o;
import com.revolut.kompot.common.flow.permissions.PermissionsFlow;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Explanation;
import h93.f0;
import ha3.x;
import i93.e;
import i93.k;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l93.f;
import od0.h;
import od0.i;
import pfm.l;
import skm.p0;
import vkm.q;
import vkm.t1;
import vkm.z1;
import yji.n;
import zhm.q0;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f301359l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j60.a f301360m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w63.a f301361n;
    public final z1 o;

    public d(f cardInteractor, j60.a bottomDialogView, w63.a cardPermissionDialogProvider) {
        Intrinsics.checkNotNullParameter(cardInteractor, "cardInteractor");
        Intrinsics.checkNotNullParameter(bottomDialogView, "bottomDialogView");
        Intrinsics.checkNotNullParameter(cardPermissionDialogProvider, "cardPermissionDialogProvider");
        this.f301359l = cardInteractor;
        this.f301360m = bottomDialogView;
        this.f301361n = cardPermissionDialogProvider;
        z1 z1VarB = q.b(0, 2, ukm.f.DROP_OLDEST);
        i.Companion.getClass();
        z1VarB.k(i.f224256b);
        this.o = z1VarB;
    }

    @Override // wz2.b
    public final Object Z2(a aVar, gim.c cVar) {
        if (aVar.f301355b == e.LOCATION && aVar.f301356c) {
            n.Q2(this, new PermissionsFlow(q0.c(new Pair("android.permission.ACCESS_FINE_LOCATION", PermissionsFlowContract$Explanation.None.f98339a))), null, new wwa.a(this, aVar, 12), 1);
            return Unit.f186387a;
        }
        Object objC3 = c3(aVar, cVar);
        return objC3 == fim.a.COROUTINE_SUSPENDED ? objC3 : Unit.f186387a;
    }

    @Override // wz2.b
    public final t1 b3() {
        return q.g(this.o);
    }

    public final Object c3(a aVar, gim.c cVar) {
        f0 f0Var = aVar.f301354a;
        i93.c cVar2 = f0Var.f150113g;
        if (cVar2 == null) {
            throw new IllegalStateException("Card must have settings != null");
        }
        e eVar = aVar.f301355b;
        boolean z = aVar.f301356c;
        k kVarC = cVar2.f159551c;
        if (kVarC != null) {
            i93.i iVarB = kVarC.b(eVar);
            if (iVarB != null) {
                kVarC = kVarC.c(eVar, i93.i.a(iVarB, z, null, 13));
            }
        } else {
            kVarC = null;
        }
        i93.c cVarA = i93.c.a(cVar2, false, false, kVarC, 507);
        i.Companion.getClass();
        this.o.k(h.a(cVarA));
        String cardId = f0Var.f150110a;
        e type = aVar.f301355b;
        boolean z3 = aVar.f301356c;
        x xVar = (x) this.f301359l;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(type, "type");
        l lVar = new l(pd.b.n(p0.f264003c, new o(xVar, cardId, type, z3, (Continuation) null, 5)), new ty7.b(this, 21), 0);
        Intrinsics.checkNotNullExpressionValue(lVar, "doFinally(...)");
        Object objA = nim.a.a(lVar, cVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }
}
