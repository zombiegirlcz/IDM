package com.revolut.feature.transaction.recogniser.impl.ui.flow;

import aff.f;
import aff.h;
import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.backend_flow.api.navigation.BackendFlowDestination;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.support.api.navigation.HelpCentreFeatureConfig;
import com.revolut.feature.transaction.recogniser.impl.R$string;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.TransactionRecogniserFlowContract$InputData;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.TransactionRecogniserFlowContract$Step;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.add_note.AddNoteScreen;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.add_note.AddNoteScreenContract$InputData;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.before_after.BeforeAfterScreen;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.before_after.BeforeAfterScreenContract$InputData;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.details.TransactionRecogniserDetailsScreen;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.details.TransactionRecogniserDetailsScreenContract$InputData;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.final_checks.FinalChecksScreen;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.final_checks.FinalChecksScreenContract$InputData;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.merchant_history.MerchantHistoryScreen;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.merchant_history.MerchantHistoryScreenContract$InputData;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.core.navigation.FeatureCommand;
import dki.g;
import java.util.List;
import java.util.Map;
import k71.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.coroutines.flow.Flow;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.w1;
import nii.y0;
import yef.e;
import yji.l;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends g implements qef.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TransactionRecogniserFlowContract$InputData f91817t;
    public final hef.a u;
    public final String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TransactionRecogniserFlowContract$Step.RecogniserTransactionDetails f91818w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TransactionRecogniserFlowContract$State f91819x;

    public b(TransactionRecogniserFlowContract$InputData inputData, hef.a destinationProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(destinationProvider, "destinationProvider");
        this.f91817t = inputData;
        this.u = destinationProvider;
        String str = inputData.f91809a;
        this.v = str;
        this.f91818w = new TransactionRecogniserFlowContract$Step.RecogniserTransactionDetails(str);
        this.f91819x = TransactionRecogniserFlowContract$State.f91811a;
    }

    public static y0 O2() {
        return new y0(null, new j0((Clause) new TextLocalisedClause(R$string.transaction_recogniser_recognised_screen_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.transaction_recogniser_recognised_screen_body, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(2, new TextLocalisedClause(R$string.transaction_recogniser_recognised_screen_actions_got_it, null, null, 14), new CompositeClause(v.k(new ImageClause(R$drawable.uikit_icn_24_pencil, Integer.valueOf(R$attr.uikit_colorAccent), (Float) null, (Float) null, 28), new TextLocalisedClause(R$string.transaction_recogniser_recognised_screen_actions_add_note, null, null, 14)), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12)), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076), false, 5);
    }

    public final void P2() {
        ((hff.a) this.u).getClass();
        String transactionId = this.v;
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        C1(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(new c(transactionId), com.revolut.feature.transactions.api.navigation.a.OTHER, null, null, 92))));
        I2();
    }

    public final void Q2(Flow flow) {
        l.a1(this, flow, null, null, new a(this, null), 3);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        TransactionRecogniserFlowContract$Step step = (TransactionRecogniserFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof TransactionRecogniserFlowContract$Step.FinalChecks) {
            FinalChecksScreen finalChecksScreen = new FinalChecksScreen(new FinalChecksScreenContract$InputData(((TransactionRecogniserFlowContract$Step.FinalChecks) step).f91813a));
            final int i = 1;
            Function1 function1 = new Function1(this) { // from class: qef.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.transaction.recogniser.impl.ui.flow.b f245146b;

                {
                    this.f245146b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            h result = (h) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof aff.g;
                            com.revolut.feature.transaction.recogniser.impl.ui.flow.b bVar = this.f245146b;
                            if (z) {
                                bVar.Q2(bVar.X1(com.revolut.feature.transaction.recogniser.impl.ui.flow.b.O2()));
                            } else {
                                if (!(result instanceof f)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar.E2(new TransactionRecogniserFlowContract$Step.TransactionsBeforeAfter(((f) result).f4038a), true, null, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            yef.g result2 = (yef.g) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            boolean z3 = result2 instanceof yef.f;
                            com.revolut.feature.transaction.recogniser.impl.ui.flow.b bVar2 = this.f245146b;
                            if (z3) {
                                hef.a aVar = bVar2.u;
                                TransactionRecogniserFlowContract$InputData transactionRecogniserFlowContract$InputData = bVar2.f91817t;
                                Map map = transactionRecogniserFlowContract$InputData.f91810b;
                                if (map.containsKey("formKey")) {
                                    Object obj3 = map.get("formKey");
                                    if (obj3 == null) {
                                        throw new IllegalStateException("Form id is not provided");
                                    }
                                    String formId = (String) obj3;
                                    Map params = r0.q(r0.l("formKey", map), new Pair("transactionId", transactionRecogniserFlowContract$InputData.f91809a));
                                    ((hff.a) aVar).getClass();
                                    Intrinsics.checkNotNullParameter(formId, "formId");
                                    Intrinsics.checkNotNullParameter(params, "params");
                                    bVar2.C1(new BackendFlowDestination(BackendFlowInput.Companion.a(BackendFlowInput.INSTANCE, formId, params, null, 4)));
                                    bVar2.I2();
                                } else {
                                    String transactionId = bVar2.v;
                                    String str = (String) map.get("labels");
                                    List listN0 = str != null ? d0.n0(str, new String[]{","}, 0, 6) : null;
                                    ((hff.a) aVar).getClass();
                                    Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                                    bVar2.C1(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FeatureCommand(new TransactionsFeatureConfig.Details(new c(transactionId), com.revolut.feature.transactions.api.navigation.a.OTHER, null, null, 92)), new FeatureCommand(new HelpCentreFeatureConfig.TransactionTroubleshooting(53, transactionId, null, null, listN0)))));
                                    bVar2.I2();
                                }
                            } else {
                                if (!(result2 instanceof e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar2.Q2(bVar2.X1(com.revolut.feature.transaction.recogniser.impl.ui.flow.b.O2()));
                            }
                            return Unit.f186387a;
                        case 2:
                            wef.h result3 = (wef.h) obj2;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            boolean z4 = result3 instanceof wef.f;
                            com.revolut.feature.transaction.recogniser.impl.ui.flow.b bVar3 = this.f245146b;
                            if (z4) {
                                bVar3.E2(new TransactionRecogniserFlowContract$Step.MerchantHistory(((wef.f) result3).f296770a), true, null, false);
                            } else {
                                if (!(result3 instanceof wef.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar3.Q2(bVar3.X1(com.revolut.feature.transaction.recogniser.impl.ui.flow.b.O2()));
                            }
                            return Unit.f186387a;
                        case 3:
                            sef.g result4 = (sef.g) obj2;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            if (!Intrinsics.f(result4, sef.g.f262190a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f245146b.P2();
                            return Unit.f186387a;
                        default:
                            uef.h result5 = (uef.h) obj2;
                            Intrinsics.checkNotNullParameter(result5, "result");
                            boolean z6 = result5 instanceof uef.g;
                            com.revolut.feature.transaction.recogniser.impl.ui.flow.b bVar4 = this.f245146b;
                            if (z6) {
                                bVar4.Q2(bVar4.X1(com.revolut.feature.transaction.recogniser.impl.ui.flow.b.O2()));
                            } else {
                                if (!(result5 instanceof uef.f)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar4.E2(new TransactionRecogniserFlowContract$Step.FinalChecks(((uef.f) result5).f279354a), true, null, false);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            finalChecksScreen.H = function1;
            return finalChecksScreen;
        }
        if (step instanceof TransactionRecogniserFlowContract$Step.MerchantHistory) {
            MerchantHistoryScreen merchantHistoryScreen = new MerchantHistoryScreen(new MerchantHistoryScreenContract$InputData(((TransactionRecogniserFlowContract$Step.MerchantHistory) step).f91814a));
            final int i2 = 0;
            Function1 function12 = new Function1(this) { // from class: qef.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.transaction.recogniser.impl.ui.flow.b f245146b;

                {
                    this.f245146b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i2) {
                        case 0:
                            h result = (h) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof aff.g;
                            com.revolut.feature.transaction.recogniser.impl.ui.flow.b bVar = this.f245146b;
                            if (z) {
                                bVar.Q2(bVar.X1(com.revolut.feature.transaction.recogniser.impl.ui.flow.b.O2()));
                            } else {
                                if (!(result instanceof f)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar.E2(new TransactionRecogniserFlowContract$Step.TransactionsBeforeAfter(((f) result).f4038a), true, null, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            yef.g result2 = (yef.g) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            boolean z3 = result2 instanceof yef.f;
                            com.revolut.feature.transaction.recogniser.impl.ui.flow.b bVar2 = this.f245146b;
                            if (z3) {
                                hef.a aVar = bVar2.u;
                                TransactionRecogniserFlowContract$InputData transactionRecogniserFlowContract$InputData = bVar2.f91817t;
                                Map map = transactionRecogniserFlowContract$InputData.f91810b;
                                if (map.containsKey("formKey")) {
                                    Object obj3 = map.get("formKey");
                                    if (obj3 == null) {
                                        throw new IllegalStateException("Form id is not provided");
                                    }
                                    String formId = (String) obj3;
                                    Map params = r0.q(r0.l("formKey", map), new Pair("transactionId", transactionRecogniserFlowContract$InputData.f91809a));
                                    ((hff.a) aVar).getClass();
                                    Intrinsics.checkNotNullParameter(formId, "formId");
                                    Intrinsics.checkNotNullParameter(params, "params");
                                    bVar2.C1(new BackendFlowDestination(BackendFlowInput.Companion.a(BackendFlowInput.INSTANCE, formId, params, null, 4)));
                                    bVar2.I2();
                                } else {
                                    String transactionId = bVar2.v;
                                    String str = (String) map.get("labels");
                                    List listN0 = str != null ? d0.n0(str, new String[]{","}, 0, 6) : null;
                                    ((hff.a) aVar).getClass();
                                    Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                                    bVar2.C1(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FeatureCommand(new TransactionsFeatureConfig.Details(new c(transactionId), com.revolut.feature.transactions.api.navigation.a.OTHER, null, null, 92)), new FeatureCommand(new HelpCentreFeatureConfig.TransactionTroubleshooting(53, transactionId, null, null, listN0)))));
                                    bVar2.I2();
                                }
                            } else {
                                if (!(result2 instanceof e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar2.Q2(bVar2.X1(com.revolut.feature.transaction.recogniser.impl.ui.flow.b.O2()));
                            }
                            return Unit.f186387a;
                        case 2:
                            wef.h result3 = (wef.h) obj2;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            boolean z4 = result3 instanceof wef.f;
                            com.revolut.feature.transaction.recogniser.impl.ui.flow.b bVar3 = this.f245146b;
                            if (z4) {
                                bVar3.E2(new TransactionRecogniserFlowContract$Step.MerchantHistory(((wef.f) result3).f296770a), true, null, false);
                            } else {
                                if (!(result3 instanceof wef.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar3.Q2(bVar3.X1(com.revolut.feature.transaction.recogniser.impl.ui.flow.b.O2()));
                            }
                            return Unit.f186387a;
                        case 3:
                            sef.g result4 = (sef.g) obj2;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            if (!Intrinsics.f(result4, sef.g.f262190a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f245146b.P2();
                            return Unit.f186387a;
                        default:
                            uef.h result5 = (uef.h) obj2;
                            Intrinsics.checkNotNullParameter(result5, "result");
                            boolean z6 = result5 instanceof uef.g;
                            com.revolut.feature.transaction.recogniser.impl.ui.flow.b bVar4 = this.f245146b;
                            if (z6) {
                                bVar4.Q2(bVar4.X1(com.revolut.feature.transaction.recogniser.impl.ui.flow.b.O2()));
                            } else {
                                if (!(result5 instanceof uef.f)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar4.E2(new TransactionRecogniserFlowContract$Step.FinalChecks(((uef.f) result5).f279354a), true, null, false);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function12, "<set-?>");
            merchantHistoryScreen.H = function12;
            return merchantHistoryScreen;
        }
        if (step instanceof TransactionRecogniserFlowContract$Step.RecogniserTransactionDetails) {
            TransactionRecogniserDetailsScreen transactionRecogniserDetailsScreen = new TransactionRecogniserDetailsScreen(new TransactionRecogniserDetailsScreenContract$InputData(this.f91817t.f91809a));
            final int i3 = 2;
            Function1 function13 = new Function1(this) { // from class: qef.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.transaction.recogniser.impl.ui.flow.b f245146b;

                {
                    this.f245146b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i3) {
                        case 0:
                            h result = (h) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof aff.g;
                            com.revolut.feature.transaction.recogniser.impl.ui.flow.b bVar = this.f245146b;
                            if (z) {
                                bVar.Q2(bVar.X1(com.revolut.feature.transaction.recogniser.impl.ui.flow.b.O2()));
                            } else {
                                if (!(result instanceof f)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar.E2(new TransactionRecogniserFlowContract$Step.TransactionsBeforeAfter(((f) result).f4038a), true, null, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            yef.g result2 = (yef.g) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            boolean z3 = result2 instanceof yef.f;
                            com.revolut.feature.transaction.recogniser.impl.ui.flow.b bVar2 = this.f245146b;
                            if (z3) {
                                hef.a aVar = bVar2.u;
                                TransactionRecogniserFlowContract$InputData transactionRecogniserFlowContract$InputData = bVar2.f91817t;
                                Map map = transactionRecogniserFlowContract$InputData.f91810b;
                                if (map.containsKey("formKey")) {
                                    Object obj3 = map.get("formKey");
                                    if (obj3 == null) {
                                        throw new IllegalStateException("Form id is not provided");
                                    }
                                    String formId = (String) obj3;
                                    Map params = r0.q(r0.l("formKey", map), new Pair("transactionId", transactionRecogniserFlowContract$InputData.f91809a));
                                    ((hff.a) aVar).getClass();
                                    Intrinsics.checkNotNullParameter(formId, "formId");
                                    Intrinsics.checkNotNullParameter(params, "params");
                                    bVar2.C1(new BackendFlowDestination(BackendFlowInput.Companion.a(BackendFlowInput.INSTANCE, formId, params, null, 4)));
                                    bVar2.I2();
                                } else {
                                    String transactionId = bVar2.v;
                                    String str = (String) map.get("labels");
                                    List listN0 = str != null ? d0.n0(str, new String[]{","}, 0, 6) : null;
                                    ((hff.a) aVar).getClass();
                                    Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                                    bVar2.C1(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FeatureCommand(new TransactionsFeatureConfig.Details(new c(transactionId), com.revolut.feature.transactions.api.navigation.a.OTHER, null, null, 92)), new FeatureCommand(new HelpCentreFeatureConfig.TransactionTroubleshooting(53, transactionId, null, null, listN0)))));
                                    bVar2.I2();
                                }
                            } else {
                                if (!(result2 instanceof e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar2.Q2(bVar2.X1(com.revolut.feature.transaction.recogniser.impl.ui.flow.b.O2()));
                            }
                            return Unit.f186387a;
                        case 2:
                            wef.h result3 = (wef.h) obj2;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            boolean z4 = result3 instanceof wef.f;
                            com.revolut.feature.transaction.recogniser.impl.ui.flow.b bVar3 = this.f245146b;
                            if (z4) {
                                bVar3.E2(new TransactionRecogniserFlowContract$Step.MerchantHistory(((wef.f) result3).f296770a), true, null, false);
                            } else {
                                if (!(result3 instanceof wef.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar3.Q2(bVar3.X1(com.revolut.feature.transaction.recogniser.impl.ui.flow.b.O2()));
                            }
                            return Unit.f186387a;
                        case 3:
                            sef.g result4 = (sef.g) obj2;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            if (!Intrinsics.f(result4, sef.g.f262190a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f245146b.P2();
                            return Unit.f186387a;
                        default:
                            uef.h result5 = (uef.h) obj2;
                            Intrinsics.checkNotNullParameter(result5, "result");
                            boolean z6 = result5 instanceof uef.g;
                            com.revolut.feature.transaction.recogniser.impl.ui.flow.b bVar4 = this.f245146b;
                            if (z6) {
                                bVar4.Q2(bVar4.X1(com.revolut.feature.transaction.recogniser.impl.ui.flow.b.O2()));
                            } else {
                                if (!(result5 instanceof uef.f)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar4.E2(new TransactionRecogniserFlowContract$Step.FinalChecks(((uef.f) result5).f279354a), true, null, false);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function13, "<set-?>");
            transactionRecogniserDetailsScreen.H = function13;
            return transactionRecogniserDetailsScreen;
        }
        if (step instanceof TransactionRecogniserFlowContract$Step.TransactionsBeforeAfter) {
            BeforeAfterScreen beforeAfterScreen = new BeforeAfterScreen(new BeforeAfterScreenContract$InputData(((TransactionRecogniserFlowContract$Step.TransactionsBeforeAfter) step).f91816a));
            final int i5 = 4;
            Function1 function14 = new Function1(this) { // from class: qef.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.transaction.recogniser.impl.ui.flow.b f245146b;

                {
                    this.f245146b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i5) {
                        case 0:
                            h result = (h) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof aff.g;
                            com.revolut.feature.transaction.recogniser.impl.ui.flow.b bVar = this.f245146b;
                            if (z) {
                                bVar.Q2(bVar.X1(com.revolut.feature.transaction.recogniser.impl.ui.flow.b.O2()));
                            } else {
                                if (!(result instanceof f)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar.E2(new TransactionRecogniserFlowContract$Step.TransactionsBeforeAfter(((f) result).f4038a), true, null, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            yef.g result2 = (yef.g) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            boolean z3 = result2 instanceof yef.f;
                            com.revolut.feature.transaction.recogniser.impl.ui.flow.b bVar2 = this.f245146b;
                            if (z3) {
                                hef.a aVar = bVar2.u;
                                TransactionRecogniserFlowContract$InputData transactionRecogniserFlowContract$InputData = bVar2.f91817t;
                                Map map = transactionRecogniserFlowContract$InputData.f91810b;
                                if (map.containsKey("formKey")) {
                                    Object obj3 = map.get("formKey");
                                    if (obj3 == null) {
                                        throw new IllegalStateException("Form id is not provided");
                                    }
                                    String formId = (String) obj3;
                                    Map params = r0.q(r0.l("formKey", map), new Pair("transactionId", transactionRecogniserFlowContract$InputData.f91809a));
                                    ((hff.a) aVar).getClass();
                                    Intrinsics.checkNotNullParameter(formId, "formId");
                                    Intrinsics.checkNotNullParameter(params, "params");
                                    bVar2.C1(new BackendFlowDestination(BackendFlowInput.Companion.a(BackendFlowInput.INSTANCE, formId, params, null, 4)));
                                    bVar2.I2();
                                } else {
                                    String transactionId = bVar2.v;
                                    String str = (String) map.get("labels");
                                    List listN0 = str != null ? d0.n0(str, new String[]{","}, 0, 6) : null;
                                    ((hff.a) aVar).getClass();
                                    Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                                    bVar2.C1(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FeatureCommand(new TransactionsFeatureConfig.Details(new c(transactionId), com.revolut.feature.transactions.api.navigation.a.OTHER, null, null, 92)), new FeatureCommand(new HelpCentreFeatureConfig.TransactionTroubleshooting(53, transactionId, null, null, listN0)))));
                                    bVar2.I2();
                                }
                            } else {
                                if (!(result2 instanceof e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar2.Q2(bVar2.X1(com.revolut.feature.transaction.recogniser.impl.ui.flow.b.O2()));
                            }
                            return Unit.f186387a;
                        case 2:
                            wef.h result3 = (wef.h) obj2;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            boolean z4 = result3 instanceof wef.f;
                            com.revolut.feature.transaction.recogniser.impl.ui.flow.b bVar3 = this.f245146b;
                            if (z4) {
                                bVar3.E2(new TransactionRecogniserFlowContract$Step.MerchantHistory(((wef.f) result3).f296770a), true, null, false);
                            } else {
                                if (!(result3 instanceof wef.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar3.Q2(bVar3.X1(com.revolut.feature.transaction.recogniser.impl.ui.flow.b.O2()));
                            }
                            return Unit.f186387a;
                        case 3:
                            sef.g result4 = (sef.g) obj2;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            if (!Intrinsics.f(result4, sef.g.f262190a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f245146b.P2();
                            return Unit.f186387a;
                        default:
                            uef.h result5 = (uef.h) obj2;
                            Intrinsics.checkNotNullParameter(result5, "result");
                            boolean z6 = result5 instanceof uef.g;
                            com.revolut.feature.transaction.recogniser.impl.ui.flow.b bVar4 = this.f245146b;
                            if (z6) {
                                bVar4.Q2(bVar4.X1(com.revolut.feature.transaction.recogniser.impl.ui.flow.b.O2()));
                            } else {
                                if (!(result5 instanceof uef.f)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar4.E2(new TransactionRecogniserFlowContract$Step.FinalChecks(((uef.f) result5).f279354a), true, null, false);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function14, "<set-?>");
            beforeAfterScreen.H = function14;
            return beforeAfterScreen;
        }
        if (!(step instanceof TransactionRecogniserFlowContract$Step.AddNote)) {
            throw new NoWhenBranchMatchedException();
        }
        AddNoteScreen addNoteScreen = new AddNoteScreen(new AddNoteScreenContract$InputData(((TransactionRecogniserFlowContract$Step.AddNote) step).f91812a));
        final int i6 = 3;
        Function1 function15 = new Function1(this) { // from class: qef.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.transaction.recogniser.impl.ui.flow.b f245146b;

            {
                this.f245146b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i6) {
                    case 0:
                        h result = (h) obj2;
                        Intrinsics.checkNotNullParameter(result, "result");
                        boolean z = result instanceof aff.g;
                        com.revolut.feature.transaction.recogniser.impl.ui.flow.b bVar = this.f245146b;
                        if (z) {
                            bVar.Q2(bVar.X1(com.revolut.feature.transaction.recogniser.impl.ui.flow.b.O2()));
                        } else {
                            if (!(result instanceof f)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar.E2(new TransactionRecogniserFlowContract$Step.TransactionsBeforeAfter(((f) result).f4038a), true, null, false);
                        }
                        return Unit.f186387a;
                    case 1:
                        yef.g result2 = (yef.g) obj2;
                        Intrinsics.checkNotNullParameter(result2, "result");
                        boolean z3 = result2 instanceof yef.f;
                        com.revolut.feature.transaction.recogniser.impl.ui.flow.b bVar2 = this.f245146b;
                        if (z3) {
                            hef.a aVar = bVar2.u;
                            TransactionRecogniserFlowContract$InputData transactionRecogniserFlowContract$InputData = bVar2.f91817t;
                            Map map = transactionRecogniserFlowContract$InputData.f91810b;
                            if (map.containsKey("formKey")) {
                                Object obj3 = map.get("formKey");
                                if (obj3 == null) {
                                    throw new IllegalStateException("Form id is not provided");
                                }
                                String formId = (String) obj3;
                                Map params = r0.q(r0.l("formKey", map), new Pair("transactionId", transactionRecogniserFlowContract$InputData.f91809a));
                                ((hff.a) aVar).getClass();
                                Intrinsics.checkNotNullParameter(formId, "formId");
                                Intrinsics.checkNotNullParameter(params, "params");
                                bVar2.C1(new BackendFlowDestination(BackendFlowInput.Companion.a(BackendFlowInput.INSTANCE, formId, params, null, 4)));
                                bVar2.I2();
                            } else {
                                String transactionId = bVar2.v;
                                String str = (String) map.get("labels");
                                List listN0 = str != null ? d0.n0(str, new String[]{","}, 0, 6) : null;
                                ((hff.a) aVar).getClass();
                                Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                                bVar2.C1(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FeatureCommand(new TransactionsFeatureConfig.Details(new c(transactionId), com.revolut.feature.transactions.api.navigation.a.OTHER, null, null, 92)), new FeatureCommand(new HelpCentreFeatureConfig.TransactionTroubleshooting(53, transactionId, null, null, listN0)))));
                                bVar2.I2();
                            }
                        } else {
                            if (!(result2 instanceof e)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar2.Q2(bVar2.X1(com.revolut.feature.transaction.recogniser.impl.ui.flow.b.O2()));
                        }
                        return Unit.f186387a;
                    case 2:
                        wef.h result3 = (wef.h) obj2;
                        Intrinsics.checkNotNullParameter(result3, "result");
                        boolean z4 = result3 instanceof wef.f;
                        com.revolut.feature.transaction.recogniser.impl.ui.flow.b bVar3 = this.f245146b;
                        if (z4) {
                            bVar3.E2(new TransactionRecogniserFlowContract$Step.MerchantHistory(((wef.f) result3).f296770a), true, null, false);
                        } else {
                            if (!(result3 instanceof wef.g)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar3.Q2(bVar3.X1(com.revolut.feature.transaction.recogniser.impl.ui.flow.b.O2()));
                        }
                        return Unit.f186387a;
                    case 3:
                        sef.g result4 = (sef.g) obj2;
                        Intrinsics.checkNotNullParameter(result4, "result");
                        if (!Intrinsics.f(result4, sef.g.f262190a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f245146b.P2();
                        return Unit.f186387a;
                    default:
                        uef.h result5 = (uef.h) obj2;
                        Intrinsics.checkNotNullParameter(result5, "result");
                        boolean z6 = result5 instanceof uef.g;
                        com.revolut.feature.transaction.recogniser.impl.ui.flow.b bVar4 = this.f245146b;
                        if (z6) {
                            bVar4.Q2(bVar4.X1(com.revolut.feature.transaction.recogniser.impl.ui.flow.b.O2()));
                        } else {
                            if (!(result5 instanceof uef.f)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar4.E2(new TransactionRecogniserFlowContract$Step.FinalChecks(((uef.f) result5).f279354a), true, null, false);
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(function15, "<set-?>");
        addNoteScreen.H = function15;
        return addNoteScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f91819x;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f91818w;
    }
}
