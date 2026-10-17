package cp7;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.ResourceId;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.insurance_car.impl.R$plurals;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.AdditionalDriver;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import com.revolut.feature.insurance_car.impl.data.model.ApplicationForm;
import com.revolut.feature.insurance_car.impl.data.model.InsurableCar;
import com.revolut.feature.insurance_car.impl.data.model.Occupation;
import com.revolut.feature.insurance_car.impl.data.model.Survey;
import ip0.ak0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements jki.p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static RowDelegate.Model b(RowDelegate.Model model, boolean z) {
        Clause clause;
        Clause clauseA;
        if (!z) {
            return model;
        }
        Clause clause2 = model.f;
        RowDelegate.Model.MainImage.Image40 image40B = null;
        if (clause2 != null) {
            if (clause2 instanceof TextClause) {
                clauseA = TextClause.c((TextClause) clause2, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), ISO781611.SMT_TAG);
            } else if (clause2 instanceof TextLocalisedClause) {
                clauseA = TextLocalisedClause.c((TextLocalisedClause) clause2, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 27);
            } else if (clause2 instanceof TextLocalisedQuantityClause) {
                TextLocalisedQuantityClause textLocalisedQuantityClause = (TextLocalisedQuantityClause) clause2;
                Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254);
                ResourceId resId = textLocalisedQuantityClause.f57949a;
                Number quantity = textLocalisedQuantityClause.f57950b;
                List args = textLocalisedQuantityClause.f57951c;
                Clause clause3 = textLocalisedQuantityClause.d;
                Intrinsics.checkNotNullParameter(resId, "resId");
                Intrinsics.checkNotNullParameter(quantity, "quantity");
                Intrinsics.checkNotNullParameter(args, "args");
                clauseA = new TextLocalisedQuantityClause(resId, quantity, args, clause3, custom);
            } else if (clause2 instanceof TimeClause) {
                clauseA = TimeClause.a((TimeClause) clause2, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 11);
            } else {
                if (!(clause2 instanceof CompositeClause)) {
                    throw new IllegalStateException(("unsupported clause: " + clause2.getClass()).toString());
                }
                clauseA = CompositeClause.a((CompositeClause) clause2, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 11);
            }
            clause = clauseA;
        } else {
            clause = null;
        }
        RowDelegate.Model.MainImage mainImage = model.f53229b;
        if (mainImage != null) {
            if (!(mainImage instanceof RowDelegate.Model.MainImage.Image40)) {
                throw new IllegalStateException(("unsupported main image: " + mainImage.getClass()).toString());
            }
            image40B = RowDelegate.Model.MainImage.Image40.b((RowDelegate.Model.MainImage.Image40) mainImage, null, 55);
        }
        return RowDelegate.Model.x(model, null, image40B, null, clause, null, 0, null, false, null, null, 0, 0, 0, 0, null, -35, 15);
    }

    public static Clause c(Answer.AdditionalClaimsDiscount additionalClaimsDiscount) {
        switch (r.f107910c[additionalClaimsDiscount.ordinal()]) {
            case 1:
                return new TextLocalisedClause(R$string.car_insurance_common_years_no_additional_years, null, null, 14);
            case 2:
                return d(1);
            case 3:
                return d(2);
            case 4:
                return d(3);
            case 5:
                return d(4);
            case 6:
                return new TextLocalisedClause(R$string.car_insurance_common_years_additional_years_x_or_more, u.c(5), null, 12);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static TextLocalisedQuantityClause d(int i) {
        return new TextLocalisedQuantityClause(R$plurals.car_insurance_common_years_additional_years, Integer.valueOf(i), (List) null, (Style) null, 28);
    }

    public static TextLocalisedQuantityClause e(int i) {
        return new TextLocalisedQuantityClause(R$plurals.car_insurance_common_years_claims_free, Integer.valueOf(i), (List) null, (Style) null, 28);
    }

    public static TextLocalisedQuantityClause f(int i) {
        return new TextLocalisedQuantityClause(R$plurals.car_insurance_common_years_claims_free_named_driver, Integer.valueOf(i), (List) null, (Style) null, 28);
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        TextLocalisedClause textLocalisedClause;
        boolean z;
        RowDelegate.Model modelB;
        boolean z3;
        RowDelegate.Model modelB2;
        TextLocalisedClause textLocalisedClause2;
        RowDelegate.Model modelB3;
        boolean z4;
        boolean z6;
        RowDelegate.Model.b.a aVar;
        RowDelegate.Model modelB4;
        RowDelegate.Model modelB5;
        RowDelegate.Model modelB6;
        RowDelegate.Model modelB7;
        Clause compositeClause;
        LayeredImage layeredImage;
        Clause textLocalisedClause3;
        Clause textLocalisedClause4;
        Answer.AdditionalClaimsDiscount additionalClaimsDiscount;
        Clause textLocalisedClause5;
        String strB;
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ApplicationForm applicationForm = domainState.f107890b;
        boolean z11 = domainState.e;
        cp7.a aVar2 = domainState.f;
        int i = domainState.f107893h;
        boolean z12 = applicationForm.f75171j;
        if (z12) {
            textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_edit_application_title, null, null, 14);
        } else {
            if (z12) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_edit_application_title_disabled, null, null, 14);
        }
        TextLocalisedClause textLocalisedClause6 = textLocalisedClause;
        Clause compositeClause2 = i > 0 ? new CompositeClause(v.k(new TextLocalisedClause(R$string.car_insurance_common_save, null, null, 14), new TextLocalisedQuantityClause(R$plurals.car_insurance_edit_application_x_updates, Integer.valueOf(i), (List) null, (Style) null, 28)), new DotDividerClause((Integer) null), null, null, 12) : new TextLocalisedClause(R$string.car_insurance_common_save, null, null, 14);
        boolean z29 = i > 0;
        boolean z31 = applicationForm.f75171j;
        Survey survey = applicationForm.d;
        Address address = domainState.d;
        boolean z41 = domainState.f107892g;
        InsurableCar insurableCar = applicationForm.f75168c;
        boolean z49 = aVar2.f107883a;
        if (insurableCar != null) {
            z = z31;
            modelB = b(new RowDelegate.Model("CAR_ITEM", xl7.n.k(R$drawable.uikit_icn_24_driving_licence, false, null, 15), new TextLocalisedClause(R$string.car_insurance_edit_application_cells_car, null, null, 14), null, 0, xl7.h.c(insurableCar), null, null, 2, null, z, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868568), z49);
        } else {
            z = z31;
            modelB = null;
        }
        RowDelegate.Model modelB8 = b(new RowDelegate.Model("ADDRESS_ITEM", xl7.n.k(R$drawable.uikit_icn_24_utilities, false, null, 15), new TextLocalisedClause(R$string.car_insurance_edit_application_cells_address, null, null, 14), null, 0, (address == null || (strB = o51.a.b(address, null)) == null) ? null : new TextClause(strB, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 2, null, applicationForm.f75171j, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868568), z41);
        Survey.Licence licence = survey != null ? survey.f75314a : null;
        RowDelegate.Model modelB9 = licence != null ? b(new RowDelegate.Model("LICENCE_ITEM", xl7.n.k(R$drawable.uikit_icn_24_national_id, false, null, 15), new TextLocalisedClause(R$string.car_insurance_edit_application_cells_licence, null, null, 14), null, 0, xl7.d.g(licence.f75327a), null, null, 2, null, applicationForm.f75171j, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868568), aVar2.f107884b) : null;
        Answer.Mileage mileage = survey != null ? survey.f : null;
        boolean z54 = aVar2.f107885c;
        boolean z74 = applicationForm.f75171j;
        if (mileage != null) {
            z3 = z11;
            modelB2 = b(new RowDelegate.Model("MILEAGE_ITEM", xl7.n.k(R$drawable.uikit_icn_24_limit, false, null, 15), new TextLocalisedClause(R$string.car_insurance_edit_application_cells_distance, null, null, 14), null, 0, xl7.d.h(mileage), null, null, 2, null, z74, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868568), z54);
        } else {
            z3 = z11;
            modelB2 = null;
        }
        Survey.Employment employment = survey != null ? survey.f75315b : null;
        boolean z83 = aVar2.d;
        boolean z89 = applicationForm.f75171j;
        if (employment != null) {
            textLocalisedClause2 = textLocalisedClause6;
            TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(R$string.car_insurance_edit_application_cells_employment, null, null, 14);
            TextLocalisedClause textLocalisedClauseF = xl7.d.f(employment.f75325a);
            Occupation occupation = employment.f75326b;
            Clause[] elements = {textLocalisedClauseF, occupation != null ? new TextClause(occupation.f75265b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            modelB3 = b(new RowDelegate.Model("EMPLOYMENT_ITEM", xl7.n.k(R$drawable.uikit_icn_24_services, false, null, 15), textLocalisedClause7, null, 0, new CompositeClause(kotlin.collections.d.L(elements), new DotDividerClause((Integer) null), null, null, 12), null, null, 2, null, z89, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868568), z83);
        } else {
            textLocalisedClause2 = textLocalisedClause6;
            modelB3 = null;
        }
        RowDelegate.Model[] elements2 = {modelB, modelB8, modelB9, modelB2, modelB3};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        List listL = xl7.n.l(kotlin.collections.d.L(elements2), new ListSubheaderDelegate.Model("YOUR_DETAILS_SUBHEADER_ITEM", (Image) null, (Clause) new TextLocalisedClause(R$string.car_insurance_edit_application_headers_your_details, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        boolean z96 = applicationForm.f75171j;
        Survey.CurrentInsurance currentInsurance = survey != null ? survey.f75316c : null;
        boolean z100 = aVar2.e;
        RowDelegate.Model.b.a aVar3 = RowDelegate.Model.b.a.f53266a;
        RowDelegate.Model.b.c cVar = RowDelegate.Model.b.c.f53268a;
        if (currentInsurance != null) {
            TextLocalisedClause textLocalisedClause8 = new TextLocalisedClause(R$string.car_insurance_edit_application_cells_current_insurance, null, null, 14);
            Answer.CurrentInsuranceState currentInsuranceState = currentInsurance.f75322a;
            Answer.AdditionalClaimsDiscount additionalClaimsDiscount2 = currentInsurance.f75324c;
            Answer.NoClaimsDiscount noClaimsDiscount = currentInsurance.f75323b;
            int i2 = r.f107908a[currentInsuranceState.ordinal()];
            z6 = z96;
            if (i2 == 1) {
                z4 = true;
                aVar = aVar3;
                layeredImage = null;
                textLocalisedClause3 = new TextLocalisedClause(R$string.car_insurance_question_current_insurance_not_currently_insured, null, null, 14);
            } else if (i2 == 2) {
                aVar = aVar3;
                Clause[] elements3 = new Clause[2];
                if (noClaimsDiscount != null) {
                    switch (r.f107909b[noClaimsDiscount.ordinal()]) {
                        case 1:
                            textLocalisedClause4 = new TextLocalisedClause(R$string.car_insurance_common_years_no_claims_free_years, null, null, 14);
                            break;
                        case 2:
                            textLocalisedClause4 = e(1);
                            break;
                        case 3:
                            textLocalisedClause4 = e(2);
                            break;
                        case 4:
                            textLocalisedClause4 = e(3);
                            break;
                        case 5:
                            textLocalisedClause4 = e(4);
                            break;
                        case 6:
                            textLocalisedClause4 = e(5);
                            break;
                        case 7:
                            textLocalisedClause4 = new TextLocalisedClause(R$string.car_insurance_common_years_claims_free_x_or_more, u.c(6), null, 12);
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                } else {
                    textLocalisedClause4 = null;
                }
                elements3[0] = textLocalisedClause4;
                z4 = true;
                elements3[1] = additionalClaimsDiscount2 != null ? c(additionalClaimsDiscount2) : null;
                Intrinsics.checkNotNullParameter(elements3, "elements");
                layeredImage = null;
                textLocalisedClause3 = new CompositeClause(kotlin.collections.d.L(elements3), new DotDividerClause((Integer) null), null, null, 12);
            } else {
                if (i2 != 3 && i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                Clause[] elements4 = new Clause[2];
                if (noClaimsDiscount != null) {
                    switch (r.f107909b[noClaimsDiscount.ordinal()]) {
                        case 1:
                            additionalClaimsDiscount = additionalClaimsDiscount2;
                            aVar = aVar3;
                            textLocalisedClause5 = new TextLocalisedClause(R$string.car_insurance_common_years_no_claims_free_years, null, null, 14);
                            break;
                        case 2:
                            additionalClaimsDiscount = additionalClaimsDiscount2;
                            aVar = aVar3;
                            textLocalisedClause5 = f(1);
                            break;
                        case 3:
                            additionalClaimsDiscount = additionalClaimsDiscount2;
                            aVar = aVar3;
                            textLocalisedClause5 = f(2);
                            break;
                        case 4:
                            additionalClaimsDiscount = additionalClaimsDiscount2;
                            aVar = aVar3;
                            textLocalisedClause5 = f(3);
                            break;
                        case 5:
                            additionalClaimsDiscount = additionalClaimsDiscount2;
                            aVar = aVar3;
                            textLocalisedClause5 = f(4);
                            break;
                        case 6:
                            additionalClaimsDiscount = additionalClaimsDiscount2;
                            aVar = aVar3;
                            textLocalisedClause5 = f(5);
                            break;
                        case 7:
                            additionalClaimsDiscount = additionalClaimsDiscount2;
                            aVar = aVar3;
                            textLocalisedClause5 = new TextLocalisedClause(R$string.car_insurance_common_years_claims_free_x_or_more_named_driver, u.c(6), null, 12);
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                } else {
                    additionalClaimsDiscount = additionalClaimsDiscount2;
                    aVar = aVar3;
                    textLocalisedClause5 = null;
                }
                elements4[0] = textLocalisedClause5;
                elements4[1] = additionalClaimsDiscount != null ? c(additionalClaimsDiscount) : null;
                Intrinsics.checkNotNullParameter(elements4, "elements");
                textLocalisedClause3 = new CompositeClause(kotlin.collections.d.L(elements4), new DotDividerClause((Integer) null), null, null, 12);
                z4 = true;
                layeredImage = null;
            }
            modelB4 = b(new RowDelegate.Model("CURRENT_INSURANCE_ITEM", xl7.n.k(R$drawable.uikit_icn_24_insurance, false, layeredImage, 15), textLocalisedClause8, null, 0, textLocalisedClause3, null, null, 2, null, (z3 || !z6) ? false : z4, null, false, !z3 ? cVar : aVar, null, null, null, null, null, null, null, 0, 0, 0, 0, 536852184), z100);
        } else {
            z4 = true;
            z6 = z96;
            aVar = aVar3;
            modelB4 = null;
        }
        if (z3) {
            modelB5 = null;
        } else {
            Survey.Claims claims = survey != null ? survey.d : null;
            modelB5 = claims != null ? b(new RowDelegate.Model("CLAIMS_ITEM", xl7.n.k(R$drawable.uikit_icn_24_statement, false, null, 15), new TextLocalisedClause(R$string.car_insurance_edit_application_cells_claims, null, null, 14), null, 0, xl7.d.a(claims.f75317a), null, null, 2, null, applicationForm.f75171j, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868568), aVar2.f) : null;
        }
        Survey.LicencePenalties licencePenalties = survey != null ? survey.e : null;
        RowDelegate.Model modelB10 = licencePenalties != null ? b(new RowDelegate.Model("PENALTIES_ITEM", xl7.n.k(R$drawable.uikit_icn_24_national_id, false, null, 15), new TextLocalisedClause(R$string.car_insurance_edit_application_cells_penalty, null, null, 14), null, 0, xl7.d.c(licencePenalties.f75329a), null, null, 2, null, applicationForm.f75171j, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868568), aVar2.f107886g) : null;
        List list = applicationForm.e;
        boolean z101 = aVar2.f107887h;
        boolean z102 = applicationForm.f75171j;
        if (list != null) {
            LayeredImage layeredImage2 = null;
            TextLocalisedClause textLocalisedClause9 = new TextLocalisedClause(R$string.car_insurance_edit_application_cells_additional_drivers, null, null, 14);
            if (list.isEmpty()) {
                compositeClause = new TextLocalisedClause(R$string.car_insurance_edit_application_cells_additional_drivers_no_drivers, null, null, 14);
            } else {
                List list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(new TextClause(((AdditionalDriver) it8.next()).a(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                }
                layeredImage2 = null;
                compositeClause = new CompositeClause(arrayList, new DotDividerClause((Integer) null), null, null, 12);
            }
            modelB6 = b(new RowDelegate.Model("ADDITIONAL_DRIVERS_ITEM", xl7.n.k(R$drawable.uikit_icn_24_add_contact, false, layeredImage2, 15), textLocalisedClause9, null, 0, compositeClause, null, null, 2, null, z102, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868568), z101);
        } else {
            modelB6 = null;
        }
        LocalDate localDate = applicationForm.f75167b;
        boolean z103 = aVar2.i;
        if (localDate != null) {
            modelB7 = b(new RowDelegate.Model("START_DATE_ITEM", xl7.n.k(R$drawable.uikit_icn_24_calendar_date, false, null, 15), new TextLocalisedClause(R$string.car_insurance_edit_application_cells_start_date, null, null, 14), null, 0, xl7.n.e(localDate, TimeClause.Format.DateLong.f57962b), null, null, 2, null, (z3 || !z6) ? false : z4, null, false, !z3 ? cVar : aVar, null, null, null, null, null, null, null, 0, 0, 0, 0, 536852184), z103);
        } else {
            modelB7 = null;
        }
        Map map = applicationForm.f;
        RowDelegate.Model[] elements5 = {modelB4, modelB5, modelB10, modelB6, modelB7, (map == null || map.isEmpty()) ? null : b(new RowDelegate.Model("ELIGIBILITY_ITEM", xl7.n.k(R$drawable.uikit_icn_24_check_verification, false, null, 15), new TextLocalisedClause(R$string.car_insurance_edit_application_cells_eligibility, null, null, 14), null, 0, null, null, null, 0, null, applicationForm.f75171j, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856), aVar2.f107888j)};
        Intrinsics.checkNotNullParameter(elements5, "elements");
        return new i(d0.E0(v.l(z3 ? new TextDelegate.Model("FOOTER_ITEM", new TextLocalisedClause(R$string.car_insurance_edit_application_footer_automated_decision_making, u.c(new TextLocalisedClause(R$string.car_insurance_edit_application_footer_see_more, null, new Click(30, (Integer) null, (Object) null, "FOOTER_ITEM_ACTION", false), 10)), null, 12), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036) : null), d0.E0(xl7.n.l(kotlin.collections.d.L(elements5), new ListSubheaderDelegate.Model("INSURANCE_DETAILS_SUBHEADER_ITEM", (Image) null, (Clause) new TextLocalisedClause(R$string.car_insurance_edit_application_headers_insurance_details, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530)), listL)), textLocalisedClause2, compositeClause2, z29, z);
    }
}
