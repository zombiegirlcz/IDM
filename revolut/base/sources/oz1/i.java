package oz1;

import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ ApmPaymentAuthorisationPendingAction v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f231109w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ApmPaymentAuthorisationPaymentMethod f231110x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ApmPaymentAuthorisationPendingAction apmPaymentAuthorisationPendingAction, j jVar, ApmPaymentAuthorisationPaymentMethod apmPaymentAuthorisationPaymentMethod, Continuation continuation) {
        super(2, continuation);
        this.v = apmPaymentAuthorisationPendingAction;
        this.f231109w = jVar;
        this.f231110x = apmPaymentAuthorisationPaymentMethod;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.v, this.f231109w, this.f231110x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (skm.e0.J(elm.f.f127540b, r10, r16) == r8) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        if (r1 != r8) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            oz1.j r1 = r0.f231109w
            vz1.g r3 = r1.f231111a
            fim.a r8 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.u
            r9 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L27
            if (r2 == r5) goto L22
            if (r2 == r4) goto L1e
            if (r2 != r9) goto L16
            goto L22
        L16:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1e:
            yhm.o.b(r17)
            goto L89
        L22:
            yhm.o.b(r17)
            goto L9c
        L27:
            yhm.o.b(r17)
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction r2 = r0.v
            boolean r6 = r2 instanceof com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction.Amendment
            r14 = 0
            if (r6 == 0) goto L64
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction$Amendment r2 = (com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction.Amendment) r2
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationAmendment r2 = r2.f61990a
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod r13 = r2.e
            if (r13 == 0) goto L53
            iz1.j r11 = r1.f231112b
            java.lang.String r12 = r2.f61983a
            r0.u = r5
            r11.getClass()
            iz1.i r10 = new iz1.i
            r15 = 2
            r10.<init>(r11, r12, r13, r14, r15)
            skm.p0 r1 = skm.p0.f264001a
            elm.f r1 = elm.f.f127540b
            java.lang.Object r1 = skm.e0.J(r1, r10, r0)
            if (r1 != r8) goto L9c
            goto L9b
        L53:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "paymentMethod should not be null"
            r1.<init>(r2)
            zhm.h0 r2 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r3 = rd0.d.f253311a
            rd0.c r3 = rd0.c.ERROR
            rd0.d.a(r3, r14, r14, r1, r2)
            throw r1
        L64:
            boolean r1 = r2 instanceof com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction.Mandate
            if (r1 == 0) goto L9f
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction$Mandate r2 = (com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction.Mandate) r2
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary r1 = r2.f61991a
            java.lang.String r1 = r1.f61992a
            j02.o r5 = j02.o.USER_DOES_NOT_RECOGNISE_PAYMENT
            r0.u = r4
            r3.getClass()
            vq5.w r2 = new vq5.w
            r7 = 13
            r4 = r1
            r6 = r14
            r2.<init>(r3, r4, r5, r6, r7)
            skm.p0 r1 = skm.p0.f264001a
            elm.f r1 = elm.f.f127540b
            java.lang.Object r1 = skm.e0.J(r1, r2, r0)
            if (r1 != r8) goto L89
            goto L9b
        L89:
            r0.u = r9
            x4l.c r1 = r3.f293365c
            r2 = 0
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod r3 = r0.f231110x
            java.lang.Object r1 = r1.d(r3, r2, r0)
            if (r1 != r8) goto L97
            goto L99
        L97:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L99:
            if (r1 != r8) goto L9c
        L9b:
            return r8
        L9c:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        L9f:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: oz1.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
