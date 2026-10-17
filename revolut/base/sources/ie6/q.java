package ie6;

import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.junior_remote_login.api.model.RemoteLoginInvitation;
import com.revolut.feature.subaccount.api.models.Subaccount;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.k1;
import nii.n1;
import zhm.d0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q() {
        super(2, null);
        this.u = 1;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q qVar = new q(2, 0, continuation);
                qVar.v = obj2;
                return qVar;
            case 1:
                q qVar2 = new q(2, 1, continuation);
                qVar2.v = obj2;
                return qVar2;
            case 2:
                q qVar3 = new q(2, 2, continuation);
                qVar3.v = obj2;
                return qVar3;
            case 3:
                q qVar4 = new q(2, 3, continuation);
                qVar4.v = obj2;
                return qVar4;
            case 4:
                q qVar5 = new q(2, 4, continuation);
                qVar5.v = obj2;
                return qVar5;
            case 5:
                q qVar6 = new q(2, 5, continuation);
                qVar6.v = obj2;
                return qVar6;
            case 6:
                q qVar7 = new q(2, 6, continuation);
                qVar7.v = obj2;
                return qVar7;
            case 7:
                q qVar8 = new q(2, 7, continuation);
                qVar8.v = obj2;
                return qVar8;
            case 8:
                q qVar9 = new q(2, 8, continuation);
                qVar9.v = obj2;
                return qVar9;
            case 9:
                q qVar10 = new q(2, 9, continuation);
                qVar10.v = obj2;
                return qVar10;
            case 10:
                q qVar11 = new q(2, 10, continuation);
                qVar11.v = obj2;
                return qVar11;
            case 11:
                q qVar12 = new q(2, 11, continuation);
                qVar12.v = obj2;
                return qVar12;
            case 12:
                q qVar13 = new q(2, 12, continuation);
                qVar13.v = obj2;
                return qVar13;
            case 13:
                q qVar14 = new q(2, 13, continuation);
                qVar14.v = obj2;
                return qVar14;
            case 14:
                q qVar15 = new q(2, 14, continuation);
                qVar15.v = obj2;
                return qVar15;
            case 15:
                q qVar16 = new q(2, 15, continuation);
                qVar16.v = obj2;
                return qVar16;
            case 16:
                q qVar17 = new q(2, 16, continuation);
                qVar17.v = obj2;
                return qVar17;
            case 17:
                q qVar18 = new q(2, 17, continuation);
                qVar18.v = obj2;
                return qVar18;
            case 18:
                q qVar19 = new q(2, 18, continuation);
                qVar19.v = obj2;
                return qVar19;
            case 19:
                q qVar20 = new q(2, 19, continuation);
                qVar20.v = obj2;
                return qVar20;
            case 20:
                q qVar21 = new q(2, 20, continuation);
                qVar21.v = obj2;
                return qVar21;
            case 21:
                q qVar22 = new q(2, 21, continuation);
                qVar22.v = obj2;
                return qVar22;
            case 22:
                q qVar23 = new q(2, 22, continuation);
                qVar23.v = obj2;
                return qVar23;
            case 23:
                q qVar24 = new q(2, 23, continuation);
                qVar24.v = obj2;
                return qVar24;
            case 24:
                q qVar25 = new q(2, 24, continuation);
                qVar25.v = obj2;
                return qVar25;
            case 25:
                q qVar26 = new q(2, 25, continuation);
                qVar26.v = obj2;
                return qVar26;
            case 26:
                q qVar27 = new q(2, 26, continuation);
                qVar27.v = obj2;
                return qVar27;
            case 27:
                q qVar28 = new q(2, 27, continuation);
                qVar28.v = obj2;
                return qVar28;
            case 28:
                q qVar29 = new q(2, 28, continuation);
                qVar29.v = obj2;
                return qVar29;
            default:
                q qVar30 = new q(2, 29, continuation);
                qVar30.v = obj2;
                return qVar30;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws jya.b {
        switch (this.u) {
            case 0:
                return ((q) create((i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((q) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                ((q) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return Boolean.FALSE;
            case 5:
                return ((q) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((q) create((kv.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((q) create((CreditCard) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((q) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((q) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                ((q) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return Boolean.FALSE;
            case 18:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((q) create((hha.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((q) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((q) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((q) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((q) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((q) create((xv.n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws jya.b {
        switch (this.u) {
            case 0:
                i iVar = (i) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf(iVar != i.LOADING);
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String str = "Error failing to fetch the remote configs: " + ((String) this.v);
                return Unit.f186387a;
            case 2:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf(!data.getLoading());
            case 3:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf((data2.getContent() == null && data2.getError() == null) ? false : true);
            case 4:
                Throwable th10 = (Throwable) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                return Boolean.FALSE;
            case 5:
                String str2 = (String) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return new jd7.e(str2);
            case 6:
                Data data3 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                RemoteLoginInvitation remoteLoginInvitation = data3 != null ? (RemoteLoginInvitation) data3.getContent() : null;
                if ((remoteLoginInvitation instanceof RemoteLoginInvitation.Absent) || (remoteLoginInvitation instanceof RemoteLoginInvitation.Pending) || remoteLoginInvitation == null) {
                    return pe8.a.f235336a;
                }
                if (remoteLoginInvitation instanceof RemoteLoginInvitation.Accepted) {
                    return new pe8.b(Unit.f186387a);
                }
                throw new NoWhenBranchMatchedException();
            case 7:
                kv.g gVar = (kv.g) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if ((gVar instanceof kv.d) && (((kv.d) gVar).f189888a instanceof gv.k)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                Data data4 = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (data4.getError() == null) {
                    return Unit.f186387a;
                }
                throw new jya.b(data4);
            case 9:
                CreditCard creditCard = (CreditCard) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return creditCard.f69793b;
            case 10:
                Data data5 = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf((data5.getContent() == null && data5.getLoading()) ? false : true);
            case 11:
                Data data6 = (Data) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf(data6 == null || data6.getContent() != null);
            case 12:
                Data data7 = (Data) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf(data7.getLoading());
            case 13:
                Data data8 = (Data) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf(data8.getContent() != null);
            case 14:
                Data data9 = (Data) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf(data9.getContent() != null);
            case 15:
                yhm.r rVar = (yhm.r) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yhm.r rVar2 = (yhm.r) rVar.f314201a;
                yhm.r rVar3 = (yhm.r) rVar.f314202b;
                Pair pair = (Pair) rVar.f314203c;
                return new vf0.g((lsd.c) rVar2.f314201a, (lsd.c) rVar2.f314202b, (lsd.c) rVar2.f314203c, (lsd.c) rVar3.f314201a, (lsd.c) rVar3.f314202b, (lsd.c) rVar3.f314203c, (List) pair.f186385a, (List) pair.f186386b);
            case 16:
                List list = (List) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!list.isEmpty()) {
                    List list2 = list;
                    if ((list2 instanceof Collection) && list2.isEmpty()) {
                        z = true;
                    } else {
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            if (!((sil.k) it8.next()).f263665b.isEmpty()) {
                            }
                        }
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 17:
                Throwable th11 = (Throwable) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th11, h0Var2);
                return Boolean.FALSE;
            case 18:
                Data data10 = (Data) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf((data10.getContent() == null && data10.getError() == null) ? false : true);
            case 19:
                Data data11 = (Data) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (data11.getLoading()) {
                    return Boolean.TRUE;
                }
                MultibancoWithdrawalCode multibancoWithdrawalCode = (MultibancoWithdrawalCode) data11.getContent();
                if (multibancoWithdrawalCode != null && c92.a.a(multibancoWithdrawalCode)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 20:
                Data data12 = (Data) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (data12.getLoading()) {
                    return Boolean.TRUE;
                }
                Iterable iterable = (List) data12.getContent();
                if (iterable == null) {
                    iterable = f0.f322471a;
                }
                Iterable iterable2 = iterable;
                if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                    Iterator it9 = iterable2.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            if (c92.a.a((MultibancoWithdrawalCode) it9.next())) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 21:
                hha.d dVar = (hha.d) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                hha.u.Companion.getClass();
                return Boolean.valueOf(hha.s.h(dVar, hha.u.Y));
            case 22:
                Pair pair2 = (Pair) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yhm.r rVar4 = (yhm.r) pair2.f186385a;
                Set set = (Set) pair2.f186386b;
                ArrayList arrayListE0 = d0.E0((List) rVar4.f314203c, d0.E0((List) rVar4.f314202b, (List) rVar4.f314201a));
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : arrayListE0) {
                    if (!set.contains(((Subaccount) obj3).getF88959a().f234881a)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 23:
                Pair pair3 = (Pair) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yhm.r rVar5 = (yhm.r) pair3.f186385a;
                return new vf0.h((k71.q) rVar5.f314201a, (List) rVar5.f314202b, (xi0.b) rVar5.f314203c, (List) pair3.f186386b);
            case 24:
                n1 n1Var = (n1) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf(n1Var instanceof k1);
            case 25:
                Data data13 = (Data) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf(data13.getLoading());
            case 26:
                Data data14 = (Data) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf(!data14.getLoading());
            case 27:
                Pair pair4 = (Pair) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yhm.r rVar6 = (yhm.r) pair4.f186385a;
                return new vf0.h((rr6.g) rVar6.f314201a, (rr6.j) rVar6.f314202b, (whf.p) rVar6.f314203c, (whf.p) pair4.f186386b);
            case 28:
                xv.n nVar = (xv.n) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return new lx.a(new ch0.a(nVar.f309130a, nVar.f309132c, nVar.d, nVar.f309131b, nVar.e), nVar.f, nVar.f309134h, nVar);
            default:
                Data data15 = (Data) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf(data15.getContent() != null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }
}
