package pv8;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends i implements Function2 {
    public int u;
    public final /* synthetic */ pw8.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.kyc.impl.flow.kyc.a f240010w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ wi0.b f240011x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(pw8.i iVar, com.revolut.feature.kyc.impl.flow.kyc.a aVar, wi0.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = iVar;
        this.f240010w = aVar;
        this.f240011x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.v, this.f240010w, this.f240011x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r1.a(r7) == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r8 == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        if (com.revolut.feature.kyc.impl.flow.kyc.a.I2(r0, (com.revolut.feature.terms.api.model.TermsScope) r3, r7.f240011x, r7) == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
    
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            com.revolut.feature.kyc.impl.flow.kyc.a r0 = r7.f240010w
            qv8.b r1 = r0.f77712q
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r7.u
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L21
            if (r3 == r6) goto L1c
            if (r3 == r5) goto L1c
            if (r3 != r4) goto L14
            goto L1c
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            yhm.o.b(r8)
            goto Lb1
        L21:
            yhm.o.b(r8)
            pw8.e r8 = pw8.e.f240345a
            pw8.i r3 = r7.v
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r3, r8)
            if (r8 == 0) goto L37
            r7.u = r6
            java.lang.Object r8 = r1.a(r7)
            if (r8 != r2) goto Lb1
            goto L7d
        L37:
            pw8.g r8 = pw8.g.f240348a
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r3, r8)
            if (r8 == 0) goto L55
            r7.u = r5
            cu8.i1 r8 = r1.f249543b
            com.revolut.feature.kyc.impl.f r8 = (com.revolut.feature.kyc.impl.f) r8
            pfm.a r8 = r8.l3()
            java.lang.Object r8 = nim.a.a(r8, r7)
            if (r8 != r2) goto L50
            goto L52
        L50:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L52:
            if (r8 != r2) goto Lb1
            goto L7d
        L55:
            boolean r8 = r3 instanceof pw8.f
            r1 = 0
            if (r8 == 0) goto L93
            pw8.f r3 = (pw8.f) r3
            java.lang.String r8 = r3.f240346a
            java.lang.String r5 = "US_VISA_DISCLOSURE_SUBTITLE_LIST_ID"
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r8, r5)
            if (r5 == 0) goto L7e
            java.lang.Object r3 = r3.f240347b
            boolean r5 = r3 instanceof com.revolut.feature.terms.api.model.TermsScope
            if (r5 == 0) goto L7e
            java.lang.String r8 = "null cannot be cast to non-null type com.revolut.feature.terms.api.model.TermsScope"
            kotlin.jvm.internal.Intrinsics.i(r3, r8)
            com.revolut.feature.terms.api.model.TermsScope r3 = (com.revolut.feature.terms.api.model.TermsScope) r3
            r7.u = r4
            wi0.b r8 = r7.f240011x
            java.lang.Object r8 = com.revolut.feature.kyc.impl.flow.kyc.a.I2(r0, r3, r8, r7)
            if (r8 != r2) goto Lb1
        L7d:
            return r2
        L7e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "KycFlowModel : Unexpected Clause Clicked Output for id : "
            java.lang.String r8 = j6.a.q(r2, r8)
            r0.<init>(r8)
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            rd0.d.a(r2, r1, r1, r0, r8)
            goto Lb1
        L93:
            boolean r8 = r3 instanceof pw8.h
            if (r8 == 0) goto Lb4
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            pw8.h r3 = (pw8.h) r3
            com.revolut.core.ui_kit.delegates.ProductSelectionDelegate$Model r0 = r3.f240349a
            java.lang.String r0 = r0.f52973a
            java.lang.String r2 = "KycFlowModel : Unexpected ProductSelected Output for model id : "
            java.lang.String r0 = j6.a.q(r2, r0)
            r8.<init>(r0)
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            rd0.d.a(r2, r1, r1, r8, r0)
        Lb1:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        Lb4:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: pv8.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
