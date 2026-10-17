package r9k;

import asa.l;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerExtraConfiguration$NoBalanceValidation;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import efm.r;
import imh.y;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import l1l.p;
import l1l.q;
import mif.e0;
import q2e.c0;
import r4k.x;
import te0.w;
import vkm.v1;
import yhm.o;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.i implements Function3 {
    public final /* synthetic */ long A;
    public final /* synthetic */ PeerToPeerRecipient B;
    public final /* synthetic */ hrf.f C;
    public final /* synthetic */ Set D;
    public int u;
    public /* synthetic */ FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f252746w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f252747x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ PeerToPeerTransferData f252748y;
    public final /* synthetic */ hrf.c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Continuation continuation, k kVar, PeerToPeerTransferData peerToPeerTransferData, hrf.c cVar, long j2, PeerToPeerRecipient peerToPeerRecipient, hrf.f fVar, Set set) {
        super(3, continuation);
        this.f252747x = kVar;
        this.f252748y = peerToPeerTransferData;
        this.z = cVar;
        this.A = j2;
        this.B = peerToPeerRecipient;
        this.C = fVar;
        this.D = set;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        h hVar = new h((Continuation) obj4, this.f252747x, this.f252748y, this.z, this.A, this.B, this.C, this.D);
        hVar.v = (FlowCollector) obj2;
        hVar.f252746w = obj3;
        return hVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i;
        go.g gVar;
        k kVar;
        vkm.d dVar;
        v1 v1Var;
        hrf.c cVar;
        go.g gVar2;
        List listL;
        nrf.c cVar2;
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i2 = this.u;
        if (i2 == 0) {
            o.b(obj2);
            FlowCollector flowCollector = this.v;
            Pair pair = (Pair) this.f252746w;
            d dVar2 = (d) pair.f186385a;
            Data data = (Data) pair.f186386b;
            PeerToPeerTransferData peerToPeerTransferData = this.f252748y;
            String str = peerToPeerTransferData.i;
            xi0.b bVar = peerToPeerTransferData.f102245b;
            long j2 = peerToPeerTransferData.f102244a;
            int[] iArr = e.f252741a;
            hrf.f fVar = this.C;
            int i3 = iArr[fVar.ordinal()];
            int i5 = 3;
            i1l.h hVar = i1l.h.f157651a;
            k kVar2 = this.f252747x;
            hrf.c cVar3 = this.z;
            if (i3 == 1) {
                if (j2 > 0) {
                    i = 1;
                    gVar = new go.g(f0.f322471a, 2);
                } else {
                    i = 1;
                    gVar = new go.g(u.c(hVar), 2);
                }
                dj0.d dVar3 = peerToPeerTransferData.f102256s;
                go.g gVar3 = gVar;
                go.g gVar4 = new go.g(peerToPeerTransferData.e != null ? f0.f322471a : u.c(i1l.e.f157647a), 2);
                go.g gVar5 = new go.g(l1l.a.a(new l1l.b(data, dVar3)).f316033b, 2);
                go.g gVar6 = new go.g(l1l.d.a(new l1l.c(data, dVar3)).f316033b, 2);
                go.g gVar7 = new go.g(l1l.f.a(new l1l.e(dVar2.d, bVar)).f316033b, 2);
                go.g gVarD = kVar2.d(peerToPeerTransferData, cVar3, fVar);
                v1 v1VarE = kVar2.e(peerToPeerTransferData, dVar2);
                u5k.c cVar4 = kVar2.d;
                r rVarH = w.h(dVar2.f252738a);
                r rVarH2 = w.h(dVar3);
                r rVarX = kVar2.e.x(AccountId.Personal.f51414a).x();
                Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
                r map = ((u5k.d) cVar4).b(rVarH, rVarH2, rVarX).map(new r83.d(15, new x(kVar2, peerToPeerTransferData, 11)));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                vkm.d dVarB = rd0.e.b(map);
                v1 v1Var2 = new v1(new p8k.h(urf.f.a(new l(data, peerToPeerTransferData)), null, 2));
                if (this.D.contains(PeerToPeerExtraConfiguration$NoBalanceValidation.f102269a)) {
                    dVar = dVarB;
                    v1Var = v1Var2;
                    gVar2 = new go.g(f0.f322471a, 2);
                    cVar = cVar3;
                    kVar = kVar2;
                } else {
                    kVar = kVar2;
                    dVar = dVarB;
                    v1Var = v1Var2;
                    cVar = cVar3;
                    gVar2 = new go.g(kVar2.i.c(new t9k.a(this.A, peerToPeerTransferData.f102244a, peerToPeerTransferData.f102245b, peerToPeerTransferData.e, cVar3, peerToPeerTransferData.f102252n, peerToPeerTransferData.f102251m)).f316033b, 2);
                }
                long j3 = peerToPeerTransferData.f102244a;
                xi0.b bVar2 = peerToPeerTransferData.f102245b;
                Map map2 = dVar2.e;
                PeerToPeerRecipient peerToPeerRecipient = this.B;
                go.g gVar8 = new go.g(t9k.b.a(new t9k.c(peerToPeerRecipient, j3, bVar2, map2)).f316033b, 2);
                go.g gVar9 = new go.g(t9k.e.a(new t9k.d(peerToPeerRecipient, j2)).f316033b, 2);
                go.g gVar10 = new go.g(q.a(str), 2);
                l1l.h hVar2 = kVar.f252759l;
                hrf.b bVar3 = cVar instanceof hrf.b ? (hrf.b) cVar : null;
                go.g gVar11 = new go.g(hVar2.b(new p((bVar3 == null || (cVar2 = bVar3.f154811a) == null) ? null : cVar2.f218626h)).f316033b, 2);
                go.g gVar12 = new go.g(kVar.k.a(new l1l.g(cVar != null ? Boolean.valueOf(foh.i.d(cVar)) : null)).f316033b, 2);
                Flow[] elements = new Flow[15];
                elements[0] = gVar3;
                elements[i] = gVar4;
                elements[2] = gVar5;
                elements[3] = gVar6;
                elements[4] = gVar7;
                elements[5] = gVarD;
                elements[6] = v1VarE;
                elements[7] = dVar;
                elements[8] = v1Var;
                elements[9] = gVar2;
                elements[10] = gVar8;
                elements[11] = gVar9;
                elements[12] = gVar10;
                elements[13] = gVar11;
                elements[14] = gVar12;
                Intrinsics.checkNotNullParameter(elements, "elements");
                listL = kotlin.collections.d.L(elements);
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                listL = v.k(j2 > 0 ? new go.g(f0.f322471a, 2) : new go.g(u.c(hVar), 2), new go.g(l1l.f.a(new l1l.e(dVar2.d, bVar)).f316033b, 2), kVar2.d(peerToPeerTransferData, cVar3, fVar), kVar2.e(peerToPeerTransferData, dVar2), new go.g(q.a(str), 2));
                i = 1;
            }
            Flow[] flowArr = (Flow[]) d0.d1(listL).toArray(new Flow[0]);
            this.v = null;
            this.f252746w = null;
            this.u = i;
            vkm.q.w(flowCollector);
            Object objG = e0.g(this, new c0(flowArr, 5), new y(i5, 22, null), flowCollector, flowArr);
            if (objG != fim.a.COROUTINE_SUSPENDED) {
                objG = Unit.f186387a;
            }
            if (objG != fim.a.COROUTINE_SUSPENDED) {
                objG = Unit.f186387a;
            }
            if (objG == obj3) {
                return obj3;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
