package sy6;

import cli.y;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ufm.n;
import vkm.j2;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.a f266637w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f266637w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f266637w, continuation, 0);
            default:
                return new k(this.f266637w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.a aVar = this.f266637w;
                y yVar = aVar.f73943r;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    FreelancerInvoiceSettings freelancerInvoiceSettings = (FreelancerInvoiceSettings) zi0.c.I(((f) ((j2) yVar.f22677a).getValue()).f266630a);
                    n nVarK = aVar.o.k(FreelancerInvoiceSettings.a(freelancerInvoiceSettings, ((f) ((j2) yVar.f22677a).getValue()).f266631b, ((f) ((j2) yVar.f22677a).getValue()).f266632c, ((f) ((j2) yVar.f22677a).getValue()).d, null, null, null, null, null, null, null, null, null, 16369));
                    this.v = 1;
                    if (nim.a.b(nVarK, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                aVar.B2();
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.a aVar4 = this.f266637w;
                    k kVar = new k(aVar4, null, 0);
                    this.v = 1;
                    if (u0.b0(aVar4.X(), "ADD_SETTINGS_SCHEDULE_SUBMIT_BUTTON_TAG", kVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
