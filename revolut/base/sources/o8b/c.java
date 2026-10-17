package o8b;

import com.revolut.domain.models.user.UserCompanyRegion;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.retail.countries.api.CountriesApi$FeatureToggles$MockIndiaRegion;
import do3.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.r0;
import zhm.v;
import zhm.w;
import zhm.y0;
import zhm.z;
import zhm.z0;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements n8b.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f222983j;
    public static final Map k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z80.b f222984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk3.a f222985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qd0.b f222986c;
    public final ang.a d;
    public final t70.g e;
    public final gte.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f222987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x80.a f222988h;
    public final l61.a i;

    static {
        wi0.b.Companion.getClass();
        Pair pair = new Pair(wi0.b.f297770q3, y0.c("AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DC", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY"));
        Pair pair2 = new Pair(wi0.b.E, y0.c("AB", "BC", "MB", "NB", "NL", "NS", "NT", "NU", "ON", "PE", "QC", "SK", "YT"));
        Pair pair3 = new Pair(wi0.b.f297756l, y0.c("ACT", "NSW", "NT", "QLD", "SA", "TAS", "VIC", "WA"));
        Pair pair4 = new Pair(wi0.b.X0, z0.f("北海道", "青森県", "岩手県", "宮城県", "秋田県", "山形県", "福島県", "茨城県", "栃木県", "群馬県", "埼玉県", "千葉県", "東京都", "神奈川県", "新潟県", "富山県", "石川県", "福井県", "山梨県", "長野県", "岐阜県", "静岡県", "愛知県", "三重県", "滋賀県", "京都府", "大阪府", "兵庫県", "奈良県", "和歌山県", "鳥取県", "島根県", "岡山県", "広島県", "山口県", "徳島県", "香川県", "愛媛県", "高知県", "福岡県", "佐賀県", "長崎県", "熊本県", "大分県", "宮崎県", "鹿児島県", "沖縄県"));
        Pair pair5 = new Pair(wi0.b.A, y0.c("AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"));
        wi0.b bVar = wi0.b.n3;
        String[] elements = {"Kyiv", "Kyiv Oblast", "Cherkasy Oblast", "Chernihiv Oblast", "Chernivtsi Oblast", "Dnipropetrovsk Oblast", "Ivano-Frankivsk Oblast", "Kharkiv Oblast", "Khmelnytskyi Oblast", "Kirovohrad Oblast", "Lviv Oblast", "Mykolaiv Oblast", "Odesa Oblast", "Poltava Oblast", "Rivne Oblast", "Sumy Oblast", "Ternopil Oblast", "Vinnytsia Oblast", "Volyn Oblast", "Zakarpattya Oblast", "Zhytomyr Oblast", "Donetsk Oblast", "Kherson Oblast", "Luhansk Oblast", "Zaporizhzhia Oblast", "Autonomous Republic of Crimea", "Sevastopol"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f222983j = r0.k(pair, pair2, pair3, pair4, pair5, new Pair(bVar, kotlin.collections.d.y0(elements)), new Pair(wi0.b.f297734c, y0.c("AZ", "DU", "SH", "AJ", "UQ", "RK", "FU")), new Pair(wi0.b.N, y0.c("AH", "BJ", "CQ", "FJ", "GS", "GD", "GX", "GZ", "HI", "HE", "HL", "HA", "HB", "HN", "JS", "JX", "JL", "LN", "NM", "NX", "QH", "SN", "SD", "SH", "SX", "SC", "TJ", "XJ", "XZ", "YN", "ZJ")));
        String[] elements2 = {"Donetsk Oblast", "Kherson Oblast", "Luhansk Oblast", "Zaporizhzhia Oblast", "Autonomous Republic of Crimea", "Sevastopol"};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        k = q0.c(new Pair(bVar, kotlin.collections.d.y0(elements2)));
    }

    public c(z80.b phoneToolsProvider, fk3.a configurationInteractor, qd0.b languageProvider, ang.a legacyUserProvider, t70.g localization, gte.a featureToggleInteractor, f countrySuggestions, x80.a packageNameProvider, l61.a userCompanyInteractor) {
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(legacyUserProvider, "legacyUserProvider");
        Intrinsics.checkNotNullParameter(localization, "localization");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(countrySuggestions, "countrySuggestions");
        Intrinsics.checkNotNullParameter(packageNameProvider, "packageNameProvider");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        this.f222984a = phoneToolsProvider;
        this.f222985b = configurationInteractor;
        this.f222986c = languageProvider;
        this.d = legacyUserProvider;
        this.e = localization;
        this.f = featureToggleInteractor;
        this.f222987g = countrySuggestions;
        this.f222988h = packageNameProvider;
        this.i = userCompanyInteractor;
    }

    public final List a() {
        ik3.c cVar = (ik3.c) this.f222985b;
        HashSet hashSet = new HashSet(cVar.b());
        List listC = ((ik3.g) cVar.f161878a).f161888g.b().c();
        ArrayList arrayList = new ArrayList(w.t(listC, 10));
        Iterator it8 = listC.iterator();
        while (it8.hasNext()) {
            arrayList.add(((wi0.b) it8.next()).f297794a);
        }
        if (!arrayList.isEmpty()) {
            hashSet.removeAll(new HashSet(arrayList));
        }
        return d0.d1(d0.b1(new ArrayList(hashSet)));
    }

    public final String b(String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Locale localeA = ((s80.b) this.f222986c).a();
        String displayCountry = new Locale(localeA.getLanguage(), countryCode).getDisplayCountry(localeA);
        Intrinsics.h(displayCountry);
        if (kotlin.text.d0.W(displayCountry)) {
            displayCountry = null;
        }
        return displayCountry == null ? countryCode : displayCountry;
    }

    public final ArrayList c(List list, boolean z) {
        ArrayList arrayListY = com.google.android.gms.internal.mlkit_vision_face.a.y("allowedCountries", list);
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            String str = (String) it8.next();
            wi0.b.Companion.getClass();
            String strJ = this.f222984a.j(wi0.a.a(str));
            if (strJ != null) {
                arrayListY.add(new r8b.a(str, b(str), "+".concat(strJ)));
            }
        }
        if (z && arrayListY.size() > 1) {
            z.w(arrayListY, new b());
        }
        return arrayListY;
    }

    public final List d(Locale locale) {
        String country = locale != null ? locale.getCountry() : null;
        if (Intrinsics.f(country, "AU")) {
            wi0.a aVar = wi0.b.Companion;
            aVar.getClass();
            wi0.b bVar = wi0.b.f297756l;
            aVar.getClass();
            wi0.b bVar2 = wi0.b.p0;
            aVar.getClass();
            wi0.b bVar3 = wi0.b.O0;
            aVar.getClass();
            wi0.b bVar4 = wi0.b.N;
            aVar.getClass();
            wi0.b bVar5 = wi0.b.l2;
            aVar.getClass();
            return v.k(bVar, bVar2, bVar3, bVar4, bVar5, wi0.b.r2);
        }
        if (Intrinsics.f(country, "BR")) {
            return f0.f322471a;
        }
        String language = locale != null ? locale.getLanguage() : null;
        if (language != null) {
            int iHashCode = language.hashCode();
            if (iHashCode != 3201) {
                if (iHashCode != 3276) {
                    if (iHashCode == 3371 && language.equals("it")) {
                        wi0.a aVar2 = wi0.b.Companion;
                        aVar2.getClass();
                        wi0.b bVar6 = wi0.b.T0;
                        aVar2.getClass();
                        return v.k(bVar6, wi0.b.J);
                    }
                } else if (language.equals("fr")) {
                    wi0.a aVar3 = wi0.b.Companion;
                    aVar3.getClass();
                    wi0.b bVar7 = wi0.b.f297760n0;
                    aVar3.getClass();
                    wi0.b bVar8 = wi0.b.E;
                    aVar3.getClass();
                    wi0.b bVar9 = wi0.b.f297771r;
                    aVar3.getClass();
                    wi0.b bVar10 = wi0.b.J;
                    aVar3.getClass();
                    return v.k(bVar7, bVar8, bVar9, bVar10, wi0.b.f297788x1);
                }
            } else if (language.equals("de")) {
                wi0.a aVar4 = wi0.b.Companion;
                aVar4.getClass();
                wi0.b bVar11 = wi0.b.W;
                aVar4.getClass();
                wi0.b bVar12 = wi0.b.k;
                aVar4.getClass();
                wi0.b bVar13 = wi0.b.J;
                aVar4.getClass();
                wi0.b bVar14 = wi0.b.T0;
                aVar4.getClass();
                return v.k(bVar11, bVar12, bVar13, bVar14, wi0.b.f297771r);
            }
        }
        wi0.a aVar5 = wi0.b.Companion;
        aVar5.getClass();
        wi0.b bVar15 = wi0.b.p0;
        aVar5.getClass();
        wi0.b bVar16 = wi0.b.f297760n0;
        aVar5.getClass();
        wi0.b bVar17 = wi0.b.f297770q3;
        aVar5.getClass();
        wi0.b bVar18 = wi0.b.N;
        aVar5.getClass();
        return v.k(bVar15, bVar16, bVar17, bVar18, wi0.b.O0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final String e(String str, wi0.b bVar) {
        String strConcat;
        if (str == null || !f222983j.containsKey(bVar)) {
            return null;
        }
        if (com.bumptech.glide.d.t(bVar)) {
            return str;
        }
        wi0.b.Companion.getClass();
        if (bVar.equals(wi0.b.E)) {
            strConcat = "region_canada_province_".concat(str);
        } else if (com.bumptech.glide.d.w(bVar)) {
            Regex regex = new Regex("[\\s-]");
            m70.a.c(t0.f186434a);
            strConcat = j6.a.q("region_ua_state_", regex.replace(str, ""));
        } else if (bVar.equals(wi0.b.f297734c)) {
            strConcat = "region_uae_emirate_".concat(str);
        } else {
            String lowerCase = bVar.f297794a.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            strConcat = "region_" + lowerCase + "_state_" + str;
        }
        return this.e.e(strConcat);
    }

    public final List f() {
        Address address;
        String country;
        List popular = ((ik3.c) this.f222985b).g();
        Locale locale = ((s80.b) this.f222986c).b();
        this.f222987g.getClass();
        Intrinsics.checkNotNullParameter(popular, "popular");
        Intrinsics.checkNotNullParameter(locale, "locale");
        wi0.a aVar = wi0.b.Companion;
        String country2 = locale.getCountry();
        Intrinsics.checkNotNullExpressionValue(country2, "getCountry(...)");
        aVar.getClass();
        wi0.b bVarA = wi0.a.a(country2);
        e.Companion.getClass();
        e eVarA = d.a(bVarA);
        ArrayList arrayListA = eVarA != null ? f.a(eVarA.a(), bVarA) : f.a(popular, bVarA);
        ArrayList arrayList = new ArrayList(w.t(arrayListA, 10));
        Iterator it8 = arrayListA.iterator();
        while (it8.hasNext()) {
            arrayList.add(((wi0.b) it8.next()).f297794a);
        }
        n nVarA = this.d.a();
        if (nVarA == null || (address = nVarA.k) == null || (country = address.getCountry()) == null || arrayList.contains(country)) {
            return arrayList;
        }
        ArrayList arrayListF1 = d0.f1(arrayList);
        arrayListF1.add(0, country);
        return d0.d1(arrayListF1);
    }

    public final boolean g() {
        if (!((jte.d) this.f).c(CountriesApi$FeatureToggles$MockIndiaRegion.f82636a) && !kotlin.text.d0.J(this.f222988h.a(), "com.revolut.retail.india", true)) {
            l71.d dVarB = ((ang.b) this.i).b();
            if ((dVarB != null ? dVarB.a() : null) != UserCompanyRegion.IN) {
                return false;
            }
        }
        return true;
    }
}
