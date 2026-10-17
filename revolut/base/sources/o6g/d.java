package o6g;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.model.TravelFlightsPassengerField$Selection$Option;
import ip0.lr;
import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.text.Regex;
import m7g.j;
import org.jetbrains.annotations.NotNull;
import p6g.h;
import p6g.i;
import p6g.n;
import p6g.p;
import p6g.q;
import p6g.r;
import p6g.s;
import p6g.v;
import p6g.w;
import p6g.x;
import p6g.y;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f222596a = new Regex("^[\\p{L}\\p{M} '’-]+$");

    public static final class a {
        private a() {
        }
    }

    public static w a(cam.f params) {
        int i;
        int i2;
        i iVar;
        Iterable iterableC;
        Intrinsics.checkNotNullParameter(params, "params");
        p7g.b bVarL = params.l();
        String strB = b(params.o(), bVarL);
        int i3 = e.f222598b[bVarL.ordinal()];
        Regex regex = f222596a;
        switch (i3) {
            case 1:
                return new v(strB, bVarL, new TextLocalisedClause(R$string.travel_flights_passenger_details_first_name, null, null, 14), zhm.v.k(new x(new TextLocalisedClause(R$string.travel_flights_passenger_details_first_name_error, null, null, 14)), new r(new TextLocalisedClause(R$string.travel_flights_passenger_details_first_name_error, null, null, 14)), new s(regex, new TextLocalisedClause(R$string.travel_flights_passenger_details_name_invalid_input, null, null, 14))), new lr(532577));
            case 2:
                return new v(strB, bVarL, new TextLocalisedClause(R$string.travel_flights_passenger_details_last_name, null, null, 14), zhm.v.k(new x(new TextLocalisedClause(R$string.travel_flights_passenger_details_last_name_error, null, null, 14)), new r(new TextLocalisedClause(R$string.travel_flights_passenger_details_last_name_error, null, null, 14)), new s(regex, new TextLocalisedClause(R$string.travel_flights_passenger_details_name_invalid_input, null, null, 14))), new lr(532577));
            case 3:
                return new p(strB, bVarL, new TextLocalisedClause(R$string.travel_flights_passenger_details_gender, null, null, 14), null, u.c(new x(new TextLocalisedClause(R$string.travel_flights_passenger_details_gender_error, null, null, 14))), null, zhm.v.k(new TravelFlightsPassengerField$Selection$Option(new TextLocalisedClause(R$string.travel_flights_gender_selection_male, null, null, 14), "MALE"), new TravelFlightsPassengerField$Selection$Option(new TextLocalisedClause(R$string.travel_flights_gender_selection_female, null, null, 14), "FEMALE")));
            case 4:
                g gVar = params instanceof g ? (g) params : null;
                if (gVar == null) {
                    throw new IllegalStateException(j6.a.q("DateOfBirthParams expected for DATE_OF_BIRTH, but received ", o0.f186429a.b(params.getClass()).m()).toString());
                }
                j jVar = gVar.f222602c;
                LocalDate localDate = gVar.d;
                LocalDate localDate2 = gVar.e;
                LocalDate localDate3 = gVar.f;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.travel_flights_passenger_details_date_of_birth, null, null, 14);
                x xVar = new x(new TextLocalisedClause(R$string.travel_flights_passenger_details_date_of_birth_error, null, null, 14));
                p6g.g gVar2 = new p6g.g(new TextLocalisedClause(R$string.travel_flights_passenger_details_date_of_birth_invalid_input, null, null, 14));
                p6g.f fVar = new p6g.f(new TextLocalisedClause(R$string.travel_flights_passenger_details_date_of_birth_invalid_input, null, null, 14));
                if (localDate2 == null || localDate3 == null) {
                    i = 2;
                    i2 = 1;
                    iVar = null;
                } else {
                    if (localDate2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    h hVar = new h(localDate2, localDate);
                    if (localDate3 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    h hVar2 = new h(localDate3, localDate);
                    int i5 = R$string.travel_flights_passenger_details_date_of_birth_age_changed_error;
                    m70.a.c(t0.f186434a);
                    i = 2;
                    i2 = 1;
                    iVar = new i(hVar, hVar2, new TextLocalisedClause(i5, u.c(""), null, 12));
                }
                y[] elements = new y[4];
                elements[0] = xVar;
                elements[i2] = gVar2;
                elements[i] = fVar;
                elements[3] = iVar;
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                int i6 = e.f222597a[jVar.ordinal()];
                if (i6 == i2) {
                    iterableC = u.c(new p6g.e(18L, localDate, new TextLocalisedClause(R$string.travel_flights_passenger_details_date_of_birth_traveller_type_mismatch, null, null, 14)));
                } else if (i6 == i) {
                    iterableC = zhm.v.k(new p6g.e(2L, localDate, new TextLocalisedClause(R$string.travel_flights_passenger_details_date_of_birth_traveller_type_mismatch, null, null, 14)), new p6g.d(18L, localDate, new TextLocalisedClause(R$string.travel_flights_passenger_details_date_of_birth_traveller_type_mismatch, null, null, 14)));
                } else if (i6 == 3) {
                    iterableC = u.c(new p6g.d(2L, localDate, new TextLocalisedClause(R$string.travel_flights_passenger_details_date_of_birth_traveller_type_mismatch, null, null, 14)));
                } else {
                    if (i6 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unexpected traveller type: " + jVar);
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "TravelFlightsPassengerFieldMapper", null, illegalArgumentException, h0Var);
                    iterableC = f0.f322471a;
                }
                return new n(strB, bVarL, textLocalisedClause, d0.E0(iterableC, listL));
            case 5:
                return new v(strB, bVarL, new TextLocalisedClause(R$string.travel_flights_passenger_details_passport_number, null, null, 14), zhm.v.k(new x(new TextLocalisedClause(R$string.travel_flights_passenger_details_passport_number_error, null, null, 14)), new q(new TextLocalisedClause(R$string.travel_flights_passenger_details_passport_number_invalid_input, null, null, 14))), new lr(528385));
            case 6:
                return new p6g.b(strB, bVarL, new TextLocalisedClause(R$string.travel_flights_passenger_details_passport_issuing_country, null, null, 14), null, u.c(new x(new TextLocalisedClause(R$string.travel_flights_passenger_details_passport_issuing_country_error, null, null, 14))), null);
            case 7:
                return new n(strB, bVarL, new TextLocalisedClause(R$string.travel_flights_passenger_details_passport_issuing_date, null, null, 14), zhm.v.k(new x(new TextLocalisedClause(R$string.travel_flights_passenger_details_passport_issuing_date_error, null, null, 14)), new p6g.g(new TextLocalisedClause(R$string.travel_flights_passenger_details_passport_issuing_date_invalid_input, null, null, 14)), new p6g.f(new TextLocalisedClause(R$string.travel_flights_passenger_details_passport_issuing_date_invalid_input, null, null, 14))));
            case 8:
                return new n(strB, bVarL, new TextLocalisedClause(R$string.travel_flights_passenger_details_passport_expiry_date, null, null, 14), zhm.v.k(new x(new TextLocalisedClause(R$string.travel_flights_passenger_details_passport_expiry_date_error, null, null, 14)), new p6g.g(new TextLocalisedClause(R$string.travel_flights_passenger_details_passport_expiry_date_invalid_input, null, null, 14)), new p6g.c(new TextLocalisedClause(R$string.travel_flights_passenger_details_passport_expiry_date_invalid_input, null, null, 14))));
            case 9:
                return new v(strB, bVarL, new TextLocalisedClause(R$string.travel_flights_passenger_details_passport_issuing_city, null, null, 14), zhm.v.k(new x(new TextLocalisedClause(R$string.travel_flights_passenger_details_passport_issuing_city_error, null, null, 14)), new r(new TextLocalisedClause(R$string.travel_flights_passenger_details_passport_issuing_city_error, null, null, 14))), new lr(8193));
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static String b(String passengerRef, p7g.b code) {
        Intrinsics.checkNotNullParameter(passengerRef, "passengerRef");
        Intrinsics.checkNotNullParameter(code, "code");
        return a0.d.s("FIELD_ITEM_ID_", passengerRef, "_", code.name());
    }
}
