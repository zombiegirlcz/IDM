package com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review;

import aw0.o9;
import aw0.t0;
import bsf.i;
import cli.y;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.revolut_x_common.api.RevolutXCommonApi$Toggles;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.feature.transfer.core.api.ui.reference.ReferenceInputData;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceAccountSwitchingInformation;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote;
import com.revolut.retail.feature.payments.bank_transfer.impl.R$string;
import com.revolut.retail.feature.payments.bank_transfer.impl.new_zealand_transfer_note.NewZealandTransferNoteScreen;
import com.revolut.retail.feature.payments.bank_transfer.impl.new_zealand_transfer_note.NewZealandTransferNoteScreenContract$InputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.structured_reference_transfer_note.StructuredReferenceTransferNoteScreen;
import com.revolut.retail.feature.payments.bank_transfer.impl.structured_reference_transfer_note.StructuredReferenceTransferNoteScreenContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import f2k.p;
import fnc.s;
import i4k.f;
import iuf.b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import mkd.d;
import oki.h;
import qna.n;
import qz9.u;
import r4k.a0;
import r4k.l;
import r4k.m;
import r4k.r;
import r4k.v;
import r4k.w;
import r4k.x;
import rp0.t;
import tga.k;
import v2k.c;
import vkm.j2;
import vkm.q;
import y4k.g;
import yp0.b;
import zhm.f0;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements r {
    public final k A;
    public final p B;
    public final f C;
    public final vrf.h D;
    public final s E;
    public final i F;
    public final i5k.a G;
    public final y H;
    public final com.revolut.kompot.navigable.vc.modal.a I;
    public final BankTransferReviewScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b9k.f f102128p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gte.a f102129q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f102130r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b5k.a f102131s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zof.f f102132t;
    public final j60.a u;
    public final yof.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f102133w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final d f102134x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c f102135y;
    public final v4k.a z;

    public a(BankTransferReviewScreenContract$InputData inputData, b9k.f interactor, gte.a featureToggleInteractor, g extrasMapper, b5k.a transferDataObserver, zof.f transferFeatureScreensProvider, j60.a bottomDialogExtension, yof.a recipientTrustMapper, e dateProvider, d slotManagerFeedControllerModelExtension, c taxesItemProvider, v4k.a disclaimersExtension, k pricingPlanUpgradeEntryPointItemProvider, p upgradeEntryPointContextFactory, f accountSwitchingDialogMapper, vrf.h sectionFactory, s transferScannedBillDestinationProvider, i transferReasonLauncherExtension, v stateMapper, i5k.a appFraudCheckExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(extrasMapper, "extrasMapper");
        Intrinsics.checkNotNullParameter(transferDataObserver, "transferDataObserver");
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(recipientTrustMapper, "recipientTrustMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(slotManagerFeedControllerModelExtension, "slotManagerFeedControllerModelExtension");
        Intrinsics.checkNotNullParameter(taxesItemProvider, "taxesItemProvider");
        Intrinsics.checkNotNullParameter(disclaimersExtension, "disclaimersExtension");
        Intrinsics.checkNotNullParameter(pricingPlanUpgradeEntryPointItemProvider, "pricingPlanUpgradeEntryPointItemProvider");
        Intrinsics.checkNotNullParameter(upgradeEntryPointContextFactory, "upgradeEntryPointContextFactory");
        Intrinsics.checkNotNullParameter(accountSwitchingDialogMapper, "accountSwitchingDialogMapper");
        Intrinsics.checkNotNullParameter(sectionFactory, "sectionFactory");
        Intrinsics.checkNotNullParameter(transferScannedBillDestinationProvider, "transferScannedBillDestinationProvider");
        Intrinsics.checkNotNullParameter(transferReasonLauncherExtension, "transferReasonLauncherExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(appFraudCheckExtension, "appFraudCheckExtension");
        this.o = inputData;
        this.f102128p = interactor;
        this.f102129q = featureToggleInteractor;
        this.f102130r = extrasMapper;
        this.f102131s = transferDataObserver;
        this.f102132t = transferFeatureScreensProvider;
        this.u = bottomDialogExtension;
        this.v = recipientTrustMapper;
        this.f102133w = dateProvider;
        this.f102134x = slotManagerFeedControllerModelExtension;
        this.f102135y = taxesItemProvider;
        this.z = disclaimersExtension;
        this.A = pricingPlanUpgradeEntryPointItemProvider;
        this.B = upgradeEntryPointContextFactory;
        this.C = accountSwitchingDialogMapper;
        this.D = sectionFactory;
        this.E = transferScannedBillDestinationProvider;
        this.F = transferReasonLauncherExtension;
        this.G = appFraudCheckExtension;
        this.H = mra.d.b(this, new l(inputData.f102122a, inputData.f102123b, inputData.d, null, null, null, null, inputData.e, f0.f322471a), stateMapper, null, false, 12);
        this.I = hx7.e.a(this, new qm2.c(this, 27));
    }

    @Override // yji.l
    public final void I1() {
        boolean zC = ((jte.d) this.f102129q).c(RevolutXCommonApi$Toggles.RevolutXPromo.f84262c);
        BankTransferReviewScreenContract$InputData bankTransferReviewScreenContract$InputData = this.o;
        Continuation continuation = null;
        if (zC) {
            mkd.a aVar = new mkd.a(new SlotContext(akd.s.PAYMENTS_TRANSFER_REVIEW, y0.b(bankTransferReviewScreenContract$InputData.f102122a.f132329a)));
            gld.f0 f0Var = (gld.f0) this.f102134x;
            f0Var.c3(aVar);
            yji.l.a1(this, f0Var.f144638l.h(), null, null, new a0(this, continuation, 4), 3);
        }
        r40.y0 y0Var = new r40.y0(17);
        y yVar = this.H;
        yji.l.a1(this, q.Q(q.q(yVar.B(y0Var)), new mki.d(continuation, this, 8)), null, null, new a0(this, continuation, 2), 3);
        yji.l.a1(this, mo3.a.g(q.Q(new qij.s(q.q(yVar.B(new w(this, 3))), 3), new r3k.c(continuation, this, 1)), null, new u(28), 1), null, null, new a0(this, continuation, 0), 3);
        RemittanceAccountSwitchingInformation information = bankTransferReviewScreenContract$InputData.d.f101934q;
        if (information != null) {
            this.C.getClass();
            Intrinsics.checkNotNullParameter(information, "information");
            aim.e eVarB = zhm.u.b();
            eVarB.add(new CellDetailsDelegate.Model("ID_BANK_NAME_CELL", new t0((Clause) new TextLocalisedClause(R$string.account_switch_transfer_bank_name, null, null, 14), (Image) null, 0, false, 30), new TextClause(information.getBankName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, new UrlImage(information.getBankLogo(), null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), false, false, null, null, 31736));
            List accountDetails = information.getAccountDetails();
            ArrayList arrayList = new ArrayList(zhm.w.t(accountDetails, 10));
            int i = 0;
            for (Object obj2 : accountDetails) {
                int i2 = i + 1;
                if (i < 0) {
                    zhm.v.s();
                    throw null;
                }
                RemittanceAccountSwitchingInformation.AccountDetails accountDetails2 = (RemittanceAccountSwitchingInformation.AccountDetails) obj2;
                arrayList.add(new CellDetailsDelegate.Model(a0.d.n("ID_ACCOUNT_DETAIL_", i), new t0((Clause) new TextClause(accountDetails2.getLabel(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, 0, false, 30), new TextClause(accountDetails2.getValue(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760));
                i = i2;
            }
            eVarB.addAll(arrayList);
            aim.e eVarA = zhm.u.a(eVarB);
            b.k(eVarA, 0, 0, 0, 0, 31);
            t tVar = new t(new TextClause(information.getTitle(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(information.getDescription(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 28);
            aim.e eVarB2 = zhm.u.b();
            eVarB2.addAll(eVarA);
            LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.common_action_got_it, null, null, 14);
            int i3 = R$attr.uikit_dp16;
            eVarB2.add(new LargeActionButtonDelegate.Model("ID_CONTINUE_BUTTON", defaultFilledButton, null, textLocalisedClause, false, "ID_CONTINUE_BUTTON", null, R$attr.uikit_dp8, i3, i3, i3, 464));
            this.u.x(new rp0.y(zhm.u.a(eVarB2), tVar, null, null, null, null, 1020));
        }
        yji.l.a1(this, this.z.Z2(), null, null, new a0(this, continuation, 1), 3);
        this.G.Z2();
    }

    public final void I2() {
        y yVar = this.H;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        TransferNote transferNote = ((l) j2Var.getValue()).f251480c.f;
        if (transferNote instanceof TransferNote.NewZealandNote) {
            yji.l.g2(this, new NewZealandTransferNoteScreen(new NewZealandTransferNoteScreenContract$InputData((TransferNote.NewZealandNote) transferNote)), null, new w(this, 5), 1);
            return;
        }
        if (!(transferNote instanceof TransferNote.SimpleNote)) {
            if (!(transferNote instanceof TransferNote.StructuredNote)) {
                throw new NoWhenBranchMatchedException();
            }
            yji.l.j2(this, new StructuredReferenceTransferNoteScreen(new StructuredReferenceTransferNoteScreenContract$InputData((TransferNote.StructuredNote) transferNote, ((l) j2Var2.getValue()).f251480c.f101932n)), null, new w(this, 6), 1);
            return;
        }
        Pair pair = f2k.f.c(((l) j2Var2.getValue()).f251480c, ((l) j2Var2.getValue()).f251478a) ? new Pair(Integer.valueOf(com.revolut.retail.feature.payments.core.R$string.payments_bank_transfer_description_title), Integer.valueOf(com.revolut.retail.feature.payments.core.R$string.payments_bank_transfer_description)) : new Pair(Integer.valueOf(com.revolut.retail.feature.payments.core.R$string.payments_bank_transfer_reference_title), Integer.valueOf(com.revolut.retail.feature.payments.core.R$string.payments_bank_transfer_reference_input_hint));
        int iIntValue = ((Number) pair.f186385a).intValue();
        int iIntValue2 = ((Number) pair.f186386b).intValue();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(iIntValue, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(iIntValue2, null, null, 14);
        b9k.f fVar = this.f102128p;
        p4k.g gVar = (p4k.g) fVar.f13816a;
        f5j.a aVar = ((BankTransferReviewScreenContract$InputData) fVar.f13817b).f102122a;
        gVar.getClass();
        Integer numC = p4k.g.c(aVar);
        yji.l.g2(this, ((qpf.h) this.f102132t).b(new ReferenceInputData(numC != null ? numC.intValue() : 140, textLocalisedClause, textLocalisedClause2, com.revolut.retail.feature.payments.bank_transfer.api.navigation.b.a(((l) j2Var2.getValue()).f251480c.f))), null, new w(this, 4), 1);
    }

    public final m J2() {
        m mVar = ((l) ((j2) this.H.f22677a).getValue()).d;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.I;
    }

    public final void K2(Function1 function1) {
        H2(this.H, new x(function1, this, 0));
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, q.Q(q.q(new n(this.H.B(new r40.y0(16)), this, 7)), new b0(null, this.D, 2)), null, new a0(this, null, 3), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.H;
    }
}
