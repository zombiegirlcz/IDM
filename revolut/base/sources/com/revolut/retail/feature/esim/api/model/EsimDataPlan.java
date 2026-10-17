package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dej.l;
import dej.m;
import dj0.d;
import ip0.v7;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimDataPlan;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimDataPlan implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimDataPlan> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f100213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f100214c;
    public final l d;
    public final d e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f100215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f100216h;
    public final Long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f100217j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f100218l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Long f100219m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Period f100220n;
    public final Period o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final EsimCoverage f100221p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f100222q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f100223r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final EsimDataPlanOfferInfo f100224s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final EsimDataPlanAttributes f100225t;
    public final EsimMobilePlanPointsOption u;
    public final EsimMobilePlanHighlights v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final EsimMobilePlanSummary f100226w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final EsimMobilePlanNetworkProvider f100227x;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            boolean z4;
            ArrayList arrayList;
            EsimCoverage esimCoverage;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            m mVarValueOf = parcel.readInt() == 0 ? null : m.valueOf(parcel.readString());
            l lVarValueOf = parcel.readInt() == 0 ? null : l.valueOf(parcel.readString());
            d dVar = (d) parcel.readSerializable();
            String string3 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            boolean z6 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z6 = true;
            } else {
                z = false;
            }
            boolean z11 = parcel.readInt() != 0 ? true : z;
            if (parcel.readInt() != 0) {
                z3 = z11;
                z4 = true;
            } else {
                z3 = z11;
                z4 = z;
            }
            Long lValueOf4 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Period period = (Period) parcel.readSerializable();
            Period period2 = (Period) parcel.readSerializable();
            EsimCoverage esimCoverage2 = (EsimCoverage) parcel.readParcelable(EsimDataPlan.class.getClassLoader());
            if (parcel.readInt() == 0) {
                esimCoverage = esimCoverage2;
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                esimCoverage = esimCoverage2;
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(EsimDataPlanRoamingAllowances.CREATOR, parcel, arrayList, iA, 1);
                    i = i;
                    string = string;
                }
            }
            return new EsimDataPlan(string, string2, mVarValueOf, lVarValueOf, dVar, string3, lValueOf, lValueOf2, lValueOf3, z6, z3, z4, lValueOf4, period, period2, esimCoverage, arrayList, parcel.readInt() != 0, (EsimDataPlanOfferInfo) parcel.readParcelable(EsimDataPlan.class.getClassLoader()), parcel.readInt() == 0 ? null : EsimDataPlanAttributes.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EsimMobilePlanPointsOption.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EsimMobilePlanHighlights.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EsimMobilePlanSummary.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EsimMobilePlanNetworkProvider.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimDataPlan[i];
        }
    }

    public EsimDataPlan(String id10, String str, m mVar, l lVar, d price, String duration, Long l2, Long l3, Long l4, boolean z, boolean z3, boolean z4, Long l5, Period period, Period period2, EsimCoverage coverage, ArrayList arrayList, boolean z6, EsimDataPlanOfferInfo esimDataPlanOfferInfo, EsimDataPlanAttributes esimDataPlanAttributes, EsimMobilePlanPointsOption esimMobilePlanPointsOption, EsimMobilePlanHighlights esimMobilePlanHighlights, EsimMobilePlanSummary esimMobilePlanSummary, EsimMobilePlanNetworkProvider esimMobilePlanNetworkProvider) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(coverage, "coverage");
        this.f100212a = id10;
        this.f100213b = str;
        this.f100214c = mVar;
        this.d = lVar;
        this.e = price;
        this.f = duration;
        this.f100215g = l2;
        this.f100216h = l3;
        this.i = l4;
        this.f100217j = z;
        this.k = z3;
        this.f100218l = z4;
        this.f100219m = l5;
        this.f100220n = period;
        this.o = period2;
        this.f100221p = coverage;
        this.f100222q = arrayList;
        this.f100223r = z6;
        this.f100224s = esimDataPlanOfferInfo;
        this.f100225t = esimDataPlanAttributes;
        this.u = esimMobilePlanPointsOption;
        this.v = esimMobilePlanHighlights;
        this.f100226w = esimMobilePlanSummary;
        this.f100227x = esimMobilePlanNetworkProvider;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimDataPlan)) {
            return false;
        }
        EsimDataPlan esimDataPlan = (EsimDataPlan) obj2;
        return Intrinsics.f(this.f100212a, esimDataPlan.f100212a) && Intrinsics.f(this.f100213b, esimDataPlan.f100213b) && this.f100214c == esimDataPlan.f100214c && this.d == esimDataPlan.d && Intrinsics.f(this.e, esimDataPlan.e) && Intrinsics.f(this.f, esimDataPlan.f) && Intrinsics.f(this.f100215g, esimDataPlan.f100215g) && Intrinsics.f(this.f100216h, esimDataPlan.f100216h) && Intrinsics.f(this.i, esimDataPlan.i) && this.f100217j == esimDataPlan.f100217j && this.k == esimDataPlan.k && this.f100218l == esimDataPlan.f100218l && Intrinsics.f(this.f100219m, esimDataPlan.f100219m) && Intrinsics.f(this.f100220n, esimDataPlan.f100220n) && Intrinsics.f(this.o, esimDataPlan.o) && Intrinsics.f(this.f100221p, esimDataPlan.f100221p) && Intrinsics.f(this.f100222q, esimDataPlan.f100222q) && this.f100223r == esimDataPlan.f100223r && Intrinsics.f(this.f100224s, esimDataPlan.f100224s) && Intrinsics.f(this.f100225t, esimDataPlan.f100225t) && Intrinsics.f(this.u, esimDataPlan.u) && Intrinsics.f(this.v, esimDataPlan.v) && Intrinsics.f(this.f100226w, esimDataPlan.f100226w) && Intrinsics.f(this.f100227x, esimDataPlan.f100227x);
    }

    public final int hashCode() {
        int iHashCode = this.f100212a.hashCode() * 31;
        String str = this.f100213b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        m mVar = this.f100214c;
        int iHashCode3 = (iHashCode2 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        l lVar = this.d;
        int iC = p.a.c(v7.c((iHashCode3 + (lVar == null ? 0 : lVar.hashCode())) * 31, 31, this.e), 31, this.f);
        Long l2 = this.f100215g;
        int iHashCode4 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f100216h;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.i;
        int iC2 = j6.a.c(j6.a.c(j6.a.c((iHashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31, 31, this.f100217j), 31, this.k), 31, this.f100218l);
        Long l5 = this.f100219m;
        int iHashCode6 = (iC2 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Period period = this.f100220n;
        int iHashCode7 = (iHashCode6 + (period == null ? 0 : period.hashCode())) * 31;
        Period period2 = this.o;
        int iHashCode8 = (this.f100221p.hashCode() + ((iHashCode7 + (period2 == null ? 0 : period2.hashCode())) * 31)) * 31;
        List list = this.f100222q;
        int iC3 = j6.a.c((iHashCode8 + (list == null ? 0 : list.hashCode())) * 31, 31, this.f100223r);
        EsimDataPlanOfferInfo esimDataPlanOfferInfo = this.f100224s;
        int iHashCode9 = (iC3 + (esimDataPlanOfferInfo == null ? 0 : esimDataPlanOfferInfo.hashCode())) * 31;
        EsimDataPlanAttributes esimDataPlanAttributes = this.f100225t;
        int iHashCode10 = (iHashCode9 + (esimDataPlanAttributes == null ? 0 : esimDataPlanAttributes.hashCode())) * 31;
        EsimMobilePlanPointsOption esimMobilePlanPointsOption = this.u;
        int iHashCode11 = (iHashCode10 + (esimMobilePlanPointsOption == null ? 0 : esimMobilePlanPointsOption.hashCode())) * 31;
        EsimMobilePlanHighlights esimMobilePlanHighlights = this.v;
        int iHashCode12 = (iHashCode11 + (esimMobilePlanHighlights == null ? 0 : esimMobilePlanHighlights.hashCode())) * 31;
        EsimMobilePlanSummary esimMobilePlanSummary = this.f100226w;
        int iHashCode13 = (iHashCode12 + (esimMobilePlanSummary == null ? 0 : esimMobilePlanSummary.hashCode())) * 31;
        EsimMobilePlanNetworkProvider esimMobilePlanNetworkProvider = this.f100227x;
        return iHashCode13 + (esimMobilePlanNetworkProvider != null ? esimMobilePlanNetworkProvider.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100212a);
        dest.writeString(this.f100213b);
        m mVar = this.f100214c;
        if (mVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(mVar.name());
        }
        l lVar = this.d;
        if (lVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(lVar.name());
        }
        dest.writeSerializable(this.e);
        dest.writeString(this.f);
        Long l2 = this.f100215g;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        Long l3 = this.f100216h;
        if (l3 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l3);
        }
        Long l4 = this.i;
        if (l4 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l4);
        }
        dest.writeInt(this.f100217j ? 1 : 0);
        dest.writeInt(this.k ? 1 : 0);
        dest.writeInt(this.f100218l ? 1 : 0);
        Long l5 = this.f100219m;
        if (l5 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l5);
        }
        dest.writeSerializable(this.f100220n);
        dest.writeSerializable(this.o);
        dest.writeParcelable(this.f100221p, i);
        List list = this.f100222q;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((EsimDataPlanRoamingAllowances) itQ.next()).writeToParcel(dest, i);
            }
        }
        dest.writeInt(this.f100223r ? 1 : 0);
        dest.writeParcelable(this.f100224s, i);
        EsimDataPlanAttributes esimDataPlanAttributes = this.f100225t;
        if (esimDataPlanAttributes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimDataPlanAttributes.writeToParcel(dest, i);
        }
        EsimMobilePlanPointsOption esimMobilePlanPointsOption = this.u;
        if (esimMobilePlanPointsOption == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimMobilePlanPointsOption.writeToParcel(dest, i);
        }
        EsimMobilePlanHighlights esimMobilePlanHighlights = this.v;
        if (esimMobilePlanHighlights == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimMobilePlanHighlights.writeToParcel(dest, i);
        }
        EsimMobilePlanSummary esimMobilePlanSummary = this.f100226w;
        if (esimMobilePlanSummary == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimMobilePlanSummary.writeToParcel(dest, i);
        }
        EsimMobilePlanNetworkProvider esimMobilePlanNetworkProvider = this.f100227x;
        if (esimMobilePlanNetworkProvider == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimMobilePlanNetworkProvider.writeToParcel(dest, i);
        }
    }
}
