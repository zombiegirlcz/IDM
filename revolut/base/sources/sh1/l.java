package sh1;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class l {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f263376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f263377b;

    public l(j form, k search) {
        Intrinsics.checkNotNullParameter(form, "form");
        Intrinsics.checkNotNullParameter(search, "search");
        this.f263376a = form;
        this.f263377b = search;
    }

    public static l a(l lVar, j form, k search, int i) {
        if ((i & 1) != 0) {
            form = lVar.f263376a;
        }
        if ((i & 2) != 0) {
            search = lVar.f263377b;
        }
        lVar.getClass();
        Intrinsics.checkNotNullParameter(form, "form");
        Intrinsics.checkNotNullParameter(search, "search");
        return new l(form, search);
    }

    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6 */
    public static l b(l lVar, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, int i) {
        Integer num21;
        Integer num22;
        Integer num23;
        ?? r87;
        Clause postCodeLookup;
        Integer num24;
        Clause searchAddress;
        Clause clause;
        Integer num25;
        Clause addressLine1;
        Integer num26;
        Clause textLocalisedClause;
        Integer num27;
        Clause textLocalisedClause2;
        Clause clause2;
        Clause textLocalisedClause3;
        Clause clause3;
        Clause city;
        Clause clause4;
        Clause textLocalisedClause4;
        Integer num28 = (i & 8) != 0 ? null : num;
        Integer num29 = (i & 16) != 0 ? null : num2;
        Integer num30 = (i & 64) != 0 ? null : num3;
        Integer num31 = (i & 128) != 0 ? null : num4;
        Integer num32 = (i & 256) != 0 ? null : num5;
        Integer num33 = (i & 512) != 0 ? null : num6;
        Integer num34 = (i & 2048) != 0 ? null : num7;
        Integer num35 = (i & 4096) != 0 ? null : num8;
        Integer num36 = (i & 8192) != 0 ? null : num9;
        Integer num37 = (i & 16384) != 0 ? null : num10;
        Integer num38 = (65536 & i) != 0 ? null : num11;
        Integer num39 = (131072 & i) != 0 ? null : num12;
        Integer num40 = (262144 & i) != 0 ? null : num13;
        Integer num41 = (i & 524288) != 0 ? null : num14;
        Integer num42 = (i & PKIFailureInfo.badCertTemplate) != 0 ? null : num15;
        Integer num43 = (i & PKIFailureInfo.badSenderNonce) != 0 ? null : num16;
        Integer num44 = (i & 8388608) != 0 ? null : num17;
        Integer num45 = (i & 16777216) != 0 ? null : num18;
        Integer num46 = (i & 33554432) != 0 ? null : num19;
        Integer num47 = (i & 67108864) != 0 ? null : num20;
        j jVar = lVar.f263376a;
        Integer num48 = num47;
        Clause selectCountry = jVar.f263354a;
        Integer num49 = num28;
        Clause skip = jVar.f263355b;
        Integer num50 = num29;
        Clause continueAction = jVar.f263356c;
        Integer num51 = num30;
        if (num49 != null) {
            num21 = num31;
            num22 = num32;
            num23 = num33;
            r87 = 0;
            postCodeLookup = new TextLocalisedClause(num49.intValue(), null, null, 14);
        } else {
            num21 = num31;
            num22 = num32;
            num23 = num33;
            r87 = 0;
            postCodeLookup = jVar.d;
        }
        if (num50 != null) {
            int iIntValue = num50.intValue();
            num24 = num34;
            searchAddress = new TextLocalisedClause(iIntValue, r87, r87, 14);
        } else {
            num24 = num34;
            searchAddress = jVar.e;
        }
        Clause clause5 = jVar.f;
        if (num51 != null) {
            clause = clause5;
            int iIntValue2 = num51.intValue();
            num25 = num35;
            addressLine1 = new TextLocalisedClause(iIntValue2, r87, r87, 14);
        } else {
            clause = clause5;
            num25 = num35;
            addressLine1 = jVar.f263357g;
        }
        if (num21 != null) {
            int iIntValue3 = num21.intValue();
            num26 = num36;
            textLocalisedClause = new TextLocalisedClause(iIntValue3, r87, r87, 14);
        } else {
            num26 = num36;
            textLocalisedClause = jVar.f263358h;
        }
        Clause clause6 = textLocalisedClause;
        Clause addressLine2 = num22 != null ? new TextLocalisedClause(num22.intValue(), r87, r87, 14) : jVar.i;
        if (num23 != null) {
            num27 = num37;
            textLocalisedClause2 = new TextLocalisedClause(num23.intValue(), r87, r87, 14);
        } else {
            num27 = num37;
            textLocalisedClause2 = jVar.f263359j;
        }
        Clause clause7 = textLocalisedClause2;
        Clause clause8 = jVar.k;
        if (num24 != null) {
            clause2 = clause8;
            textLocalisedClause3 = new TextLocalisedClause(num24.intValue(), r87, r87, 14);
        } else {
            clause2 = clause8;
            textLocalisedClause3 = jVar.f263360l;
        }
        Clause clause9 = textLocalisedClause3;
        Clause textLocalisedClause5 = num25 != null ? new TextLocalisedClause(num25.intValue(), r87, r87, 14) : jVar.f263361m;
        Clause textLocalisedClause6 = num26 != null ? new TextLocalisedClause(num26.intValue(), r87, r87, 14) : jVar.f263362n;
        Clause textLocalisedClause7 = num27 != null ? new TextLocalisedClause(num27.intValue(), r87, r87, 14) : jVar.o;
        Clause clause10 = jVar.f263363p;
        Clause textLocalisedClause8 = num38 != null ? new TextLocalisedClause(num38.intValue(), r87, r87, 14) : jVar.f263364q;
        Clause textLocalisedClause9 = num39 != null ? new TextLocalisedClause(num39.intValue(), r87, r87, 14) : jVar.f263365r;
        Clause textLocalisedClause10 = num40 != null ? new TextLocalisedClause(num40.intValue(), r87, r87, 14) : jVar.f263366s;
        Clause postCode = num41 != null ? new TextLocalisedClause(num41.intValue(), r87, r87, 14) : jVar.f263367t;
        Clause textLocalisedClause11 = num42 != null ? new TextLocalisedClause(num42.intValue(), r87, r87, 14) : jVar.u;
        Clause neighbourhood = num43 != null ? new TextLocalisedClause(num43.intValue(), r87, r87, 14) : jVar.v;
        Clause clause11 = jVar.f263368w;
        if (num44 != null) {
            clause3 = clause10;
            city = new TextLocalisedClause(num44.intValue(), r87, r87, 14);
        } else {
            clause3 = clause10;
            city = jVar.f263369x;
        }
        if (num45 != null) {
            clause4 = clause11;
            textLocalisedClause4 = new TextLocalisedClause(num45.intValue(), r87, r87, 14);
        } else {
            clause4 = clause11;
            textLocalisedClause4 = jVar.f263370y;
        }
        Clause clause12 = textLocalisedClause4;
        Clause region = num46 != null ? new TextLocalisedClause(num46.intValue(), r87, r87, 14) : jVar.z;
        Clause textLocalisedClause12 = num48 != null ? new TextLocalisedClause(num48.intValue(), r87, r87, 14) : jVar.A;
        Clause optional = jVar.B;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(selectCountry, "selectCountry");
        Intrinsics.checkNotNullParameter(skip, "skip");
        Intrinsics.checkNotNullParameter(continueAction, "continueAction");
        Intrinsics.checkNotNullParameter(postCodeLookup, "postCodeLookup");
        Intrinsics.checkNotNullParameter(searchAddress, "searchAddress");
        Intrinsics.checkNotNullParameter(addressLine1, "addressLine1");
        Intrinsics.checkNotNullParameter(addressLine2, "addressLine2");
        Intrinsics.checkNotNullParameter(postCode, "postCode");
        Intrinsics.checkNotNullParameter(neighbourhood, "neighbourhood");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(optional, "optional");
        return a(lVar, new j(selectCountry, skip, continueAction, postCodeLookup, searchAddress, clause, addressLine1, clause6, addressLine2, clause7, clause2, clause9, textLocalisedClause5, textLocalisedClause6, textLocalisedClause7, clause3, textLocalisedClause8, textLocalisedClause9, textLocalisedClause10, postCode, textLocalisedClause11, neighbourhood, clause4, city, clause12, region, textLocalisedClause12, optional), null, 2);
    }

    public static l c(l lVar, Integer num, Integer num2, Integer num3, int i) {
        Integer num4 = (i & 1) != 0 ? null : num;
        Integer num5 = (i & 2) != 0 ? null : num2;
        Integer num6 = (i & 8) != 0 ? null : num3;
        k kVar = lVar.f263377b;
        Clause searchAddressHint = num4 != null ? new TextLocalisedClause(num4.intValue(), null, null, 14) : kVar.f263371a;
        Clause searchPostcodeHint = num5 != null ? new TextLocalisedClause(num5.intValue(), null, null, 14) : kVar.f263372b;
        Clause loadingMessage = kVar.f263373c;
        Clause noResultsFound = num6 != null ? new TextLocalisedClause(num6.intValue(), null, null, 14) : kVar.d;
        Clause addressNotHere = kVar.e;
        Clause somethingWentWrong = kVar.f;
        Clause errorDescription = kVar.f263374g;
        Clause invalidPostcode = kVar.f263375h;
        Clause enterValidPostcode = kVar.i;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(searchAddressHint, "searchAddressHint");
        Intrinsics.checkNotNullParameter(searchPostcodeHint, "searchPostcodeHint");
        Intrinsics.checkNotNullParameter(loadingMessage, "loadingMessage");
        Intrinsics.checkNotNullParameter(noResultsFound, "noResultsFound");
        Intrinsics.checkNotNullParameter(addressNotHere, "addressNotHere");
        Intrinsics.checkNotNullParameter(somethingWentWrong, "somethingWentWrong");
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
        Intrinsics.checkNotNullParameter(invalidPostcode, "invalidPostcode");
        Intrinsics.checkNotNullParameter(enterValidPostcode, "enterValidPostcode");
        return a(lVar, null, new k(searchAddressHint, searchPostcodeHint, loadingMessage, noResultsFound, addressNotHere, somethingWentWrong, errorDescription, invalidPostcode, enterValidPostcode), 1);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f263376a, lVar.f263376a) && Intrinsics.f(this.f263377b, lVar.f263377b);
    }

    public final int hashCode() {
        return this.f263377b.hashCode() + (this.f263376a.hashCode() * 31);
    }
}
