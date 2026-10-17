package rnb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rlh.d0;
import zhm.q0;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f255555w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f255555w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f255555w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            case 1:
                g gVar2 = new g(this.f255555w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
            case 2:
                g gVar3 = new g(this.f255555w, continuation, 2);
                gVar3.v = obj2;
                return gVar3;
            default:
                g gVar4 = new g(this.f255555w, continuation, 3);
                gVar4.v = obj2;
                return gVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((npg.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((g) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        w4l.j loadingStrategy = w4l.j.f294644c;
        i iVar = this.f255555w;
        switch (i) {
            case 0:
                npg.a aVar = (npg.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return nim.a.v(iVar.d(zhm.u.c(aVar.f218206b), loadingStrategy), new d0(aVar, 7));
            case 1:
                Pair pair = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pcd.s vault = (pcd.s) pair.f186385a;
                xi0.b baseCurrency = (xi0.b) pair.f186386b;
                ypg.p pVar = (ypg.p) iVar.f255558b;
                Intrinsics.checkNotNullParameter(vault, "vault");
                Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                long j2 = vault.f234885h.f234861c;
                xi0.b bVarU = kii.e.u(vault, xi0.b.Companion);
                dj0.d dVar = new dj0.d(j2, bVarU);
                return xam.a.h(new g(iVar, continuation, 0), bVarU.equals(baseCurrency) ? zi0.c.i(new npg.a(dVar, vault)) : nim.a.v(rd0.e.b(pVar.g(ypg.p.d(zhm.u.c(vault), baseCurrency), baseCurrency)), new xwd.o(vault, dVar, baseCurrency)));
            case 2:
                List list = (List) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List<npg.a> list2 = list;
                int iB = q0.b(zhm.w.t(list2, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (npg.a aVar5 : list2) {
                    linkedHashMap.put(((pcd.s) aVar5.f218206b).f234881a, aVar5.f218205a);
                }
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add((pcd.s) ((npg.a) it8.next()).f218206b);
                }
                return nim.a.v(iVar.d(arrayList, loadingStrategy), new awk.j(linkedHashMap, 17));
            default:
                Pair pair2 = (Pair) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return xam.a.h(new g(iVar, continuation, 2), ((ypg.p) iVar.f255558b).m((List) pair2.f186385a, (xi0.b) pair2.f186386b, loadingStrategy, npg.l.AMOUNT_BALANCE));
        }
    }
}
