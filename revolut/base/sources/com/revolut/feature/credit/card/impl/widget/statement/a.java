package com.revolut.feature.credit.card.impl.widget.statement;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GoalProgressWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.SimpleTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.core.ui_kit.delegates.widgets.z3;
import com.revolut.feature.credit.card.api.navigation.CreditCardInAppStatementDetailsDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardSetupAutoPayDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardTopupDestination;
import com.revolut.feature.credit.card.api.widget.CreditCardWidgetContext;
import com.revolut.feature.credit.card.impl.widget.statement.CreditCardStatementWidgetMapper;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import csh.f;
import dsh.o;
import efm.b;
import ish.a0;
import jli.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f69790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f69791b;

    public a(m navigator, a0 widgetsUiInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        this.f69790a = navigator;
        this.f69791b = widgetsUiInteractor;
    }

    @Override // csh.f
    public final Class j() {
        return CreditCardWidgetContext.class;
    }

    @Override // csh.f
    public final b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        ParcelableDestination creditCardSetupAutoPayDestination;
        CreditCardWidgetContext widgetContext2 = (CreditCardWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof q0) {
            String str = ((q0) event).f55476b;
            HomeFeedWidgetContext.CreditCard.Companion companion = HomeFeedWidgetContext.CreditCard.INSTANCE;
            String creditCardFacilityId = widgetContext2.getCreditCardFacilityId();
            companion.getClass();
            this.f69791b.a(new o(HomeFeedWidgetContext.CreditCard.Companion.a(creditCardFacilityId), str));
        } else {
            boolean z = event instanceof i;
            m mVar = this.f69790a;
            if (z) {
                BaseDraggableWidgetDelegate.Model model = ((i) event).f55375c;
                if (model instanceof GoalProgressWidgetDelegate.Model) {
                    String creditCardFacilityId2 = widgetContext2.getCreditCardFacilityId();
                    Object obj2 = ((GoalProgressWidgetDelegate.Model) model).f55148j;
                    CreditCardStatementWidgetMapper.StatementWidgetParcel statementWidgetParcel = obj2 instanceof CreditCardStatementWidgetMapper.StatementWidgetParcel ? (CreditCardStatementWidgetMapper.StatementWidgetParcel) obj2 : null;
                    if (statementWidgetParcel != null) {
                        mVar.c(new FeatureCommand(new KompotOverlayFeatureConfig(new CreditCardInAppStatementDetailsDestination(creditCardFacilityId2, statementWidgetParcel.f69786a), yhi.b.POPUP, (Integer) null, 12)));
                    }
                } else if (model instanceof SimpleTileWidgetDelegate.Model) {
                    String creditCardFacilityId3 = widgetContext2.getCreditCardFacilityId();
                    Object obj3 = ((SimpleTileWidgetDelegate.Model) model).i;
                    CreditCardStatementWidgetMapper.StatementWidgetParcel statementWidgetParcel2 = obj3 instanceof CreditCardStatementWidgetMapper.StatementWidgetParcel ? (CreditCardStatementWidgetMapper.StatementWidgetParcel) obj3 : null;
                    if (statementWidgetParcel2 != null) {
                        mVar.c(new FeatureCommand(new KompotOverlayFeatureConfig(new CreditCardInAppStatementDetailsDestination(creditCardFacilityId3, statementWidgetParcel2.f69786a), yhi.b.POPUP, (Integer) null, 12)));
                    }
                } else {
                    int i = h.f175850a;
                }
            } else if (event instanceof z3) {
                String creditCardFacilityId4 = widgetContext2.getCreditCardFacilityId();
                Object obj4 = ((z3) event).f55578c.i;
                CreditCardStatementWidgetMapper.StatementWidgetParcel statementWidgetParcel3 = obj4 instanceof CreditCardStatementWidgetMapper.StatementWidgetParcel ? (CreditCardStatementWidgetMapper.StatementWidgetParcel) obj4 : null;
                CreditCardStatementWidgetMapper.StatementWidgetParcel.ActionParcel actionParcel = statementWidgetParcel3 != null ? statementWidgetParcel3.f69787b : null;
                if (actionParcel instanceof CreditCardStatementWidgetMapper.StatementWidgetParcel.ActionParcel.Repay) {
                    creditCardSetupAutoPayDestination = new CreditCardTopupDestination(creditCardFacilityId4, (KompotDestination) null, 6);
                } else if (actionParcel instanceof CreditCardStatementWidgetMapper.StatementWidgetParcel.ActionParcel.AutopaySetup) {
                    creditCardSetupAutoPayDestination = new CreditCardSetupAutoPayDestination(creditCardFacilityId4);
                } else {
                    if (actionParcel != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    creditCardSetupAutoPayDestination = null;
                }
                FeatureCommand featureCommand = creditCardSetupAutoPayDestination != null ? new FeatureCommand(new KompotOverlayFeatureConfig(creditCardSetupAutoPayDestination, yhi.b.POPUP, (Integer) null, 12)) : null;
                if (featureCommand != null) {
                    mVar.c(featureCommand);
                }
            } else {
                int i2 = h.f175850a;
            }
        }
        pfm.m mVar2 = pfm.m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
        return mVar2;
    }
}
