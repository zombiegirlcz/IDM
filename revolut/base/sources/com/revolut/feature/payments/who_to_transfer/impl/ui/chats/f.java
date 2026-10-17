package com.revolut.feature.payments.who_to_transfer.impl.ui.chats;

import akd.s;
import aw0.k9;
import c2f.m;
import c42.j;
import c5a.a0;
import c5a.e0;
import c5a.g0;
import c5a.j0;
import c5a.l0;
import c5a.m0;
import c5a.o;
import c5a.t;
import c5a.w;
import c5a.y;
import c5a.z;
import cli.g;
import com.revolut.core.chaosmanagement.domain.model.ChaosManagementNewsItem;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.data.network.models.security.SecuritySettings;
import com.revolut.feature.payments.who_to_transfer.api.transfer.TabTransferShotDialogAction;
import com.revolut.feature.payments.who_to_transfer.api.who_to_transfer.WhoToTransferApi$Toggles;
import com.revolut.feature.payments.who_to_transfer.impl.R$string;
import com.revolut.feature.payments.who_to_transfer.impl.ui.chats.a;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsDestination;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsInputData;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.transition.ZoomTarget;
import com.revolut.retail.feature.plan_gifting.api.PlanGiftingApi$Toggles;
import efm.r;
import g48.r0;
import h3a.l;
import h3a.n;
import h3a.p;
import ip0.v7;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mii.k;
import mjf.b0;
import oki.h;
import org.jetbrains.annotations.NotNull;
import r10.q;
import rp0.z1;
import tof.i1;
import vkm.j2;
import wl3.u;
import zhm.f0;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends h implements t {

    @NotNull
    public static final y Companion = new y();
    public final md0.b A;
    public final p B;
    public final n C;
    public final gte.a D;
    public final i5a.b E;
    public final r0 F;
    public final t3a.f G;
    public final d4m.a H;
    public final z1 I;
    public final mkd.d J;
    public final wsg.n K;
    public final bn2.p L;
    public final ej9.c M;
    public final s70.a N;
    public final f5a.e O;
    public final cnh.f P;
    public final utk.f Q;
    public final h5a.d R;
    public final j40.a S;
    public final lal.a T;
    public final cw9.d U;
    public final h5a.e V;
    public final b5a.b W;
    public final tbk.c X;
    public final q Y;
    public final i4b.f Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final dl3.a f80167a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final u f80168b0;
    public final h3j.y c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final d3j.b f80169d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final lra.d f80170e0;
    public final ihm.b f0;
    public final ihm.f g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final cli.y f80171h0;
    public final com.revolut.kompot.navigable.vc.modal.a i0;
    public final ChatTransferScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h30.q f80172p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f80173q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final pn3.a f80174r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f80175s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final sb7.b f80176t;
    public final jei.b u;
    public final e4a.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final g4a.b f80177w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i4a.d f80178x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final cl3.a f80179y;
    public final cu8.r0 z;

    public f(ChatTransferScreenContract$InputData inputData, h30.q provider, com.revolut.domain.interactors.transactions.a transactionsInteractor, pn3.a contactsPermissionsController, l itemNavigationCommandFactory, sb7.b homeNpsWidgetDelegate, jei.b tilesInteractor, e4a.b pinInteractor, g4a.b recentRecipientPopupMenuMapper, i4a.d scheduledToolTipProvider, cl3.a contactsInteractor, cu8.r0 kycRequiredActionTransformer, md0.b chaosManagementInteractor, p searchActionsNavigationCommandFactory, n navBarSearchFieldActionButtonsProvider, gte.a featureToggleInteractor, i5a.b homeNavBarTitleProvider, r0 jointAccountsInteractor, t3a.f notifyFriendsInteractor, d4m.a deeplinkHandler, z1 tipPopupDisplayer, mkd.d slotManagerExtension, wsg.n walletInteractor, bn2.p backgroundsInteractor, ej9.c contactWidgetInteractor, com.revolut.kompot.navigable.a controller, y80.a permissionProvider, s70.a intentProvider, f5a.e chatTransferSlotChecklistManager, cnh.f chatTransferMediaPickerExtension, utk.f profileNotificationInteractor, h5a.d newTransferNavigationDestinationProvider, j40.a assistantModelExtension, lal.a paymentsItemsDataProvider, cw9.d paymentsProductFeatureChecker, h5a.e shotDialogModelProvider, cli.n stateMapper, b5a.b inviteFriendsDestinationProvider, tbk.c planGiftingBirthdayInteractor, q userRegisteredIdentitiesInteractor, i4b.f legalEntityContextProvider, dl3.a contactDetailsDeleteChatDialogModelProvider, u contactPaymentsSettingsInteractor, h3j.y bankBeneficiaryDialogsProvider, d3j.b beneficiaryInteractor, lra.d cardOwnersInteractor) {
        a oVar;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(contactsPermissionsController, "contactsPermissionsController");
        Intrinsics.checkNotNullParameter(itemNavigationCommandFactory, "itemNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(homeNpsWidgetDelegate, "homeNpsWidgetDelegate");
        Intrinsics.checkNotNullParameter(tilesInteractor, "tilesInteractor");
        Intrinsics.checkNotNullParameter(pinInteractor, "pinInteractor");
        Intrinsics.checkNotNullParameter(recentRecipientPopupMenuMapper, "recentRecipientPopupMenuMapper");
        Intrinsics.checkNotNullParameter(scheduledToolTipProvider, "scheduledToolTipProvider");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(chaosManagementInteractor, "chaosManagementInteractor");
        Intrinsics.checkNotNullParameter(searchActionsNavigationCommandFactory, "searchActionsNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(navBarSearchFieldActionButtonsProvider, "navBarSearchFieldActionButtonsProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(homeNavBarTitleProvider, "homeNavBarTitleProvider");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(notifyFriendsInteractor, "notifyFriendsInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(tipPopupDisplayer, "tipPopupDisplayer");
        Intrinsics.checkNotNullParameter(slotManagerExtension, "slotManagerExtension");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(backgroundsInteractor, "backgroundsInteractor");
        Intrinsics.checkNotNullParameter(contactWidgetInteractor, "contactWidgetInteractor");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(chatTransferSlotChecklistManager, "chatTransferSlotChecklistManager");
        Intrinsics.checkNotNullParameter(chatTransferMediaPickerExtension, "chatTransferMediaPickerExtension");
        Intrinsics.checkNotNullParameter(profileNotificationInteractor, "profileNotificationInteractor");
        Intrinsics.checkNotNullParameter(newTransferNavigationDestinationProvider, "newTransferNavigationDestinationProvider");
        Intrinsics.checkNotNullParameter(assistantModelExtension, "assistantModelExtension");
        Intrinsics.checkNotNullParameter(paymentsItemsDataProvider, "paymentsItemsDataProvider");
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(shotDialogModelProvider, "shotDialogModelProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inviteFriendsDestinationProvider, "inviteFriendsDestinationProvider");
        Intrinsics.checkNotNullParameter(planGiftingBirthdayInteractor, "planGiftingBirthdayInteractor");
        Intrinsics.checkNotNullParameter(userRegisteredIdentitiesInteractor, "userRegisteredIdentitiesInteractor");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(contactDetailsDeleteChatDialogModelProvider, "contactDetailsDeleteChatDialogModelProvider");
        Intrinsics.checkNotNullParameter(contactPaymentsSettingsInteractor, "contactPaymentsSettingsInteractor");
        Intrinsics.checkNotNullParameter(bankBeneficiaryDialogsProvider, "bankBeneficiaryDialogsProvider");
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        Intrinsics.checkNotNullParameter(cardOwnersInteractor, "cardOwnersInteractor");
        this.o = inputData;
        this.f80172p = provider;
        this.f80173q = transactionsInteractor;
        this.f80174r = contactsPermissionsController;
        this.f80175s = itemNavigationCommandFactory;
        this.f80176t = homeNpsWidgetDelegate;
        this.u = tilesInteractor;
        this.v = pinInteractor;
        this.f80177w = recentRecipientPopupMenuMapper;
        this.f80178x = scheduledToolTipProvider;
        this.f80179y = contactsInteractor;
        this.z = kycRequiredActionTransformer;
        this.A = chaosManagementInteractor;
        this.B = searchActionsNavigationCommandFactory;
        this.C = navBarSearchFieldActionButtonsProvider;
        this.D = featureToggleInteractor;
        this.E = homeNavBarTitleProvider;
        this.F = jointAccountsInteractor;
        this.G = notifyFriendsInteractor;
        this.H = deeplinkHandler;
        this.I = tipPopupDisplayer;
        this.J = slotManagerExtension;
        this.K = walletInteractor;
        this.L = backgroundsInteractor;
        this.M = contactWidgetInteractor;
        this.N = intentProvider;
        this.O = chatTransferSlotChecklistManager;
        this.P = chatTransferMediaPickerExtension;
        this.Q = profileNotificationInteractor;
        this.R = newTransferNavigationDestinationProvider;
        this.S = assistantModelExtension;
        this.T = paymentsItemsDataProvider;
        this.U = paymentsProductFeatureChecker;
        this.V = shotDialogModelProvider;
        this.W = inviteFriendsDestinationProvider;
        this.X = planGiftingBirthdayInteractor;
        this.Y = userRegisteredIdentitiesInteractor;
        this.Z = legalEntityContextProvider;
        this.f80167a0 = contactDetailsDeleteChatDialogModelProvider;
        this.f80168b0 = contactPaymentsSettingsInteractor;
        this.c0 = bankBeneficiaryDialogsProvider;
        this.f80169d0 = beneficiaryInteractor;
        this.f80170e0 = cardOwnersInteractor;
        ihm.b bVarE = ihm.b.e(Unit.f186387a);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f0 = bVarE;
        this.g0 = v0.a.d("create(...)");
        int i = z.f21543a[inputData.f80150a.ordinal()];
        if (i == 1) {
            oVar = new o(null);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            oVar = a.C0521a.f80161a;
        }
        k9 k9Var = new k9(null, null, 3);
        Data data = new Data(null, null, true, 3, null);
        Data data2 = new Data(null, null, true, 3, null);
        f0 f0Var = f0.f322471a;
        this.f80171h0 = mra.d.b(this, new c5a.l(oVar, data, data2, f0Var, null, true, f0Var, null, k9Var, null, new Data(f0Var, null, false, 6, null), null, f0Var, permissionProvider.d(controller.m2(), v.k("android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS")), false, false, null, false, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.i0 = hx7.e.a(this, new bwd.a(this, 19));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f r4, jq9.k r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof c5a.c0
            if (r0 == 0) goto L13
            r0 = r6
            c5a.c0 r0 = (c5a.c0) r0
            int r1 = r0.f21486w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21486w = r1
            goto L18
        L13:
            c5a.c0 r0 = new c5a.c0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f21486w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3e
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            h3a.l r6 = r4.f80175s
            r0.f21486w = r3
            r2 = 0
            java.lang.Object r6 = r6.b(r5, r2, r0)
            if (r6 != r1) goto L3e
            return r1
        L3e:
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r5.<init>(r6)
            r4.C1(r5)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f.I2(com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f, jq9.k, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        int i = 1;
        int i2 = 0;
        ((b0) this.f80173q).t(i1.f272794a);
        int i3 = 6;
        Continuation continuation = null;
        yji.l.a1(this, mo3.a.g(this.F.i(false), new m(i3), null, 2), null, null, new a0(this, continuation, i3), 3);
        int i5 = 26;
        l2(new l0(this, continuation, i), new yi5.b(26));
        l2(new l0(this, continuation, 2), new yi5.b(26));
        l2(new m0(this, continuation, i2), new yi5.b(26));
        int i6 = 11;
        yji.l.a1(this, yh5.b.e(rd0.e.b(((pn3.b) this.f80174r).b()), new olf.e(this.M.f126792a.C0("PAYMENTS_CONTACTS_WIDGET_DISMISS_KEY", Boolean.TYPE), i6), ((cc7.h) this.f80176t).Z2(zb7.f.TRANSFERS)), null, null, new a0(this, continuation, 7), 3);
        r rVarSwitchMap = this.f0.switchMap(new c2i.c(new w(this, i2), 29));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        yji.l.a1(this, rd0.e.b(rVarSwitchMap), null, null, new a0(this, continuation, 8), 3);
        yji.l.a1(this, this.Z.j(null), null, null, new a0(this, continuation, i), 3);
        boolean zC = ((jte.d) this.D).c(PlanGiftingApi$Toggles.BirthdaySharingInPaymentsChatListCell.f102431c);
        cli.y yVar = this.f80171h0;
        if (zC) {
            y21.c cVar = (y21.c) this.X.f269553b.f322838b;
            w4l.h loadingStrategy = w4l.h.f294642c;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            yji.l.a1(this, nim.a.y(rd0.e.n(nim.a.v(rd0.e.b(cVar.b(SecuritySettings.BIRTHDAY_SHARING, loadingStrategy)), new dak.c(20)), h0.f322473a), new dak.c(21)), null, null, new a0(this, continuation, i2), 3);
        } else {
            H2(yVar, new j(10));
        }
        d4a.b bVar = this.v.f122515a;
        mk0.a aVar = bVar.f111257a;
        jb3.l.a();
        yji.l.a1(this, new cqh.m(aVar.j(new tk0.e("PINNED_CONTACTS")), bVar, 4), null, null, new a0(this, continuation, 9), 3);
        if (((c5a.l) ((j2) yVar.f22677a).getValue()).f21498a instanceof o) {
            yji.l.a1(this, rd0.e.b(this.E.a(new TextLocalisedClause(R$string.payments_transfer_title, null, null, 14))), null, null, new a0(this, continuation, 5), 3);
        }
        l2(new e0(this, null), new j(i6));
        h30.q qVar = this.f80172p;
        yji.l.a1(this, vkm.q.Q(rd0.e.b(ue0.e.E(m70.a.g(qVar.J0(false), null, null, 3), f0.f322471a)), new g6f.l(continuation, qVar, i5)), null, null, new a0(this, continuation, 3), 3);
        l2(new c5a.b0(this, null), new yi5.b(26));
        l2(new l0(this, continuation, i2), new yi5.b(26));
        yji.l.a1(this, this.U.f109573b.A("TRANSFER.scheduled"), null, null, new c5a.h0(this, null, 1), 3);
        TabTransferShotDialogAction shotDialogAction = this.o.d;
        if (shotDialogAction == null || this.f226127l) {
            return;
        }
        this.V.getClass();
        Intrinsics.checkNotNullParameter(shotDialogAction, "shotDialogAction");
        if (!(shotDialogAction instanceof TabTransferShotDialogAction.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        X1(new k("TAB_TRANSFER_SHOT_DIALOG_ACTION", ((TabTransferShotDialogAction.Success) shotDialogAction).f80024a, null, null, null, 28));
    }

    public final void J2(com.revolut.core.ui_kit.delegates.t clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        ActionWidgetDelegate.Model model = clickData.f54722b;
        ActionWidgetDelegate.a aVar = clickData.f54721a;
        boolean zF = Intrinsics.f(model.f51590a, "ID_TRANSFER_WIDGET_PERMISSION");
        ActionWidgetDelegate.a.C0395a c0395a = ActionWidgetDelegate.a.C0395a.f51607a;
        ActionWidgetDelegate.a.b bVar = ActionWidgetDelegate.a.b.f51608a;
        ActionWidgetDelegate.a.d dVar = ActionWidgetDelegate.a.d.f51610a;
        ActionWidgetDelegate.a.c cVar = ActionWidgetDelegate.a.c.f51609a;
        if (zF) {
            if (Intrinsics.f(aVar, cVar) || Intrinsics.f(aVar, dVar) || Intrinsics.f(aVar, bVar)) {
                ((pn3.b) this.f80174r).c(this, new w(this, 1));
                return;
            } else if (Intrinsics.f(aVar, c0395a)) {
                this.M.f126792a.G(Boolean.TRUE, "PAYMENTS_CONTACTS_WIDGET_DISMISS_KEY", Boolean.TYPE);
                return;
            } else {
                if (!(aVar instanceof com.revolut.core.ui_kit.delegates.h)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        Object obj2 = clickData.f54722b.f51596l;
        Continuation continuation = null;
        gei.a aVar2 = obj2 instanceof gei.a ? (gei.a) obj2 : null;
        if (aVar2 == null) {
            return;
        }
        if (Intrinsics.f(aVar, cVar) || Intrinsics.f(aVar, dVar)) {
            l2(new j0(this, aVar2, continuation, 0), new yi5.b(26));
        } else if (Intrinsics.f(aVar, c0395a)) {
            l2(new j0(this, aVar2, continuation, 1), new yi5.b(26));
        } else if (!(aVar instanceof com.revolut.core.ui_kit.delegates.h) && !Intrinsics.f(aVar, bVar)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.i0;
    }

    public final void K2(BannerDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.k;
        if (obj2 instanceof ChaosManagementNewsItem) {
            ChaosManagementNewsItem chaosManagementNewsItem = (ChaosManagementNewsItem) obj2;
            int i = 3;
            l2(new c34.d(i, this, chaosManagementNewsItem.f51356h, chaosManagementNewsItem.f51352a, (Continuation) null), new yi5.b(26));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void L2(FullScreenStateDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52373a;
        int iHashCode = str.hashCode();
        int i = 1;
        pn3.a aVar = this.f80174r;
        switch (iHashCode) {
            case -404547953:
                if (str.equals("CONTACTS_DENIED_ITEM_ID")) {
                    ((pn3.b) aVar).c(this, new w(this, i));
                    return;
                }
                break;
            case -316971230:
                if (str.equals("ID_TRANSFER_WIDGET_EMPTY")) {
                    c5a.n nVar = this.o.f80150a;
                    this.R.getClass();
                    C1(h5a.d.a(nVar));
                    return;
                }
                break;
            case 249399844:
                if (str.equals("CONTACTS_ALLOWED_ITEM_ID")) {
                    C1(this.W.a());
                    return;
                }
                break;
            case 752339194:
                if (str.equals("ID_TRANSFER_WIDGET_PERMISSION")) {
                    ((pn3.b) aVar).c(this, new w(this, i));
                    return;
                }
                break;
            case 1130256051:
                if (str.equals("CONTACTS_PERMANENTLY_DENIED_ITEM_ID")) {
                    C1(new ExternalDestination.ByIntent(((s70.b) this.N).b(), null));
                    return;
                }
                break;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Unknown list id: ", model.f52373a));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
    }

    public final void M2(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ID_MENU_ITEM_NEW")) {
            c5a.n nVar = this.o.f80150a;
            this.R.getClass();
            C1(h5a.d.a(nVar));
        } else if (Intrinsics.f(listId, "ID_MENU_ITEM_SCHEDULED")) {
            C1(new ScheduledPaymentsDestination(new ScheduledPaymentsInputData(RecurringPaymentAccount.Personal.f89320a, (ScheduledPaymentsInputData.InitialAction) null, 4), new ZoomTarget.ListId("ID_MENU_ITEM_SCHEDULED")));
        } else {
            IllegalStateException illegalStateException = new IllegalStateException(p.a.p("Menu Item (", listId, ") not supported"));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
    }

    public final void N2(String buttonId) {
        Intrinsics.checkNotNullParameter(buttonId, "buttonId");
        this.B.getClass();
        C1(p.a(buttonId));
    }

    @Override // yji.l
    public final void P1() {
        z1 z1Var = this.I;
        yr0.u uVar = z1Var.f256233g;
        if (uVar != null) {
            uVar.dismiss();
        }
        z1Var.f256233g = null;
    }

    @Override // yji.l
    public final void T1(long j2) {
        ChatTransferScreenContract$InputData chatTransferScreenContract$InputData = this.o;
        Continuation continuation = null;
        if (chatTransferScreenContract$InputData.f80151b) {
            n2(new c34.d(this, continuation, 4), new whi.b(6));
        }
        if (((jte.d) this.D).c(WhoToTransferApi$Toggles.PaymentsSlot.f80046c)) {
            mkd.a aVar = new mkd.a(new SlotContext(s.PAYMENTS_HOME));
            gld.f0 f0Var = (gld.f0) this.J;
            f0Var.c3(aVar);
            gld.a0 a0Var = f0Var.f144638l;
            yji.l.b1(this, v7.y("ChatTransferScreenModel", "observeSlotManager", a0Var.h()), null, new a0(this, continuation, 4), 3);
            yji.l.b1(this, a0Var.e(), null, new g0(this, null), 3);
        }
        yji.l.b1(this, this.Q.d(), null, new c5a.h0(this, null, 0), 3);
        ((pn3.b) this.f80174r).e();
        this.f0.onNext(Unit.f186387a);
        if (chatTransferScreenContract$InputData.f80152c) {
            yji.l.b1(this, this.S.Z2(), null, new a0(this, continuation, 10), 3);
        }
    }

    @Override // cli.z
    public final g getState() {
        return this.f80171h0;
    }
}
