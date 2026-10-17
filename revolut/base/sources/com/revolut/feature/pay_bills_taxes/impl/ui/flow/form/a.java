package com.revolut.feature.pay_bills_taxes.impl.ui.flow.form;

import com.revolut.feature.apm.bills.core.api.model.Bill;
import com.revolut.feature.apm.bills.core.api.model.form.BillFormV2;
import com.revolut.feature.pay_bills_taxes.impl.ui.flow.form.FormFlowContract$Step;
import elm.f;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import skm.e0;
import skm.p0;
import vp1.c;
import xo1.d;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function1 {
    public BillFormV2 u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f78701w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.f78701w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f78701w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        BillFormV2 billFormV2;
        Bill bill;
        b bVar = this.f78701w;
        FormFlowContract$InputData formFlowContract$InputData = bVar.f78702p;
        wo1.b bVar2 = bVar.o;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            d dVar = new d(formFlowContract$InputData.f78696a, null, null, 30);
            this.v = 1;
            rp1.d dVar2 = new rp1.d(((c) bVar2).f291042a, dVar, null, 0);
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(f.f127540b, dVar2, this);
            if (obj2 != aVar) {
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            billFormV2 = this.u;
            o.b(obj2);
            bill = (Bill) obj2;
            h.u2(bVar, bVar.f78703q, new FormFlowContract$Step.Form(bVar.f78702p.f78696a, billFormV2, bill), null, 6);
            return Unit.f186387a;
        }
        o.b(obj2);
        BillFormV2 billFormV22 = (BillFormV2) obj2;
        String str = formFlowContract$InputData.f78697b;
        if (str == null) {
            billFormV2 = billFormV22;
            bill = null;
            h.u2(bVar, bVar.f78703q, new FormFlowContract$Step.Form(bVar.f78702p.f78696a, billFormV2, bill), null, 6);
            return Unit.f186387a;
        }
        this.u = billFormV22;
        this.v = 2;
        Object objA = ((c) bVar2).a(str, this);
        if (objA != aVar) {
            billFormV2 = billFormV22;
            obj2 = objA;
            bill = (Bill) obj2;
            h.u2(bVar, bVar.f78703q, new FormFlowContract$Step.Form(bVar.f78702p.f78696a, billFormV2, bill), null, 6);
            return Unit.f186387a;
        }
        return aVar;
    }
}
