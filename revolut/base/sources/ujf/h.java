package ujf;

import aw0.k7;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.network.models.security.SecuritySettings;
import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.payments.money_request.core.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import ft3.w;
import g48.r0;
import grl.r2;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mjf.b0;
import rp0.l;
import rp0.t;
import rp0.y;
import tof.a3;
import uhf.i;
import uhf.j;
import xif.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y21.c f280619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k61.a f280620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f280621c;
    public final cl3.a d;
    public final tqi.g e;
    public final r0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final eqj.g f280622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f01.c f280623h;

    public h(y21.c optOutRepository, k61.a transferInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, cl3.a contactsInteractor, tqi.g shareNaviCommandFactory, r0 jointAccountsInteractor, za7.d hideTransactionDialogProvider, eqj.g transactionAnalyticsInteractor, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(optOutRepository, "optOutRepository");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(hideTransactionDialogProvider, "hideTransactionDialogProvider");
        Intrinsics.checkNotNullParameter(transactionAnalyticsInteractor, "transactionAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f280619a = optOutRepository;
        this.f280620b = transferInteractor;
        this.f280621c = transactionsInteractor;
        this.d = contactsInteractor;
        this.e = shareNaviCommandFactory;
        this.f = jointAccountsInteractor;
        this.f280622g = transactionAnalyticsInteractor;
        this.f280623h = uiKitResources;
    }

    public static y b(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3, TextLocalisedClause textLocalisedClause4, i iVar, Function1 function1) {
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("DIALOG_POSITIVE_BUTTON_ID", LargeActionButton.ButtonStyle.f58725a, null, textLocalisedClause3, false, null, null, function1.invoke(iVar), null, 744);
        int i = R$attr.uikit_dp16;
        yp0.b.r(model, 0, 0, i, i, 3);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("DIALOG_NEGATIVE_BUTTON_ID", LargeActionButton.ButtonStyle.f58726b, null, textLocalisedClause4, false, null, null, function1.invoke(null), null, 744);
        int i2 = R$attr.uikit_dp16;
        yp0.b.r(model2, 0, R$attr.uikit_dp24, i2, i2, 1);
        return new y(v.k(model, model2), new t(textLocalisedClause, textLocalisedClause2, null, 28), l.WINDOW, null, null, null, 1016);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(tof.a3 r17, boolean r18, gim.c r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            boolean r3 = r2 instanceof ujf.c
            if (r3 == 0) goto L19
            r3 = r2
            ujf.c r3 = (ujf.c) r3
            int r4 = r3.f280611w
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f280611w = r4
            goto L1e
        L19:
            ujf.c r3 = new ujf.c
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.u
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f280611w
            uhf.e$a r6 = uhf.e.a.f280223a
            r7 = 1
            if (r5 == 0) goto L37
            if (r5 != r7) goto L2f
            yhm.o.b(r2)
            return r6
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            yhm.o.b(r2)
            java.lang.String r10 = r1.f272584c
            if (r10 == 0) goto L60
            java.lang.String r2 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r2)
            tof.w5 r2 = r1.f272624y
            java.lang.String r9 = r2.f273143a
            boolean r11 = k71.k.M0(r1)
            java.lang.String r12 = r1.f272581b
            r13 = 0
            r15 = 0
            eqj.g r8 = r0.f280622g
            r14 = r18
            pfm.a r1 = r8.b(r9, r10, r11, r12, r13, r14, r15)
            r3.f280611w = r7
            java.lang.Object r1 = nim.a.a(r1, r3)
            if (r1 != r4) goto L60
            return r4
        L60:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ujf.h.a(tof.a3, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(tof.a3 r18, kotlin.jvm.functions.Function1 r19, gim.c r20) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ujf.h.c(tof.a3, kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }

    public final Object d(a3 a3Var, String str, gim.i iVar) {
        return e(a3Var, str, new uj6.v(3), iVar);
    }

    public final Object e(a3 a3Var, String actionId, Function1 function1, gim.c cVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        uhf.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        switch (b.f280610a[uhf.c.valueOf(actionId).ordinal()]) {
            case 1:
                return new uhf.f(new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(r2.TRANSACTION_SWIPE, w.INSTANCE, null, null, null, null, 16378)));
            case 2:
                return h(a3Var, cVar);
            case 3:
                return c(a3Var, function1, cVar);
            case 4:
                String strE = k.e(a3Var);
                MoneyClause moneyClause = new MoneyClause(a3Var.k, new MoneyClause.Format.Defaults(k7.ONLY_NEGATIVE, null, false, true, 6), null, null, 12);
                f01.c cVar2 = this.f280623h;
                CharSequence charSequenceB = cVar2.b(moneyClause);
                if (strE.length() > 0) {
                    textLocalisedClause = new TextLocalisedClause(R$string.send_request_details_cancel_transfer_title, v.k(charSequenceB, strE), null, 12);
                    textLocalisedClause2 = null;
                } else {
                    CharSequence charSequenceB2 = cVar2.b(new TextLocalisedClause(R.string.notification_friend, null, null, 14));
                    TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.payment_link_cancel_alert_send_title, v.k(charSequenceB, charSequenceB2), null, 12);
                    TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.payment_link_cancel_alert_send_message, u.c(charSequenceB2), null, 12);
                    textLocalisedClause = textLocalisedClause3;
                    textLocalisedClause2 = textLocalisedClause4;
                }
                return new uhf.g(b(textLocalisedClause, textLocalisedClause2, new TextLocalisedClause(R$string.send_request_details_cancel, null, null, 14), new TextLocalisedClause(R$string.send_request_details_cancel_request_close, null, null, 14), new uhf.h(a3Var.f272581b), function1));
            case 5:
                return g(a3Var, function1, cVar);
            case 6:
                return i(a3Var, cVar);
            case 7:
                return a(a3Var, true, cVar);
            case 8:
                return a(a3Var, false, cVar);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final Object f(i iVar, gim.c cVar) {
        if (iVar instanceof i.a) {
            Object objA = nim.a.a(this.f280619a.c(SecuritySettings.INCOGNITO, false), cVar);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
        }
        boolean z = iVar instanceof j;
        com.revolut.domain.interactors.transactions.a aVar = this.f280621c;
        if (z) {
            b0 b0Var = (b0) aVar;
            com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, ((s) b0Var.f205982a).f306380g, "PREF_KEY_HIDE_TRANSACTION_WAS_SHOWN", Boolean.TRUE);
            Object objA2 = nim.a.a(b0Var.s(((j) iVar).f280228a, true), cVar);
            return objA2 == fim.a.COROUTINE_SUSPENDED ? objA2 : Unit.f186387a;
        }
        if (!(iVar instanceof uhf.h)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objA3 = nim.a.a(((b0) aVar).e(((uhf.h) iVar).f280226a), cVar);
        return objA3 == fim.a.COROUTINE_SUSPENDED ? objA3 : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(tof.a3 r19, kotlin.jvm.functions.Function1 r20, gim.c r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r21
            boolean r3 = r2 instanceof ujf.e
            if (r3 == 0) goto L19
            r3 = r2
            ujf.e r3 = (ujf.e) r3
            int r4 = r3.f280615w
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f280615w = r4
            goto L1e
        L19:
            ujf.e r3 = new ujf.e
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.u
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f280615w
            r6 = 1
            if (r5 == 0) goto L35
            if (r5 != r6) goto L2d
            yhm.o.b(r2)
            goto L63
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L35:
            yhm.o.b(r2)
            com.revolut.domain.interactors.transactions.a r2 = r0.f280621c
            mjf.b0 r2 = (mjf.b0) r2
            x71.e r5 = r2.f205982a
            xif.s r5 = (xif.s) r5
            ue0.c r5 = r5.f306380g
            java.lang.String r7 = "PREF_KEY_HIDE_TRANSACTION_WAS_SHOWN"
            java.lang.Class r8 = java.lang.Boolean.TYPE
            java.lang.Object r5 = j6.a.k(r8, r5, r7)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 == 0) goto L53
            boolean r5 = r5.booleanValue()
            goto L54
        L53:
            r5 = 0
        L54:
            if (r5 == 0) goto L66
            pfm.r r1 = r2.s(r1, r6)
            r3.f280615w = r6
            java.lang.Object r1 = nim.a.a(r1, r3)
            if (r1 != r4) goto L63
            return r4
        L63:
            uhf.e$a r1 = uhf.e.a.f280223a
            return r1
        L66:
            uhf.g r2 = new uhf.g
            uhf.j r3 = new uhf.j
            r3.<init>(r1)
            r1 = r20
            java.lang.Object r11 = r1.invoke(r3)
            rp0.t r1 = new rp0.t
            com.revolut.core.ui_kit.models.TextLocalisedClause r3 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r4 = com.revolut.feature.hidden_accounts.impl.R$string.hidden_transaction_hide_info_title
            r5 = 0
            r6 = 14
            r3.<init>(r4, r5, r5, r6)
            r4 = 30
            r1.<init>(r3, r5, r5, r4)
            java.util.List r12 = za7.d.a()
            r16 = 0
            r17 = 31
            r13 = 0
            r14 = 0
            r15 = 0
            yp0.b.k(r12, r13, r14, r15, r16, r17)
            r3 = r12
            java.util.Collection r3 = (java.util.Collection) r3
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r4 = com.revolut.feature.hidden_accounts.impl.R$string.hidden_transaction_hide_info_button
            r8.<init>(r4, r5, r5, r6)
            com.revolut.core.ui_kit.views.LargeActionButton$ButtonStyle$DefaultFilledButton r6 = com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle.f58725a
            int r14 = com.revolut.core.ui_kit_resources.R$attr.uikit_dp16
            int r12 = com.revolut.core.ui_kit_resources.R$attr.uikit_dp8
            com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate$Model r4 = new com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate$Model
            r10 = 0
            r16 = 368(0x170, float:5.16E-43)
            java.lang.String r5 = "HIDE_TRANSACTION_BUTTON_ID"
            r7 = 0
            r9 = 0
            r13 = r12
            r15 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.util.ArrayList r4 = zhm.d0.F0(r4, r3)
            rp0.y r3 = new rp0.y
            r9 = 0
            r10 = 1020(0x3fc, float:1.43E-42)
            r6 = 0
            r8 = 0
            r5 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2.<init>(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ujf.h.g(tof.a3, kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(tof.a3 r19, gim.c r20) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ujf.h.h(tof.a3, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(tof.a3 r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ujf.g
            if (r0 == 0) goto L13
            r0 = r6
            ujf.g r0 = (ujf.g) r0
            int r1 = r0.f280618w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f280618w = r1
            goto L18
        L13:
            ujf.g r0 = new ujf.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f280618w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r6 = 0
            com.revolut.domain.interactors.transactions.a r2 = r4.f280621c
            mjf.b0 r2 = (mjf.b0) r2
            pfm.r r5 = r2.s(r5, r6)
            r0.f280618w = r3
            java.lang.Object r5 = nim.a.a(r5, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            uhf.e$a r5 = uhf.e.a.f280223a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ujf.h.i(tof.a3, gim.c):java.lang.Object");
    }
}
