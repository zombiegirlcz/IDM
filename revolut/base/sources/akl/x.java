package akl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes13.dex */
public final class x extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f6111w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f6111w = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                x xVar = new x((z) this.f6111w, (Continuation) obj4, 0);
                xVar.v = (gkl.o) obj3;
                return xVar.invokeSuspend(Unit.f186387a);
            case 1:
                x xVar2 = new x((dp4.o0) this.f6111w, (Continuation) obj4, 1);
                xVar2.v = (List) obj3;
                return xVar2.invokeSuspend(Unit.f186387a);
            case 2:
                x xVar3 = new x((pfk.p0) this.f6111w, (Continuation) obj4, 2);
                xVar3.v = (hha.l) obj3;
                return xVar3.invokeSuspend(Unit.f186387a);
            case 3:
                x xVar4 = new x((qt8.l) this.f6111w, (Continuation) obj4, 3);
                xVar4.v = (yt8.d) obj3;
                return xVar4.invokeSuspend(Unit.f186387a);
            case 4:
                x xVar5 = new x((qt8.l) this.f6111w, (Continuation) obj4, 4);
                xVar5.v = (yt8.c) obj3;
                return xVar5.invokeSuspend(Unit.f186387a);
            case 5:
                x xVar6 = new x((Set) this.f6111w, (Continuation) obj4, 5);
                xVar6.v = (Throwable) obj3;
                return xVar6.invokeSuspend(Unit.f186387a);
            case 6:
                x xVar7 = new x((xce.f) this.f6111w, (Continuation) obj4, 6);
                xVar7.v = (k7d.d) obj3;
                return xVar7.invokeSuspend(Unit.f186387a);
            default:
                x xVar8 = new x((xr3.k) this.f6111w, (Continuation) obj4, 7);
                xVar8.v = (cs3.b) obj3;
                return xVar8.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Object obj3 = this.f6111w;
        switch (i) {
            case 0:
                gkl.o oVar = (gkl.o) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((z) obj3).d.G(oVar, "CONFIG", wim.z.d(kotlin.jvm.internal.o0.b(gkl.o.class)));
                break;
            case 1:
                List list = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xx4.e eVar = ((dp4.o0) obj3).f116673c;
                List list2 = list;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(ngm.n.D((yw4.p) it8.next()));
                }
                eVar.b(cp4.o.f107837a, arrayList);
                break;
            case 2:
                hha.l lVar = (hha.l) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((pfk.p0) obj3).f235670c.G(io3.h.N(lVar), "STORAGE_KEY_PLAN_CAMPAIGNS", wim.z.d(kotlin.jvm.internal.o0.b(zek.n.class)));
                break;
            case 3:
                yt8.d dVar = (yt8.d) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((qt8.l) obj3).f249029b.G(mif.e0.M(dVar), "KYC_ADDRESSES_CACHE_KEY", wim.z.d(kotlin.jvm.internal.o0.b(rt8.c.class)));
                break;
            case 4:
                yt8.c cVar = (yt8.c) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((qt8.l) obj3).f249029b.G(c6d.b.Q(cVar), "kyc_state", wim.z.d(kotlin.jvm.internal.o0.b(vt8.e.class)));
                break;
            case 5:
                Throwable th10 = (Throwable) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th10, (Set) obj3);
                break;
            case 6:
                k7d.d dVar2 = (k7d.d) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((xce.f) obj3).f304121c.G(dVar2, "troubleshootingSuggestions", wim.z.d(kotlin.jvm.internal.o0.b(k7d.d.class)));
                break;
            default:
                cs3.b bVar = (cs3.b) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((xr3.k) obj3).d.G(yoj.b.O(bVar), "credit-configuration", wim.z.d(kotlin.jvm.internal.o0.b(tr3.a.class)));
                break;
        }
        return Unit.f186387a;
    }
}
