package no6;

import com.revolut.feature.external_accounts.impl.ui.us.plaid.screen.webview.model.UsPlaidResponseEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ UsPlaidResponseEvent.Connected f217927w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, UsPlaidResponseEvent.Connected connected, Continuation continuation) {
        super(2, continuation);
        this.v = mVar;
        this.f217927w = connected;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.v, this.f217927w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r0 == r7) goto L15;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            r6 = r24
            fim.a r7 = fim.a.COROUTINE_SUSPENDED
            int r0 = r6.u
            r1 = 2
            r2 = 1
            com.revolut.feature.external_accounts.impl.ui.us.plaid.screen.webview.model.UsPlaidResponseEvent$Connected r8 = r6.f217927w
            no6.m r9 = r6.v
            r10 = 0
            if (r0 == 0) goto L25
            if (r0 == r2) goto L21
            if (r0 != r1) goto L19
            yhm.o.b(r25)
            r0 = r25
            goto L51
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L21:
            yhm.o.b(r25)
            goto L3d
        L25:
            yhm.o.b(r25)
            oe6.a r0 = r9.f217928p
            java.lang.String r3 = r8.d
            java.lang.String r4 = r8.f73084a
            xg6.j r0 = (xg6.j) r0
            pfm.r r0 = r0.n(r3, r4, r10)
            r6.u = r2
            java.lang.Object r0 = nim.a.a(r0, r6)
            if (r0 != r7) goto L3d
            goto L50
        L3d:
            oe6.h r0 = r9.f217929q
            java.lang.String r2 = r8.d
            r6.u = r1
            r4 = 10
            xg6.q r0 = (xg6.q) r0
            r1 = r2
            r2 = 2000(0x7d0, double:9.88E-321)
            java.io.Serializable r0 = r0.a(r1, r2, r4, r6)
            if (r0 != r7) goto L51
        L50:
            return r7
        L51:
            io3.d r0 = (io3.d) r0
            nii.y0 r1 = new nii.y0
            lo6.a r2 = r9.f217930r
            java.lang.String r3 = r8.e
            r2.getClass()
            java.lang.String r2 = "institutionName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            nii.j0 r11 = new nii.j0
            com.revolut.core.ui_kit.models.TextLocalisedClause r12 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.external_accounts.impl.R$string.external_institutions_linking_success_title
            java.util.List r3 = zhm.u.c(r3)
            r4 = 12
            r12.<init>(r2, r3, r10, r4)
            com.revolut.core.ui_kit.views.status.StatusViewContract$Duration$Custom r2 = new com.revolut.core.ui_kit.views.status.StatusViewContract$Duration$Custom
            r3 = 4000(0xfa0, double:1.9763E-320)
            r2.<init>(r3)
            r22 = 0
            r23 = 3582(0xdfe, float:5.02E-42)
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r20 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r2 = 0
            r3 = 4
            java.lang.String r4 = "SUCCESS_DIALOG_ID"
            r1.<init>(r4, r11, r2, r3)
            kotlinx.coroutines.flow.Flow r1 = r9.X1(r1)
            nn7.d r13 = new nn7.d
            r2 = 4
            r13.<init>(r9, r0, r10, r2)
            r14 = 3
            r11 = 0
            r12 = 0
            r10 = r1
            skm.a2 r0 = yji.l.a1(r9, r10, r11, r12, r13, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: no6.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
