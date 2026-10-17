package com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.flow;

import com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.flow.BillsCatalogueFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function2 {
    public b u;
    public yki.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f78749w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f78750x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.f78750x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.f78750x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        yki.i iVar;
        yki.i iVar2;
        BillsCatalogueFlowContract$Step billers;
        b bVar = this.f78750x;
        BillsCatalogueFlowContract$InputData billsCatalogueFlowContract$InputData = bVar.o;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f78749w;
        if (i == 0) {
            o.b(obj2);
            iVar = bVar.f78755t;
            String str = billsCatalogueFlowContract$InputData.f78744c;
            if (str != null) {
                this.u = bVar;
                this.v = iVar;
                this.f78749w = 1;
                Object objI2 = b.I2(bVar, str, this);
                if (objI2 == aVar) {
                    return aVar;
                }
                iVar2 = iVar;
                obj2 = objI2;
            }
            iVar2 = iVar;
            billers = new BillsCatalogueFlowContract$Step.Billers(billsCatalogueFlowContract$InputData.f78743b);
            h.u2(bVar, iVar2, billers, null, 6);
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        yki.i iVar3 = this.v;
        b bVar2 = this.u;
        o.b(obj2);
        iVar2 = iVar3;
        bVar = bVar2;
        billers = (BillsCatalogueFlowContract$Step) obj2;
        if (billers == null) {
            iVar = iVar2;
            iVar2 = iVar;
            billers = new BillsCatalogueFlowContract$Step.Billers(billsCatalogueFlowContract$InputData.f78743b);
        }
        h.u2(bVar, iVar2, billers, null, 6);
        return Unit.f186387a;
    }
}
