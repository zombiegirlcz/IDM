package com.revolut.feature.shared_separate_favourites.alerts.ui.flow.alerts;

import com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.SharedAddAlertFlow;
import com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.SharedAddAlertFlowContract$InputData;
import com.revolut.feature.shared_separate_favourites.alerts.ui.flow.alert_details.SharedAlertDetailsFlow;
import com.revolut.feature.shared_separate_favourites.alerts.ui.flow.alert_details.SharedAlertDetailsFlowContract$InputData;
import com.revolut.feature.shared_separate_favourites.alerts.ui.flow.alerts.SharedAlertsFlowContract$State;
import com.revolut.feature.shared_separate_favourites.alerts.ui.flow.alerts.SharedAlertsFlowContract$Step;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alerts.SharedAlertsScreen;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alerts.SharedAlertsScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alerts.SharedAlertsScreenContract$SharedAlertsScreenConfiguration;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.completed_alerts.SharedCompletedAlertsScreen;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.completed_alerts.SharedCompletedAlertsScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.api.alerts.navigation.AddSharedAlertsConfiguration;
import com.revolut.feature.shared_separate_favourites.api.alerts.navigation.SharedAlertsConfiguration;
import com.revolut.feature.shared_separate_favourites.api.alerts.navigation.SharedAlertsDestination;
import com.revolut.feature.shared_separate_favourites.common.screen.init.SharedFavouritesInitScreen;
import com.revolut.feature.shared_separate_favourites.common.screen.init.SharedFavouritesInitScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dgd.a;
import dki.g;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mgd.d;
import r6.b;
import wed.m;
import wed.n;
import wed.o;
import wed.p;
import xed.f;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends g implements sed.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SharedAlertsDestination.InputData f86709t;
    public final SharedAlertsFlowContract$Step.InitAssetTypes u;

    public a(SharedAlertsDestination.InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f86709t = inputData;
        this.u = SharedAlertsFlowContract$Step.InitAssetTypes.f86708a;
    }

    public final void O2(AlertItem alertItem) {
        d f86880h = alertItem.getF86880h();
        d dVar = d.ACTIVE;
        ModalDestination.Style.FULLSCREEN_FADE fullscreen_fade = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
        if (f86880h == dVar && b.B(xi0.b.Companion, alertItem.getF86877b().f86863a)) {
            f2(new SharedAddAlertFlow(new SharedAddAlertFlowContract$InputData.Edit(alertItem)), fullscreen_fade, new se0.a(6));
        } else {
            d2(new SharedAlertDetailsFlow(new SharedAlertDetailsFlowContract$InputData(alertItem)), fullscreen_fade, new se0.a(7));
        }
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        SharedAlertsFlowContract$Step step = (SharedAlertsFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        boolean z = step instanceof SharedAlertsFlowContract$Step.InitAssetTypes;
        SharedAlertsDestination.InputData inputData = this.f86709t;
        if (z) {
            SharedAlertsConfiguration sharedAlertsConfiguration = inputData.f86774a;
            SharedFavouritesInitScreen sharedFavouritesInitScreen = new SharedFavouritesInitScreen(new SharedFavouritesInitScreenContract$InputData(sharedAlertsConfiguration.f86768a, sharedAlertsConfiguration.f86769b));
            final int i = 0;
            Function1 function1 = new Function1(this) { // from class: sed.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.shared_separate_favourites.alerts.ui.flow.alerts.a f262179b;

                {
                    this.f262179b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            dgd.a output = (dgd.a) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z3 = output instanceof a.C0678a;
                            com.revolut.feature.shared_separate_favourites.alerts.ui.flow.alerts.a aVar = this.f262179b;
                            if (z3) {
                                aVar.I2();
                            } else {
                                if (!(output instanceof dgd.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                SharedAlertsFlowContract$State sharedAlertsFlowContract$State = (SharedAlertsFlowContract$State) aVar.A2().f98429a;
                                dgd.b bVar = (dgd.b) output;
                                Set allAssetTypeKeys = bVar.f114636a;
                                Set initialSelectedAssetTypeKeys = bVar.f114637b;
                                sharedAlertsFlowContract$State.getClass();
                                Intrinsics.checkNotNullParameter(allAssetTypeKeys, "allAssetTypeKeys");
                                Intrinsics.checkNotNullParameter(initialSelectedAssetTypeKeys, "initialSelectedAssetTypeKeys");
                                aVar.L2(new SharedAlertsFlowContract$State(allAssetTypeKeys, initialSelectedAssetTypeKeys));
                                aVar.E2(SharedAlertsFlowContract$Step.Alerts.f86706a, false, TransitionAnimation.NONE.f98393a, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            f output2 = (f) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (!Intrinsics.f(output2, f.a.f304618a)) {
                                if (!(output2 instanceof xed.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                this.f262179b.O2(((xed.g) output2).f304619a);
                            }
                            return Unit.f186387a;
                        default:
                            p output3 = (p) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            boolean z4 = output3 instanceof m;
                            com.revolut.feature.shared_separate_favourites.alerts.ui.flow.alerts.a aVar2 = this.f262179b;
                            if (z4) {
                                m mVar = (m) output3;
                                l.j2(aVar2, new SharedAddAlertFlow(new SharedAddAlertFlowContract$InputData.Create(new AddSharedAlertsConfiguration(mVar.f296747a, null, mVar.f296748b, true))), ModalDestination.Style.FULLSCREEN_FADE.f98307a, null, 2);
                            } else if (output3 instanceof n) {
                                aVar2.O2(((n) output3).f296749a);
                            } else {
                                if (!(output3 instanceof o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.E2(new SharedAlertsFlowContract$Step.CompletedAlerts(((o) output3).f296750a), true, null, false);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            sharedFavouritesInitScreen.H = function1;
            return sharedFavouritesInitScreen;
        }
        if (!Intrinsics.f(step, SharedAlertsFlowContract$Step.Alerts.f86706a)) {
            if (!(step instanceof SharedAlertsFlowContract$Step.CompletedAlerts)) {
                throw new NoWhenBranchMatchedException();
            }
            SharedCompletedAlertsScreen sharedCompletedAlertsScreen = new SharedCompletedAlertsScreen(new SharedCompletedAlertsScreenContract$InputData(((SharedAlertsFlowContract$Step.CompletedAlerts) step).f86707a));
            final int i2 = 1;
            Function1 function12 = new Function1(this) { // from class: sed.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.shared_separate_favourites.alerts.ui.flow.alerts.a f262179b;

                {
                    this.f262179b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i2) {
                        case 0:
                            dgd.a output = (dgd.a) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z3 = output instanceof a.C0678a;
                            com.revolut.feature.shared_separate_favourites.alerts.ui.flow.alerts.a aVar = this.f262179b;
                            if (z3) {
                                aVar.I2();
                            } else {
                                if (!(output instanceof dgd.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                SharedAlertsFlowContract$State sharedAlertsFlowContract$State = (SharedAlertsFlowContract$State) aVar.A2().f98429a;
                                dgd.b bVar = (dgd.b) output;
                                Set allAssetTypeKeys = bVar.f114636a;
                                Set initialSelectedAssetTypeKeys = bVar.f114637b;
                                sharedAlertsFlowContract$State.getClass();
                                Intrinsics.checkNotNullParameter(allAssetTypeKeys, "allAssetTypeKeys");
                                Intrinsics.checkNotNullParameter(initialSelectedAssetTypeKeys, "initialSelectedAssetTypeKeys");
                                aVar.L2(new SharedAlertsFlowContract$State(allAssetTypeKeys, initialSelectedAssetTypeKeys));
                                aVar.E2(SharedAlertsFlowContract$Step.Alerts.f86706a, false, TransitionAnimation.NONE.f98393a, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            f output2 = (f) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (!Intrinsics.f(output2, f.a.f304618a)) {
                                if (!(output2 instanceof xed.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                this.f262179b.O2(((xed.g) output2).f304619a);
                            }
                            return Unit.f186387a;
                        default:
                            p output3 = (p) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            boolean z4 = output3 instanceof m;
                            com.revolut.feature.shared_separate_favourites.alerts.ui.flow.alerts.a aVar2 = this.f262179b;
                            if (z4) {
                                m mVar = (m) output3;
                                l.j2(aVar2, new SharedAddAlertFlow(new SharedAddAlertFlowContract$InputData.Create(new AddSharedAlertsConfiguration(mVar.f296747a, null, mVar.f296748b, true))), ModalDestination.Style.FULLSCREEN_FADE.f98307a, null, 2);
                            } else if (output3 instanceof n) {
                                aVar2.O2(((n) output3).f296749a);
                            } else {
                                if (!(output3 instanceof o)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.E2(new SharedAlertsFlowContract$Step.CompletedAlerts(((o) output3).f296750a), true, null, false);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function12, "<set-?>");
            sharedCompletedAlertsScreen.H = function12;
            return sharedCompletedAlertsScreen;
        }
        Set set = ((SharedAlertsFlowContract$State) A2().f98429a).f86705b;
        Set set2 = ((SharedAlertsFlowContract$State) A2().f98429a).f86704a;
        SharedAlertsConfiguration sharedAlertsConfiguration2 = inputData.f86774a;
        SharedAlertsScreen sharedAlertsScreen = new SharedAlertsScreen(new SharedAlertsScreenContract$InputData(new SharedAlertsScreenContract$SharedAlertsScreenConfiguration(set, set2, sharedAlertsConfiguration2.f86770c, sharedAlertsConfiguration2.d, sharedAlertsConfiguration2.e, sharedAlertsConfiguration2.f)));
        final int i3 = 2;
        Function1 function13 = new Function1(this) { // from class: sed.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.shared_separate_favourites.alerts.ui.flow.alerts.a f262179b;

            {
                this.f262179b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        dgd.a output = (dgd.a) obj2;
                        Intrinsics.checkNotNullParameter(output, "output");
                        boolean z3 = output instanceof a.C0678a;
                        com.revolut.feature.shared_separate_favourites.alerts.ui.flow.alerts.a aVar = this.f262179b;
                        if (z3) {
                            aVar.I2();
                        } else {
                            if (!(output instanceof dgd.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            SharedAlertsFlowContract$State sharedAlertsFlowContract$State = (SharedAlertsFlowContract$State) aVar.A2().f98429a;
                            dgd.b bVar = (dgd.b) output;
                            Set allAssetTypeKeys = bVar.f114636a;
                            Set initialSelectedAssetTypeKeys = bVar.f114637b;
                            sharedAlertsFlowContract$State.getClass();
                            Intrinsics.checkNotNullParameter(allAssetTypeKeys, "allAssetTypeKeys");
                            Intrinsics.checkNotNullParameter(initialSelectedAssetTypeKeys, "initialSelectedAssetTypeKeys");
                            aVar.L2(new SharedAlertsFlowContract$State(allAssetTypeKeys, initialSelectedAssetTypeKeys));
                            aVar.E2(SharedAlertsFlowContract$Step.Alerts.f86706a, false, TransitionAnimation.NONE.f98393a, false);
                        }
                        return Unit.f186387a;
                    case 1:
                        f output2 = (f) obj2;
                        Intrinsics.checkNotNullParameter(output2, "output");
                        if (!Intrinsics.f(output2, f.a.f304618a)) {
                            if (!(output2 instanceof xed.g)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f262179b.O2(((xed.g) output2).f304619a);
                        }
                        return Unit.f186387a;
                    default:
                        p output3 = (p) obj2;
                        Intrinsics.checkNotNullParameter(output3, "output");
                        boolean z4 = output3 instanceof m;
                        com.revolut.feature.shared_separate_favourites.alerts.ui.flow.alerts.a aVar2 = this.f262179b;
                        if (z4) {
                            m mVar = (m) output3;
                            l.j2(aVar2, new SharedAddAlertFlow(new SharedAddAlertFlowContract$InputData.Create(new AddSharedAlertsConfiguration(mVar.f296747a, null, mVar.f296748b, true))), ModalDestination.Style.FULLSCREEN_FADE.f98307a, null, 2);
                        } else if (output3 instanceof n) {
                            aVar2.O2(((n) output3).f296749a);
                        } else {
                            if (!(output3 instanceof o)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar2.E2(new SharedAlertsFlowContract$Step.CompletedAlerts(((o) output3).f296750a), true, null, false);
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(function13, "<set-?>");
        sharedAlertsScreen.H = function13;
        return sharedAlertsScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        h0 h0Var = h0.f322473a;
        return new SharedAlertsFlowContract$State(h0Var, h0Var);
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.u;
    }
}
