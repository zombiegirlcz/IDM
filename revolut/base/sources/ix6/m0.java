package ix6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g f169401w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ FreelancerInvoice f169402x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g gVar, FreelancerInvoice freelancerInvoice, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f169401w = gVar;
        this.f169402x = freelancerInvoice;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m0(this.f169401w, this.f169402x, continuation, 0);
            case 1:
                return new m0(this.f169401w, this.f169402x, continuation, 1);
            case 2:
                return new m0(this.f169401w, this.f169402x, continuation, 2);
            default:
                return new m0(this.f169401w, this.f169402x, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((m0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g gVar = this.f169401w;
                g84.u uVar = new g84.u(gVar, this.f169402x, null, 29);
                this.v = 1;
                Object objP2 = gVar.p2(this, uVar);
                return objP2 == aVar ? aVar : objP2;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g gVar2 = this.f169401w;
                o0 o0Var = new o0(gVar2, this.f169402x, (Continuation) null, 0);
                this.v = 1;
                Object objB = pu7.a.B(gVar2.k, "add_invoice_item", o0Var, this);
                return objB == aVar2 ? aVar2 : objB;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                FreelancerInvoice freelancerInvoice = this.f169402x;
                com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g gVar3 = this.f169401w;
                o0 o0Var2 = new o0(freelancerInvoice, gVar3, (Continuation) null, 2);
                this.v = 1;
                Object objB2 = pu7.a.B(gVar3.k, "send_or_schedule_invoice", o0Var2, this);
                return objB2 == aVar3 ? aVar3 : objB2;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g gVar4 = this.f169401w;
                o0 o0Var3 = new o0(gVar4, this.f169402x, (Continuation) null, 4);
                this.v = 1;
                Object objB3 = pu7.a.B(gVar4.k, "delete_invoice", o0Var3, this);
                return objB3 == aVar4 ? aVar4 : objB3;
        }
    }
}
