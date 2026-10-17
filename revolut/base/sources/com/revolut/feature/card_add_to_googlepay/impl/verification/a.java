package com.revolut.feature.card_add_to_googlepay.impl.verification;

import com.revolut.feature.card_add_to_googlepay.impl.verification.GooglePayConfirmationFlowContract$InputData;
import com.revolut.feature.card_add_to_googlepay.impl.verification.GooglePayConfirmationFlowContract$Step;
import com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.GooglePayConfirmationController;
import com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.GooglePayConfirmationControllerContract$InputData;
import com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.a;
import com.revolut.feature.card_add_to_googlepay.impl.verification.otp.location_mismatch.GooglePayOtpLocationMismatchController;
import com.revolut.feature.card_add_to_googlepay.impl.verification.otp.location_mismatch.GooglePayOtpLocationMismatchScreenContract$InputData;
import com.revolut.feature.card_add_to_googlepay.impl.verification.otp.multiple.GooglePayMultipleOtpVerificationController;
import com.revolut.feature.card_add_to_googlepay.impl.verification.otp.multiple.GooglePayMultipleOtpVerificationScreenContract$InputData;
import com.revolut.feature.card_add_to_googlepay.impl.verification.otp.single.GooglePayOtpVerificationController;
import com.revolut.feature.card_add_to_googlepay.impl.verification.otp.single.GooglePayOtpVerificationScreenContract$InputData;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.card_screen.api.navigation.CardsCarouselFlowDestination;
import com.revolut.feature.cards.models.revolutcard.LocationMismatch;
import com.revolut.feature.cards.models.revolutcard.RevolutCardOtp;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import dki.g;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nvg.b0;
import ow2.f;
import sw2.k;
import sw2.l;
import uw2.k;
import ww2.l;
import zh9.u0;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends g implements nw2.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yw2.a f64487t;
    public final GooglePayConfirmationFlowContract$Step u;
    public final GooglePayConfirmationFlowContract$State v;

    public a(GooglePayConfirmationFlowContract$InputData inputData, yw2.a googlePayIntentProvider, gte.a featureToggleInteractor) {
        GooglePayConfirmationFlowContract$Step multipleOtpVerification;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(googlePayIntentProvider, "googlePayIntentProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f64487t = googlePayIntentProvider;
        if (inputData instanceof GooglePayConfirmationFlowContract$InputData.Confirmation) {
            GooglePayConfirmationFlowContract$InputData.Confirmation confirmation = (GooglePayConfirmationFlowContract$InputData.Confirmation) inputData;
            multipleOtpVerification = new GooglePayConfirmationFlowContract$Step.Confirmation(confirmation.f64473a, confirmation.f64474b);
        } else if (inputData instanceof GooglePayConfirmationFlowContract$InputData.RevivalConfirmation) {
            GooglePayConfirmationFlowContract$InputData.RevivalConfirmation revivalConfirmation = (GooglePayConfirmationFlowContract$InputData.RevivalConfirmation) inputData;
            multipleOtpVerification = new GooglePayConfirmationFlowContract$Step.RevivalConfirmation(revivalConfirmation.f64476a, revivalConfirmation.f64477b);
        } else {
            if (!(inputData instanceof GooglePayConfirmationFlowContract$InputData.OtpVerification)) {
                throw new NoWhenBranchMatchedException();
            }
            List list = ((GooglePayConfirmationFlowContract$InputData.OtpVerification) inputData).f64475a;
            if (list.size() == 1) {
                RevolutCardOtp revolutCardOtp = (RevolutCardOtp) d0.b0(list);
                LocationMismatch locationMismatch = revolutCardOtp.d;
                multipleOtpVerification = locationMismatch != null ? new GooglePayConfirmationFlowContract$Step.LocationMismatchConfirmation(revolutCardOtp, locationMismatch) : new GooglePayConfirmationFlowContract$Step.SingleOtpVerification(revolutCardOtp);
            } else {
                multipleOtpVerification = new GooglePayConfirmationFlowContract$Step.MultipleOtpVerification(list);
            }
        }
        this.u = multipleOtpVerification;
        this.v = new GooglePayConfirmationFlowContract$State(0);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        GooglePayConfirmationFlowContract$Step step = (GooglePayConfirmationFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof GooglePayConfirmationFlowContract$Step.LocationMismatchConfirmation) {
            GooglePayConfirmationFlowContract$Step.LocationMismatchConfirmation locationMismatchConfirmation = (GooglePayConfirmationFlowContract$Step.LocationMismatchConfirmation) step;
            GooglePayOtpLocationMismatchController googlePayOtpLocationMismatchController = new GooglePayOtpLocationMismatchController(new GooglePayOtpLocationMismatchScreenContract$InputData(locationMismatchConfirmation.f64481a, locationMismatchConfirmation.f64482b, true));
            final int i = 0;
            Function1 block = new Function1(this) { // from class: nw2.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.card_add_to_googlepay.impl.verification.a f219754b;

                {
                    this.f219754b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            k result = (k) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof l;
                            com.revolut.feature.card_add_to_googlepay.impl.verification.a aVar = this.f219754b;
                            if (z) {
                                aVar.E2(new GooglePayConfirmationFlowContract$Step.SingleOtpVerification(((l) result).f266084b), false, null, false);
                            } else {
                                if (!(result instanceof k.a) && !(result instanceof k.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar.I2();
                            }
                            return Unit.f186387a;
                        case 1:
                            ww2.l result2 = (ww2.l) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!Intrinsics.f(result2, l.a.f300586a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f219754b.I2();
                            return Unit.f186387a;
                        case 2:
                            uw2.k result3 = (uw2.k) obj2;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (!Intrinsics.f(result3, k.a.f283536a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f219754b.I2();
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.a result4 = (com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.a) obj2;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean z3 = result4 instanceof f;
                            com.revolut.feature.card_add_to_googlepay.impl.verification.a aVar2 = this.f219754b;
                            if (z3) {
                                aVar2.C1(u0.b(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new CardsCarouselFlowDestination(null, null, null, null, new CardScreenAction.Select(((f) result4).f230280a.f150110a, 6, false, false), null, 47), false, (Integer) null, 0, 61)), 2)))));
                            } else {
                                if (!(result4 instanceof a.C0461a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.I2();
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            googlePayOtpLocationMismatchController.H = block;
            return googlePayOtpLocationMismatchController;
        }
        if (step instanceof GooglePayConfirmationFlowContract$Step.SingleOtpVerification) {
            GooglePayOtpVerificationController googlePayOtpVerificationController = new GooglePayOtpVerificationController(new GooglePayOtpVerificationScreenContract$InputData(((GooglePayConfirmationFlowContract$Step.SingleOtpVerification) step).f64486a));
            final int i2 = 1;
            Function1 block2 = new Function1(this) { // from class: nw2.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.card_add_to_googlepay.impl.verification.a f219754b;

                {
                    this.f219754b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i2) {
                        case 0:
                            sw2.k result = (sw2.k) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof sw2.l;
                            com.revolut.feature.card_add_to_googlepay.impl.verification.a aVar = this.f219754b;
                            if (z) {
                                aVar.E2(new GooglePayConfirmationFlowContract$Step.SingleOtpVerification(((sw2.l) result).f266084b), false, null, false);
                            } else {
                                if (!(result instanceof k.a) && !(result instanceof k.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar.I2();
                            }
                            return Unit.f186387a;
                        case 1:
                            ww2.l result2 = (ww2.l) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!Intrinsics.f(result2, l.a.f300586a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f219754b.I2();
                            return Unit.f186387a;
                        case 2:
                            uw2.k result3 = (uw2.k) obj2;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (!Intrinsics.f(result3, k.a.f283536a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f219754b.I2();
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.a result4 = (com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.a) obj2;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean z3 = result4 instanceof f;
                            com.revolut.feature.card_add_to_googlepay.impl.verification.a aVar2 = this.f219754b;
                            if (z3) {
                                aVar2.C1(u0.b(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new CardsCarouselFlowDestination(null, null, null, null, new CardScreenAction.Select(((f) result4).f230280a.f150110a, 6, false, false), null, 47), false, (Integer) null, 0, 61)), 2)))));
                            } else {
                                if (!(result4 instanceof a.C0461a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.I2();
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            googlePayOtpVerificationController.H = block2;
            return googlePayOtpVerificationController;
        }
        if (step instanceof GooglePayConfirmationFlowContract$Step.MultipleOtpVerification) {
            GooglePayMultipleOtpVerificationController googlePayMultipleOtpVerificationController = new GooglePayMultipleOtpVerificationController(new GooglePayMultipleOtpVerificationScreenContract$InputData(((GooglePayConfirmationFlowContract$Step.MultipleOtpVerification) step).f64483a));
            final int i3 = 2;
            Function1 block3 = new Function1(this) { // from class: nw2.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.card_add_to_googlepay.impl.verification.a f219754b;

                {
                    this.f219754b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i3) {
                        case 0:
                            sw2.k result = (sw2.k) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof sw2.l;
                            com.revolut.feature.card_add_to_googlepay.impl.verification.a aVar = this.f219754b;
                            if (z) {
                                aVar.E2(new GooglePayConfirmationFlowContract$Step.SingleOtpVerification(((sw2.l) result).f266084b), false, null, false);
                            } else {
                                if (!(result instanceof k.a) && !(result instanceof k.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar.I2();
                            }
                            return Unit.f186387a;
                        case 1:
                            ww2.l result2 = (ww2.l) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!Intrinsics.f(result2, l.a.f300586a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f219754b.I2();
                            return Unit.f186387a;
                        case 2:
                            uw2.k result3 = (uw2.k) obj2;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (!Intrinsics.f(result3, k.a.f283536a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f219754b.I2();
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.a result4 = (com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.a) obj2;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean z3 = result4 instanceof f;
                            com.revolut.feature.card_add_to_googlepay.impl.verification.a aVar2 = this.f219754b;
                            if (z3) {
                                aVar2.C1(u0.b(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new CardsCarouselFlowDestination(null, null, null, null, new CardScreenAction.Select(((f) result4).f230280a.f150110a, 6, false, false), null, 47), false, (Integer) null, 0, 61)), 2)))));
                            } else {
                                if (!(result4 instanceof a.C0461a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.I2();
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block3, "block");
            googlePayMultipleOtpVerificationController.H = block3;
            return googlePayMultipleOtpVerificationController;
        }
        if (step instanceof GooglePayConfirmationFlowContract$Step.Confirmation) {
            GooglePayConfirmationFlowContract$Step.Confirmation confirmation = (GooglePayConfirmationFlowContract$Step.Confirmation) step;
            GooglePayConfirmationController googlePayConfirmationController = new GooglePayConfirmationController(new GooglePayConfirmationControllerContract$InputData.Confirmation(confirmation.f64479a, confirmation.f64480b));
            b0 block4 = new b0(this, step, 2);
            Intrinsics.checkNotNullParameter(block4, "block");
            googlePayConfirmationController.H = block4;
            return googlePayConfirmationController;
        }
        if (!(step instanceof GooglePayConfirmationFlowContract$Step.RevivalConfirmation)) {
            throw new NoWhenBranchMatchedException();
        }
        GooglePayConfirmationFlowContract$Step.RevivalConfirmation revivalConfirmation = (GooglePayConfirmationFlowContract$Step.RevivalConfirmation) step;
        GooglePayConfirmationController googlePayConfirmationController2 = new GooglePayConfirmationController(new GooglePayConfirmationControllerContract$InputData.RevivalConfirmation(revivalConfirmation.f64484a, revivalConfirmation.f64485b));
        final int i5 = 3;
        Function1 block5 = new Function1(this) { // from class: nw2.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.card_add_to_googlepay.impl.verification.a f219754b;

            {
                this.f219754b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        sw2.k result = (sw2.k) obj2;
                        Intrinsics.checkNotNullParameter(result, "result");
                        boolean z = result instanceof sw2.l;
                        com.revolut.feature.card_add_to_googlepay.impl.verification.a aVar = this.f219754b;
                        if (z) {
                            aVar.E2(new GooglePayConfirmationFlowContract$Step.SingleOtpVerification(((sw2.l) result).f266084b), false, null, false);
                        } else {
                            if (!(result instanceof k.a) && !(result instanceof k.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar.I2();
                        }
                        return Unit.f186387a;
                    case 1:
                        ww2.l result2 = (ww2.l) obj2;
                        Intrinsics.checkNotNullParameter(result2, "result");
                        if (!Intrinsics.f(result2, l.a.f300586a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f219754b.I2();
                        return Unit.f186387a;
                    case 2:
                        uw2.k result3 = (uw2.k) obj2;
                        Intrinsics.checkNotNullParameter(result3, "result");
                        if (!Intrinsics.f(result3, k.a.f283536a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f219754b.I2();
                        return Unit.f186387a;
                    default:
                        com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.a result4 = (com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.a) obj2;
                        Intrinsics.checkNotNullParameter(result4, "result");
                        boolean z3 = result4 instanceof f;
                        com.revolut.feature.card_add_to_googlepay.impl.verification.a aVar2 = this.f219754b;
                        if (z3) {
                            aVar2.C1(u0.b(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new CardsCarouselFlowDestination(null, null, null, null, new CardScreenAction.Select(((f) result4).f230280a.f150110a, 6, false, false), null, 47), false, (Integer) null, 0, 61)), 2)))));
                        } else {
                            if (!(result4 instanceof a.C0461a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar2.I2();
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block5, "block");
        googlePayConfirmationController2.H = block5;
        return googlePayConfirmationController2;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.v;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.u;
    }
}
