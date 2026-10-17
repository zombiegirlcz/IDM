package com.revolut.shared.feature.wealth.models.config;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/config/Links;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Links implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Links> CREATOR = new a();
    public final String A;
    public final String B;
    public final String C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f105090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f105091c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f105092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f105093h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f105094j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f105095l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f105096m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f105097n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f105098p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f105099q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f105100r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f105101s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f105102t;
    public final String u;
    public final String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f105103w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f105104x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f105105y;
    public final String z;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Links(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Links[i];
        }
    }

    public Links(String usPerson, String icons, String professional, String riskWarning, String onboardingRiskWarning, String tinDescription, String termsOfBusiness, String orderHandling, String agreementPrefix, String privacyPolicy, String customerAccountAgreement, String str, String stocksFaqs, String str2, String morningstarResearchDisclosure, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        Intrinsics.checkNotNullParameter(usPerson, "usPerson");
        Intrinsics.checkNotNullParameter(icons, "icons");
        Intrinsics.checkNotNullParameter(professional, "professional");
        Intrinsics.checkNotNullParameter(riskWarning, "riskWarning");
        Intrinsics.checkNotNullParameter(onboardingRiskWarning, "onboardingRiskWarning");
        Intrinsics.checkNotNullParameter(tinDescription, "tinDescription");
        Intrinsics.checkNotNullParameter(termsOfBusiness, "termsOfBusiness");
        Intrinsics.checkNotNullParameter(orderHandling, "orderHandling");
        Intrinsics.checkNotNullParameter(agreementPrefix, "agreementPrefix");
        Intrinsics.checkNotNullParameter(privacyPolicy, "privacyPolicy");
        Intrinsics.checkNotNullParameter(customerAccountAgreement, "customerAccountAgreement");
        Intrinsics.checkNotNullParameter(stocksFaqs, "stocksFaqs");
        Intrinsics.checkNotNullParameter(morningstarResearchDisclosure, "morningstarResearchDisclosure");
        this.f105089a = usPerson;
        this.f105090b = icons;
        this.f105091c = professional;
        this.d = riskWarning;
        this.e = onboardingRiskWarning;
        this.f = tinDescription;
        this.f105092g = termsOfBusiness;
        this.f105093h = orderHandling;
        this.i = agreementPrefix;
        this.f105094j = privacyPolicy;
        this.k = customerAccountAgreement;
        this.f105095l = str;
        this.f105096m = stocksFaqs;
        this.f105097n = str2;
        this.o = morningstarResearchDisclosure;
        this.f105098p = str3;
        this.f105099q = str4;
        this.f105100r = str5;
        this.f105101s = str6;
        this.f105102t = str7;
        this.u = str8;
        this.v = str9;
        this.f105103w = str10;
        this.f105104x = str11;
        this.f105105y = str12;
        this.z = str13;
        this.A = str14;
        this.B = str15;
        this.C = str16;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Links)) {
            return false;
        }
        Links links = (Links) obj2;
        return Intrinsics.f(this.f105089a, links.f105089a) && Intrinsics.f(this.f105090b, links.f105090b) && Intrinsics.f(this.f105091c, links.f105091c) && Intrinsics.f(this.d, links.d) && Intrinsics.f(this.e, links.e) && Intrinsics.f(this.f, links.f) && Intrinsics.f(this.f105092g, links.f105092g) && Intrinsics.f(this.f105093h, links.f105093h) && Intrinsics.f(this.i, links.i) && Intrinsics.f(this.f105094j, links.f105094j) && Intrinsics.f(this.k, links.k) && Intrinsics.f(this.f105095l, links.f105095l) && Intrinsics.f(this.f105096m, links.f105096m) && Intrinsics.f(this.f105097n, links.f105097n) && Intrinsics.f(this.o, links.o) && Intrinsics.f(this.f105098p, links.f105098p) && Intrinsics.f(this.f105099q, links.f105099q) && Intrinsics.f(this.f105100r, links.f105100r) && Intrinsics.f(this.f105101s, links.f105101s) && Intrinsics.f(this.f105102t, links.f105102t) && Intrinsics.f(this.u, links.u) && Intrinsics.f(this.v, links.v) && Intrinsics.f(this.f105103w, links.f105103w) && Intrinsics.f(this.f105104x, links.f105104x) && Intrinsics.f(this.f105105y, links.f105105y) && Intrinsics.f(this.z, links.z) && Intrinsics.f(this.A, links.A) && Intrinsics.f(this.B, links.B) && Intrinsics.f(this.C, links.C);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f105089a.hashCode() * 31, 31, this.f105090b), 31, this.f105091c), 31, this.d), 31, this.e), 31, this.f), 31, this.f105092g), 31, this.f105093h), 31, this.i), 31, this.f105094j), 31, this.k);
        String str = this.f105095l;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f105096m);
        String str2 = this.f105097n;
        int iC3 = p.a.c((iC2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.o);
        String str3 = this.f105098p;
        int iHashCode = (iC3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f105099q;
        int iHashCode2 = (iHashCode + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f105100r;
        int iHashCode3 = (iHashCode2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f105101s;
        int iHashCode4 = (iHashCode3 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f105102t;
        int iHashCode5 = (iHashCode4 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.u;
        int iHashCode6 = (iHashCode5 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.v;
        int iHashCode7 = (iHashCode6 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f105103w;
        int iHashCode8 = (iHashCode7 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f105104x;
        int iHashCode9 = (iHashCode8 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f105105y;
        int iHashCode10 = (iHashCode9 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.z;
        int iHashCode11 = (iHashCode10 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.A;
        int iHashCode12 = (iHashCode11 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.B;
        int iHashCode13 = (iHashCode12 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.C;
        return iHashCode13 + (str16 != null ? str16.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f105089a);
        dest.writeString(this.f105090b);
        dest.writeString(this.f105091c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f105092g);
        dest.writeString(this.f105093h);
        dest.writeString(this.i);
        dest.writeString(this.f105094j);
        dest.writeString(this.k);
        dest.writeString(this.f105095l);
        dest.writeString(this.f105096m);
        dest.writeString(this.f105097n);
        dest.writeString(this.o);
        dest.writeString(this.f105098p);
        dest.writeString(this.f105099q);
        dest.writeString(this.f105100r);
        dest.writeString(this.f105101s);
        dest.writeString(this.f105102t);
        dest.writeString(this.u);
        dest.writeString(this.v);
        dest.writeString(this.f105103w);
        dest.writeString(this.f105104x);
        dest.writeString(this.f105105y);
        dest.writeString(this.z);
        dest.writeString(this.A);
        dest.writeString(this.B);
        dest.writeString(this.C);
    }
}
