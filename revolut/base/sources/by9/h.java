package by9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.recipients.settings.models.b f19786w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, com.revolut.feature.payments.recipients.settings.models.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = jVar;
        this.f19786w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.v, this.f19786w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
    
        if (r14 == r4) goto L22;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            com.revolut.feature.payments.recipients.settings.models.b r0 = r13.f19786w
            java.util.Set r1 = r0.f79684a
            com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings$Setting$Value$Binary r2 = r0.f79686c
            iy9.c r3 = r0.f79685b
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r13.u
            by9.j r6 = r13.v
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L27
            if (r5 == r8) goto L23
            if (r5 != r7) goto L1b
            yhm.o.b(r14)
            goto L92
        L1b:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L23:
            yhm.o.b(r14)
            goto L73
        L27:
            yhm.o.b(r14)
            com.revolut.feature.payments.recipients.settings.impl.data.network.RecipientPaymentsSettingsService r14 = r6.f19789a
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r5)
            java.lang.String r0 = r3.a()
            boolean r5 = r2.f79677a
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r9 = r1
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 10
            int r11 = zhm.w.t(r9, r11)
            r10.<init>(r11)
            java.util.Iterator r9 = r9.iterator()
        L4d:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L65
            java.lang.Object r11 = r9.next()
            com.revolut.feature.payments.recipients.settings.models.RecipientsPaymentsSettingsRequest$Recipient r11 = (com.revolut.feature.payments.recipients.settings.models.RecipientsPaymentsSettingsRequest$Recipient) r11
            iy9.d r12 = r11.f79680b
            java.lang.String r11 = r11.f79679a
            ey9.c r11 = by9.c.a(r12, r11)
            r10.add(r11)
            goto L4d
        L65:
            ey9.d r9 = new ey9.d
            r9.<init>(r0, r5, r10)
            r13.u = r8
            java.lang.Object r14 = r14.patchRecipientsSettings(r9, r13)
            if (r14 != r4) goto L73
            goto L91
        L73:
            com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings$Setting r14 = new com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings$Setting
            r14.<init>(r3, r2)
            r13.u = r7
            by9.i r0 = new by9.i
            r2 = 0
            r0.<init>(r6, r1, r14, r2)
            skm.p0 r14 = skm.p0.f264001a
            elm.f r14 = elm.f.f127540b
            java.lang.Object r14 = skm.e0.J(r14, r0, r13)
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            if (r14 != r0) goto L8d
            goto L8f
        L8d:
            kotlin.Unit r14 = kotlin.Unit.f186387a
        L8f:
            if (r14 != r4) goto L92
        L91:
            return r4
        L92:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: by9.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
