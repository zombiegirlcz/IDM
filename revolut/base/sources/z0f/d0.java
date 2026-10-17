package z0f;

import com.revolut.data.model.Data;
import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.feature.topup_screen.impl.screens.topup_methods.TopupMethodsScreenContract$InputData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class d0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f0 f318248w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(f0 f0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f318248w = f0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d0 d0Var = new d0(this.f318248w, continuation, 0);
                d0Var.v = obj2;
                return d0Var;
            case 1:
                d0 d0Var2 = new d0(this.f318248w, continuation, 1);
                d0Var2.v = obj2;
                return d0Var2;
            case 2:
                d0 d0Var3 = new d0(this.f318248w, continuation, 2);
                d0Var3.v = obj2;
                return d0Var3;
            case 3:
                d0 d0Var4 = new d0(this.f318248w, continuation, 3);
                d0Var4.v = obj2;
                return d0Var4;
            default:
                d0 d0Var5 = new d0(this.f318248w, continuation, 4);
                d0Var5.v = obj2;
                return d0Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d0) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d0) create((xi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((d0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d0) create((TopupMethod) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ArrayList arrayListF0;
        int i = this.u;
        f0 f0Var = this.f318248w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f0Var.H2(f0Var.A, new yvk.n(data, 9));
                break;
            case 1:
                yhm.r rVar = (yhm.r) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list = (List) rVar.f314201a;
                List list2 = (List) rVar.f314202b;
                Set set = (Set) rVar.f314203c;
                List listO0 = list2;
                if (listO0.isEmpty()) {
                    listO0 = zhm.d0.O0(set);
                }
                List list3 = listO0;
                TopupMethodsScreenContract$InputData topupMethodsScreenContract$InputData = f0Var.o;
                String str = topupMethodsScreenContract$InputData.f91102a;
                if (topupMethodsScreenContract$InputData.f91103b != yte.n.JOINT || list3.contains(str)) {
                    List list4 = list3;
                    xi0.a aVar3 = xi0.b.Companion;
                    ArrayList arrayList = new ArrayList(zhm.w.t(list4, 10));
                    Iterator it8 = list4.iterator();
                    while (it8.hasNext()) {
                        t61.a.A(aVar3, (String) it8.next(), arrayList);
                    }
                    arrayListF0 = arrayList;
                } else {
                    List list5 = list3;
                    xi0.a aVar4 = xi0.b.Companion;
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(list5, 10));
                    Iterator it9 = list5.iterator();
                    while (it9.hasNext()) {
                        t61.a.A(aVar4, (String) it9.next(), arrayList2);
                    }
                    xi0.b.Companion.getClass();
                    arrayListF0 = zhm.d0.F0(xi0.a.a(str), arrayList2);
                }
                aim.e eVarB = zhm.u.b();
                xi0.b.Companion.getClass();
                eVarB.add(xi0.a.a(str));
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list) {
                    io3.d dVar = (io3.d) obj3;
                    if (!Intrinsics.f(dVar.f163147c, str) && list3.contains(dVar.f163147c)) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                Iterator it10 = arrayList3.iterator();
                while (it10.hasNext()) {
                    t61.a.A(xi0.b.Companion, ((io3.d) it10.next()).f163147c, arrayList4);
                }
                eVarB.addAll(zhm.d0.V0(arrayList4, 2));
                List listA = zhm.u.a(eVarB);
                if (listA.size() < 3) {
                    listA = zhm.d0.E0(zhm.d0.V0(zhm.d0.B0(arrayListF0, listA), 3 - listA.size()), listA);
                }
                f0Var.H2(f0Var.A, new yrb.i(listA, arrayListF0, 29));
                break;
            case 2:
                xi0.b bVar = (xi0.b) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cli.y yVar = f0Var.A;
                List list6 = ((q) ((j2) yVar.f22677a).getValue()).d;
                if (list6 == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Currency action was clicked while currencies weren't loaded");
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                } else if (list6.contains(bVar)) {
                    f0Var.H2(yVar, new vgc.b(19, bVar));
                } else {
                    f0Var.H2(yVar, new c9h.a(bVar, list6, 12));
                }
                break;
            case 3:
                Data data2 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f0Var.H2(f0Var.A, new yvk.n(data2, 10));
                break;
            default:
                TopupMethod topupMethod = (TopupMethod) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f0Var.H2(f0Var.A, new b0(topupMethod, 1));
                break;
        }
        return Unit.f186387a;
    }
}
