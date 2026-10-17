package xsd;

import aue.k;
import aue.l;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.camerakit.core.errors.CameraKitException;
import com.revolut.camerakit.core.errors.UnsupportedCameraInitException;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.models.error.CreditApplicationException;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.retail.trading.core.domain.PocketInfo;
import do3.n;
import io.reactivex.exceptions.CompositeException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ll4.u;
import nii.k1;
import nii.l1;
import nii.n1;
import ql4.q;
import xv.j;
import yhm.o;
import yhm.r;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a() {
        super(2, null);
        this.u = 7;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a aVar = new a(2, 0, continuation);
                aVar.v = obj2;
                return aVar;
            case 1:
                a aVar2 = new a(2, 1, continuation);
                aVar2.v = obj2;
                return aVar2;
            case 2:
                a aVar3 = new a(2, 2, continuation);
                aVar3.v = obj2;
                return aVar3;
            case 3:
                a aVar4 = new a(2, 3, continuation);
                aVar4.v = obj2;
                return aVar4;
            case 4:
                a aVar5 = new a(2, 4, continuation);
                aVar5.v = obj2;
                return aVar5;
            case 5:
                a aVar6 = new a(2, 5, continuation);
                aVar6.v = obj2;
                return aVar6;
            case 6:
                a aVar7 = new a(2, 6, continuation);
                aVar7.v = obj2;
                return aVar7;
            case 7:
                a aVar8 = new a(2, 7, continuation);
                aVar8.v = obj2;
                return aVar8;
            case 8:
                a aVar9 = new a(2, 8, continuation);
                aVar9.v = obj2;
                return aVar9;
            case 9:
                a aVar10 = new a(2, 9, continuation);
                aVar10.v = obj2;
                return aVar10;
            case 10:
                a aVar11 = new a(2, 10, continuation);
                aVar11.v = obj2;
                return aVar11;
            case 11:
                a aVar12 = new a(2, 11, continuation);
                aVar12.v = obj2;
                return aVar12;
            case 12:
                a aVar13 = new a(2, 12, continuation);
                aVar13.v = obj2;
                return aVar13;
            case 13:
                a aVar14 = new a(2, 13, continuation);
                aVar14.v = obj2;
                return aVar14;
            case 14:
                a aVar15 = new a(2, 14, continuation);
                aVar15.v = obj2;
                return aVar15;
            case 15:
                a aVar16 = new a(2, 15, continuation);
                aVar16.v = obj2;
                return aVar16;
            case 16:
                a aVar17 = new a(2, 16, continuation);
                aVar17.v = obj2;
                return aVar17;
            default:
                a aVar18 = new a(2, 17, continuation);
                aVar18.v = obj2;
                return aVar18;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((a) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object next;
        switch (this.u) {
            case 0:
                l35.g gVar = (l35.g) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return Boolean.valueOf(gVar.f191854a && gVar.f191855b && gVar.f191856c);
            case 1:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                r rVar = (r) pair.f186385a;
                Pair pair2 = (Pair) pair.f186386b;
                return new g((xi0.b) rVar.f314201a, (List) rVar.f314202b, (l35.e) rVar.f314203c, (cs3.b) pair2.f186385a, (n) pair2.f186386b);
            case 2:
                List list = (List) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Iterator it8 = list.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (((l) next).a() == aue.c.ACCOUNT_LIMIT) {
                        }
                    } else {
                        next = null;
                    }
                }
                if (next instanceof k) {
                    return (k) next;
                }
                return null;
            case 3:
                Data data = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return Boolean.valueOf(!data.getLoading());
            case 4:
                Data data2 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return Boolean.valueOf(!data2.getLoading());
            case 5:
                n1 n1Var = (n1) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return Boolean.valueOf(n1Var instanceof k1);
            case 6:
                Pair pair3 = (Pair) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                r rVar2 = (r) pair3.f186385a;
                Object obj3 = pair3.f186386b;
                return new vf0.h(Boolean.valueOf(((Boolean) rVar2.f314201a).booleanValue()), (m1h.h) rVar2.f314202b, (PocketInfo) rVar2.f314203c, (od0.i) obj3);
            case 7:
                Throwable th10 = (Throwable) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                gom.e.f145194a.e(th10);
                return Unit.f186387a;
            case 8:
                Throwable th11 = (Throwable) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                gom.e.f145194a.e(th11);
                return Unit.f186387a;
            case 9:
                Pair pair4 = (Pair) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                r rVar3 = (r) pair4.f186385a;
                return new vf0.h((xi0.b) rVar3.f314201a, (od0.i) rVar3.f314202b, (List) rVar3.f314203c, (xh9.d) pair4.f186386b);
            case 10:
                j jVar = (j) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                CameraKitException error = jVar.getError();
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                return Unit.f186387a;
            case 11:
                CameraKitException cameraKitException = (CameraKitException) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (!(cameraKitException instanceof UnsupportedCameraInitException)) {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, cameraKitException, h0Var2);
                }
                return Unit.f186387a;
            case 12:
                Data data3 = (Data) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Throwable error2 = data3.getError();
                if (error2 != null) {
                    if (error2 instanceof CreditApplicationException) {
                        throw ((CreditApplicationException) error2).f66910a;
                    }
                    if (error2 instanceof CompositeException) {
                        List<Throwable> list2 = ((CompositeException) error2).f163108a;
                        Intrinsics.checkNotNullExpressionValue(list2, "getExceptions(...)");
                        for (Throwable th12 : list2) {
                            if (th12 instanceof CreditApplicationException) {
                                throw ((CreditApplicationException) th12).f66910a;
                            }
                        }
                    } else if (error2 instanceof com.revolut.rxdata.core.CompositeException) {
                        for (Throwable th13 : ((com.revolut.rxdata.core.CompositeException) error2).f104678a) {
                            if (th13 instanceof CreditApplicationException) {
                                throw ((CreditApplicationException) th13).f66910a;
                            }
                        }
                    }
                }
                return Unit.f186387a;
            case 13:
                n1 n1Var2 = (n1) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return Boolean.valueOf(n1Var2 instanceof l1);
            case 14:
                zb6.o oVar = (zb6.o) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return t1.t(oVar.f320817b, oVar.f320816a);
            case 15:
                Data data4 = (Data) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return Boolean.valueOf(data4.getLoading());
            case 16:
                Pair pair5 = (Pair) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                r rVar4 = (r) pair5.f186385a;
                return new vf0.h((q) rVar4.f314201a, (od0.i) rVar4.f314202b, (u) rVar4.f314203c, (wi0.b) pair5.f186386b);
            default:
                Pair pair6 = (Pair) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                r rVar5 = (r) pair6.f186385a;
                return new vf0.h((FreelancerInvoice) rVar5.f314201a, (k6d.j) rVar5.f314202b, (k6d.h) rVar5.f314203c, (od0.i) pair6.f186386b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }
}
