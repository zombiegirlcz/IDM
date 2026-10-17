package yo7;

import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.AdditionalDriver;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import com.revolut.feature.insurance_car.impl.data.model.Occupation;
import com.revolut.feature.insurance_car.impl.data.model.Survey;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.driver.details.AdditionalDriverDetailsScreenContract$InputData;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kl7.n1;
import kl7.p1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yed.g0;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends jki.g implements k {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l80.e f315632p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tl7.f f315633q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h f315634r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f315635s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(jki.p stateMapper, AdditionalDriverDetailsScreenContract$InputData inputData, l80.e dateProvider, tl7.f bottomDialog) {
        String str;
        Answer.PenaltyPoints penaltyPoints;
        List list;
        Survey survey;
        Survey.Employment employment;
        Survey survey2;
        Survey.Employment employment2;
        Survey survey3;
        Survey.LicencePenalties licencePenalties;
        Survey survey4;
        Survey.LicencePenalties licencePenalties2;
        Survey survey5;
        Survey.LicencePenalties licencePenalties3;
        Survey survey6;
        Survey.Claims claims;
        ArrayList arrayList;
        Survey survey7;
        Survey.Claims claims2;
        Survey survey8;
        Survey.Licence licence;
        Survey survey9;
        Survey.Licence licence2;
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        this.f315632p = dateProvider;
        this.f315633q = bottomDialog;
        AdditionalDriver additionalDriver = inputData.f75574a;
        v vVar = additionalDriver == null ? v.CREATE : v.EDIT;
        String str2 = additionalDriver != null ? additionalDriver.f75162b : null;
        str2 = str2 == null ? "" : str2;
        String str3 = additionalDriver != null ? additionalDriver.f75163c : null;
        str3 = str3 == null ? "" : str3;
        LocalDate localDate = additionalDriver != null ? additionalDriver.d : null;
        AdditionalDriver.Relationship relationship = additionalDriver != null ? additionalDriver.e : null;
        Answer.LicenceType licenceType = (additionalDriver == null || (survey9 = additionalDriver.f) == null || (licence2 = survey9.f75314a) == null) ? null : licence2.f75327a;
        Answer.LicenceDuration licenceDuration = (additionalDriver == null || (survey8 = additionalDriver.f) == null || (licence = survey8.f75314a) == null) ? null : licence.f75328b;
        Answer.ClaimsState claimsState = (additionalDriver == null || (survey7 = additionalDriver.f) == null || (claims2 = survey7.d) == null) ? null : claims2.f75317a;
        if (additionalDriver == null || (survey6 = additionalDriver.f) == null || (claims = survey6.d) == null) {
            str = str2;
            penaltyPoints = null;
            list = f0.f322471a;
        } else {
            int i = xl7.d.i(claims.f75317a);
            List list2 = claims.f75318b;
            if (i == list2.size()) {
                List list3 = list2;
                ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
                Iterator it8 = list3.iterator();
                while (it8.hasNext()) {
                    Survey.Claims.Details details = (Survey.Claims.Details) it8.next();
                    Intrinsics.checkNotNullParameter(details, "<this>");
                    arrayList2.add(new vp7.b(details.f75319a, details.f75320b, details.f75321c, details.d));
                    it8 = it8;
                    str2 = str2;
                }
                str = str2;
                arrayList = arrayList2;
            } else {
                str = str2;
                ArrayList arrayList3 = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList3.add(new vp7.b(null, null, null, null));
                }
                arrayList = arrayList3;
            }
            penaltyPoints = null;
            list = arrayList;
        }
        AdditionalDriver additionalDriver2 = inputData.f75574a;
        this.f315634r = new h(vVar, str, str3, localDate, relationship, licenceType, licenceDuration, claimsState, list, (additionalDriver2 == null || (survey5 = additionalDriver2.f) == null || (licencePenalties3 = survey5.e) == null) ? penaltyPoints : licencePenalties3.f75329a, (additionalDriver2 == null || (survey4 = additionalDriver2.f) == null || (licencePenalties2 = survey4.e) == null) ? penaltyPoints : licencePenalties2.f75330b, (additionalDriver2 == null || (survey3 = additionalDriver2.f) == null || (licencePenalties = survey3.e) == null) ? penaltyPoints : licencePenalties.f75331c, (additionalDriver2 == null || (survey2 = additionalDriver2.f) == null || (employment2 = survey2.f75315b) == null) ? penaltyPoints : employment2.f75325a, (additionalDriver2 == null || (survey = additionalDriver2.f) == null || (employment = survey.f75315b) == null) ? penaltyPoints : employment.f75326b);
        this.f315635s = true;
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f315634r;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void y2(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        tl7.f fVar = this.f315633q;
        switch (iHashCode) {
            case -1096958720:
                if (listId.equals("INPUT_OCCUPATION")) {
                    final int i = 6;
                    qn7.a.a(this, new Function1(this) { // from class: yo7.n

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ s f315625b;

                        {
                            this.f315625b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            switch (i) {
                                case 0:
                                    AdditionalDriver.Relationship answer = (AdditionalDriver.Relationship) obj3;
                                    Intrinsics.checkNotNullParameter(answer, "answer");
                                    this.f315625b.x2(new g0(answer, 29));
                                    break;
                                case 1:
                                    Answer.ClaimsState answer2 = (Answer.ClaimsState) obj3;
                                    Intrinsics.checkNotNullParameter(answer2, "answer");
                                    s sVar = this.f315625b;
                                    if (answer2 != ((h) sVar.t2()).f315612h) {
                                        sVar.x2(new g0(answer2, 27));
                                    }
                                    break;
                                case 2:
                                    Answer.EmploymentStatus answer3 = (Answer.EmploymentStatus) obj3;
                                    Intrinsics.checkNotNullParameter(answer3, "answer");
                                    this.f315625b.x2(new p(answer3, 0));
                                    break;
                                case 3:
                                    Answer.PenaltyPoints answer4 = (Answer.PenaltyPoints) obj3;
                                    Intrinsics.checkNotNullParameter(answer4, "answer");
                                    this.f315625b.x2(new p(answer4, 1));
                                    break;
                                case 4:
                                    Answer.LicenceType answer5 = (Answer.LicenceType) obj3;
                                    Intrinsics.checkNotNullParameter(answer5, "answer");
                                    this.f315625b.x2(new p(answer5, 2));
                                    break;
                                case 5:
                                    Answer.LicenceDuration answer6 = (Answer.LicenceDuration) obj3;
                                    Intrinsics.checkNotNullParameter(answer6, "answer");
                                    this.f315625b.x2(new g0(answer6, 28));
                                    break;
                                default:
                                    Occupation it8 = (Occupation) obj3;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    this.f315625b.x2(new xp7.h(it8, 1));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    });
                    return;
                }
                break;
            case -1061193698:
                if (listId.equals("INPUT_PENALTY_POINTS_COUNT")) {
                    final int i2 = 3;
                    fVar.Q(R$string.car_insurance_create_driver_sections_penalty_points_cells_count_title, zhm.p.c(Answer.PenaltyPoints.values()), ((h) t2()).f315613j, new Function1(this) { // from class: yo7.n

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ s f315625b;

                        {
                            this.f315625b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            switch (i2) {
                                case 0:
                                    AdditionalDriver.Relationship answer = (AdditionalDriver.Relationship) obj3;
                                    Intrinsics.checkNotNullParameter(answer, "answer");
                                    this.f315625b.x2(new g0(answer, 29));
                                    break;
                                case 1:
                                    Answer.ClaimsState answer2 = (Answer.ClaimsState) obj3;
                                    Intrinsics.checkNotNullParameter(answer2, "answer");
                                    s sVar = this.f315625b;
                                    if (answer2 != ((h) sVar.t2()).f315612h) {
                                        sVar.x2(new g0(answer2, 27));
                                    }
                                    break;
                                case 2:
                                    Answer.EmploymentStatus answer3 = (Answer.EmploymentStatus) obj3;
                                    Intrinsics.checkNotNullParameter(answer3, "answer");
                                    this.f315625b.x2(new p(answer3, 0));
                                    break;
                                case 3:
                                    Answer.PenaltyPoints answer4 = (Answer.PenaltyPoints) obj3;
                                    Intrinsics.checkNotNullParameter(answer4, "answer");
                                    this.f315625b.x2(new p(answer4, 1));
                                    break;
                                case 4:
                                    Answer.LicenceType answer5 = (Answer.LicenceType) obj3;
                                    Intrinsics.checkNotNullParameter(answer5, "answer");
                                    this.f315625b.x2(new p(answer5, 2));
                                    break;
                                case 5:
                                    Answer.LicenceDuration answer6 = (Answer.LicenceDuration) obj3;
                                    Intrinsics.checkNotNullParameter(answer6, "answer");
                                    this.f315625b.x2(new g0(answer6, 28));
                                    break;
                                default:
                                    Occupation it8 = (Occupation) obj3;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    this.f315625b.x2(new xp7.h(it8, 1));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    });
                    return;
                }
                break;
            case 246656173:
                if (listId.equals("INPUT_RELATIONSHIP")) {
                    final int i3 = 0;
                    fVar.Q(R$string.car_insurance_create_driver_sections_personal_information_cells_relationship_title, zhm.p.c(AdditionalDriver.Relationship.values()), ((h) t2()).e, new Function1(this) { // from class: yo7.n

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ s f315625b;

                        {
                            this.f315625b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            switch (i3) {
                                case 0:
                                    AdditionalDriver.Relationship answer = (AdditionalDriver.Relationship) obj3;
                                    Intrinsics.checkNotNullParameter(answer, "answer");
                                    this.f315625b.x2(new g0(answer, 29));
                                    break;
                                case 1:
                                    Answer.ClaimsState answer2 = (Answer.ClaimsState) obj3;
                                    Intrinsics.checkNotNullParameter(answer2, "answer");
                                    s sVar = this.f315625b;
                                    if (answer2 != ((h) sVar.t2()).f315612h) {
                                        sVar.x2(new g0(answer2, 27));
                                    }
                                    break;
                                case 2:
                                    Answer.EmploymentStatus answer3 = (Answer.EmploymentStatus) obj3;
                                    Intrinsics.checkNotNullParameter(answer3, "answer");
                                    this.f315625b.x2(new p(answer3, 0));
                                    break;
                                case 3:
                                    Answer.PenaltyPoints answer4 = (Answer.PenaltyPoints) obj3;
                                    Intrinsics.checkNotNullParameter(answer4, "answer");
                                    this.f315625b.x2(new p(answer4, 1));
                                    break;
                                case 4:
                                    Answer.LicenceType answer5 = (Answer.LicenceType) obj3;
                                    Intrinsics.checkNotNullParameter(answer5, "answer");
                                    this.f315625b.x2(new p(answer5, 2));
                                    break;
                                case 5:
                                    Answer.LicenceDuration answer6 = (Answer.LicenceDuration) obj3;
                                    Intrinsics.checkNotNullParameter(answer6, "answer");
                                    this.f315625b.x2(new g0(answer6, 28));
                                    break;
                                default:
                                    Occupation it8 = (Occupation) obj3;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    this.f315625b.x2(new xp7.h(it8, 1));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    });
                    return;
                }
                break;
            case 621705436:
                if (listId.equals("INPUT_CLAIMS_COUNT")) {
                    final int i5 = 1;
                    fVar.Q(R$string.car_insurance_create_driver_sections_claims_cells_count_title, d0.A0(zhm.p.c(Answer.ClaimsState.values()), Answer.ClaimsState.WINDSCREEN_ONLY), ((h) t2()).f315612h, new Function1(this) { // from class: yo7.n

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ s f315625b;

                        {
                            this.f315625b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            switch (i5) {
                                case 0:
                                    AdditionalDriver.Relationship answer = (AdditionalDriver.Relationship) obj3;
                                    Intrinsics.checkNotNullParameter(answer, "answer");
                                    this.f315625b.x2(new g0(answer, 29));
                                    break;
                                case 1:
                                    Answer.ClaimsState answer2 = (Answer.ClaimsState) obj3;
                                    Intrinsics.checkNotNullParameter(answer2, "answer");
                                    s sVar = this.f315625b;
                                    if (answer2 != ((h) sVar.t2()).f315612h) {
                                        sVar.x2(new g0(answer2, 27));
                                    }
                                    break;
                                case 2:
                                    Answer.EmploymentStatus answer3 = (Answer.EmploymentStatus) obj3;
                                    Intrinsics.checkNotNullParameter(answer3, "answer");
                                    this.f315625b.x2(new p(answer3, 0));
                                    break;
                                case 3:
                                    Answer.PenaltyPoints answer4 = (Answer.PenaltyPoints) obj3;
                                    Intrinsics.checkNotNullParameter(answer4, "answer");
                                    this.f315625b.x2(new p(answer4, 1));
                                    break;
                                case 4:
                                    Answer.LicenceType answer5 = (Answer.LicenceType) obj3;
                                    Intrinsics.checkNotNullParameter(answer5, "answer");
                                    this.f315625b.x2(new p(answer5, 2));
                                    break;
                                case 5:
                                    Answer.LicenceDuration answer6 = (Answer.LicenceDuration) obj3;
                                    Intrinsics.checkNotNullParameter(answer6, "answer");
                                    this.f315625b.x2(new g0(answer6, 28));
                                    break;
                                default:
                                    Occupation it8 = (Occupation) obj3;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    this.f315625b.x2(new xp7.h(it8, 1));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    });
                    return;
                }
                break;
            case 807130071:
                if (listId.equals("INPUT_LICENCE_DURATION")) {
                    final int i6 = 5;
                    fVar.Q(R$string.car_insurance_create_driver_sections_driving_license_cells_driving_license_years_title, zhm.p.c(Answer.LicenceDuration.values()), ((h) t2()).f315611g, new Function1(this) { // from class: yo7.n

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ s f315625b;

                        {
                            this.f315625b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            switch (i6) {
                                case 0:
                                    AdditionalDriver.Relationship answer = (AdditionalDriver.Relationship) obj3;
                                    Intrinsics.checkNotNullParameter(answer, "answer");
                                    this.f315625b.x2(new g0(answer, 29));
                                    break;
                                case 1:
                                    Answer.ClaimsState answer2 = (Answer.ClaimsState) obj3;
                                    Intrinsics.checkNotNullParameter(answer2, "answer");
                                    s sVar = this.f315625b;
                                    if (answer2 != ((h) sVar.t2()).f315612h) {
                                        sVar.x2(new g0(answer2, 27));
                                    }
                                    break;
                                case 2:
                                    Answer.EmploymentStatus answer3 = (Answer.EmploymentStatus) obj3;
                                    Intrinsics.checkNotNullParameter(answer3, "answer");
                                    this.f315625b.x2(new p(answer3, 0));
                                    break;
                                case 3:
                                    Answer.PenaltyPoints answer4 = (Answer.PenaltyPoints) obj3;
                                    Intrinsics.checkNotNullParameter(answer4, "answer");
                                    this.f315625b.x2(new p(answer4, 1));
                                    break;
                                case 4:
                                    Answer.LicenceType answer5 = (Answer.LicenceType) obj3;
                                    Intrinsics.checkNotNullParameter(answer5, "answer");
                                    this.f315625b.x2(new p(answer5, 2));
                                    break;
                                case 5:
                                    Answer.LicenceDuration answer6 = (Answer.LicenceDuration) obj3;
                                    Intrinsics.checkNotNullParameter(answer6, "answer");
                                    this.f315625b.x2(new g0(answer6, 28));
                                    break;
                                default:
                                    Occupation it8 = (Occupation) obj3;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    this.f315625b.x2(new xp7.h(it8, 1));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    });
                    return;
                }
                break;
            case 835499773:
                if (listId.equals("INPUT_LICENCE_TYPE")) {
                    final int i21 = 4;
                    fVar.Q(R$string.car_insurance_create_driver_sections_driving_license_cells_driving_license_type_title, zhm.p.c(Answer.LicenceType.values()), ((h) t2()).f, new Function1(this) { // from class: yo7.n

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ s f315625b;

                        {
                            this.f315625b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            switch (i21) {
                                case 0:
                                    AdditionalDriver.Relationship answer = (AdditionalDriver.Relationship) obj3;
                                    Intrinsics.checkNotNullParameter(answer, "answer");
                                    this.f315625b.x2(new g0(answer, 29));
                                    break;
                                case 1:
                                    Answer.ClaimsState answer2 = (Answer.ClaimsState) obj3;
                                    Intrinsics.checkNotNullParameter(answer2, "answer");
                                    s sVar = this.f315625b;
                                    if (answer2 != ((h) sVar.t2()).f315612h) {
                                        sVar.x2(new g0(answer2, 27));
                                    }
                                    break;
                                case 2:
                                    Answer.EmploymentStatus answer3 = (Answer.EmploymentStatus) obj3;
                                    Intrinsics.checkNotNullParameter(answer3, "answer");
                                    this.f315625b.x2(new p(answer3, 0));
                                    break;
                                case 3:
                                    Answer.PenaltyPoints answer4 = (Answer.PenaltyPoints) obj3;
                                    Intrinsics.checkNotNullParameter(answer4, "answer");
                                    this.f315625b.x2(new p(answer4, 1));
                                    break;
                                case 4:
                                    Answer.LicenceType answer5 = (Answer.LicenceType) obj3;
                                    Intrinsics.checkNotNullParameter(answer5, "answer");
                                    this.f315625b.x2(new p(answer5, 2));
                                    break;
                                case 5:
                                    Answer.LicenceDuration answer6 = (Answer.LicenceDuration) obj3;
                                    Intrinsics.checkNotNullParameter(answer6, "answer");
                                    this.f315625b.x2(new g0(answer6, 28));
                                    break;
                                default:
                                    Occupation it8 = (Occupation) obj3;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    this.f315625b.x2(new xp7.h(it8, 1));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    });
                    return;
                }
                break;
            case 1750923169:
                if (listId.equals("INPUT_EMPLOYMENT")) {
                    final int i22 = 2;
                    fVar.Q(R$string.car_insurance_edit_application_cells_employment, zhm.p.c(Answer.EmploymentStatus.values()), ((h) t2()).f315615m, new Function1(this) { // from class: yo7.n

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ s f315625b;

                        {
                            this.f315625b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            switch (i22) {
                                case 0:
                                    AdditionalDriver.Relationship answer = (AdditionalDriver.Relationship) obj3;
                                    Intrinsics.checkNotNullParameter(answer, "answer");
                                    this.f315625b.x2(new g0(answer, 29));
                                    break;
                                case 1:
                                    Answer.ClaimsState answer2 = (Answer.ClaimsState) obj3;
                                    Intrinsics.checkNotNullParameter(answer2, "answer");
                                    s sVar = this.f315625b;
                                    if (answer2 != ((h) sVar.t2()).f315612h) {
                                        sVar.x2(new g0(answer2, 27));
                                    }
                                    break;
                                case 2:
                                    Answer.EmploymentStatus answer3 = (Answer.EmploymentStatus) obj3;
                                    Intrinsics.checkNotNullParameter(answer3, "answer");
                                    this.f315625b.x2(new p(answer3, 0));
                                    break;
                                case 3:
                                    Answer.PenaltyPoints answer4 = (Answer.PenaltyPoints) obj3;
                                    Intrinsics.checkNotNullParameter(answer4, "answer");
                                    this.f315625b.x2(new p(answer4, 1));
                                    break;
                                case 4:
                                    Answer.LicenceType answer5 = (Answer.LicenceType) obj3;
                                    Intrinsics.checkNotNullParameter(answer5, "answer");
                                    this.f315625b.x2(new p(answer5, 2));
                                    break;
                                case 5:
                                    Answer.LicenceDuration answer6 = (Answer.LicenceDuration) obj3;
                                    Intrinsics.checkNotNullParameter(answer6, "answer");
                                    this.f315625b.x2(new g0(answer6, 28));
                                    break;
                                default:
                                    Occupation it8 = (Occupation) obj3;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    this.f315625b.x2(new xp7.h(it8, 1));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    });
                    return;
                }
                break;
        }
        if (obj2 instanceof n1) {
            n1 n1Var = (n1) obj2;
            final int i32 = n1Var.f185362a;
            p1 p1Var = n1Var.f185363b;
            int i33 = r.f315631a[p1Var.ordinal()];
            if (i33 != 1) {
                if (i33 == 2) {
                    final int i43 = 0;
                    fVar.Q(R$string.car_insurance_question_claim_details_claim_type, zhm.p.c(Answer.ClaimType.values()), ((vp7.b) ((h) t2()).i.get(i32)).f291114b, new Function1(this) { // from class: yo7.o

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ s f315627b;

                        {
                            this.f315627b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            switch (i43) {
                                case 0:
                                    Answer.ClaimType answer = (Answer.ClaimType) obj3;
                                    Intrinsics.checkNotNullParameter(answer, "answer");
                                    this.f315627b.x2(new vp7.o(i32, answer, 1));
                                    break;
                                default:
                                    LocalDate answer2 = (LocalDate) obj3;
                                    Intrinsics.checkNotNullParameter(answer2, "answer");
                                    this.f315627b.x2(new vp7.p(i32, 1, answer2));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    });
                    return;
                } else {
                    throw new IllegalStateException(("unexpected question " + p1Var).toString());
                }
            }
            LocalDate localDateE = ((l80.f) this.f315632p).e();
            int i59 = R$string.car_insurance_question_claim_details_claim_date;
            LocalDate localDateMinusYears = localDateE.minusYears(5L);
            Intrinsics.checkNotNullExpressionValue(localDateMinusYears, "minusYears(...)");
            LocalDate localDate = ((vp7.b) ((h) t2()).i.get(i32)).f291113a;
            LocalDate localDate2 = localDate == null ? localDateE : localDate;
            final int i66 = 1;
            this.f315633q.T(i59, localDateMinusYears, localDateE, localDate2, new Function1(this) { // from class: yo7.o

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ s f315627b;

                {
                    this.f315627b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    switch (i66) {
                        case 0:
                            Answer.ClaimType answer = (Answer.ClaimType) obj3;
                            Intrinsics.checkNotNullParameter(answer, "answer");
                            this.f315627b.x2(new vp7.o(i32, answer, 1));
                            break;
                        default:
                            LocalDate answer2 = (LocalDate) obj3;
                            Intrinsics.checkNotNullParameter(answer2, "answer");
                            this.f315627b.x2(new vp7.p(i32, 1, answer2));
                            break;
                    }
                    return Unit.f186387a;
                }
            });
        }
    }
}
