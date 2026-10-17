package pwc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a f240395w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f240396x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a aVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f240395w = aVar;
        this.f240396x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a0(this.f240395w, this.f240396x, continuation, 0);
            default:
                return new a0(this.f240395w, this.f240396x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = r0.u
            switch(r1) {
                case 0: goto L31;
                default: goto L7;
            }
        L7:
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L1c
            if (r2 != r3) goto L14
            yhm.o.b(r17)
            goto L2e
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1c:
            yhm.o.b(r17)
            com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a r2 = r0.f240395w
            wtc.k0 r2 = r2.A
            r0.v = r3
            java.lang.String r3 = r0.f240396x
            java.lang.Object r2 = r2.b(r3, r0)
            if (r2 != r1) goto L2e
            goto L30
        L2e:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L30:
            return r1
        L31:
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            java.lang.String r7 = r0.f240396x
            com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a r8 = r0.f240395w
            if (r2 == 0) goto L5b
            if (r2 == r5) goto L55
            if (r2 == r4) goto L51
            if (r2 != r3) goto L49
            yhm.o.b(r17)
            goto La0
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L51:
            yhm.o.b(r17)
            goto L95
        L55:
            yhm.o.b(r17)
            r2 = r17
            goto L69
        L5b:
            yhm.o.b(r17)
            w39.b r2 = r8.B
            r0.v = r5
            java.lang.Object r2 = oi0.d.o(r2, r0)
            if (r2 != r1) goto L69
            goto Lb9
        L69:
            com.revolut.feature.location.api.domain.models.location.LocationDomain r2 = (com.revolut.feature.location.api.domain.models.location.LocationDomain) r2
            if (r2 != 0) goto L8a
            buc.h r1 = r8.C
            r1.getClass()
            nii.y0 r1 = buc.h.a()
            kotlinx.coroutines.flow.Flow r9 = r8.X1(r1)
            o4a.b r12 = new o4a.b
            r1 = 18
            r12.<init>(r8, r7, r6, r1)
            r13 = 3
            r10 = 0
            r11 = 0
            yji.l.a1(r8, r9, r10, r11, r12, r13)
            kotlin.Unit r1 = kotlin.Unit.f186387a
            goto Lb9
        L8a:
            wtc.g0 r5 = r8.v
            r0.v = r4
            java.lang.Object r2 = r5.a(r7, r2, r0)
            if (r2 != r1) goto L95
            goto Lb9
        L95:
            wtc.k0 r2 = r8.A
            r0.v = r3
            java.lang.Object r2 = r2.b(r7, r0)
            if (r2 != r1) goto La0
            goto Lb9
        La0:
            mii.k r9 = new mii.k
            com.revolut.core.ui_kit.models.TextLocalisedClause r11 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.security_hub.api.R$string.security_hub_street_mode_trusted_wifi_suggestion_success
            r2 = 14
            r11.<init>(r1, r6, r6, r2)
            r14 = 0
            r15 = 28
            java.lang.String r10 = "WIFI_ADDED_AS_TRUSTED_SUCCESS_ID"
            r12 = 0
            r13 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            kotlinx.coroutines.flow.Flow r1 = r8.X1(r9)
        Lb9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pwc.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
