package com.revolut.feature.subaccount.impl.ui.recurring_transfer;

import android.os.Parcelable;
import ccb.l;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.money_box_amount.ui.money_flow.MoneyBoxAmountInputScreen;
import com.revolut.feature.retail.money_box_amount.ui.money_flow.MoneyBoxAmountInputScreenContract$InputData;
import com.revolut.feature.subaccount.impl.ui.recurring_transfer.RecurringTransferFlowContract$Step;
import com.revolut.feature.transfer.core.api.schedule.ScheduleTransferInputData;
import com.revolut.feature.transfer.core.impl.schedule.ScheduleTransferScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.navigable.flow.EmptyFlowState;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import dki.g;
import g6e.d;
import grl.k9;
import java.time.LocalDate;
import jli.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qpf.h;
import u8e.c;
import u8e.f;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends g implements c {

    @NotNull
    public static final f Companion = new f();
    public static final Object z = r0.k(new Pair(e.f175845h, Float.valueOf(80.0f)), new Pair(e.f175843c, Float.valueOf(20.0f)), new Pair(e.f175841a, Float.valueOf(3.0f)));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RecurringTransferFlowContract$FlowInput f89126t;
    public final zof.f u;
    public final d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l80.e f89127w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final RecurringTransferFlowContract$Step.Schedule f89128x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final EmptyFlowState f89129y;

    public b(RecurringTransferFlowContract$FlowInput flowInput, zof.f transferFeatureScreensProvider, d subaccountInteractor, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(flowInput, "flowInput");
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f89126t = flowInput;
        this.u = transferFeatureScreensProvider;
        this.v = subaccountInteractor;
        this.f89127w = dateProvider;
        this.f89128x = RecurringTransferFlowContract$Step.Schedule.f89124a;
        this.f89129y = EmptyFlowState.f98428a;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Map] */
    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        long jK;
        RecurringTransferFlowContract$Step step = (RecurringTransferFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        boolean z3 = step instanceof RecurringTransferFlowContract$Step.Schedule;
        RecurringTransferFlowContract$FlowInput recurringTransferFlowContract$FlowInput = this.f89126t;
        if (z3) {
            TransferScheduleData transferScheduleData = recurringTransferFlowContract$FlowInput.f89121c;
            if (transferScheduleData == null) {
                ((l80.f) this.f89127w).getClass();
                transferScheduleData = new TransferScheduleData(System.currentTimeMillis(), jli.c.PERIOD_SELECTION_WEEK, 4);
            }
            m1l.a aVar = m1l.a.SCHEDULE_ENABLED;
            u8e.d.Companion.getClass();
            ScheduleTransferScreen scheduleTransferScreenD = ((h) this.u).d(new ScheduleTransferInputData((TextLocalisedClause) null, transferScheduleData, aVar, (TextLocalisedClause) null, v.k(jli.c.PERIOD_SELECTION_DAY, jli.c.PERIOD_SELECTION_WEEK, jli.c.PERIOD_SELECTION_BI_WEEKLY, jli.c.PERIOD_SELECTION_MONTH), false, (AnalyticsContext) null, (LocalDate) null, (LocalDate) null, false, false, false, 8137));
            final int i = 0;
            Function1 function1 = new Function1(this) { // from class: u8e.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.subaccount.impl.ui.recurring_transfer.b f278187b;

                {
                    this.f278187b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            dpf.c output = (dpf.c) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean zF = Intrinsics.f(output, dpf.a.f116875a);
                            com.revolut.feature.subaccount.impl.ui.recurring_transfer.b bVar = this.f278187b;
                            if (zF) {
                                bVar.I2();
                            } else {
                                if (!(output instanceof dpf.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar.l2(new com.revolut.feature.subaccount.impl.ui.recurring_transfer.a(bVar, output, null), new yi5.b(26));
                            }
                            return Unit.f186387a;
                        default:
                            l it8 = (l) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            com.revolut.feature.subaccount.impl.ui.recurring_transfer.b bVar2 = this.f278187b;
                            NaviCommand naviCommand = bVar2.f89126t.f;
                            if (naviCommand != null) {
                                bVar2.C1(new BridgeDestination(naviCommand));
                            } else {
                                bVar2.I2();
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
        String str = recurringTransferFlowContract$FlowInput.f89119a;
        RecurringTransferFlowContract$Step.RecurringTransfer recurringTransfer = (RecurringTransferFlowContract$Step.RecurringTransfer) step;
        TransferScheduleData transferScheduleData2 = recurringTransfer.f89123b;
        Long l2 = recurringTransfer.f89122a;
        if (l2 != null) {
            jK = l2.longValue();
        } else {
            Long l3 = recurringTransferFlowContract$FlowInput.d;
            if (l3 != null) {
                jK = l3.longValue();
            } else {
                float fFloatValue = ((Number) r0.h(e.f175843c, z)).floatValue();
                xi0.a aVar2 = xi0.b.Companion;
                String str2 = recurringTransferFlowContract$FlowInput.f89120b;
                aVar2.getClass();
                jK = (long) (fFloatValue * cp5.d.k(xi0.a.a(str2)));
            }
        }
        String str3 = recurringTransferFlowContract$FlowInput.f89120b;
        k9 k9Var = k9.Vaults;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        MoneyBoxAmountInputScreen moneyBoxAmountInputScreen = new MoneyBoxAmountInputScreen(MoneyBoxAmountInputScreenContract$InputData.Companion.a(companion, str, str3, transferScheduleData2, jK, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var)));
        final int i2 = 1;
        Function1 function12 = new Function1(this) { // from class: u8e.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.subaccount.impl.ui.recurring_transfer.b f278187b;

            {
                this.f278187b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        dpf.c output = (dpf.c) obj2;
                        Intrinsics.checkNotNullParameter(output, "output");
                        boolean zF = Intrinsics.f(output, dpf.a.f116875a);
                        com.revolut.feature.subaccount.impl.ui.recurring_transfer.b bVar = this.f278187b;
                        if (zF) {
                            bVar.I2();
                        } else {
                            if (!(output instanceof dpf.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar.l2(new com.revolut.feature.subaccount.impl.ui.recurring_transfer.a(bVar, output, null), new yi5.b(26));
                        }
                        return Unit.f186387a;
                    default:
                        l it8 = (l) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        com.revolut.feature.subaccount.impl.ui.recurring_transfer.b bVar2 = this.f278187b;
                        NaviCommand naviCommand = bVar2.f89126t.f;
                        if (naviCommand != null) {
                            bVar2.C1(new BridgeDestination(naviCommand));
                        } else {
                            bVar2.I2();
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
        return this.f89129y;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f89128x;
    }
}
