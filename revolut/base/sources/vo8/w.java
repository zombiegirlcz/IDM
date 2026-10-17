package vo8;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ RowDelegate.Model v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b f290920w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(RowDelegate.Model model, com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = model;
        this.f290920w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new w(this.v, this.f290920w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((w) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (r0.c(r6, r8, r3, r7) == r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r0.a(r6, r8, r3, r7) == r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        return r2;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b r0 = r7.f290920w
            com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.JuniorSecurityAndPrivacyControllerContract$InputData r1 = r0.o
            kd8.e r0 = r0.f77335s
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r7.u
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L1f
            if (r3 == r5) goto L1b
            if (r3 != r4) goto L13
            goto L1b
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            yhm.o.b(r8)
            goto L4d
        L1f:
            yhm.o.b(r8)
            com.revolut.core.ui_kit.delegates.RowDelegate$Model r8 = r7.v
            java.lang.Object r8 = r8.u
            java.lang.String r3 = "null cannot be cast to non-null type com.revolut.feature.junior_consent.api.model.consent.JuniorConsent"
            kotlin.jvm.internal.Intrinsics.i(r8, r3)
            xc8.c r8 = (xc8.c) r8
            v6d.a r3 = r8.f304102b
            java.lang.String r6 = r8.f304101a
            boolean r8 = r8.b()
            if (r8 == 0) goto L42
            java.lang.String r8 = r1.f77325a
            r7.u = r5
            java.lang.Object r8 = r0.c(r6, r8, r3, r7)
            if (r8 != r2) goto L4d
            goto L4c
        L42:
            java.lang.String r8 = r1.f77325a
            r7.u = r4
            java.lang.Object r8 = r0.a(r6, r8, r3, r7)
            if (r8 != r2) goto L4d
        L4c:
            return r2
        L4d:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: vo8.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
