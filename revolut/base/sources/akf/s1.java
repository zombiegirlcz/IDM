package akf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit;
import com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplitSource;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class s1 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f5894l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final cl3.a f5895m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k38.c f5896n;
    public final bmf.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y21.c f5897p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mq9.f f5898q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final gkf.n f5899r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final od0.i f5900s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gkf.l f5901t;
    public final gkf.h u;
    public final v0a.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final v0a.c f5902w;

    public s1(klf.h0 commonDataSource, cl3.a contactsInteractor, k38.c jointAccountsInteractor, bmf.b modalFactory, y21.c optOutRepository, mq9.f paymentsGroupsInteractor, gkf.n splitBillOptionsDialogProvider, gkf.l splitBillDataProvider, gkf.h splitBillActionItemMapper, v0a.a recurringSplitInteractor, v0a.c splitBillsInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(modalFactory, "modalFactory");
        Intrinsics.checkNotNullParameter(optOutRepository, "optOutRepository");
        Intrinsics.checkNotNullParameter(paymentsGroupsInteractor, "paymentsGroupsInteractor");
        Intrinsics.checkNotNullParameter(splitBillOptionsDialogProvider, "splitBillOptionsDialogProvider");
        od0.i customSplitBillActionsProvider = od0.i.f224256b;
        Intrinsics.checkNotNullParameter(customSplitBillActionsProvider, "customSplitBillActionsProvider");
        Intrinsics.checkNotNullParameter(splitBillDataProvider, "splitBillDataProvider");
        Intrinsics.checkNotNullParameter(splitBillActionItemMapper, "splitBillActionItemMapper");
        Intrinsics.checkNotNullParameter(recurringSplitInteractor, "recurringSplitInteractor");
        Intrinsics.checkNotNullParameter(splitBillsInteractor, "splitBillsInteractor");
        this.f5894l = commonDataSource;
        this.f5895m = contactsInteractor;
        this.f5896n = jointAccountsInteractor;
        this.o = modalFactory;
        this.f5897p = optOutRepository;
        this.f5898q = paymentsGroupsInteractor;
        this.f5899r = splitBillOptionsDialogProvider;
        this.f5900s = customSplitBillActionsProvider;
        this.f5901t = splitBillDataProvider;
        this.u = splitBillActionItemMapper;
        this.v = recurringSplitInteractor;
        this.f5902w = splitBillsInteractor;
    }

    public final cmf.f Z2() {
        if (this.f5900s.g() != null) {
            throw new ClassCastException();
        }
        gkf.l lVar = this.f5901t;
        return new cmf.f(new a3i.i(vkm.q.Q(((cw9.d) lVar.d).f109573b.A("BILLS_AND_TAXES.split_bill"), new gkf.i(null, lVar, 0)), this, 15), zhm.u.c(this), "SplitBill");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(tof.a3 r19, gim.c r20) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: akf.s1.b3(tof.a3, gim.c):java.lang.Object");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        if (this.f5900s.g() != null) {
            throw new ClassCastException();
        }
        if (a10.b.B(v1.Companion, t1.OPEN_SPLIT_BILL, str)) {
            return c3(obj2 instanceof qua.p ? (qua.p) obj2 : null, (gim.c) continuation);
        }
        boolean zF = Intrinsics.f(str, u1.a(t1.CANCEL_SPLIT_BILL));
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        boolean z = true;
        if (zF) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.domain.models.moneyrequest.SplittedBill");
            N2(bmf.a.b(this.o, new TextLocalisedClause(R$string.transaction_split_bill_confirm_cancel_title, null, null, 14), new TextLocalisedClause(R$string.transaction_split_bill_confirm_cancel_message, null, null, 14), new TextLocalisedClause(R$string.transaction_split_bill_confirm_cancel_negative_action, null, null, 14), null, new TextLocalisedClause(R$string.transaction_split_bill_confirm_cancel_positive_action, null, null, 14), null, 472), bottom_dialog, new acb.f(this, (v61.h) obj2, 27));
        } else if (Intrinsics.f(str, u1.a(t1.CANCEL_RECURRING_SPLIT_BILL))) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit");
            RecurringSplit recurringSplit = (RecurringSplit) obj2;
            RecurringSplitSource recurringSplitSource = recurringSplit.f79921b;
            a2a.g gVar = recurringSplitSource.f79929a;
            int[] iArr = k1.f5856b;
            int i = iArr[gVar.ordinal()];
            if (i == 1) {
                textLocalisedClause = new TextLocalisedClause(R$string.recurring_payments_split_subscription_cancel_dialog_title, null, null, 14);
            } else if (i == 2) {
                textLocalisedClause = new TextLocalisedClause(R$string.recurring_payments_split_direct_debit_cancel_dialog_title, null, null, 14);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.recurring_payments_split_external_transfer_cancel_dialog_title, null, null, 14);
            }
            TextLocalisedClause textLocalisedClause3 = textLocalisedClause;
            int i2 = iArr[recurringSplitSource.f79929a.ordinal()];
            if (i2 == 1) {
                textLocalisedClause2 = new TextLocalisedClause(R$string.recurring_payments_split_subscription_cancel_dialog_subtitle, null, null, 14);
            } else if (i2 == 2) {
                textLocalisedClause2 = new TextLocalisedClause(R$string.recurring_payments_split_direct_debit_cancel_dialog_subtitle, null, null, 14);
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause2 = new TextLocalisedClause(R$string.recurring_payments_split_external_transfer_cancel_dialog_subtitle, null, null, 14);
            }
            N2(bmf.a.a(this.o, textLocalisedClause3, textLocalisedClause2, new TextLocalisedClause(R$string.recurring_payments_split_cancel_dialog_confirm_button_title, null, null, 14), LargeActionButton.ButtonStyle.f58725a, new TextLocalisedClause(R$string.recurring_payments_split_cancel_dialog_no_button_title, null, null, 14), LargeActionButton.ButtonStyle.f58726b, 328), bottom_dialog, new acb.f(this, recurringSplit, 25));
        } else if (Intrinsics.f(str, u1.a(t1.PAYMENT_GROUP_BILL_REMOVE))) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.payments.groups.api.providers.united_wallet.PaymentGroupTransactionData.Bill");
            sq9.a aVar = (sq9.a) obj2;
            if (ofm.q.G(aVar.f265031c)) {
                N2(bmf.a.b(this.o, new TextLocalisedClause(com.revolut.feature.payments.groups.api.R$string.payments_groups_details_bill_remove_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.payments.groups.api.R$string.payments_groups_details_bill_remove_subtitle, zhm.u.c(aVar.f265030b.f79286b), null, 12), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14), null, new TextLocalisedClause(R.string.common_action_remove, null, null, 14), null, 472), bottom_dialog, new acb.f(this, aVar, 26));
            } else {
                L2(new nii.y0(null, new nii.z(new TextLocalisedClause(com.revolut.feature.payments.groups.api.R$string.payments_groups_details_bill_action_error_remove_or_edit_unavailable, null, null, 14), null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 5));
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a7, code lost:
    
        if (b3(r4, r2) == r3) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(qua.p r24, gim.c r25) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: akf.s1.c3(qua.p, gim.c):java.lang.Object");
    }
}
