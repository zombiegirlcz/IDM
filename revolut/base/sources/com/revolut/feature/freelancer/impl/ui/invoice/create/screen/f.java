package com.revolut.feature.freelancer.impl.ui.invoice.create.screen;

import au6.k2;
import com.revolut.feature.freelancer.common.models.FreelancerProfileSettings;
import com.revolut.feature.freelancer.impl.ui.invoice.create.screen.InvoiceCreateScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ g v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Continuation continuation) {
        super(2, continuation);
        this.v = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((FreelancerProfileSettings) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FreelancerProfileSettings freelancerProfileSettings = (FreelancerProfileSettings) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (freelancerProfileSettings.f == null) {
            g gVar = this.v;
            ue0.c cVar = ((k2) gVar.f73848p.f129237b).d;
            Type type = l21.d.e;
            Intrinsics.checkNotNullExpressionValue(type, "<get-BOOLEAN_TYPE>(...)");
            if (!((Boolean) cVar.v0(Boolean.FALSE, "STORAGE_KEY_GET_VAT_PROMPT", type)).booleanValue()) {
                oki.h.v2(gVar.A, InvoiceCreateScreenContract$ModalStep.VatPrompt.f73836a, ModalDestination.Style.POPUP.f98311a);
            }
        }
        return Unit.f186387a;
    }
}
