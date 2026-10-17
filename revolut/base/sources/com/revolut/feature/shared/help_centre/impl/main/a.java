package com.revolut.feature.shared.help_centre.impl.main;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card.view_pin.api.R$string;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.shared.help_centre.impl.faq.screens.quick_help.all.QuickHelpSeeAllScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.quick_help.card.HelpWithCardScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.quick_help.card.HelpWithCardScreenContract$Input;
import com.revolut.feature.shared.help_centre.impl.main.HelpFlowContract$StartPoint;
import com.revolut.feature.shared.help_centre.impl.main.HelpFlowContract$Step;
import com.revolut.feature.shared.help_centre.impl.main.screen.SharedHelpRev10Screen;
import com.revolut.feature_cards_kompot_flows_api.navigation.CardDetailsFlowDestination;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m9d.a0;
import m9d.b0;
import m9d.c0;
import q8d.d;
import q8d.e;
import q8d.f;
import q8d.h;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends g implements j9d.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HelpFlowContract$Step f86383t;
    public final HelpFlowContract$State u;

    public a(HelpFlowContract$InputData inputData) {
        HelpFlowContract$Step helpFlowContract$Step;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        HelpFlowContract$StartPoint helpFlowContract$StartPoint = inputData.f86372a;
        if (Intrinsics.f(helpFlowContract$StartPoint, HelpFlowContract$StartPoint.HelpWithCard.f86375a)) {
            helpFlowContract$Step = HelpFlowContract$Step.QuickHelpWithCard.f86380a;
        } else if (Intrinsics.f(helpFlowContract$StartPoint, HelpFlowContract$StartPoint.Home.f86376a)) {
            helpFlowContract$Step = HelpFlowContract$Step.Main.f86379a;
        } else {
            if (!Intrinsics.f(helpFlowContract$StartPoint, HelpFlowContract$StartPoint.ViewCardPin.f86377a)) {
                throw new NoWhenBranchMatchedException();
            }
            helpFlowContract$Step = HelpFlowContract$Step.SelectCardToViewPinCode.f86382a;
        }
        this.f86383t = helpFlowContract$Step;
        this.u = new HelpFlowContract$State(0);
    }

    public final void O2(String str) {
        C1(new CardDetailsFlowDestination(new CardDetailsFlowDestination.StartType.ShowPinWithCtaAfterClick(str, new TextLocalisedClause(R$string.card_view_pin_reminder_title, null, null, 14), new TextLocalisedClause(R$string.card_view_pin_reminder_subtitle, null, null, 14), new TextLocalisedClause(R$string.card_view_pin_card_unblocked_action, null, null, 14), null)));
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        HelpFlowContract$Step step = (HelpFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof HelpFlowContract$Step.Main) {
            SharedHelpRev10Screen sharedHelpRev10Screen = new SharedHelpRev10Screen();
            final int i = 1;
            Function1 function1 = new Function1(this) { // from class: j9d.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.shared.help_centre.impl.main.a f172318b;

                {
                    this.f172318b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            h output = (h) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof d;
                            com.revolut.feature.shared.help_centre.impl.main.a aVar = this.f172318b;
                            if (z) {
                                aVar.E2(HelpFlowContract$Step.QuickHelpWithCard.f86380a, true, null, false);
                            } else if (output instanceof q8d.g) {
                                aVar.E2(HelpFlowContract$Step.SelectCardToViewPinCode.f86382a, true, null, false);
                            } else if (output instanceof e) {
                                aVar.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.CardTroubleshooter(((e) output).f243056a, null, false), (SharedFaqDestination.PassthroughData) null, false, 14));
                            } else {
                                if (!(output instanceof f)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar.O2(((f) output).f243057a);
                            }
                            return Unit.f186387a;
                        case 1:
                            a0 output2 = (a0) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean z3 = output2 instanceof a0.b;
                            com.revolut.feature.shared.help_centre.impl.main.a aVar2 = this.f172318b;
                            if (z3) {
                                aVar2.E2(HelpFlowContract$Step.SeeAllQuickActions.f86381a, true, null, false);
                            } else if (output2 instanceof a0.a) {
                                aVar2.E2(HelpFlowContract$Step.QuickHelpWithCard.f86380a, true, null, false);
                            } else if (output2 instanceof a0.c) {
                                aVar2.E2(HelpFlowContract$Step.SelectCardToViewPinCode.f86382a, true, null, false);
                            } else if (output2 instanceof b0) {
                                aVar2.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.CardTroubleshooter(((b0) output2).f203687a, null, false), (SharedFaqDestination.PassthroughData) null, false, 14));
                            } else {
                                if (!(output2 instanceof c0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.O2(((c0) output2).f203689a);
                            }
                            return Unit.f186387a;
                        default:
                            s8d.h output3 = (s8d.h) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            boolean z4 = output3 instanceof s8d.f;
                            com.revolut.feature.shared.help_centre.impl.main.a aVar3 = this.f172318b;
                            if (z4) {
                                aVar3.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.CardTroubleshooter(((s8d.f) output3).f260974a, null, false), (SharedFaqDestination.PassthroughData) null, false, 14));
                            } else {
                                if (!(output3 instanceof s8d.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar3.O2(((s8d.g) output3).f260975a);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            sharedHelpRev10Screen.H = function1;
            return sharedHelpRev10Screen;
        }
        if (step instanceof HelpFlowContract$Step.SeeAllQuickActions) {
            QuickHelpSeeAllScreen quickHelpSeeAllScreen = new QuickHelpSeeAllScreen();
            final int i2 = 0;
            Function1 function12 = new Function1(this) { // from class: j9d.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.shared.help_centre.impl.main.a f172318b;

                {
                    this.f172318b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i2) {
                        case 0:
                            h output = (h) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof d;
                            com.revolut.feature.shared.help_centre.impl.main.a aVar = this.f172318b;
                            if (z) {
                                aVar.E2(HelpFlowContract$Step.QuickHelpWithCard.f86380a, true, null, false);
                            } else if (output instanceof q8d.g) {
                                aVar.E2(HelpFlowContract$Step.SelectCardToViewPinCode.f86382a, true, null, false);
                            } else if (output instanceof e) {
                                aVar.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.CardTroubleshooter(((e) output).f243056a, null, false), (SharedFaqDestination.PassthroughData) null, false, 14));
                            } else {
                                if (!(output instanceof f)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar.O2(((f) output).f243057a);
                            }
                            return Unit.f186387a;
                        case 1:
                            a0 output2 = (a0) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean z3 = output2 instanceof a0.b;
                            com.revolut.feature.shared.help_centre.impl.main.a aVar2 = this.f172318b;
                            if (z3) {
                                aVar2.E2(HelpFlowContract$Step.SeeAllQuickActions.f86381a, true, null, false);
                            } else if (output2 instanceof a0.a) {
                                aVar2.E2(HelpFlowContract$Step.QuickHelpWithCard.f86380a, true, null, false);
                            } else if (output2 instanceof a0.c) {
                                aVar2.E2(HelpFlowContract$Step.SelectCardToViewPinCode.f86382a, true, null, false);
                            } else if (output2 instanceof b0) {
                                aVar2.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.CardTroubleshooter(((b0) output2).f203687a, null, false), (SharedFaqDestination.PassthroughData) null, false, 14));
                            } else {
                                if (!(output2 instanceof c0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.O2(((c0) output2).f203689a);
                            }
                            return Unit.f186387a;
                        default:
                            s8d.h output3 = (s8d.h) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            boolean z4 = output3 instanceof s8d.f;
                            com.revolut.feature.shared.help_centre.impl.main.a aVar3 = this.f172318b;
                            if (z4) {
                                aVar3.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.CardTroubleshooter(((s8d.f) output3).f260974a, null, false), (SharedFaqDestination.PassthroughData) null, false, 14));
                            } else {
                                if (!(output3 instanceof s8d.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar3.O2(((s8d.g) output3).f260975a);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function12, "<set-?>");
            quickHelpSeeAllScreen.H = function12;
            return quickHelpSeeAllScreen;
        }
        if (step instanceof HelpFlowContract$Step.QuickHelpWithCard) {
            HelpWithCardScreen helpWithCardScreen = new HelpWithCardScreen(HelpWithCardScreenContract$Input.HelpWithCard.f86296a);
            final int i3 = 2;
            Function1 function13 = new Function1(this) { // from class: j9d.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.shared.help_centre.impl.main.a f172318b;

                {
                    this.f172318b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i3) {
                        case 0:
                            h output = (h) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof d;
                            com.revolut.feature.shared.help_centre.impl.main.a aVar = this.f172318b;
                            if (z) {
                                aVar.E2(HelpFlowContract$Step.QuickHelpWithCard.f86380a, true, null, false);
                            } else if (output instanceof q8d.g) {
                                aVar.E2(HelpFlowContract$Step.SelectCardToViewPinCode.f86382a, true, null, false);
                            } else if (output instanceof e) {
                                aVar.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.CardTroubleshooter(((e) output).f243056a, null, false), (SharedFaqDestination.PassthroughData) null, false, 14));
                            } else {
                                if (!(output instanceof f)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar.O2(((f) output).f243057a);
                            }
                            return Unit.f186387a;
                        case 1:
                            a0 output2 = (a0) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean z3 = output2 instanceof a0.b;
                            com.revolut.feature.shared.help_centre.impl.main.a aVar2 = this.f172318b;
                            if (z3) {
                                aVar2.E2(HelpFlowContract$Step.SeeAllQuickActions.f86381a, true, null, false);
                            } else if (output2 instanceof a0.a) {
                                aVar2.E2(HelpFlowContract$Step.QuickHelpWithCard.f86380a, true, null, false);
                            } else if (output2 instanceof a0.c) {
                                aVar2.E2(HelpFlowContract$Step.SelectCardToViewPinCode.f86382a, true, null, false);
                            } else if (output2 instanceof b0) {
                                aVar2.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.CardTroubleshooter(((b0) output2).f203687a, null, false), (SharedFaqDestination.PassthroughData) null, false, 14));
                            } else {
                                if (!(output2 instanceof c0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.O2(((c0) output2).f203689a);
                            }
                            return Unit.f186387a;
                        default:
                            s8d.h output3 = (s8d.h) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            boolean z4 = output3 instanceof s8d.f;
                            com.revolut.feature.shared.help_centre.impl.main.a aVar3 = this.f172318b;
                            if (z4) {
                                aVar3.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.CardTroubleshooter(((s8d.f) output3).f260974a, null, false), (SharedFaqDestination.PassthroughData) null, false, 14));
                            } else {
                                if (!(output3 instanceof s8d.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar3.O2(((s8d.g) output3).f260975a);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function13, "<set-?>");
            helpWithCardScreen.H = function13;
            return helpWithCardScreen;
        }
        if (!(step instanceof HelpFlowContract$Step.SelectCardToViewPinCode)) {
            throw new NoWhenBranchMatchedException();
        }
        HelpWithCardScreen helpWithCardScreen2 = new HelpWithCardScreen(HelpWithCardScreenContract$Input.ViewPin.f86297a);
        final int i5 = 2;
        Function1 function14 = new Function1(this) { // from class: j9d.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.shared.help_centre.impl.main.a f172318b;

            {
                this.f172318b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        h output = (h) obj2;
                        Intrinsics.checkNotNullParameter(output, "output");
                        boolean z = output instanceof d;
                        com.revolut.feature.shared.help_centre.impl.main.a aVar = this.f172318b;
                        if (z) {
                            aVar.E2(HelpFlowContract$Step.QuickHelpWithCard.f86380a, true, null, false);
                        } else if (output instanceof q8d.g) {
                            aVar.E2(HelpFlowContract$Step.SelectCardToViewPinCode.f86382a, true, null, false);
                        } else if (output instanceof e) {
                            aVar.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.CardTroubleshooter(((e) output).f243056a, null, false), (SharedFaqDestination.PassthroughData) null, false, 14));
                        } else {
                            if (!(output instanceof f)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar.O2(((f) output).f243057a);
                        }
                        return Unit.f186387a;
                    case 1:
                        a0 output2 = (a0) obj2;
                        Intrinsics.checkNotNullParameter(output2, "output");
                        boolean z3 = output2 instanceof a0.b;
                        com.revolut.feature.shared.help_centre.impl.main.a aVar2 = this.f172318b;
                        if (z3) {
                            aVar2.E2(HelpFlowContract$Step.SeeAllQuickActions.f86381a, true, null, false);
                        } else if (output2 instanceof a0.a) {
                            aVar2.E2(HelpFlowContract$Step.QuickHelpWithCard.f86380a, true, null, false);
                        } else if (output2 instanceof a0.c) {
                            aVar2.E2(HelpFlowContract$Step.SelectCardToViewPinCode.f86382a, true, null, false);
                        } else if (output2 instanceof b0) {
                            aVar2.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.CardTroubleshooter(((b0) output2).f203687a, null, false), (SharedFaqDestination.PassthroughData) null, false, 14));
                        } else {
                            if (!(output2 instanceof c0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar2.O2(((c0) output2).f203689a);
                        }
                        return Unit.f186387a;
                    default:
                        s8d.h output3 = (s8d.h) obj2;
                        Intrinsics.checkNotNullParameter(output3, "output");
                        boolean z4 = output3 instanceof s8d.f;
                        com.revolut.feature.shared.help_centre.impl.main.a aVar3 = this.f172318b;
                        if (z4) {
                            aVar3.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.CardTroubleshooter(((s8d.f) output3).f260974a, null, false), (SharedFaqDestination.PassthroughData) null, false, 14));
                        } else {
                            if (!(output3 instanceof s8d.g)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar3.O2(((s8d.g) output3).f260975a);
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(function14, "<set-?>");
        helpWithCardScreen2.H = function14;
        return helpWithCardScreen2;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f86383t;
    }
}
