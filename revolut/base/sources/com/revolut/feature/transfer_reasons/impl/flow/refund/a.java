package com.revolut.feature.transfer_reasons.impl.flow.refund;

import com.revolut.feature.transfer_reasons.impl.flow.refund.TransferReasonsRefundFlowContract$Step;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonCategory;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasons;
import dj0.d;
import dsf.e;
import gim.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import ptf.f;
import sdi.k;
import tof.a3;
import tof.o3;
import yhm.o;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f92365w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = fVar;
        this.f92365w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f92365w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        d dVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        f fVar = this.v;
        b bVar = this.f92365w;
        if (i == 0) {
            o.b(obj2);
            a3 a3Var = fVar.f239662a;
            d dVar2 = bVar.f92367q.f92353a;
            o3 o3Var = a3Var.J;
            if (o3Var == null || (dVar = o3Var.f272965a) == null) {
                dVar = a3Var.N1;
            }
            if (Intrinsics.f(dVar2, dVar.a())) {
                bVar.C2(new e(fVar.f239663b));
                return Unit.f186387a;
            }
            sb4.i iVar = new sb4.i(bVar, a3Var, null, 9);
            this.u = 1;
            obj2 = bVar.p2(this, iVar);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        TransferReasons transferReasons = (TransferReasons) obj2;
        List list = transferReasons != null ? transferReasons.f92439b : null;
        if (list == null) {
            list = f0.f322471a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (obj3 instanceof TransferReasonCategory) {
                arrayList.add(obj3);
            }
        }
        if (transferReasons == null || arrayList.isEmpty()) {
            l.a1(bVar, bVar.X1(isf.d.b(bVar.f92366p)), null, null, null, 7);
        } else {
            bVar.H2(bVar.f92370t, new k(transferReasons, qsf.k.a(bVar.f92368r, transferReasons, fVar.f239663b), 24));
            h.t2(bVar, bVar.u, new TransferReasonsRefundFlowContract$Step.ReasonsList(transferReasons.f92438a, arrayList), false, null, false, 14);
        }
        return Unit.f186387a;
    }
}
