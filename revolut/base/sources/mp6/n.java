package mp6;

import au.c0;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.ActionsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RateEmojiDelegate;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.feedback.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import ep6.c;
import ip0.sr;
import ip0.y;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.MatchGroup;
import kotlinx.coroutines.flow.Flow;
import m9d.y0;
import mhd.p0;
import rp0.g1;
import rp0.k1;
import skm.a2;
import te0.w;
import vkm.q;
import vkm.v1;
import vkm.z1;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends cki.a implements ep6.n {
    public final RateEmojiDelegate A;
    public final ActionsDelegate B;
    public final InputTextDelegate C;
    public final LargeActionButtonDelegate D;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j60.a f207759m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final dp6.a f207760n;
    public final ep6.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g1 f207761p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sr f207762q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Data f207763r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z1 f207764s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final cji.d f207765t;
    public final cji.d u;
    public final cji.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final cji.d f207766w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final cji.d f207767x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final cji.d f207768y;
    public a2 z;

    public n(j60.a bottomExpandableDialogControllerExtension, dp6.a feedbackRepository, ep6.b feedbackBottomDialogItemsProvider, g1 shotDialogDisplayer, sr inputStyle) {
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(feedbackRepository, "feedbackRepository");
        Intrinsics.checkNotNullParameter(feedbackBottomDialogItemsProvider, "feedbackBottomDialogItemsProvider");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(inputStyle, "inputStyle");
        this.f207759m = bottomExpandableDialogControllerExtension;
        this.f207760n = feedbackRepository;
        this.o = feedbackBottomDialogItemsProvider;
        this.f207761p = shotDialogDisplayer;
        this.f207762q = inputStyle;
        this.f207763r = new Data(null, null, true, 3, null);
        this.f207764s = q.b(0, 7, null);
        this.f207765t = new cji.d(Boolean.FALSE);
        this.u = new cji.d(c.a.f128083a);
        this.v = new cji.d(yo6.e.NEGATIVE);
        this.f207766w = new cji.d(new Data(null, null, true, 3, null));
        this.f207767x = new cji.d(h0.f322473a);
        m70.a.c(t0.f186434a);
        this.f207768y = new cji.d("");
        this.A = new RateEmojiDelegate();
        this.B = new ActionsDelegate();
        this.C = new InputTextDelegate(null);
        this.D = new LargeActionButtonDelegate();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e3(mp6.n r4, yo6.d r5, java.lang.String r6, gim.c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof mp6.m
            if (r0 == 0) goto L13
            r0 = r7
            mp6.m r0 = (mp6.m) r0
            int r1 = r0.f207758w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f207758w = r1
            goto L18
        L13:
            mp6.m r0 = new mp6.m
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f207758w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L3f
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r7)
            dp6.a r7 = r4.f207760n
            r0.f207758w = r3
            lp6.m r7 = (lp6.m) r7
            java.lang.Object r7 = r7.d(r5, r6, r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r5 = r7.booleanValue()
            if (r5 == 0) goto L52
            mlk.a0 r5 = new mlk.a0
            r6 = 18
            r5.<init>(r6)
            r4.d3(r5)
            goto L5c
        L52:
            mlk.a0 r5 = new mlk.a0
            r6 = 19
            r5.<init>(r6)
            r4.d3(r5)
        L5c:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mp6.n.e3(mp6.n, yo6.d, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String j3(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return (String) charSequence;
        }
        if (charSequence instanceof MatchGroup) {
            return ((MatchGroup) charSequence).f187889a;
        }
        StringBuilder sb6 = new StringBuilder(charSequence.length());
        sb6.append(charSequence);
        return sb6.toString();
    }

    @Override // ep6.n
    public final void A1() {
        boolean z = false;
        switch (c.f207742a[((ep6.d) this.u.a()).f128085b.ordinal()]) {
            case 1:
                i3(false);
                return;
            case 2:
                i3(false);
                return;
            case 3:
                i3(false);
                return;
            case 4:
                T2(new p0(this, new k(this, z, null, 1), (Continuation) null), new yi5.b(27));
                return;
            case 5:
                i3(false);
                return;
            case 6:
            case 7:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // yji.n
    public final void D2() {
        this.f207759m.d(v.k(this.A, this.B, this.C, this.D, new ActionsLoadingDelegate(), new ListSubheaderDelegate()));
    }

    @Override // yji.n
    public final void H2() {
        j60.a aVar = this.f207759m;
        Continuation continuation = null;
        yji.n.l2(this, q.Q(rd0.e.b(aVar.E()), new g(0, continuation, this)), null, null, 7);
        yji.n.l2(this, q.Q(q.r(new mh1.e(27), rd0.e.b(this.u.c())), new g(1, continuation, this)), null, new d(2, continuation, this), 3);
        yji.n.j2(this, rd0.e.b(this.A.f53143c), null, new d(0, continuation, this), 3);
        yji.n.l2(this, rd0.e.b(this.B.f51611c.f121375b), null, new d(1, continuation, this), 3);
        yji.n.l2(this, rd0.e.b(this.C.e.f121375b), null, new e(this, null), 3);
        yji.n.l2(this, rd0.e.b(this.D.d.f121375b), null, new f(this, null), 3);
        yji.n.l2(this, rd0.e.b(aVar.F()), null, new y0(this, continuation, 24), 3);
    }

    @Override // ep6.n
    public final Flow I1(String referenceId, yo6.d referenceType, yo6.c cVar) {
        Intrinsics.checkNotNullParameter(referenceId, "referenceId");
        Intrinsics.checkNotNullParameter(referenceType, "referenceType");
        return new v1(new j(0, this, referenceType, referenceId, cVar, (Continuation) null));
    }

    @Override // ep6.n
    public final void L0() {
        boolean z = true;
        switch (c.f207742a[((ep6.d) this.u.a()).f128085b.ordinal()]) {
            case 1:
                i3(true);
                return;
            case 2:
                i3(true);
                return;
            case 3:
                i3(true);
                return;
            case 4:
                T2(new p0(this, new k(this, z, null, 1), (Continuation) null), new yi5.b(27));
                return;
            case 5:
                i3(true);
                return;
            case 6:
            case 7:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // cki.a
    public final Object Z2() {
        return this.f207763r;
    }

    public final void f3(boolean z) {
        a2 a2Var = this.z;
        Continuation continuation = null;
        if (a2Var != null && a2Var.d()) {
            a2Var.f(null);
        }
        this.z = yji.n.j2(this, rd0.e.b(w.n(this.v.c(), this.f207766w.c(), this.f207767x.c(), this.f207768y.c())), null, new c0(z, this, continuation, 15), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g3(yo6.d r12, java.lang.String r13, int r14, java.lang.String r15, java.util.ArrayList r16, yo6.c r17, gim.c r18) throws java.lang.Throwable {
        /*
            r11 = this;
            r0 = r18
            boolean r1 = r0 instanceof mp6.l
            if (r1 == 0) goto L16
            r1 = r0
            mp6.l r1 = (mp6.l) r1
            int r2 = r1.f207757w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f207757w = r2
        L14:
            r10 = r1
            goto L1c
        L16:
            mp6.l r1 = new mp6.l
            r1.<init>(r11, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r10.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r10.f207757w
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r0)     // Catch: retrofit2.HttpException -> L2b
            goto L59
        L2b:
            r0 = move-exception
            r12 = r0
            goto L5e
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            yhm.o.b(r0)
            dp6.a r0 = r11.f207760n     // Catch: retrofit2.HttpException -> L2b
            yo6.d r2 = yo6.d.AIR_MESSAGE     // Catch: retrofit2.HttpException -> L2b
            if (r12 != r2) goto L43
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: retrofit2.HttpException -> L2b
        L41:
            r9 = r2
            goto L45
        L43:
            r2 = 0
            goto L41
        L45:
            r10.f207757w = r3     // Catch: retrofit2.HttpException -> L2b
            r2 = r0
            lp6.m r2 = (lp6.m) r2     // Catch: retrofit2.HttpException -> L2b
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            java.lang.Object r0 = r2.e(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: retrofit2.HttpException -> L2b
            if (r0 != r1) goto L59
            return r1
        L59:
            com.revolut.feature.feedback.api.domain.Feedback r0 = (com.revolut.feature.feedback.api.domain.Feedback) r0     // Catch: retrofit2.HttpException -> L2b
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        L5e:
            int r13 = r12.code()
            r14 = 422(0x1a6, float:5.91E-43)
            if (r13 != r14) goto L69
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        L69:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: mp6.n.g3(yo6.d, java.lang.String, int, java.lang.String, java.util.ArrayList, yo6.c, gim.c):java.lang.Object");
    }

    public final void h3() {
        ((a) this.o).getClass();
        ((k1) this.f207761p).d(new ShotDialogDisplayer$Configuration("feedback_prompt", new TextLocalisedClause(R$string.cx_feedback_feedback_success_v2, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
    }

    public final void i3(boolean z) {
        T2(new p0(this, new k(this, z, null, 2), (Continuation) null), new yi5.b(27));
    }

    @Override // ep6.n
    public final void o1(LargeActionButtonDelegate.Model clickData, ep6.h feedbackParams) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        Intrinsics.checkNotNullParameter(feedbackParams, "feedbackParams");
    }

    @Override // ep6.n
    public final void t1(CharSequence comment) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.f207768y.d(j3(comment));
    }

    @Override // ep6.n
    public final void v1(y clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
    }
}
