package com.revolut.feature.junior.isa.impl.navigation;

import aii.e;
import aii.g;
import aii.p;
import android.os.Parcelable;
import aw0.i;
import aw0.m6;
import aw0.n6;
import ba8.h;
import com.google.common.collect.ImmutableSet;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior.isa.api.navigation.JisaCashHoldingAvailableToWithdrawInfoDialogDescriptor;
import com.revolut.feature.junior.isa.api.navigation.JuniorIsaAccountOwnership;
import com.revolut.feature.junior.isa.api.navigation.JuniorIsaDestination;
import com.revolut.feature.junior.isa.impl.navigation.JuniorIsaInternalDestination;
import com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.JuniorAccountDetailsConfirmationScreen;
import com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.JuniorAccountDetailsConfirmationScreenContract$InputData;
import com.revolut.feature.junior.isa.impl.ui.child_details.JuniorIsaChildDetailsScreen;
import com.revolut.feature.junior.isa.impl.ui.child_details.JuniorIsaChildDetailsScreenContract$InputData;
import com.revolut.feature.junior.isa.impl.ui.child_picker.JuniorIsaChildPickerScreen;
import com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation.JuniorIsaChildCreationScreen;
import com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation.JuniorIsaChildCreationScreenContract$InputData;
import com.revolut.feature.junior.isa.impl.ui.jisa_details.JuniorIsaDetailsScreen;
import com.revolut.feature.junior.isa.impl.ui.jisa_details.JuniorIsaDetailsScreenContract$InputData;
import com.revolut.feature.junior.isa.impl.ui.jisa_details.flow.JuniorIsaDetailsFlow;
import com.revolut.feature.junior.isa.impl.ui.jisa_details.flow.JuniorIsaDetailsFlowContract$InputData;
import com.revolut.feature.junior.isa.impl.ui.jisa_national_number.JuniorIsaNationalNumberScreen;
import com.revolut.feature.junior.isa.impl.ui.jisa_national_number.JuniorIsaNationalNumberScreenContract$InputData;
import com.revolut.feature.junior.isa.impl.ui.trading_account_picker.flow.JuniorTradingAccountPickerFlow;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import grl.k9;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lw0.c;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f76747a;

    public a(ImmutableSet deeplinkGateways, h withdrawInfoDialogProvider) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        Intrinsics.checkNotNullParameter(withdrawInfoDialogProvider, "withdrawInfoDialogProvider");
        this.f76747a = deeplinkGateways;
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        i hVar;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof t98.a) {
            return ((t98.a) descriptor).a(new JuniorTradingAccountPickerFlow());
        }
        if (!(descriptor instanceof JisaCashHoldingAvailableToWithdrawInfoDialogDescriptor)) {
            return null;
        }
        JisaCashHoldingAvailableToWithdrawInfoDialogDescriptor jisaCashHoldingAvailableToWithdrawInfoDialogDescriptor = (JisaCashHoldingAvailableToWithdrawInfoDialogDescriptor) descriptor;
        JuniorIsaAccountOwnership ownership = jisaCashHoldingAvailableToWithdrawInfoDialogDescriptor.f76733a;
        t98.e transferType = jisaCashHoldingAvailableToWithdrawInfoDialogDescriptor.f76734b;
        Intrinsics.checkNotNullParameter(ownership, "ownership");
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        c cVar = new c(new GlyphImage(R$drawable.uikit_icn_16_info_outline, null, null, 6));
        boolean z = ownership instanceof JuniorIsaAccountOwnership.Custodian;
        JuniorIsaAccountOwnership.Personal personal = JuniorIsaAccountOwnership.Personal.f76736a;
        if (z) {
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_cash_info_withdrawable_custodian_jisa_title, u.c(((JuniorIsaAccountOwnership.Custodian) ownership).f76735a), null, 12);
        } else {
            if (!Intrinsics.f(ownership, personal)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_cash_info_withdrawable_personal_jisa_title, null, null, 14);
        }
        if (z) {
            int i = R$string.wealth_cash_info_withdrawable_custodian_jisa_description;
            String str = ((JuniorIsaAccountOwnership.Custodian) ownership).f76735a;
            textLocalisedClause2 = new TextLocalisedClause(i, v.k(str, str), null, 12);
        } else {
            if (!Intrinsics.f(ownership, personal)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_cash_info_withdrawable_personal_jisa_description, null, null, 14);
        }
        lw0.a aVar = new lw0.a(textLocalisedClause, textLocalisedClause2, cVar, null, false, 24);
        int i2 = ba8.g.f13993a[transferType.ordinal()];
        if (i2 == 1) {
            m6 m6Var = n6.Companion;
            hVar = new aw0.h(false, m6.c(m6Var, new TextLocalisedClause(R$string.wealth_cash_info_withdrawable_personal_jisa_action_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(R$string.wealth_cash_info_withdrawable_personal_jisa_action_not_now, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            hVar = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
        }
        k9 k9Var = k9.Wealth;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return jisaCashHoldingAvailableToWithdrawInfoDialogDescriptor.a(new ActionsBottomSheetController(new dii.a(aVar, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof JuniorIsaDestination) && !(destination instanceof JuniorIsaInternalDestination)) {
            return null;
        }
        KompotDestination kompotDestination = (KompotDestination) destination;
        if (kompotDestination instanceof JuniorIsaInternalDestination.ChildPickerDestination) {
            return new JuniorIsaChildPickerScreen();
        }
        if (kompotDestination instanceof JuniorIsaInternalDestination.JISADetailsFlowDestination) {
            return new JuniorIsaDetailsFlow(new JuniorIsaDetailsFlowContract$InputData(((JuniorIsaInternalDestination.JISADetailsFlowDestination) destination).f76746a));
        }
        if (kompotDestination instanceof JuniorIsaDestination.ChildDetailsDestination) {
            return new JuniorIsaChildDetailsScreen(new JuniorIsaChildDetailsScreenContract$InputData(((JuniorIsaDestination.ChildDetailsDestination) destination).f76739a));
        }
        if (kompotDestination instanceof JuniorIsaDestination.JISADetailsDestination) {
            return new JuniorIsaDetailsScreen(new JuniorIsaDetailsScreenContract$InputData(((JuniorIsaDestination.JISADetailsDestination) destination).f76741a));
        }
        if (kompotDestination instanceof JuniorIsaDestination.JISAChildCreationDestination) {
            return new JuniorIsaChildCreationScreen(new JuniorIsaChildCreationScreenContract$InputData(((JuniorIsaDestination.JISAChildCreationDestination) destination).f76740a));
        }
        if (kompotDestination instanceof JuniorIsaDestination.ChildDetailsConfirmationDestination) {
            return new JuniorAccountDetailsConfirmationScreen(new JuniorAccountDetailsConfirmationScreenContract$InputData(((JuniorIsaDestination.ChildDetailsConfirmationDestination) destination).f76737a, f0.f322471a));
        }
        if (!(kompotDestination instanceof JuniorIsaDestination.JISANationalNumberDestination)) {
            return null;
        }
        JuniorIsaDestination.JISANationalNumberDestination jISANationalNumberDestination = (JuniorIsaDestination.JISANationalNumberDestination) destination;
        String value = jISANationalNumberDestination.f76742a;
        Intrinsics.checkNotNullParameter(value, "value");
        return new JuniorIsaNationalNumberScreen(new JuniorIsaNationalNumberScreenContract$InputData(value, jISANationalNumberDestination.f76743b, jISANationalNumberDestination.f76744c, jISANationalNumberDestination.d));
    }

    @Override // aii.p
    public final Set h() {
        return this.f76747a;
    }
}
