package ga9;

import com.revolut.feature.onboarding.api.onboarding.models.EmailData;
import com.revolut.feature_retail_user_declarations.email.flow.EmailFlowOutputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class w extends gim.i implements Function1 {
    public EmailData u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EmailFlowOutputData f142106w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.onboarding.v f142107x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f142108y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(EmailFlowOutputData emailFlowOutputData, com.revolut.feature.onboarding.impl.onboarding.v vVar, boolean z, Continuation continuation) {
        super(1, continuation);
        this.f142106w = emailFlowOutputData;
        this.f142107x = vVar;
        this.f142108y = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new w(this.f142106w, this.f142107x, this.f142108y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((w) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a6, code lost:
    
        if (com.revolut.feature.onboarding.impl.onboarding.v.Y2(r0, r13, r12, 1) != r2) goto L27;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            com.revolut.feature.onboarding.impl.onboarding.v r0 = r12.f142107x
            qki.d r1 = r0.P
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r12.v
            com.revolut.feature_retail_user_declarations.email.flow.EmailFlowOutputData r4 = r12.f142106w
            r5 = 3
            r6 = 1
            r7 = 2
            r8 = 0
            if (r3 == 0) goto L2d
            if (r3 == r6) goto L29
            if (r3 == r7) goto L23
            if (r3 != r5) goto L1b
            yhm.o.b(r13)
            goto La9
        L1b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L23:
            com.revolut.feature.onboarding.api.onboarding.models.EmailData r1 = r12.u
            yhm.o.b(r13)
            goto L98
        L29:
            yhm.o.b(r13)
            goto L48
        L2d:
            yhm.o.b(r13)
            r13 = r4
            com.revolut.feature_retail_user_declarations.email.flow.EmailFlowOutputData$EmailData r13 = (com.revolut.feature_retail_user_declarations.email.flow.EmailFlowOutputData.EmailData) r13
            java.lang.String r13 = r13.d
            if (r13 == 0) goto L48
            yva.a r3 = r0.f78494t
            if (r13 != 0) goto L3d
            java.lang.String r13 = ""
        L3d:
            r12.v = r6
            cwa.j r3 = (cwa.j) r3
            java.lang.Object r13 = r3.a(r13, r8, r12)
            if (r13 != r2) goto L48
            goto La8
        L48:
            com.revolut.feature.onboarding.api.onboarding.models.EmailData r13 = new com.revolut.feature.onboarding.api.onboarding.models.EmailData
            com.revolut.feature_retail_user_declarations.email.flow.EmailFlowOutputData$EmailData r4 = (com.revolut.feature_retail_user_declarations.email.flow.EmailFlowOutputData.EmailData) r4
            java.lang.String r3 = r4.f97565a
            boolean r4 = r4.f97567c
            boolean r9 = r12.f142108y
            r13.<init>(r3, r4, r9)
            i1b.e r4 = r0.N
            r4.getClass()
            i1b.b r9 = i1b.b.Account
            i1b.d r10 = i1b.d.Email
            i1b.a r11 = i1b.a.Input
            i1b.e.a(r4, r9, r10, r11)
            fwj.d r4 = r0.O
            ho.t r4 = r4.f138661b
            ho.p r9 = new ho.p
            java.lang.String r10 = "Account_Email_input"
            r9.<init>(r10)
            r4.e2(r9)
            java.lang.Object r4 = r1.f22677a
            vkm.j2 r4 = (vkm.j2) r4
            java.lang.Object r4 = r4.getValue()
            com.revolut.feature.onboarding.impl.onboarding.OnboardingFlowContract$State r4 = (com.revolut.feature.onboarding.impl.onboarding.OnboardingFlowContract$State) r4
            g48.j r9 = new g48.j
            r10 = 28
            r9.<init>(r4, r13, r10)
            r0.H2(r1, r9)
            fwj.p r1 = r0.A
            o0j.h r4 = new o0j.h
            r4.<init>(r3)
            r12.u = r13
            r12.v = r7
            java.lang.Object r1 = r1.h(r4, r12)
            if (r1 != r2) goto L97
            goto La8
        L97:
            r1 = r13
        L98:
            ga9.v r13 = new ga9.v
            r3 = 0
            r13.<init>(r0, r1, r8, r3)
            r12.u = r8
            r12.v = r5
            java.lang.Object r13 = com.revolut.feature.onboarding.impl.onboarding.v.Y2(r0, r13, r12, r6)
            if (r13 != r2) goto La9
        La8:
            return r2
        La9:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ga9.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
