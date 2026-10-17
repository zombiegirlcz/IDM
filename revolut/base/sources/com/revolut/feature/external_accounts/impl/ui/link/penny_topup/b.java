package com.revolut.feature.external_accounts.impl.ui.link.penny_topup;

import cn6.g;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.link.penny_topup.PennyTopUpFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.link.screens.iban.IbanScreenContract$InputData;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PennyTopUpFlowContract$Step.PaymentInitiationService f73039w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, PennyTopUpFlowContract$Step.PaymentInitiationService paymentInitiationService, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f73039w = paymentInitiationService;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f73039w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            r10.a aVar2 = dVar.f73041p;
            this.u = 1;
            obj2 = aVar2.a0(null, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        g gVar = (g) obj2;
        if (gVar != null) {
            yki.i iVar = dVar.v;
            PennyTopUpFlowContract$Step.PaymentInitiationService paymentInitiationService = this.f73039w;
            h.t2(dVar, iVar, new PennyTopUpFlowContract$Step.Iban(paymentInitiationService.f73033a, paymentInitiationService.f73034b, new IbanScreenContract$InputData(new TextLocalisedClause(R$string.external_institutions_penny_topup_payment_initiation_iban_input_title, null, null, 14), new TextLocalisedClause(R$string.external_institutions_penny_topup_payment_initiation_iban_input_subtitle, u.c(paymentInitiationService.f73033a.f66108b), null, 12), gVar.f25367a, gVar.f25368b, null)), true, null, false, 12);
        }
        return Unit.f186387a;
    }
}
