package com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.flow;

import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubAssessmentStep;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubCalendarEvent;
import com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.flow.TaxHubAssessmentFlowContract$Step;
import ds6.n;
import gim.i;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;
import z27.k;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function2 {
    public b u;
    public yki.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f74259w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f74260x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f74261y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, k kVar, Continuation continuation) {
        super(2, continuation);
        this.f74260x = bVar;
        this.f74261y = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.f74260x, this.f74261y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        b bVar;
        yki.a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.f74259w;
        if (i == 0) {
            o.b(obj2);
            bVar = this.f74260x;
            yki.a aVar3 = bVar.f74264r;
            this.u = bVar;
            this.v = aVar3;
            this.f74259w = 1;
            Serializable serializableI2 = b.I2(bVar, this);
            if (serializableI2 == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
            obj2 = serializableI2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yki.a aVar4 = this.v;
            bVar = this.u;
            o.b(obj2);
            aVar = aVar4;
        }
        b bVar2 = bVar;
        wi0.b bVar3 = (wi0.b) obj2;
        z27.i iVar = (z27.i) this.f74261y;
        TaxHubCalendarEvent taxHubCalendarEvent = iVar.f318984b;
        String str = taxHubCalendarEvent.f73483a;
        TaxHubAssessmentStep taxHubAssessmentStep = iVar.f318983a;
        h.t2(bVar2, aVar, new TaxHubAssessmentFlowContract$Step.MakePayment(bVar3, str, taxHubAssessmentStep.f73480a, taxHubCalendarEvent.f73484b, taxHubAssessmentStep.f73482c == n.COMPLETED), true, null, false, 12);
        return Unit.f186387a;
    }
}
