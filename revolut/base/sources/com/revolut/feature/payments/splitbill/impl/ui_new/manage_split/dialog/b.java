package com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.dialog;

import aw0.m6;
import aw0.n6;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.dialog.RecurringPaymentsManageSplitDialogContract$InputData;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import x1a.d;
import x1a.h;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecurringPaymentsManageSplitDialogContract$InputData f79895a;

    public b(RecurringPaymentsManageSplitDialogContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f79895a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        TextLocalisedClause textLocalisedClause3;
        TextLocalisedClause textLocalisedClause4;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        RecurringPaymentsManageSplitDialogContract$InputData recurringPaymentsManageSplitDialogContract$InputData = this.f79895a;
        boolean z = recurringPaymentsManageSplitDialogContract$InputData instanceof RecurringPaymentsManageSplitDialogContract$InputData.RemoveParticipant;
        if (z) {
            textLocalisedClause = new TextLocalisedClause(R$string.recurring_payments_split_members_remove_dialog_title, u.c(((RecurringPaymentsManageSplitDialogContract$InputData.RemoveParticipant) recurringPaymentsManageSplitDialogContract$InputData).f79894c), null, 12);
        } else {
            if (!(recurringPaymentsManageSplitDialogContract$InputData instanceof RecurringPaymentsManageSplitDialogContract$InputData.CancelSplit)) {
                throw new NoWhenBranchMatchedException();
            }
            int i = h.f302362a[((RecurringPaymentsManageSplitDialogContract$InputData.CancelSplit) recurringPaymentsManageSplitDialogContract$InputData).f79891a.f79921b.f79929a.ordinal()];
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
        }
        if (z) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.recurring_payments_split_members_remove_dialog_subtitle, u.c(((RecurringPaymentsManageSplitDialogContract$InputData.RemoveParticipant) recurringPaymentsManageSplitDialogContract$InputData).f79894c), null, 12);
        } else {
            if (!(recurringPaymentsManageSplitDialogContract$InputData instanceof RecurringPaymentsManageSplitDialogContract$InputData.CancelSplit)) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = h.f302362a[((RecurringPaymentsManageSplitDialogContract$InputData.CancelSplit) recurringPaymentsManageSplitDialogContract$InputData).f79891a.f79921b.f79929a.ordinal()];
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
        }
        lw0.a aVar = new lw0.a(textLocalisedClause, textLocalisedClause2, null, null, false, 28);
        m6 m6Var = n6.Companion;
        if (z) {
            textLocalisedClause3 = new TextLocalisedClause(R$string.recurring_payments_split_members_remove_dialog_confirm_button_text, null, null, 14);
        } else {
            if (!(recurringPaymentsManageSplitDialogContract$InputData instanceof RecurringPaymentsManageSplitDialogContract$InputData.CancelSplit)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause3 = new TextLocalisedClause(R$string.recurring_payments_split_cancel_dialog_confirm_button_title, null, null, 14);
        }
        n6 n6VarC = m6.c(m6Var, textLocalisedClause3, LargeActionButton.ButtonStyle.f58725a, null, "MANAGE_SPLIT_DIALOG_PRIMARY_BUTTON_TAG", false, null, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        if (z) {
            textLocalisedClause4 = new TextLocalisedClause(R$string.recurring_payments_split_manage_members_remove_dialog_cancel_button_text, null, null, 14);
        } else {
            if (!(recurringPaymentsManageSplitDialogContract$InputData instanceof RecurringPaymentsManageSplitDialogContract$InputData.CancelSplit)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause4 = new TextLocalisedClause(R$string.recurring_payments_split_cancel_dialog_no_button_title, null, null, 14);
        }
        return new d(new cii.a(aVar, new aw0.h(false, n6VarC, m6.c(m6Var, textLocalisedClause4, LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121)));
    }
}
