package t48;

import com.revolut.feature.joint.impl.ui.consent.ConsentScreenContract$InputData;
import com.revolut.feature.joint.impl.ui.invite_flow.models.InvitationType;
import com.revolut.feature.terms.api.model.TermsScope;
import g48.r0;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends jki.g implements o {
    public static final TermsScope A;
    public static final TermsScope B;
    public static final TermsScope C;
    public static final TermsScope[] D;
    public static final List E;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final TermsScope f267942x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final TermsScope f267943y;
    public static final TermsScope z;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ConsentScreenContract$InputData f267944p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pre.c f267945q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mre.c f267946r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r0 f267947s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ang.f f267948t;
    public final i u;
    public final sx8.a v;

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final List f267941w = zhm.v.k(cci.g.SPENDING, cci.g.BUDGETING);

    static {
        TermsScope.INSTANCE.getClass();
        TermsScope termsScope = TermsScope.I;
        f267942x = termsScope;
        TermsScope termsScope2 = TermsScope.f90360a0;
        f267943y = termsScope2;
        TermsScope termsScope3 = TermsScope.f90376p;
        TermsScope termsScope4 = TermsScope.B;
        TermsScope termsScope5 = TermsScope.Z;
        z = termsScope5;
        TermsScope termsScope6 = TermsScope.A;
        A = termsScope6;
        TermsScope termsScope7 = TermsScope.f90362b0;
        B = termsScope7;
        TermsScope termsScope8 = TermsScope.f90387x;
        C = termsScope8;
        D = new TermsScope[]{termsScope, termsScope3, termsScope4, termsScope5};
        E = zhm.v.k(termsScope, termsScope2, termsScope3, termsScope4, termsScope5, termsScope6, termsScope7, termsScope8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(jki.p stateMapper, ConsentScreenContract$InputData inputData, pre.c termsInteractor, mre.c termsNavigationFactory, r0 jointAccountInteractor, ang.f userInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(jointAccountInteractor, "jointAccountInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f267944p = inputData;
        this.f267945q = termsInteractor;
        this.f267946r = termsNavigationFactory;
        this.f267947s = jointAccountInteractor;
        this.f267948t = userInteractor;
        InvitationType invitationType = inputData.f76526a;
        f0 f0Var = f0.f322471a;
        this.u = new i(invitationType, f0Var, f0Var, null, g.None, null, h.NOT_REQUIRED);
        this.v = new sx8.a(this, 26);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A2(t48.y r4, com.revolut.feature.terms.api.model.TermsScope r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof t48.v
            if (r0 == 0) goto L13
            r0 = r6
            t48.v r0 = (t48.v) r0
            int r1 = r0.f267938w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267938w = r1
            goto L18
        L13:
            t48.v r0 = new t48.v
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267938w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            mre.c r4 = r4.f267946r
            ufm.i r4 = mre.c.a(r4, r5)
            r0.f267938w = r3
            java.lang.Object r6 = nim.a.b(r4, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t48.y.A2(t48.y, com.revolut.feature.terms.api.model.TermsScope, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B2(t48.y r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof t48.w
            if (r0 == 0) goto L13
            r0 = r6
            t48.w r0 = (t48.w) r0
            int r1 = r0.f267939w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267939w = r1
            goto L18
        L13:
            t48.w r0 = new t48.w
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267939w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            pre.c r5 = r5.f267945q
            java.util.List r6 = t48.y.E
            r2 = 5
            r4 = 0
            efm.d0 r5 = pre.c.h(r5, r4, r6, r2)
            r0.f267939w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t48.y.B2(t48.y, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Enum y2(t48.y r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof t48.t
            if (r0 == 0) goto L13
            r0 = r5
            t48.t r0 = (t48.t) r0
            int r1 = r0.f267936w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267936w = r1
            goto L18
        L13:
            t48.t r0 = new t48.t
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267936w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            g48.r0 r5 = r4.f267947s
            r0.f267936w = r3
            java.lang.Object r5 = r5.p(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            com.revolut.feature.joint.impl.ui.consent.ConsentScreenContract$InputData r4 = r4.f267944p
            com.revolut.feature.joint.impl.ui.invite_flow.models.InvitationType r4 = r4.f76526a
            boolean r0 = r4 instanceof com.revolut.feature.joint.impl.ui.invite_flow.models.InvitationType.OutgoingInvitation
            if (r0 == 0) goto L4e
            t48.g r4 = t48.g.ShowConfirmButtonOnly
            return r4
        L4e:
            boolean r4 = r4 instanceof com.revolut.feature.joint.impl.ui.invite_flow.models.InvitationType.IncomingInvitation
            if (r4 == 0) goto L5a
            if (r5 == 0) goto L57
            t48.g r4 = t48.g.ShowConfirmButtonOnly
            return r4
        L57:
            t48.g r4 = t48.g.ShowAcceptAndDeclineButtons
            return r4
        L5a:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t48.y.y2(t48.y, gim.c):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z2(t48.y r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof t48.u
            if (r0 == 0) goto L13
            r0 = r5
            t48.u r0 = (t48.u) r0
            int r1 = r0.f267937w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267937w = r1
            goto L18
        L13:
            t48.u r0 = new t48.u
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267937w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            g48.r0 r5 = r4.f267947s
            r0.f267937w = r3
            java.lang.Object r5 = r5.p(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            com.revolut.feature.joint.impl.ui.consent.ConsentScreenContract$InputData r4 = r4.f267944p
            com.revolut.feature.joint.impl.ui.invite_flow.models.InvitationType r0 = r4.f76526a
            boolean r0 = r0 instanceof com.revolut.feature.joint.impl.ui.invite_flow.models.InvitationType.OutgoingInvitation
            if (r5 == 0) goto L5c
            if (r0 == 0) goto L5c
            java.util.List r4 = r4.f76527b
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L59
            java.util.List r4 = t48.y.f267941w
        L59:
            java.util.List r4 = (java.util.List) r4
            return r4
        L5c:
            zhm.f0 r4 = zhm.f0.f322471a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t48.y.z2(t48.y, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        d0(true, true);
        l2(new pn2.c(this, (Continuation) null, 6), this.v);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.u;
    }
}
