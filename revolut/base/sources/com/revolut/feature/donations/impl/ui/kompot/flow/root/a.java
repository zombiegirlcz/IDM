package com.revolut.feature.donations.impl.ui.kompot.flow.root;

import ba6.u;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.b;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.donations.impl.R$string;
import com.revolut.feature.donations.impl.ui.kompot.flow.overview.CharitiesOverviewFlow;
import com.revolut.feature.donations.impl.ui.kompot.flow.recurring.CharityRecurringDonationFlow;
import com.revolut.feature.donations.impl.ui.kompot.flow.recurring.CharityRecurringDonationFlowContract$InputData;
import com.revolut.feature.donations.impl.ui.kompot.flow.root.DonationsFlowContract$InputData;
import com.revolut.feature.donations.impl.ui.kompot.flow.root.DonationsFlowContract$Step;
import com.revolut.feature.donations.impl.ui.kompot.screen.amount_suggestion.AmountSuggestionScreen;
import com.revolut.feature.donations.impl.ui.kompot.screen.amount_suggestion.AmountSuggestionScreenContract$InputData;
import com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.CharityDetailsScreen;
import com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.CharityDetailsScreenContract$InputData;
import com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.a;
import com.revolut.feature.donations.impl.ui.kompot.screen.collection.details.CharitiesCollectionDetailsScreen;
import com.revolut.feature.donations.impl.ui.kompot.screen.collection.details.CharitiesCollectionDetailsScreenContract$InputData;
import com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.OneTimeDonationScreen;
import com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.OneTimeDonationScreenContract$InputData;
import com.revolut.feature.donations.impl.ui.kompot.screen.transactions.CharityTransactionsContract$InputData;
import com.revolut.feature.donations.impl.ui.kompot.screen.transactions.CharityTransactionsScreen;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.feature.full_screen_prompt.c;
import com.revolut.kompot.navigable.flow.EmptyFlowState;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nb6.e;
import nb6.f;
import nb6.h;
import tb6.n;
import tb6.o;
import tb6.p;
import tb6.q;
import xb6.d;
import xb6.e;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends g implements qb6.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final DonationsFlowContract$Step f72054t;
    public final EmptyFlowState u;

    public a(DonationsFlowContract$InputData inputData) {
        DonationsFlowContract$Step donationsFlowContract$Step;
        DonationsFlowContract$Step amountSuggestion;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        if (inputData instanceof DonationsFlowContract$InputData.Overview) {
            donationsFlowContract$Step = DonationsFlowContract$Step.Overview.f72051a;
        } else {
            if (inputData instanceof DonationsFlowContract$InputData.CharityDetails) {
                amountSuggestion = new DonationsFlowContract$Step.CharityDetails(((DonationsFlowContract$InputData.CharityDetails) inputData).f72036a);
            } else if (inputData instanceof DonationsFlowContract$InputData.CharitiesCollectionDetails) {
                DonationsFlowContract$InputData.CharitiesCollectionDetails charitiesCollectionDetails = (DonationsFlowContract$InputData.CharitiesCollectionDetails) inputData;
                amountSuggestion = new DonationsFlowContract$Step.CharitiesCollectionDetails(charitiesCollectionDetails.f72033a, charitiesCollectionDetails.f72034b);
            } else if (inputData instanceof DonationsFlowContract$InputData.RecurringDonation) {
                amountSuggestion = new DonationsFlowContract$Step.RecurringDonation(((DonationsFlowContract$InputData.RecurringDonation) inputData).f72039a);
            } else if (inputData instanceof DonationsFlowContract$InputData.AmountSuggestion) {
                DonationsFlowContract$InputData.AmountSuggestion amountSuggestion2 = (DonationsFlowContract$InputData.AmountSuggestion) inputData;
                amountSuggestion = new DonationsFlowContract$Step.AmountSuggestion(amountSuggestion2.f72030a, amountSuggestion2.f72031b, amountSuggestion2.f72032c);
            } else if (inputData instanceof DonationsFlowContract$InputData.CharityNotFound) {
                donationsFlowContract$Step = DonationsFlowContract$Step.CharityNotFound.f72047a;
            } else {
                if (!(inputData instanceof DonationsFlowContract$InputData.CharitiesCollectionNotFound)) {
                    throw new NoWhenBranchMatchedException();
                }
                donationsFlowContract$Step = DonationsFlowContract$Step.CharitiesCollectionNotFound.f72045a;
            }
            donationsFlowContract$Step = amountSuggestion;
        }
        this.f72054t = donationsFlowContract$Step;
        this.u = EmptyFlowState.f98428a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        DonationsFlowContract$Step step = (DonationsFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof DonationsFlowContract$Step.Overview) {
            CharitiesOverviewFlow charitiesOverviewFlow = new CharitiesOverviewFlow();
            final int i = 0;
            Function1 block = new Function1(this) { // from class: qb6.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.donations.impl.ui.kompot.flow.root.a f244122b;

                {
                    this.f244122b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            h output = (h) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof e;
                            com.revolut.feature.donations.impl.ui.kompot.flow.root.a aVar = this.f244122b;
                            if (z) {
                                aVar.E2(new DonationsFlowContract$Step.CharityDetails(((e) output).f213992a), true, null, false);
                            } else if (output instanceof f) {
                                aVar.E2(new DonationsFlowContract$Step.CharitiesCollectionDetails(((f) output).f213993a, false), true, null, false);
                            } else {
                                if (!(output instanceof nb6.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar.E2(new DonationsFlowContract$Step.Transactions(((nb6.g) output).f213994a), true, null, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.a output2 = (com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.a) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean z3 = output2 instanceof a.b;
                            com.revolut.feature.donations.impl.ui.kompot.flow.root.a aVar2 = this.f244122b;
                            if (z3) {
                                if (!aVar2.K2(new dki.h((Function1) new qb5.a(1), true))) {
                                    aVar2.E2(DonationsFlowContract$Step.Overview.f72051a, true, null, false);
                                }
                            } else if (output2 instanceof a.C0480a) {
                                aVar2.E2(DonationsFlowContract$Step.CharityNotFound.f72047a, false, null, false);
                            } else if (output2 instanceof o) {
                                aVar2.E2(new DonationsFlowContract$Step.CharityDetails(((o) output2).f269490a), true, null, false);
                            } else if (output2 instanceof p) {
                                aVar2.E2(new DonationsFlowContract$Step.RecurringDonation(((p) output2).f269491a), true, null, false);
                            } else if (output2 instanceof n) {
                                aVar2.E2(new DonationsFlowContract$Step.AmountSuggestion(((n) output2).f269489a, u.REGULAR, r0.g()), true, null, false);
                            } else {
                                if (!(output2 instanceof q)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.E2(new DonationsFlowContract$Step.Transactions(((q) output2).f269492a), true, null, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            xb6.e output3 = (xb6.e) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            boolean z4 = output3 instanceof e.a;
                            com.revolut.feature.donations.impl.ui.kompot.flow.root.a aVar3 = this.f244122b;
                            if (z4) {
                                aVar3.E2(DonationsFlowContract$Step.CharitiesCollectionNotFound.f72045a, false, null, false);
                            } else {
                                if (!(output3 instanceof d)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar3.E2(new DonationsFlowContract$Step.CharityDetails(((d) output3).f304001a), true, null, false);
                            }
                            return Unit.f186387a;
                        case 3:
                            c output4 = (c) obj2;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            if (output4 instanceof c.C0497c) {
                                dki.h hVar = new dki.h((Function1) new qb5.a(1), true);
                                com.revolut.feature.donations.impl.ui.kompot.flow.root.a aVar4 = this.f244122b;
                                if (!aVar4.K2(hVar)) {
                                    aVar4.E2(DonationsFlowContract$Step.Overview.f72051a, false, null, false);
                                }
                            }
                            return Unit.f186387a;
                        default:
                            c output5 = (c) obj2;
                            Intrinsics.checkNotNullParameter(output5, "output");
                            if (output5 instanceof c.C0497c) {
                                dki.h hVar2 = new dki.h((Function1) new qb5.a(1), true);
                                com.revolut.feature.donations.impl.ui.kompot.flow.root.a aVar5 = this.f244122b;
                                if (!aVar5.K2(hVar2)) {
                                    aVar5.E2(DonationsFlowContract$Step.Overview.f72051a, false, null, false);
                                }
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            charitiesOverviewFlow.H = block;
            return charitiesOverviewFlow;
        }
        if (step instanceof DonationsFlowContract$Step.CharityDetails) {
            CharityDetailsScreen charityDetailsScreen = new CharityDetailsScreen(new CharityDetailsScreenContract$InputData(((DonationsFlowContract$Step.CharityDetails) step).f72046a));
            final int i2 = 1;
            Function1 block2 = new Function1(this) { // from class: qb6.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.donations.impl.ui.kompot.flow.root.a f244122b;

                {
                    this.f244122b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i2) {
                        case 0:
                            h output = (h) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof nb6.e;
                            com.revolut.feature.donations.impl.ui.kompot.flow.root.a aVar = this.f244122b;
                            if (z) {
                                aVar.E2(new DonationsFlowContract$Step.CharityDetails(((nb6.e) output).f213992a), true, null, false);
                            } else if (output instanceof f) {
                                aVar.E2(new DonationsFlowContract$Step.CharitiesCollectionDetails(((f) output).f213993a, false), true, null, false);
                            } else {
                                if (!(output instanceof nb6.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar.E2(new DonationsFlowContract$Step.Transactions(((nb6.g) output).f213994a), true, null, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.a output2 = (com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.a) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean z3 = output2 instanceof a.b;
                            com.revolut.feature.donations.impl.ui.kompot.flow.root.a aVar2 = this.f244122b;
                            if (z3) {
                                if (!aVar2.K2(new dki.h((Function1) new qb5.a(1), true))) {
                                    aVar2.E2(DonationsFlowContract$Step.Overview.f72051a, true, null, false);
                                }
                            } else if (output2 instanceof a.C0480a) {
                                aVar2.E2(DonationsFlowContract$Step.CharityNotFound.f72047a, false, null, false);
                            } else if (output2 instanceof o) {
                                aVar2.E2(new DonationsFlowContract$Step.CharityDetails(((o) output2).f269490a), true, null, false);
                            } else if (output2 instanceof p) {
                                aVar2.E2(new DonationsFlowContract$Step.RecurringDonation(((p) output2).f269491a), true, null, false);
                            } else if (output2 instanceof n) {
                                aVar2.E2(new DonationsFlowContract$Step.AmountSuggestion(((n) output2).f269489a, u.REGULAR, r0.g()), true, null, false);
                            } else {
                                if (!(output2 instanceof q)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.E2(new DonationsFlowContract$Step.Transactions(((q) output2).f269492a), true, null, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            xb6.e output3 = (xb6.e) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            boolean z4 = output3 instanceof e.a;
                            com.revolut.feature.donations.impl.ui.kompot.flow.root.a aVar3 = this.f244122b;
                            if (z4) {
                                aVar3.E2(DonationsFlowContract$Step.CharitiesCollectionNotFound.f72045a, false, null, false);
                            } else {
                                if (!(output3 instanceof d)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar3.E2(new DonationsFlowContract$Step.CharityDetails(((d) output3).f304001a), true, null, false);
                            }
                            return Unit.f186387a;
                        case 3:
                            c output4 = (c) obj2;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            if (output4 instanceof c.C0497c) {
                                dki.h hVar = new dki.h((Function1) new qb5.a(1), true);
                                com.revolut.feature.donations.impl.ui.kompot.flow.root.a aVar4 = this.f244122b;
                                if (!aVar4.K2(hVar)) {
                                    aVar4.E2(DonationsFlowContract$Step.Overview.f72051a, false, null, false);
                                }
                            }
                            return Unit.f186387a;
                        default:
                            c output5 = (c) obj2;
                            Intrinsics.checkNotNullParameter(output5, "output");
                            if (output5 instanceof c.C0497c) {
                                dki.h hVar2 = new dki.h((Function1) new qb5.a(1), true);
                                com.revolut.feature.donations.impl.ui.kompot.flow.root.a aVar5 = this.f244122b;
                                if (!aVar5.K2(hVar2)) {
                                    aVar5.E2(DonationsFlowContract$Step.Overview.f72051a, false, null, false);
                                }
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            charityDetailsScreen.H = block2;
            return charityDetailsScreen;
        }
        if (step instanceof DonationsFlowContract$Step.CharitiesCollectionDetails) {
            DonationsFlowContract$Step.CharitiesCollectionDetails charitiesCollectionDetails = (DonationsFlowContract$Step.CharitiesCollectionDetails) step;
            CharitiesCollectionDetailsScreen charitiesCollectionDetailsScreen = new CharitiesCollectionDetailsScreen(new CharitiesCollectionDetailsScreenContract$InputData(charitiesCollectionDetails.f72043a, charitiesCollectionDetails.f72044b));
            final int i3 = 2;
            Function1 function1 = new Function1(this) { // from class: qb6.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.donations.impl.ui.kompot.flow.root.a f244122b;

                {
                    this.f244122b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i3) {
                        case 0:
                            h output = (h) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof nb6.e;
                            com.revolut.feature.donations.impl.ui.kompot.flow.root.a aVar = this.f244122b;
                            if (z) {
                                aVar.E2(new DonationsFlowContract$Step.CharityDetails(((nb6.e) output).f213992a), true, null, false);
                            } else if (output instanceof f) {
                                aVar.E2(new DonationsFlowContract$Step.CharitiesCollectionDetails(((f) output).f213993a, false), true, null, false);
                            } else {
                                if (!(output instanceof nb6.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar.E2(new DonationsFlowContract$Step.Transactions(((nb6.g) output).f213994a), true, null, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.a output2 = (com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.a) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean z3 = output2 instanceof a.b;
                            com.revolut.feature.donations.impl.ui.kompot.flow.root.a aVar2 = this.f244122b;
                            if (z3) {
                                if (!aVar2.K2(new dki.h((Function1) new qb5.a(1), true))) {
                                    aVar2.E2(DonationsFlowContract$Step.Overview.f72051a, true, null, false);
                                }
                            } else if (output2 instanceof a.C0480a) {
                                aVar2.E2(DonationsFlowContract$Step.CharityNotFound.f72047a, false, null, false);
                            } else if (output2 instanceof o) {
                                aVar2.E2(new DonationsFlowContract$Step.CharityDetails(((o) output2).f269490a), true, null, false);
                            } else if (output2 instanceof p) {
                                aVar2.E2(new DonationsFlowContract$Step.RecurringDonation(((p) output2).f269491a), true, null, false);
                            } else if (output2 instanceof n) {
                                aVar2.E2(new DonationsFlowContract$Step.AmountSuggestion(((n) output2).f269489a, u.REGULAR, r0.g()), true, null, false);
                            } else {
                                if (!(output2 instanceof q)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.E2(new DonationsFlowContract$Step.Transactions(((q) output2).f269492a), true, null, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            xb6.e output3 = (xb6.e) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            boolean z4 = output3 instanceof e.a;
                            com.revolut.feature.donations.impl.ui.kompot.flow.root.a aVar3 = this.f244122b;
                            if (z4) {
                                aVar3.E2(DonationsFlowContract$Step.CharitiesCollectionNotFound.f72045a, false, null, false);
                            } else {
                                if (!(output3 instanceof d)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar3.E2(new DonationsFlowContract$Step.CharityDetails(((d) output3).f304001a), true, null, false);
                            }
                            return Unit.f186387a;
                        case 3:
                            c output4 = (c) obj2;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            if (output4 instanceof c.C0497c) {
                                dki.h hVar = new dki.h((Function1) new qb5.a(1), true);
                                com.revolut.feature.donations.impl.ui.kompot.flow.root.a aVar4 = this.f244122b;
                                if (!aVar4.K2(hVar)) {
                                    aVar4.E2(DonationsFlowContract$Step.Overview.f72051a, false, null, false);
                                }
                            }
                            return Unit.f186387a;
                        default:
                            c output5 = (c) obj2;
                            Intrinsics.checkNotNullParameter(output5, "output");
                            if (output5 instanceof c.C0497c) {
                                dki.h hVar2 = new dki.h((Function1) new qb5.a(1), true);
                                com.revolut.feature.donations.impl.ui.kompot.flow.root.a aVar5 = this.f244122b;
                                if (!aVar5.K2(hVar2)) {
                                    aVar5.E2(DonationsFlowContract$Step.Overview.f72051a, false, null, false);
                                }
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            charitiesCollectionDetailsScreen.H = function1;
            return charitiesCollectionDetailsScreen;
        }
        if (step instanceof DonationsFlowContract$Step.CharitiesCollectionNotFound) {
            FullScreenPromptScreen fullScreenPromptScreen = new FullScreenPromptScreen(d67.e.a(d67.g.Companion, new TextLocalisedClause(R$string.donations_charities_collection_details_not_found_title, null, null, 14), new TextLocalisedClause(R$string.donations_charities_collection_details_not_found_description, null, null, 14), null, b.c("3D051", null, null, null, 30), new ResourceImage(R$drawable.uikit_icn_16_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, new TextLocalisedClause(R$string.donations_charities_collection_details_not_found_action_button, null, null, 14), null, false, null, null, null, false, 16759756));
            final int i5 = 3;
            Function1 block3 = new Function1(this) { // from class: qb6.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.donations.impl.ui.kompot.flow.root.a f244122b;

                {
                    this.f244122b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i5) {
                        case 0:
                            h output = (h) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof nb6.e;
                            com.revolut.feature.donations.impl.ui.kompot.flow.root.a aVar = this.f244122b;
                            if (z) {
                                aVar.E2(new DonationsFlowContract$Step.CharityDetails(((nb6.e) output).f213992a), true, null, false);
                            } else if (output instanceof f) {
                                aVar.E2(new DonationsFlowContract$Step.CharitiesCollectionDetails(((f) output).f213993a, false), true, null, false);
                            } else {
                                if (!(output instanceof nb6.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar.E2(new DonationsFlowContract$Step.Transactions(((nb6.g) output).f213994a), true, null, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.a output2 = (com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.a) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean z3 = output2 instanceof a.b;
                            com.revolut.feature.donations.impl.ui.kompot.flow.root.a aVar2 = this.f244122b;
                            if (z3) {
                                if (!aVar2.K2(new dki.h((Function1) new qb5.a(1), true))) {
                                    aVar2.E2(DonationsFlowContract$Step.Overview.f72051a, true, null, false);
                                }
                            } else if (output2 instanceof a.C0480a) {
                                aVar2.E2(DonationsFlowContract$Step.CharityNotFound.f72047a, false, null, false);
                            } else if (output2 instanceof o) {
                                aVar2.E2(new DonationsFlowContract$Step.CharityDetails(((o) output2).f269490a), true, null, false);
                            } else if (output2 instanceof p) {
                                aVar2.E2(new DonationsFlowContract$Step.RecurringDonation(((p) output2).f269491a), true, null, false);
                            } else if (output2 instanceof n) {
                                aVar2.E2(new DonationsFlowContract$Step.AmountSuggestion(((n) output2).f269489a, u.REGULAR, r0.g()), true, null, false);
                            } else {
                                if (!(output2 instanceof q)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.E2(new DonationsFlowContract$Step.Transactions(((q) output2).f269492a), true, null, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            xb6.e output3 = (xb6.e) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            boolean z4 = output3 instanceof e.a;
                            com.revolut.feature.donations.impl.ui.kompot.flow.root.a aVar3 = this.f244122b;
                            if (z4) {
                                aVar3.E2(DonationsFlowContract$Step.CharitiesCollectionNotFound.f72045a, false, null, false);
                            } else {
                                if (!(output3 instanceof d)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar3.E2(new DonationsFlowContract$Step.CharityDetails(((d) output3).f304001a), true, null, false);
                            }
                            return Unit.f186387a;
                        case 3:
                            c output4 = (c) obj2;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            if (output4 instanceof c.C0497c) {
                                dki.h hVar = new dki.h((Function1) new qb5.a(1), true);
                                com.revolut.feature.donations.impl.ui.kompot.flow.root.a aVar4 = this.f244122b;
                                if (!aVar4.K2(hVar)) {
                                    aVar4.E2(DonationsFlowContract$Step.Overview.f72051a, false, null, false);
                                }
                            }
                            return Unit.f186387a;
                        default:
                            c output5 = (c) obj2;
                            Intrinsics.checkNotNullParameter(output5, "output");
                            if (output5 instanceof c.C0497c) {
                                dki.h hVar2 = new dki.h((Function1) new qb5.a(1), true);
                                com.revolut.feature.donations.impl.ui.kompot.flow.root.a aVar5 = this.f244122b;
                                if (!aVar5.K2(hVar2)) {
                                    aVar5.E2(DonationsFlowContract$Step.Overview.f72051a, false, null, false);
                                }
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block3, "block");
            fullScreenPromptScreen.H = block3;
            return fullScreenPromptScreen;
        }
        if (step instanceof DonationsFlowContract$Step.CharityNotFound) {
            FullScreenPromptScreen fullScreenPromptScreen2 = new FullScreenPromptScreen(d67.e.a(d67.g.Companion, new TextLocalisedClause(R$string.donations_single_donation_details_not_found_title, null, null, 14), new TextLocalisedClause(R$string.donations_single_donation_details_not_found_description, null, null, 14), null, b.c("3D051", null, null, null, 30), new ResourceImage(R$drawable.uikit_icn_16_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, new TextLocalisedClause(R$string.donations_single_donation_details_not_found_action_button, null, null, 14), null, false, null, null, null, false, 16759756));
            final int i6 = 4;
            Function1 block4 = new Function1(this) { // from class: qb6.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.donations.impl.ui.kompot.flow.root.a f244122b;

                {
                    this.f244122b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i6) {
                        case 0:
                            h output = (h) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof nb6.e;
                            com.revolut.feature.donations.impl.ui.kompot.flow.root.a aVar = this.f244122b;
                            if (z) {
                                aVar.E2(new DonationsFlowContract$Step.CharityDetails(((nb6.e) output).f213992a), true, null, false);
                            } else if (output instanceof f) {
                                aVar.E2(new DonationsFlowContract$Step.CharitiesCollectionDetails(((f) output).f213993a, false), true, null, false);
                            } else {
                                if (!(output instanceof nb6.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar.E2(new DonationsFlowContract$Step.Transactions(((nb6.g) output).f213994a), true, null, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.a output2 = (com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.a) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean z3 = output2 instanceof a.b;
                            com.revolut.feature.donations.impl.ui.kompot.flow.root.a aVar2 = this.f244122b;
                            if (z3) {
                                if (!aVar2.K2(new dki.h((Function1) new qb5.a(1), true))) {
                                    aVar2.E2(DonationsFlowContract$Step.Overview.f72051a, true, null, false);
                                }
                            } else if (output2 instanceof a.C0480a) {
                                aVar2.E2(DonationsFlowContract$Step.CharityNotFound.f72047a, false, null, false);
                            } else if (output2 instanceof o) {
                                aVar2.E2(new DonationsFlowContract$Step.CharityDetails(((o) output2).f269490a), true, null, false);
                            } else if (output2 instanceof p) {
                                aVar2.E2(new DonationsFlowContract$Step.RecurringDonation(((p) output2).f269491a), true, null, false);
                            } else if (output2 instanceof n) {
                                aVar2.E2(new DonationsFlowContract$Step.AmountSuggestion(((n) output2).f269489a, u.REGULAR, r0.g()), true, null, false);
                            } else {
                                if (!(output2 instanceof q)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.E2(new DonationsFlowContract$Step.Transactions(((q) output2).f269492a), true, null, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            xb6.e output3 = (xb6.e) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            boolean z4 = output3 instanceof e.a;
                            com.revolut.feature.donations.impl.ui.kompot.flow.root.a aVar3 = this.f244122b;
                            if (z4) {
                                aVar3.E2(DonationsFlowContract$Step.CharitiesCollectionNotFound.f72045a, false, null, false);
                            } else {
                                if (!(output3 instanceof d)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar3.E2(new DonationsFlowContract$Step.CharityDetails(((d) output3).f304001a), true, null, false);
                            }
                            return Unit.f186387a;
                        case 3:
                            c output4 = (c) obj2;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            if (output4 instanceof c.C0497c) {
                                dki.h hVar = new dki.h((Function1) new qb5.a(1), true);
                                com.revolut.feature.donations.impl.ui.kompot.flow.root.a aVar4 = this.f244122b;
                                if (!aVar4.K2(hVar)) {
                                    aVar4.E2(DonationsFlowContract$Step.Overview.f72051a, false, null, false);
                                }
                            }
                            return Unit.f186387a;
                        default:
                            c output5 = (c) obj2;
                            Intrinsics.checkNotNullParameter(output5, "output");
                            if (output5 instanceof c.C0497c) {
                                dki.h hVar2 = new dki.h((Function1) new qb5.a(1), true);
                                com.revolut.feature.donations.impl.ui.kompot.flow.root.a aVar5 = this.f244122b;
                                if (!aVar5.K2(hVar2)) {
                                    aVar5.E2(DonationsFlowContract$Step.Overview.f72051a, false, null, false);
                                }
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block4, "block");
            fullScreenPromptScreen2.H = block4;
            return fullScreenPromptScreen2;
        }
        if (step instanceof DonationsFlowContract$Step.RecurringDonation) {
            return new CharityRecurringDonationFlow(new CharityRecurringDonationFlowContract$InputData(((DonationsFlowContract$Step.RecurringDonation) step).f72052a));
        }
        if (step instanceof DonationsFlowContract$Step.AmountSuggestion) {
            DonationsFlowContract$Step.AmountSuggestion amountSuggestion = (DonationsFlowContract$Step.AmountSuggestion) step;
            AmountSuggestionScreen amountSuggestionScreen = new AmountSuggestionScreen(new AmountSuggestionScreenContract$InputData(amountSuggestion.f72040a, amountSuggestion.f72041b));
            q2g.h hVar = new q2g.h(this, step, 15);
            Intrinsics.checkNotNullParameter(hVar, "<set-?>");
            amountSuggestionScreen.H = hVar;
            return amountSuggestionScreen;
        }
        if (step instanceof DonationsFlowContract$Step.OneTimeDonation) {
            DonationsFlowContract$Step.OneTimeDonation oneTimeDonation = (DonationsFlowContract$Step.OneTimeDonation) step;
            return new OneTimeDonationScreen(new OneTimeDonationScreenContract$InputData(oneTimeDonation.f72049b, oneTimeDonation.d, oneTimeDonation.f72048a, oneTimeDonation.f72050c));
        }
        if (step instanceof DonationsFlowContract$Step.Transactions) {
            return new CharityTransactionsScreen(new CharityTransactionsContract$InputData(((DonationsFlowContract$Step.Transactions) step).f72053a));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f72054t;
    }
}
