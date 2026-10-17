package com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods;

import aw0.f;
import aw0.n6;
import cli.n;
import cli.y;
import cn0.e;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.data.model.Data;
import com.revolut.feature.sign_in_methods.api.R$string;
import com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.SignInMethodsScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.sso.api.signin_social.LinkSocialAccountControllerModelExtension$SocialAccount;
import elm.g;
import eql.c0;
import eql.l;
import eql.m;
import eql.o;
import eql.p;
import eql.r;
import eql.s;
import eql.t;
import grl.k9;
import grl.od;
import grl.q6;
import grl.w2;
import grl.x0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import skm.p0;
import wjd.d;
import wjd.i;
import wjd.j;
import wl0.c;
import yi5.b;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements j {
    public final SignInMethodsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f87247p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f87248q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final hjl.e f87249r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f87250s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g f87251t;
    public final y u;

    public a(n stateMapper, SignInMethodsScreenContract$InputData signInMethodsScreenContract$InputData, c biometricHelper, e primaryAuthCredentialsTypeProvider, hjl.e linkSocialAccountControllerModelExtension, d biometricTypeExtensions) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(biometricHelper, "biometricHelper");
        Intrinsics.checkNotNullParameter(primaryAuthCredentialsTypeProvider, "primaryAuthCredentialsTypeProvider");
        Intrinsics.checkNotNullParameter(linkSocialAccountControllerModelExtension, "linkSocialAccountControllerModelExtension");
        Intrinsics.checkNotNullParameter(biometricTypeExtensions, "biometricTypeExtensions");
        this.o = signInMethodsScreenContract$InputData;
        this.f87247p = biometricHelper;
        this.f87248q = primaryAuthCredentialsTypeProvider;
        this.f87249r = linkSocialAccountControllerModelExtension;
        this.f87250s = biometricTypeExtensions;
        this.f87251t = p0.f264002b;
        this.u = mra.d.b(this, new i(new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), biometricHelper.c() instanceof rm0.d), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.a r7, boolean r8, gim.c r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.a.I2(com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.a, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.a r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof wjd.q
            if (r0 == 0) goto L13
            r0 = r7
            wjd.q r0 = (wjd.q) r0
            int r1 = r0.f298062x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f298062x = r1
            goto L18
        L13:
            wjd.q r0 = new wjd.q
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f298062x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            rl0.d r0 = r0.u
            yhm.o.b(r7)
            goto L69
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r7)
            goto L46
        L38:
            yhm.o.b(r7)
            cn0.e r7 = r6.f87248q
            r0.f298062x = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L46
            goto L67
        L46:
            rl0.d r7 = (rl0.d) r7
            int[] r2 = wjd.l.f298051a
            int r5 = r7.ordinal()
            r2 = r2[r5]
            if (r2 == r4) goto L5b
            if (r2 != r3) goto L55
            goto L6a
        L55:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L5b:
            wjd.d r2 = r6.f87250s
            r0.u = r7
            r0.f298062x = r3
            java.lang.Object r0 = r2.e3(r0)
            if (r0 != r1) goto L68
        L67:
            return r1
        L68:
            r0 = r7
        L69:
            r7 = r0
        L6a:
            cli.y r0 = r6.u
            wdb.b r1 = new wdb.b
            r2 = 27
            r1.<init>(r7, r2)
            r6.H2(r0, r1)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.a.J2(com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.a, gim.c):java.lang.Object");
    }

    public static final void K2(int i, a aVar, Object obj2, boolean z) {
        aVar.getClass();
        LinkSocialAccountControllerModelExtension$SocialAccount account = obj2 instanceof LinkSocialAccountControllerModelExtension$SocialAccount ? (LinkSocialAccountControllerModelExtension$SocialAccount) obj2 : null;
        if (account == null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "Settings & Privacy - External Accounts", "switch linking failed: payload is not supported", null, h0Var);
            return;
        }
        if (!z) {
            aVar.f2(new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(R$string.settings_socialSignIn_unlinking_alert_message, null, null, 14), null, null, false, 28), new aw0.g(new n6(new TextLocalisedClause(R$string.settings_socialSignIn_unlinking_alert_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1016), new n6(new TextLocalisedClause(R$string.settings_socialSignIn_unlinking_alert_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), (Clause) null, (f) null, 25), new AnalyticsProduct.Shared(k9.SecurityHub, x0.Settings, q6.Profile, w2.SecurityHub, od.Profile), null, null, 24)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new wg2.g(aVar, account, 13));
            return;
        }
        c0 c0Var = (c0) aVar.f87249r;
        c0Var.getClass();
        Intrinsics.checkNotNullParameter(account, "account");
        int i2 = o.f128513a[account.f106023a.ordinal()];
        int i3 = 1;
        int i5 = 27;
        if (i2 == 1) {
            c0Var.T2(new r(c0Var, null), new b(i5));
            return;
        }
        int i6 = 3;
        if (i2 == 2) {
            if (c0Var.f128497t.a()) {
                c0Var.f128496s.b(new m(c0Var, i3), new l(c0Var, i6));
            }
            Unit unit = Unit.f186387a;
        } else if (i2 == 3) {
            c0Var.T2(new s(c0Var, null), new b(i5));
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            c0Var.T2(new t(c0Var, null), new b(i5));
        }
    }

    @Override // yji.l
    public final void I1() {
        Object obj2 = this.f87249r;
        Continuation continuation = null;
        yji.l.a1(this, ((cki.a) obj2).c3(), null, null, new wjd.m(this, continuation, 0), 3);
        yji.l.a1(this, this.f87250s.c3(), null, null, new wjd.m(this, continuation, 1), 3);
        l2(new w76.a(this, continuation, 16), new b(26));
        SignInMethodsScreenContract$InputData signInMethodsScreenContract$InputData = this.o;
        if (signInMethodsScreenContract$InputData instanceof SignInMethodsScreenContract$InputData.BankIdDeeplink) {
            String challengeId = ((SignInMethodsScreenContract$InputData.BankIdDeeplink) signInMethodsScreenContract$InputData).f87245a;
            c0 c0Var = (c0) obj2;
            c0Var.getClass();
            Intrinsics.checkNotNullParameter(challengeId, "challengeId");
            c0Var.h3(true, hjl.c.BANK_ID, new p(c0Var, challengeId, continuation, 1));
            return;
        }
        if (signInMethodsScreenContract$InputData instanceof SignInMethodsScreenContract$InputData.DAPDeeplink) {
            String challengeId2 = ((SignInMethodsScreenContract$InputData.DAPDeeplink) signInMethodsScreenContract$InputData).f87246a;
            c0 c0Var2 = (c0) obj2;
            c0Var2.getClass();
            Intrinsics.checkNotNullParameter(challengeId2, "challengeId");
            c0Var2.h3(true, hjl.c.DAP, new p(c0Var2, challengeId2, continuation, 2));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
