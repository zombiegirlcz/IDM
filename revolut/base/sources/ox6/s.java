package ox6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a f230640w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ FreelancerInvoice f230641x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a aVar, FreelancerInvoice freelancerInvoice, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f230640w = aVar;
        this.f230641x = freelancerInvoice;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s(this.f230640w, this.f230641x, continuation, 0);
            case 1:
                return new s(this.f230640w, this.f230641x, continuation, 1);
            case 2:
                return new s(this.f230640w, this.f230641x, continuation, 2);
            case 3:
                return new s(this.f230640w, this.f230641x, continuation, 3);
            case 4:
                return new s(this.f230640w, this.f230641x, continuation, 4);
            case 5:
                return new s(this.f230640w, this.f230641x, continuation, 5);
            case 6:
                return new s(this.f230640w, this.f230641x, continuation, 6);
            case 7:
                return new s(this.f230640w, this.f230641x, continuation, 7);
            default:
                return new s(this.f230640w, this.f230641x, continuation, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a aVar2 = this.f230640w;
                r rVar = new r(aVar2, this.f230641x, null, 1);
                this.v = 1;
                Object objB = pu7.a.B(aVar2.k, "cancel_invoice", rVar, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a aVar4 = this.f230640w;
                r rVar2 = new r(aVar4, this.f230641x, null, 3);
                this.v = 1;
                Object objB2 = pu7.a.B(aVar4.k, "delete_invoice", rVar2, this);
                return objB2 == aVar3 ? aVar3 : objB2;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a aVar6 = this.f230640w;
                r rVar3 = new r(aVar6, this.f230641x, null, 5);
                this.v = 1;
                Object objB3 = pu7.a.B(aVar6.k, "download_pdf", rVar3, this);
                return objB3 == aVar5 ? aVar5 : objB3;
            case 3:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a aVar8 = this.f230640w;
                r rVar4 = new r(aVar8, this.f230641x, null, 7);
                this.v = 1;
                Object objB4 = pu7.a.B(aVar8.k, "duplicate_invoice", rVar4, this);
                return objB4 == aVar7 ? aVar7 : objB4;
            case 4:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a aVar10 = this.f230640w;
                r rVar5 = new r(aVar10, this.f230641x, null, 9);
                this.v = 1;
                Object objB5 = pu7.a.B(aVar10.k, "mark_invoice_as_paid", rVar5, this);
                return objB5 == aVar9 ? aVar9 : objB5;
            case 5:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a aVar12 = this.f230640w;
                r rVar6 = new r(aVar12, this.f230641x, null, 11);
                this.v = 1;
                Object objB6 = pu7.a.B(aVar12.k, "preview_invoice_email", rVar6, this);
                return objB6 == aVar11 ? aVar11 : objB6;
            case 6:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a aVar14 = this.f230640w;
                r rVar7 = new r(aVar14, this.f230641x, null, 13);
                this.v = 1;
                Object objB7 = pu7.a.B(aVar14.k, "resend_invoice", rVar7, this);
                return objB7 == aVar13 ? aVar13 : objB7;
            case 7:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a aVar16 = this.f230640w;
                r rVar8 = new r(aVar16, this.f230641x, null, 15);
                this.v = 1;
                Object objB8 = pu7.a.B(aVar16.k, "send_invoice", rVar8, this);
                return objB8 == aVar15 ? aVar15 : objB8;
            default:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a aVar18 = this.f230640w;
                mcg.j jVar = new mcg.j(aVar18, this.f230641x, null, 7);
                this.v = 1;
                Object objB9 = pu7.a.B(aVar18.k, "show_actions_bottom_dialog", jVar, this);
                return objB9 == aVar17 ? aVar17 : objB9;
        }
    }
}
