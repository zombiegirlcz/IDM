package com.revolut.sso.impl.ui.phone.change_flow;

import akl.o0;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.sso.api.R$string;
import com.revolut.sso.impl.ui.phone.enter_phone.EnterPhoneScreenContract$InputData;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.j0;
import nii.u1;
import nk4.o;
import nol.c;
import nol.f;
import nol.g;
import nol.v;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qki.d;
import rp0.g1;
import rp0.k1;
import rqk.m;
import vkm.j2;
import wll.e;
import yji.l;
import yki.i;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends h implements nol.b {

    @NotNull
    public static final f Companion = new f();
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jol.b f106654p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ChangePhoneFlowContract$InputData f106655q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z80.b f106656r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final nkl.a f106657s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o0 f106658t;
    public final g1 u;
    public final kql.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m f106659w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final d f106660x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i f106661y;

    public b(e claimSubmissionStrategy, jol.b dialogsFactory, ChangePhoneFlowContract$InputData input, z80.b phoneToolsProvider, nkl.a resendTimeProvider, o0 revolutAccountUserInfoRepository, g1 shotDialogDisplayer, kql.f simBindingControllerModelExtension, m userInfoFromAppProvider) {
        Intrinsics.checkNotNullParameter(claimSubmissionStrategy, "claimSubmissionStrategy");
        Intrinsics.checkNotNullParameter(dialogsFactory, "dialogsFactory");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(resendTimeProvider, "resendTimeProvider");
        Intrinsics.checkNotNullParameter(revolutAccountUserInfoRepository, "revolutAccountUserInfoRepository");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(simBindingControllerModelExtension, "simBindingControllerModelExtension");
        Intrinsics.checkNotNullParameter(userInfoFromAppProvider, "userInfoFromAppProvider");
        this.o = claimSubmissionStrategy;
        this.f106654p = dialogsFactory;
        this.f106655q = input;
        this.f106656r = phoneToolsProvider;
        this.f106657s = resendTimeProvider;
        this.f106658t = revolutAccountUserInfoRepository;
        this.u = shotDialogDisplayer;
        this.v = simBindingControllerModelExtension;
        this.f106659w = userInfoFromAppProvider;
        this.f106660x = hx7.e.b(this, new ChangePhoneFlowContract$State(null, null, h0.f322473a));
        this.f106661y = d8l.d.a(this, new o(this, 8));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.sso.impl.ui.phone.change_flow.b r7, java.lang.String r8, com.revolut.sso.api.models.Evidence r9, gim.c r10) {
        /*
            boolean r0 = r10 instanceof nol.t
            if (r0 == 0) goto L13
            r0 = r10
            nol.t r0 = (nol.t) r0
            int r1 = r0.f218099x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f218099x = r1
            goto L18
        L13:
            nol.t r0 = new nol.t
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f218099x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r8 = r0.u
            yhm.o.b(r10)
            goto L45
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r10)
            wll.e r10 = r7.o
            com.revolut.sso.impl.ui.phone.change_flow.ChangePhoneFlowContract$InputData r2 = r7.f106655q
            java.lang.String r2 = r2.f106641b
            r0.u = r8
            r0.f218099x = r3
            java.lang.Object r10 = r10.k(r7, r2, r9, r0)
            if (r10 != r1) goto L45
            return r1
        L45:
            gkl.c0 r10 = (gkl.c0) r10
            gkl.y r9 = gkl.y.f144502a
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r10, r9)
            if (r9 == 0) goto L58
            fjl.a r9 = new fjl.a
            r9.<init>(r8)
            r7.N2(r9)
            goto La0
        L58:
            gkl.a0 r9 = gkl.a0.f144433a
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r10, r9)
            r0 = 0
            if (r9 == 0) goto L7f
            jol.b r9 = r7.f106654p
            com.revolut.sso.impl.domain.models.Claim$Phone r10 = new com.revolut.sso.impl.domain.models.Claim$Phone
            r10.<init>(r8)
            jol.c r9 = (jol.c) r9
            nii.y0 r8 = r9.a(r10)
            kotlinx.coroutines.flow.Flow r2 = r7.X1(r8)
            nol.u r5 = new nol.u
            r5.<init>(r7, r0)
            r6 = 3
            r3 = 0
            r4 = 0
            r1 = r7
            yji.l.a1(r1, r2, r3, r4, r5, r6)
            goto La0
        L7f:
            gkl.z r7 = gkl.z.f144503a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r10, r7)
            if (r7 == 0) goto L98
            com.revolut.sso.api.exceptions.RevolutSSOException$IllegalState r7 = new com.revolut.sso.api.exceptions.RevolutSSOException$IllegalState
            java.lang.String r8 = "EvidenceNotVerifiedYet is unexpected for confirmation with OTP"
            r7.<init>(r8)
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r9 = rd0.d.f253311a
            rd0.c r9 = rd0.c.ERROR
            rd0.d.a(r9, r0, r0, r7, r8)
            goto La0
        L98:
            gkl.b0 r7 = gkl.b0.f144436a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r10, r7)
            if (r7 == 0) goto La3
        La0:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        La3:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.phone.change_flow.b.I2(com.revolut.sso.impl.ui.phone.change_flow.b, java.lang.String, com.revolut.sso.api.models.Evidence, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        if (M2(r13, r14, r15, r2) == r3) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c3, code lost:
    
        if (M2(r13, r14, r15, r2) == r3) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f8, code lost:
    
        if (M2(r13, r14, r15, r2) == r3) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012c, code lost:
    
        if (M2(r13, r14, r15, r2) == r3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.sso.impl.ui.phone.change_flow.b r13, java.lang.String r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.phone.change_flow.b.J2(com.revolut.sso.impl.ui.phone.change_flow.b, java.lang.String, gim.c):java.lang.Object");
    }

    public static final Object K2(b bVar, EnterPhoneScreenContract$InputData.Mode.Create.PhoneData phoneData, gim.i iVar) {
        String str = ((ChangePhoneFlowContract$State) ((j2) bVar.f106660x.f22677a).getValue()).f106644b;
        if (str == null) {
            bVar.O2(new nol.e(bVar, 2));
            return Unit.f186387a;
        }
        h.r2(bVar.f106661y);
        Object objM = bVar.o.m(bVar, bVar.f106655q.f106641b, gkl.m.PHONE, y0.b(new RegisteredIdentityId(str)), new c(bVar, 2), new ni1.a(bVar, phoneData, 18), iVar);
        return objM == fim.a.COROUTINE_SUSPENDED ? objM : Unit.f186387a;
    }

    public static final Object M2(b bVar, String str, Set set, v vVar) {
        bVar.H2(bVar.f106660x, new imk.e(19, set));
        Object objL2 = bVar.L2(vVar, str, false);
        return objL2 == fim.a.COROUTINE_SUSPENDED ? objL2 : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L2(gim.c r12, java.lang.String r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.phone.change_flow.b.L2(gim.c, java.lang.String, boolean):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new yi5.b(26));
    }

    public final void N2(fjl.a aVar) {
        C2(aVar);
        c cVar = new c(this, 1);
        int i = g.f218078b[this.f106655q.d.ordinal()];
        Continuation continuation = null;
        if (i == 1) {
            l.a1(this, X1(new nii.y0("DIALOG_ID_PHONE_CHANGED_SUCCESSFUL", new j0((Clause) new TextLocalisedClause(R$string.revolut_sso_phone_change_success_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4094), false, 4)), null, null, new nfj.j2(cVar, continuation, 20), 3);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ((k1) this.u).d(ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, "DIALOG_ID_PHONE_CHANGED_SUCCESSFUL", new TextLocalisedClause(R$string.revolut_sso_phone_change_success_title, null, null, 14), null, null, null, 60));
            cVar.invoke();
            Unit unit = Unit.f186387a;
        }
    }

    public final void O2(Function1 function1) {
        l.b1(this, X1(((jol.c) this.f106654p).e("DIALOG_ID_GENERIC_PHONE_UPDATE_ERROR")), null, new ex6.c(4, null, function1), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        ((kql.h) this.v).Z2(new c(this, 0));
    }

    @Override // qki.e
    public final d getState() {
        return this.f106660x;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f106661y;
    }
}
