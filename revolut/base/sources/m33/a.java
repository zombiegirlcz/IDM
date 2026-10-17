package m33;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.address.models.Address;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:104:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.address.models.Address a(com.revolut.feature.address.models.Address r13, gk3.d r14) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m33.a.a(com.revolut.feature.address.models.Address, gk3.d):com.revolut.feature.address.models.Address");
    }

    public static final Address b(Address address, gk3.d dVar) {
        Intrinsics.checkNotNullParameter(address, "<this>");
        if (dVar == null) {
            return address;
        }
        String streetLine1 = dVar.i() != null ? address.getStreetLine1() : null;
        String streetLine2 = dVar.j() != null ? address.getStreetLine2() : null;
        String street = dVar.h() != null ? address.getStreet() : null;
        String streetType = dVar.k() != null ? address.getStreetType() : null;
        String houseNumber = dVar.c() != null ? address.getHouseNumber() : null;
        String flat = dVar.b() != null ? address.getFlat() : null;
        String neighborhood = dVar.e() != null ? address.getNeighborhood() : null;
        return new Address(streetLine1, streetLine2, dVar.g() != null ? address.getRegion() : null, dVar.a() != null ? address.getCity() : null, dVar.f() != null ? address.getPostcode() : null, address.getCountry(), null, streetType, street, houseNumber, flat, neighborhood, null, null, dVar.d() != null ? address.getLandmark() : null, 12352, null);
    }

    public static final CompositeClause c(Address address) {
        Intrinsics.checkNotNullParameter(address, "<this>");
        TextClause textClause = new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClauseE = e(address.getStreetLine1());
        TextClause textClauseE2 = e(address.getStreetLine2());
        TextClause textClauseE3 = e(address.getStreetType());
        TextClause textClauseE4 = e(address.getStreet());
        TextClause textClauseE5 = e(address.getHouseNumber());
        TextClause textClauseE6 = e(address.getFlat());
        TextClause textClauseE7 = e(address.getNeighborhood());
        TextClause textClauseE8 = e(address.getLandmark());
        TextClause textClauseE9 = e(address.getPostcode());
        TextClause textClauseE10 = e(address.getRegion());
        TextClause textClauseE11 = e(address.getCity());
        wi0.a aVar = wi0.b.Companion;
        String country = address.getCountry();
        aVar.getClass();
        Object[] elements = {textClauseE11, new CountryClause(wi0.a.a(country), null)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] elements2 = {textClauseE, textClauseE2, textClauseE3, textClauseE4, textClauseE5, textClauseE6, textClauseE7, textClauseE8, textClauseE9, textClauseE10, new CompositeClause(kotlin.collections.d.L(elements), new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12)};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements2), textClause, null, null, 12);
    }

    public static final boolean d(Address address, Address address2) {
        String lowerCase;
        String lowerCase2;
        String lowerCase3;
        String lowerCase4;
        String lowerCase5;
        String lowerCase6;
        String lowerCase7;
        String lowerCase8;
        String lowerCase9;
        String lowerCase10;
        String lowerCase11;
        String lowerCase12;
        String lowerCase13;
        String lowerCase14;
        String lowerCase15;
        String lowerCase16;
        String lowerCase17;
        String lowerCase18;
        String lowerCase19;
        String lowerCase20;
        String lowerCase21;
        Intrinsics.checkNotNullParameter(address, "<this>");
        Intrinsics.checkNotNullParameter(address2, "address");
        String streetLine1 = address.getStreetLine1();
        String lowerCase22 = null;
        if (streetLine1 != null) {
            lowerCase = streetLine1.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        String streetLine12 = address2.getStreetLine1();
        if (streetLine12 != null) {
            lowerCase2 = streetLine12.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        } else {
            lowerCase2 = null;
        }
        if (!Intrinsics.f(lowerCase, lowerCase2)) {
            return false;
        }
        String streetLine2 = address.getStreetLine2();
        if (streetLine2 != null) {
            lowerCase3 = streetLine2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
        } else {
            lowerCase3 = null;
        }
        String streetLine22 = address2.getStreetLine2();
        if (streetLine22 != null) {
            lowerCase4 = streetLine22.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
        } else {
            lowerCase4 = null;
        }
        if (!Intrinsics.f(lowerCase3, lowerCase4)) {
            return false;
        }
        String street = address.getStreet();
        if (street != null) {
            lowerCase5 = street.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase5, "toLowerCase(...)");
        } else {
            lowerCase5 = null;
        }
        String street2 = address2.getStreet();
        if (street2 != null) {
            lowerCase6 = street2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase6, "toLowerCase(...)");
        } else {
            lowerCase6 = null;
        }
        if (!Intrinsics.f(lowerCase5, lowerCase6)) {
            return false;
        }
        String streetType = address.getStreetType();
        if (streetType != null) {
            lowerCase7 = streetType.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase7, "toLowerCase(...)");
        } else {
            lowerCase7 = null;
        }
        String streetType2 = address2.getStreetType();
        if (streetType2 != null) {
            lowerCase8 = streetType2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase8, "toLowerCase(...)");
        } else {
            lowerCase8 = null;
        }
        if (!Intrinsics.f(lowerCase7, lowerCase8)) {
            return false;
        }
        String houseNumber = address.getHouseNumber();
        if (houseNumber != null) {
            lowerCase9 = houseNumber.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase9, "toLowerCase(...)");
        } else {
            lowerCase9 = null;
        }
        String houseNumber2 = address2.getHouseNumber();
        if (houseNumber2 != null) {
            lowerCase10 = houseNumber2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase10, "toLowerCase(...)");
        } else {
            lowerCase10 = null;
        }
        if (!Intrinsics.f(lowerCase9, lowerCase10)) {
            return false;
        }
        String flat = address.getFlat();
        if (flat != null) {
            lowerCase11 = flat.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase11, "toLowerCase(...)");
        } else {
            lowerCase11 = null;
        }
        String flat2 = address2.getFlat();
        if (flat2 != null) {
            lowerCase12 = flat2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase12, "toLowerCase(...)");
        } else {
            lowerCase12 = null;
        }
        if (!Intrinsics.f(lowerCase11, lowerCase12)) {
            return false;
        }
        String region = address.getRegion();
        if (region != null) {
            lowerCase13 = region.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase13, "toLowerCase(...)");
        } else {
            lowerCase13 = null;
        }
        String region2 = address2.getRegion();
        if (region2 != null) {
            lowerCase14 = region2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase14, "toLowerCase(...)");
        } else {
            lowerCase14 = null;
        }
        if (!Intrinsics.f(lowerCase13, lowerCase14)) {
            return false;
        }
        String city = address.getCity();
        if (city != null) {
            lowerCase15 = city.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase15, "toLowerCase(...)");
        } else {
            lowerCase15 = null;
        }
        String city2 = address2.getCity();
        if (city2 != null) {
            lowerCase16 = city2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase16, "toLowerCase(...)");
        } else {
            lowerCase16 = null;
        }
        if (!Intrinsics.f(lowerCase15, lowerCase16)) {
            return false;
        }
        String postcode = address.getPostcode();
        if (postcode != null) {
            lowerCase17 = postcode.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase17, "toLowerCase(...)");
        } else {
            lowerCase17 = null;
        }
        String postcode2 = address2.getPostcode();
        if (postcode2 != null) {
            lowerCase18 = postcode2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase18, "toLowerCase(...)");
        } else {
            lowerCase18 = null;
        }
        if (!Intrinsics.f(lowerCase17, lowerCase18)) {
            return false;
        }
        String country = address.getCountry();
        Locale locale = Locale.ROOT;
        String lowerCase23 = country.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase23, "toLowerCase(...)");
        String lowerCase24 = address2.getCountry().toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase24, "toLowerCase(...)");
        if (!Intrinsics.f(lowerCase23, lowerCase24)) {
            return false;
        }
        String neighborhood = address.getNeighborhood();
        if (neighborhood != null) {
            lowerCase19 = neighborhood.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase19, "toLowerCase(...)");
        } else {
            lowerCase19 = null;
        }
        String neighborhood2 = address2.getNeighborhood();
        if (neighborhood2 != null) {
            lowerCase20 = neighborhood2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase20, "toLowerCase(...)");
        } else {
            lowerCase20 = null;
        }
        if (!Intrinsics.f(lowerCase19, lowerCase20)) {
            return false;
        }
        String landmark = address.getLandmark();
        if (landmark != null) {
            lowerCase21 = landmark.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase21, "toLowerCase(...)");
        } else {
            lowerCase21 = null;
        }
        String landmark2 = address2.getLandmark();
        if (landmark2 != null) {
            lowerCase22 = landmark2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase22, "toLowerCase(...)");
        }
        return Intrinsics.f(lowerCase21, lowerCase22);
    }

    public static final TextClause e(String str) {
        if (str != null) {
            String str2 = !d0.W(str) ? str : null;
            if (str2 != null) {
                return new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
        }
        return null;
    }
}
