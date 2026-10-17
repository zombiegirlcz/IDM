package d4f;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import dej.j0;
import dej.k0;
import dej.o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.l1;
import nii.n1;
import rp0.c1;
import rp0.e1;
import vf0.y;
import xg0.t;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                m mVar = new m(2, 0, continuation);
                mVar.v = obj2;
                return mVar;
            case 1:
                m mVar2 = new m(2, 1, continuation);
                mVar2.v = obj2;
                return mVar2;
            case 2:
                m mVar3 = new m(2, 2, continuation);
                mVar3.v = obj2;
                return mVar3;
            case 3:
                m mVar4 = new m(2, 3, continuation);
                mVar4.v = obj2;
                return mVar4;
            case 4:
                m mVar5 = new m(2, 4, continuation);
                mVar5.v = obj2;
                return mVar5;
            case 5:
                m mVar6 = new m(2, 5, continuation);
                mVar6.v = obj2;
                return mVar6;
            case 6:
                m mVar7 = new m(2, 6, continuation);
                mVar7.v = obj2;
                return mVar7;
            case 7:
                m mVar8 = new m(2, 7, continuation);
                mVar8.v = obj2;
                return mVar8;
            case 8:
                m mVar9 = new m(2, 8, continuation);
                mVar9.v = obj2;
                return mVar9;
            case 9:
                m mVar10 = new m(2, 9, continuation);
                mVar10.v = obj2;
                return mVar10;
            case 10:
                m mVar11 = new m(2, 10, continuation);
                mVar11.v = obj2;
                return mVar11;
            case 11:
                m mVar12 = new m(2, 11, continuation);
                mVar12.v = obj2;
                return mVar12;
            case 12:
                m mVar13 = new m(2, 12, continuation);
                mVar13.v = obj2;
                return mVar13;
            case 13:
                m mVar14 = new m(2, 13, continuation);
                mVar14.v = obj2;
                return mVar14;
            case 14:
                m mVar15 = new m(2, 14, continuation);
                mVar15.v = obj2;
                return mVar15;
            case 15:
                m mVar16 = new m(2, 15, continuation);
                mVar16.v = obj2;
                return mVar16;
            case 16:
                m mVar17 = new m(2, 16, continuation);
                mVar17.v = obj2;
                return mVar17;
            case 17:
                m mVar18 = new m(2, 17, continuation);
                mVar18.v = obj2;
                return mVar18;
            case 18:
                m mVar19 = new m(2, 18, continuation);
                mVar19.v = obj2;
                return mVar19;
            case 19:
                m mVar20 = new m(2, 19, continuation);
                mVar20.v = obj2;
                return mVar20;
            case 20:
                m mVar21 = new m(2, 20, continuation);
                mVar21.v = obj2;
                return mVar21;
            case 21:
                m mVar22 = new m(2, 21, continuation);
                mVar22.v = obj2;
                return mVar22;
            case 22:
                m mVar23 = new m(2, 22, continuation);
                mVar23.v = obj2;
                return mVar23;
            case 23:
                m mVar24 = new m(2, 23, continuation);
                mVar24.v = obj2;
                return mVar24;
            case 24:
                m mVar25 = new m(2, 24, continuation);
                mVar25.v = obj2;
                return mVar25;
            case 25:
                m mVar26 = new m(2, 25, continuation);
                mVar26.v = obj2;
                return mVar26;
            case 26:
                m mVar27 = new m(2, 26, continuation);
                mVar27.v = obj2;
                return mVar27;
            case 27:
                m mVar28 = new m(2, 27, continuation);
                mVar28.v = obj2;
                return mVar28;
            case 28:
                m mVar29 = new m(2, 28, continuation);
                mVar29.v = obj2;
                return mVar29;
            default:
                m mVar30 = new m(2, 29, continuation);
                mVar30.v = obj2;
                return mVar30;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((m) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((m) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((m) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((m) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((m) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((m) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                ((m) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return Boolean.TRUE;
            case 7:
                return ((m) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((m) create((xg0.p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((m) create((e1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((m) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((m) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                ((m) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return Boolean.TRUE;
            case 13:
                return ((m) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((m) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((m) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((m) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((m) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((m) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((m) create((gie.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((m) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((m) create((gs.k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((m) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((m) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((m) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((m) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((m) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                ((m) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return Boolean.FALSE;
            case 28:
                return ((m) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                ((m) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return Boolean.TRUE;
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        Object next2;
        Object next3;
        switch (this.u) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf(Intrinsics.f(data.getContent(), Boolean.TRUE) || !data.getLoading());
            case 1:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yhm.r rVar = (yhm.r) pair.f186385a;
                Object obj3 = pair.f186386b;
                Object obj4 = rVar.f314201a;
                Object obj5 = rVar.f314202b;
                List list = (List) obj3;
                List list2 = (List) obj4;
                List list3 = (List) ((Pair) rVar.f314203c).f186386b;
                aim.e eVarB = u.b();
                for (StakingProduct stakingProduct : (List) obj5) {
                    Iterator it8 = list2.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next = it8.next();
                            StakingPocket stakingPocket = (StakingPocket) next;
                            if (!Intrinsics.f(stakingPocket.f88082b.f88086a, stakingProduct.f88086a) || stakingPocket.f88084g.k()) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    StakingPocket stakingPocket2 = (StakingPocket) next;
                    Iterator it9 = list3.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            next2 = it9.next();
                            io3.d dVar = (io3.d) next2;
                            if (!Intrinsics.f(dVar.f163147c, stakingProduct.d.f306286a) || dVar.e != io3.l.CURRENT || dVar.i == 0) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    io3.d dVar2 = (io3.d) next2;
                    Iterator it10 = list.iterator();
                    while (true) {
                        if (it10.hasNext()) {
                            next3 = it10.next();
                            if (Intrinsics.f(((qta.c) next3).f249046a, stakingProduct.d)) {
                            }
                        } else {
                            next3 = null;
                        }
                    }
                    qta.c cVar = (qta.c) next3;
                    if (stakingPocket2 != null || dVar2 != null) {
                        eVarB.add(new we5.a(stakingProduct, stakingPocket2, dVar2, cVar));
                    }
                }
                return u.a(eVarB);
            case 2:
                List<o0> list4 = (List) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ArrayList arrayList = new ArrayList();
                for (o0 o0Var : list4) {
                    String str = ((o0Var instanceof j0) || (o0Var instanceof k0)) ? null : o0Var.a().f100423a;
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                return arrayList;
            case 3:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf((data2.getContent() == null && data2.getLoading()) ? false : true);
            case 4:
                n1 n1Var = (n1) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf(n1Var instanceof l1);
            case 5:
                Pair pair2 = (Pair) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yhm.r rVar2 = (yhm.r) pair2.f186385a;
                return new vf0.h((hha.d) rVar2.f314201a, (List) rVar2.f314202b, (List) rVar2.f314203c, (xi0.b) pair2.f186386b);
            case 6:
                Throwable th10 = (Throwable) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                return Boolean.TRUE;
            case 7:
                Pair pair3 = (Pair) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yhm.r rVar3 = (yhm.r) pair3.f186385a;
                yhm.r rVar4 = (yhm.r) pair3.f186386b;
                return new y((od0.i) rVar3.f314201a, (ll4.u) rVar3.f314202b, (List) rVar3.f314203c, Boolean.valueOf(((Boolean) rVar4.f314201a).booleanValue()), (wi0.b) rVar4.f314202b, (List) rVar4.f314203c);
            case 8:
                xg0.p pVar = (xg0.p) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if ((pVar instanceof xg0.q) || (pVar instanceof xg0.k) || (pVar instanceof xg0.o) || (pVar instanceof t)) {
                    z = true;
                } else if (!(pVar instanceof xg0.n) && !(pVar instanceof xg0.m) && !(pVar instanceof xg0.r) && !(pVar instanceof xg0.s)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Boolean.valueOf(z);
            case 9:
                e1 e1Var = (e1) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf(e1Var instanceof c1);
            case 10:
                Data data3 = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf(!data3.getLoading());
            case 11:
                Data data4 = (Data) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf(!data4.getLoading());
            case 12:
                Throwable th11 = (Throwable) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "Revolut SSO", null, th11, h0Var2);
                return Boolean.TRUE;
            case 13:
                Pair pair4 = (Pair) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yhm.r rVar5 = (yhm.r) pair4.f186385a;
                return new vf0.h((od0.i) rVar5.f314201a, (rr6.m) rVar5.f314202b, (od0.i) rVar5.f314203c, (String) pair4.f186386b);
            case 14:
                Pair pair5 = (Pair) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yhm.r rVar6 = (yhm.r) pair5.f186385a;
                return new vf0.h((CreditCard) rVar6.f314201a, (od0.i) rVar6.f314202b, (od0.i) rVar6.f314203c, (wi0.b) pair5.f186386b);
            case 15:
                Data data5 = (Data) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf(!data5.getLoading());
            case 16:
                Data data6 = (Data) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf(!data6.getLoading());
            case 17:
                Data data7 = (Data) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf(!data7.getLoading());
            case 18:
                Pair pair6 = (Pair) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yhm.r rVar7 = (yhm.r) pair6.f186385a;
                return new vf0.h((Optional) rVar7.f314201a, Boolean.valueOf(((Boolean) rVar7.f314202b).booleanValue()), Boolean.valueOf(((Boolean) rVar7.f314203c).booleanValue()), (Optional) pair6.f186386b);
            case 19:
                gie.b bVar = (gie.b) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf(bVar == gie.b.FINISHED || bVar == gie.b.CANCELLED);
            case 20:
                Data data8 = (Data) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf(data8.getContent() != null);
            case 21:
                gs.k kVar = (gs.k) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return kVar.f146256a;
            case 22:
                Data data9 = (Data) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf(data9.getLoading());
            case 23:
                Pair pair7 = (Pair) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yhm.r rVar8 = (yhm.r) pair7.f186385a;
                Object obj6 = pair7.f186386b;
                Object obj7 = rVar8.f314201a;
                Object obj8 = rVar8.f314202b;
                Optional optional = (Optional) obj6;
                nel.n nVar = (nel.n) rVar8.f314203c;
                Optional optional2 = (Optional) obj7;
                if (oi0.d.B((r0) obj8)) {
                    return nVar.i;
                }
                if (!optional2.isPresent()) {
                    xi0.b bVar2 = (xi0.b) gj7.b.m(optional);
                    return bVar2 == null ? nVar.i : bVar2;
                }
                Object obj9 = optional2.get();
                Intrinsics.checkNotNullExpressionValue(obj9, "get(...)");
                return (xi0.b) obj9;
            case 24:
                List list5 = (List) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf(!list5.isEmpty());
            case 25:
                Data data10 = (Data) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Throwable error = data10.getError();
                if (error != null) {
                    h0 h0Var3 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, error, h0Var3);
                }
                return Unit.f186387a;
            case 26:
                Pair pair8 = (Pair) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yhm.r rVar9 = (yhm.r) pair8.f186385a;
                return new hp4.f((el4.a) rVar9.f314202b, (List) rVar9.f314201a, (yt8.c) rVar9.f314203c, (CreditCard) pair8.f186386b);
            case 27:
                Throwable th12 = (Throwable) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0 h0Var4 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th12, h0Var4);
                return Boolean.FALSE;
            case 28:
                Pair pair9 = (Pair) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yhm.r rVar10 = (yhm.r) pair9.f186385a;
                Pair pair10 = (Pair) pair9.f186386b;
                return new vf0.k((od0.i) rVar10.f314201a, (od0.i) rVar10.f314202b, (od0.i) rVar10.f314203c, (od0.i) pair10.f186385a, (od0.i) pair10.f186386b);
            default:
                Throwable th13 = (Throwable) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0 h0Var5 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th13, h0Var5);
                return Boolean.TRUE;
        }
    }
}
