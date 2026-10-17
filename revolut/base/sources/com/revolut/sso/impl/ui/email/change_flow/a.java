package com.revolut.sso.impl.ui.email.change_flow;

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
import com.revolut.sso.api.email.change.ChangeEmailInputData;
import com.revolut.sso.api.models.UserInfoFromApp;
import com.revolut.sso.impl.domain.models.SsoServerError;
import com.revolut.sso.impl.ui.email.change_flow.ChangeEmailFlowContract$Step;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import jol.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.j0;
import nii.u1;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qki.d;
import rp0.g1;
import rp0.k1;
import rqk.m;
import s7a.m0;
import tml.c;
import tml.g;
import tml.n;
import tml.q;
import vkm.j2;
import wll.e;
import yji.l;
import yki.i;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h implements c {

    @NotNull
    public static final g Companion = new g();
    public final ChangeEmailInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f106520p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f106521q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final nkl.a f106522r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o0 f106523s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final xjl.h f106524t;
    public final g1 u;
    public final m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f106525w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i f106526x;

    public a(ChangeEmailInputData input, e claimSubmissionStrategy, b dialogsFactory, nkl.a resendTimeProvider, o0 revolutAccountUserInfoRepository, xjl.h revolutSsoClientDeeplinkRestoreManager, g1 shotDialogDisplayer, m userInfoFromAppProvider) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(claimSubmissionStrategy, "claimSubmissionStrategy");
        Intrinsics.checkNotNullParameter(dialogsFactory, "dialogsFactory");
        Intrinsics.checkNotNullParameter(resendTimeProvider, "resendTimeProvider");
        Intrinsics.checkNotNullParameter(revolutAccountUserInfoRepository, "revolutAccountUserInfoRepository");
        Intrinsics.checkNotNullParameter(revolutSsoClientDeeplinkRestoreManager, "revolutSsoClientDeeplinkRestoreManager");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(userInfoFromAppProvider, "userInfoFromAppProvider");
        this.o = input;
        this.f106520p = claimSubmissionStrategy;
        this.f106521q = dialogsFactory;
        this.f106522r = resendTimeProvider;
        this.f106523s = revolutAccountUserInfoRepository;
        this.f106524t = revolutSsoClientDeeplinkRestoreManager;
        this.u = shotDialogDisplayer;
        this.v = userInfoFromAppProvider;
        this.f106525w = hx7.e.b(this, new ChangeEmailFlowContract$State(h0.f322473a, null, null));
        this.f106526x = d8l.d.a(this, new ta8.a(this, 22));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        if (M2(r12, r13, r14, r1) == r2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c7, code lost:
    
        if (M2(r12, r13, r14, r1) == r2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0105, code lost:
    
        if (M2(r12, r13, r14, r1) == r2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0139, code lost:
    
        if (M2(r12, r13, r14, r1) == r2) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.sso.impl.ui.email.change_flow.a r12, java.lang.String r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.email.change_flow.a.I2(com.revolut.sso.impl.ui.email.change_flow.a, java.lang.String, gim.c):java.lang.Object");
    }

    public static final Object J2(a aVar, gim.i iVar) {
        String str = ((ChangeEmailFlowContract$State) ((j2) aVar.f106525w.f22677a).getValue()).f106510b;
        if (str == null) {
            aVar.P2(new tml.d(aVar, 3));
            return Unit.f186387a;
        }
        h.r2(aVar.f106526x);
        Object objM = aVar.f106520p.m(aVar, aVar.o.f105829b, gkl.m.EMAIL, y0.b(new RegisteredIdentityId(str)), new tml.e(aVar, 0), new tml.e(aVar, 1), iVar);
        return objM == fim.a.COROUTINE_SUSPENDED ? objM : Unit.f186387a;
    }

    public static final Object M2(a aVar, String str, Set set, q qVar) {
        aVar.H2(aVar.f106525w, new m0(8, set));
        Object objL2 = aVar.L2(qVar, str, false);
        return objL2 == fim.a.COROUTINE_SUSPENDED ? objL2 : Unit.f186387a;
    }

    public final ChangeEmailFlowContract$Step K2() {
        UserInfoFromApp.Email email = ((ChangeEmailFlowContract$State) ((j2) this.f106525w.f22677a).getValue()).f106511c;
        return (email == null || email.f106000b) ? new ChangeEmailFlowContract$Step.CreateNewEmail(this.o.f105828a) : new ChangeEmailFlowContract$Step.VerifyEmail(email.f105999a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L2(gim.c r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.email.change_flow.a.L2(gim.c, java.lang.String, boolean):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new n(this, null), new yi5.b(26));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N2(java.lang.String r12, java.lang.String r13, boolean r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.email.change_flow.a.N2(java.lang.String, java.lang.String, boolean, gim.c):java.lang.Object");
    }

    public final void O2(zil.c cVar) {
        C2(cVar);
        if (!(cVar instanceof zil.a)) {
            if (!cVar.equals(zil.b.f322582a)) {
                throw new NoWhenBranchMatchedException();
            }
            h.D2(this.f106526x);
            return;
        }
        tml.e eVar = new tml.e(this, 4);
        int i = tml.h.f272252a[this.o.f.ordinal()];
        Continuation continuation = null;
        if (i == 1) {
            l.a1(this, X1(new nii.y0("DIALOG_ID_EMAIL_CHANGED_SUCCESSFUL", new j0((Clause) new TextLocalisedClause(R$string.revolut_sso_email_change_success_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4094), false, 4)), null, null, new tk5.c(eVar, continuation, 3), 3);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ((k1) this.u).d(ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, "DIALOG_ID_EMAIL_CHANGED_SUCCESSFUL", new TextLocalisedClause(R$string.revolut_sso_email_change_success_title, null, null, 14), null, null, null, 60));
            eVar.invoke();
            Unit unit = Unit.f186387a;
        }
    }

    public final void P2(Function1 function1) {
        l.b1(this, X1(((jol.c) this.f106521q).e("DIALOG_ID_GENERIC_EMAIL_UPDATE_ERROR")), null, new ex6.c(5, null, function1), 3);
    }

    @Override // qki.e
    public final d getState() {
        return this.f106525w;
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        i iVar = this.f106526x;
        boolean z = iVar.d() == null;
        if (!(throwable instanceof SsoServerError)) {
            if (z) {
                Intrinsics.checkNotNullParameter(iVar, "<this>");
                iVar.n();
            }
            return false;
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var);
        P2(new t9f.n(z, this, 2));
        return true;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f106526x;
    }
}
