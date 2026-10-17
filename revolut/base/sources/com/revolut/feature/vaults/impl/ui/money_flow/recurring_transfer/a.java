package com.revolut.feature.vaults.impl.ui.money_flow.recurring_transfer;

import android.os.Parcelable;
import ccb.l;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.money_box_amount.ui.money_flow.MoneyBoxAmountInputScreen;
import com.revolut.feature.retail.money_box_amount.ui.money_flow.MoneyBoxAmountInputScreenContract$InputData;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.transfer.core.api.schedule.ScheduleTransferInputData;
import com.revolut.feature.transfer.core.impl.schedule.ScheduleTransferScreen;
import com.revolut.feature.vaults.impl.ui.money_flow.recurring_transfer.RecurringTransferFlowContract$Step;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.navigable.flow.EmptyFlowState;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.revolut.feature_fourthline_impl.R;
import dki.g;
import grl.k9;
import java.time.LocalDate;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import qpf.h;
import tqg.c;
import tqg.d;
import v04.b;
import zhm.r0;
import zhm.v;
import zof.f;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends g implements c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RecurringTransferFlowContract$FlowInput f94785t;
    public final f u;
    public final e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final RecurringTransferFlowContract$Step.Schedule f94786w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final EmptyFlowState f94787x;

    public a(RecurringTransferFlowContract$FlowInput flowInput, f transferFeatureScreensProvider, e dateProvider) {
        Intrinsics.checkNotNullParameter(flowInput, "flowInput");
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f94785t = flowInput;
        this.u = transferFeatureScreensProvider;
        this.v = dateProvider;
        this.f94786w = RecurringTransferFlowContract$Step.Schedule.f94784a;
        this.f94787x = EmptyFlowState.f98428a;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Map] */
    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        long jK;
        RecurringTransferFlowContract$Step step = (RecurringTransferFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        boolean z = step instanceof RecurringTransferFlowContract$Step.Schedule;
        RecurringTransferFlowContract$FlowInput recurringTransferFlowContract$FlowInput = this.f94785t;
        if (z) {
            TextLocalisedClause textLocalisedClauseQ = b.Q(new TextLocalisedClause(R.string.common_action_schedule, null, null, 14), R$string.savings_onboarding_add_money_schedule);
            TransferScheduleData transferScheduleData = recurringTransferFlowContract$FlowInput.d;
            if (transferScheduleData == null) {
                ((l80.f) this.v).getClass();
                transferScheduleData = new TransferScheduleData(System.currentTimeMillis(), jli.c.PERIOD_SELECTION_WEEK, 4);
            }
            TransferScheduleData transferScheduleData2 = transferScheduleData;
            m1l.a aVar = m1l.a.SCHEDULE_ENABLED;
            d.Companion.getClass();
            List listK = v.k(jli.c.PERIOD_SELECTION_DAY, jli.c.PERIOD_SELECTION_WEEK, jli.c.PERIOD_SELECTION_MONTH);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.savings_onboarding_add_money_schedule_set, null, null, 14);
            String str = recurringTransferFlowContract$FlowInput.f94781b;
            ScheduleTransferScreen scheduleTransferScreenD = ((h) this.u).d(new ScheduleTransferInputData(textLocalisedClauseQ, transferScheduleData2, aVar, textLocalisedClause, listK, false, str != null ? new AnalyticsContext(v0.a.b(str, AnalyticsContext.INSTANCE)) : null, (LocalDate) null, (LocalDate) null, false, false, false, ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED));
            final int i = 0;
            Function1 function1 = new Function1(this) { // from class: tqg.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.vaults.impl.ui.money_flow.recurring_transfer.a f273559b;

                {
                    this.f273559b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            dpf.c output = (dpf.c) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean zF = Intrinsics.f(output, dpf.a.f116875a);
                            com.revolut.feature.vaults.impl.ui.money_flow.recurring_transfer.a aVar2 = this.f273559b;
                            if (zF) {
                                aVar2.I2();
                            } else {
                                if (!(output instanceof dpf.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.E2(new RecurringTransferFlowContract$Step.RecurringTransfer(((dpf.b) output).f116876a), true, null, false);
                            }
                            return Unit.f186387a;
                        default:
                            l it8 = (l) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            com.revolut.feature.vaults.impl.ui.money_flow.recurring_transfer.a aVar3 = this.f273559b;
                            if (aVar3.f94785t.f != null) {
                                aVar3.C1(new BridgeDestination(new FinishCommand(-1, null, null, 6)));
                            } else {
                                aVar3.I2();
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            scheduleTransferScreenD.H = function1;
            return scheduleTransferScreenD;
        }
        if (!(step instanceof RecurringTransferFlowContract$Step.RecurringTransfer)) {
            throw new NoWhenBranchMatchedException();
        }
        MoneyBoxAmountInputScreenContract$InputData.Companion companion = MoneyBoxAmountInputScreenContract$InputData.INSTANCE;
        String str2 = recurringTransferFlowContract$FlowInput.f94780a;
        TransferScheduleData transferScheduleData3 = ((RecurringTransferFlowContract$Step.RecurringTransfer) step).f94783a;
        Long l2 = recurringTransferFlowContract$FlowInput.e;
        if (l2 != null) {
            jK = l2.longValue();
        } else {
            hqg.b.Companion.getClass();
            float fFloatValue = ((Number) r0.h(jli.e.f175843c, hqg.b.f154696a.f154695b)).floatValue();
            xi0.a aVar2 = xi0.b.Companion;
            String str3 = recurringTransferFlowContract$FlowInput.f94782c;
            aVar2.getClass();
            jK = (long) (fFloatValue * cp5.d.k(xi0.a.a(str3)));
        }
        String str4 = recurringTransferFlowContract$FlowInput.f94782c;
        k9 k9Var = k9.Savings;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        MoneyBoxAmountInputScreen moneyBoxAmountInputScreen = new MoneyBoxAmountInputScreen(MoneyBoxAmountInputScreenContract$InputData.Companion.a(companion, str2, str4, transferScheduleData3, jK, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var)));
        final int i2 = 1;
        Function1 function12 = new Function1(this) { // from class: tqg.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.vaults.impl.ui.money_flow.recurring_transfer.a f273559b;

            {
                this.f273559b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        dpf.c output = (dpf.c) obj2;
                        Intrinsics.checkNotNullParameter(output, "output");
                        boolean zF = Intrinsics.f(output, dpf.a.f116875a);
                        com.revolut.feature.vaults.impl.ui.money_flow.recurring_transfer.a aVar22 = this.f273559b;
                        if (zF) {
                            aVar22.I2();
                        } else {
                            if (!(output instanceof dpf.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar22.E2(new RecurringTransferFlowContract$Step.RecurringTransfer(((dpf.b) output).f116876a), true, null, false);
                        }
                        return Unit.f186387a;
                    default:
                        l it8 = (l) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        com.revolut.feature.vaults.impl.ui.money_flow.recurring_transfer.a aVar3 = this.f273559b;
                        if (aVar3.f94785t.f != null) {
                            aVar3.C1(new BridgeDestination(new FinishCommand(-1, null, null, 6)));
                        } else {
                            aVar3.I2();
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(function12, "<set-?>");
        moneyBoxAmountInputScreen.H = function12;
        return moneyBoxAmountInputScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f94787x;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f94786w;
    }
}
