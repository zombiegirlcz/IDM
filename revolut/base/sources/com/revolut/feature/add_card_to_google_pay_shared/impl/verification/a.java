package com.revolut.feature.add_card_to_google_pay_shared.impl.verification;

import ah1.f;
import ah1.h;
import ch1.j;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.GooglePayConfirmationFlowContract$InputData;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.GooglePayConfirmationFlowContract$Step;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.GooglePayConfirmationController;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.GooglePayConfirmationControllerContract$InputData;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.GooglePayOtpLocationMismatchController;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.GooglePayOtpLocationMismatchScreenContract$InputData;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.c;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.multiple.GooglePayMultipleOtpVerificationController;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.multiple.GooglePayMultipleOtpVerificationScreenContract$InputData;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.single.GooglePayOtpVerificationController;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.single.GooglePayOtpVerificationScreenContract$InputData;
import com.revolut.feature.cards.models.revolutcard.LocationMismatch;
import com.revolut.feature.cards.models.revolutcard.RevolutCardOtp;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import eh1.m;
import gh1.l;
import ih1.d;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zf5.n;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends g implements zg1.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f60889t;
    public final mw2.g u;
    public final ug1.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final GooglePayConfirmationFlowContract$Step f60890w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final GooglePayConfirmationFlowContract$State f60891x;

    public a(GooglePayConfirmationFlowContract$InputData inputData, d inAppVerificationIntentProvider, mw2.g googlePayConfirmationNavigationProvider, ug1.a googlePayConfirmationResultInteractor) {
        GooglePayConfirmationFlowContract$Step multipleOtpVerification;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(inAppVerificationIntentProvider, "inAppVerificationIntentProvider");
        Intrinsics.checkNotNullParameter(googlePayConfirmationNavigationProvider, "googlePayConfirmationNavigationProvider");
        Intrinsics.checkNotNullParameter(googlePayConfirmationResultInteractor, "googlePayConfirmationResultInteractor");
        this.f60889t = inAppVerificationIntentProvider;
        this.u = googlePayConfirmationNavigationProvider;
        this.v = googlePayConfirmationResultInteractor;
        if (inputData instanceof GooglePayConfirmationFlowContract$InputData.Confirmation) {
            GooglePayConfirmationFlowContract$InputData.Confirmation confirmation = (GooglePayConfirmationFlowContract$InputData.Confirmation) inputData;
            multipleOtpVerification = new GooglePayConfirmationFlowContract$Step.Confirmation(confirmation.f60875a, confirmation.f60876b);
        } else if (inputData instanceof GooglePayConfirmationFlowContract$InputData.RevivalConfirmation) {
            GooglePayConfirmationFlowContract$InputData.RevivalConfirmation revivalConfirmation = (GooglePayConfirmationFlowContract$InputData.RevivalConfirmation) inputData;
            multipleOtpVerification = new GooglePayConfirmationFlowContract$Step.RevivalConfirmation(revivalConfirmation.f60878a, revivalConfirmation.f60879b);
        } else {
            if (!(inputData instanceof GooglePayConfirmationFlowContract$InputData.OtpVerification)) {
                throw new NoWhenBranchMatchedException();
            }
            List list = ((GooglePayConfirmationFlowContract$InputData.OtpVerification) inputData).f60877a;
            if (list.size() == 1) {
                RevolutCardOtp revolutCardOtp = (RevolutCardOtp) d0.b0(list);
                LocationMismatch locationMismatch = revolutCardOtp.d;
                multipleOtpVerification = locationMismatch != null ? new GooglePayConfirmationFlowContract$Step.LocationMismatchConfirmation(revolutCardOtp, locationMismatch) : new GooglePayConfirmationFlowContract$Step.SingleOtpVerification(revolutCardOtp);
            } else {
                multipleOtpVerification = new GooglePayConfirmationFlowContract$Step.MultipleOtpVerification(list);
            }
        }
        this.f60890w = multipleOtpVerification;
        this.f60891x = new GooglePayConfirmationFlowContract$State(0);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        GooglePayConfirmationFlowContract$Step step = (GooglePayConfirmationFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof GooglePayConfirmationFlowContract$Step.LocationMismatchConfirmation) {
            GooglePayConfirmationFlowContract$Step.LocationMismatchConfirmation locationMismatchConfirmation = (GooglePayConfirmationFlowContract$Step.LocationMismatchConfirmation) step;
            GooglePayOtpLocationMismatchController googlePayOtpLocationMismatchController = new GooglePayOtpLocationMismatchController(new GooglePayOtpLocationMismatchScreenContract$InputData(locationMismatchConfirmation.f60883a, locationMismatchConfirmation.f60884b, true));
            final int i = 0;
            Function1 block = new Function1(this) { // from class: zg1.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.add_card_to_google_pay_shared.impl.verification.a f322050b;

                {
                    this.f322050b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            c result = (c) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof j;
                            com.revolut.feature.add_card_to_google_pay_shared.impl.verification.a aVar = this.f322050b;
                            if (z) {
                                aVar.E2(new GooglePayConfirmationFlowContract$Step.SingleOtpVerification(((j) result).f24110b), false, null, false);
                            } else {
                                if (!(result instanceof c.a) && !(result instanceof c.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar.I2();
                            }
                            return Unit.f186387a;
                        case 1:
                            l result2 = (l) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!Intrinsics.f(result2, l.a.f143827a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f322050b.I2();
                            return Unit.f186387a;
                        case 2:
                            m result3 = (m) obj2;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (!Intrinsics.f(result3, m.a.f125696a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f322050b.I2();
                            return Unit.f186387a;
                        default:
                            h result4 = (h) obj2;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean z3 = result4 instanceof f;
                            com.revolut.feature.add_card_to_google_pay_shared.impl.verification.a aVar2 = this.f322050b;
                            if (z3) {
                                aVar2.C1(aVar2.u.a(((f) result4).f4854a.f104693a));
                            } else {
                                if (!(result4 instanceof ah1.g)) {
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
            GooglePayOtpVerificationController googlePayOtpVerificationController = new GooglePayOtpVerificationController(new GooglePayOtpVerificationScreenContract$InputData(((GooglePayConfirmationFlowContract$Step.SingleOtpVerification) step).f60888a));
            final int i2 = 1;
            Function1 block2 = new Function1(this) { // from class: zg1.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.add_card_to_google_pay_shared.impl.verification.a f322050b;

                {
                    this.f322050b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i2) {
                        case 0:
                            c result = (c) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof j;
                            com.revolut.feature.add_card_to_google_pay_shared.impl.verification.a aVar = this.f322050b;
                            if (z) {
                                aVar.E2(new GooglePayConfirmationFlowContract$Step.SingleOtpVerification(((j) result).f24110b), false, null, false);
                            } else {
                                if (!(result instanceof c.a) && !(result instanceof c.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar.I2();
                            }
                            return Unit.f186387a;
                        case 1:
                            l result2 = (l) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!Intrinsics.f(result2, l.a.f143827a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f322050b.I2();
                            return Unit.f186387a;
                        case 2:
                            m result3 = (m) obj2;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (!Intrinsics.f(result3, m.a.f125696a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f322050b.I2();
                            return Unit.f186387a;
                        default:
                            h result4 = (h) obj2;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean z3 = result4 instanceof f;
                            com.revolut.feature.add_card_to_google_pay_shared.impl.verification.a aVar2 = this.f322050b;
                            if (z3) {
                                aVar2.C1(aVar2.u.a(((f) result4).f4854a.f104693a));
                            } else {
                                if (!(result4 instanceof ah1.g)) {
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
            GooglePayMultipleOtpVerificationController googlePayMultipleOtpVerificationController = new GooglePayMultipleOtpVerificationController(new GooglePayMultipleOtpVerificationScreenContract$InputData(((GooglePayConfirmationFlowContract$Step.MultipleOtpVerification) step).f60885a));
            final int i3 = 2;
            Function1 block3 = new Function1(this) { // from class: zg1.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.add_card_to_google_pay_shared.impl.verification.a f322050b;

                {
                    this.f322050b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i3) {
                        case 0:
                            c result = (c) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof j;
                            com.revolut.feature.add_card_to_google_pay_shared.impl.verification.a aVar = this.f322050b;
                            if (z) {
                                aVar.E2(new GooglePayConfirmationFlowContract$Step.SingleOtpVerification(((j) result).f24110b), false, null, false);
                            } else {
                                if (!(result instanceof c.a) && !(result instanceof c.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar.I2();
                            }
                            return Unit.f186387a;
                        case 1:
                            l result2 = (l) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!Intrinsics.f(result2, l.a.f143827a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f322050b.I2();
                            return Unit.f186387a;
                        case 2:
                            m result3 = (m) obj2;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (!Intrinsics.f(result3, m.a.f125696a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f322050b.I2();
                            return Unit.f186387a;
                        default:
                            h result4 = (h) obj2;
                            Intrinsics.checkNotNullParameter(result4, "result");
                            boolean z3 = result4 instanceof f;
                            com.revolut.feature.add_card_to_google_pay_shared.impl.verification.a aVar2 = this.f322050b;
                            if (z3) {
                                aVar2.C1(aVar2.u.a(((f) result4).f4854a.f104693a));
                            } else {
                                if (!(result4 instanceof ah1.g)) {
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
            GooglePayConfirmationController googlePayConfirmationController = new GooglePayConfirmationController(new GooglePayConfirmationControllerContract$InputData.Confirmation(confirmation.f60881a, confirmation.f60882b));
            n block4 = new n(this, step, 3);
            Intrinsics.checkNotNullParameter(block4, "block");
            googlePayConfirmationController.H = block4;
            return googlePayConfirmationController;
        }
        if (!(step instanceof GooglePayConfirmationFlowContract$Step.RevivalConfirmation)) {
            throw new NoWhenBranchMatchedException();
        }
        GooglePayConfirmationFlowContract$Step.RevivalConfirmation revivalConfirmation = (GooglePayConfirmationFlowContract$Step.RevivalConfirmation) step;
        GooglePayConfirmationController googlePayConfirmationController2 = new GooglePayConfirmationController(new GooglePayConfirmationControllerContract$InputData.RevivalConfirmation(revivalConfirmation.f60886a, revivalConfirmation.f60887b));
        final int i5 = 3;
        Function1 block5 = new Function1(this) { // from class: zg1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.add_card_to_google_pay_shared.impl.verification.a f322050b;

            {
                this.f322050b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        c result = (c) obj2;
                        Intrinsics.checkNotNullParameter(result, "result");
                        boolean z = result instanceof j;
                        com.revolut.feature.add_card_to_google_pay_shared.impl.verification.a aVar = this.f322050b;
                        if (z) {
                            aVar.E2(new GooglePayConfirmationFlowContract$Step.SingleOtpVerification(((j) result).f24110b), false, null, false);
                        } else {
                            if (!(result instanceof c.a) && !(result instanceof c.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar.I2();
                        }
                        return Unit.f186387a;
                    case 1:
                        l result2 = (l) obj2;
                        Intrinsics.checkNotNullParameter(result2, "result");
                        if (!Intrinsics.f(result2, l.a.f143827a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f322050b.I2();
                        return Unit.f186387a;
                    case 2:
                        m result3 = (m) obj2;
                        Intrinsics.checkNotNullParameter(result3, "result");
                        if (!Intrinsics.f(result3, m.a.f125696a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f322050b.I2();
                        return Unit.f186387a;
                    default:
                        h result4 = (h) obj2;
                        Intrinsics.checkNotNullParameter(result4, "result");
                        boolean z3 = result4 instanceof f;
                        com.revolut.feature.add_card_to_google_pay_shared.impl.verification.a aVar2 = this.f322050b;
                        if (z3) {
                            aVar2.C1(aVar2.u.a(((f) result4).f4854a.f104693a));
                        } else {
                            if (!(result4 instanceof ah1.g)) {
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
        return this.f60891x;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f60890w;
    }
}
