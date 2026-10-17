package oy6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceRecurringPeriod;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import et6.p1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends gim.i implements Function1 {
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.a f230908w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f230909x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.a aVar, f fVar, Continuation continuation) {
        super(1, continuation);
        this.f230908w = aVar;
        this.f230909x = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p(this.f230909x, this.f230908w, continuation);
            default:
                return new p(this.f230908w, this.f230909x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((p) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.a aVar2 = this.f230908w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    f fVar = this.f230909x;
                    j jVar = fVar.f230894c;
                    if (jVar == null) {
                        throw new IllegalArgumentException("isValid check guarantees recurring period exists");
                    }
                    p1 p1Var = aVar2.f73934p;
                    FreelancerInvoiceSettings freelancerInvoiceSettings = (FreelancerInvoiceSettings) zi0.c.I(fVar.f230892a);
                    i iVar = fVar.f230893b;
                    Integer numW = iVar != null ? iVar.w() : null;
                    sr6.l lVar = jVar.f230897a;
                    Integer num = jVar.f230898b;
                    ufm.n nVarK = p1Var.k(FreelancerInvoiceSettings.a(freelancerInvoiceSettings, null, null, null, null, null, null, null, null, new FreelancerInvoiceRecurringPeriod(lVar, num != null ? num.intValue() : 0), numW, null, null, 13311));
                    this.v = 1;
                    if (nim.a.b(nVarK, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar2.B2();
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    f fVar2 = this.f230909x;
                    com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.a aVar4 = this.f230908w;
                    p pVar = new p(fVar2, aVar4, (Continuation) null);
                    this.v = 1;
                    if (aVar4.p2(this, pVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(f fVar, com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.a aVar, Continuation continuation) {
        super(1, continuation);
        this.f230909x = fVar;
        this.f230908w = aVar;
    }
}
