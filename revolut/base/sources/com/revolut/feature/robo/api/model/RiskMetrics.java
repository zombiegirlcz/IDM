package com.revolut.feature.robo.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/robo/api/model/RiskMetrics;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ReturnBreakDown", "RiskOverviewItem", "feature_robo_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RiskMetrics implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RiskMetrics> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f85030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f85031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f85032c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final BigDecimal f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BigDecimal f85033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BigDecimal f85034h;
    public final BigDecimal i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BigDecimal f85035j;
    public final BigDecimal k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final BigDecimal f85036l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final BigDecimal f85037m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final BigDecimal f85038n;
    public final BigDecimal o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final BigDecimal f85039p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final BigDecimal f85040q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ReturnBreakDown f85041r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ReturnBreakDown f85042s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f85043t;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/robo/api/model/RiskMetrics$ReturnBreakDown;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "OngoingCharges", "feature_robo_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReturnBreakDown implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ReturnBreakDown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BigDecimal f85044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BigDecimal f85045b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final OngoingCharges f85046c;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/robo/api/model/RiskMetrics$ReturnBreakDown$OngoingCharges;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_robo_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OngoingCharges implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<OngoingCharges> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BigDecimal f85047a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BigDecimal f85048b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OngoingCharges((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OngoingCharges[i];
                }
            }

            public OngoingCharges(BigDecimal min, BigDecimal max) {
                Intrinsics.checkNotNullParameter(min, "min");
                Intrinsics.checkNotNullParameter(max, "max");
                this.f85047a = min;
                this.f85048b = max;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof OngoingCharges)) {
                    return false;
                }
                OngoingCharges ongoingCharges = (OngoingCharges) obj2;
                return Intrinsics.f(this.f85047a, ongoingCharges.f85047a) && Intrinsics.f(this.f85048b, ongoingCharges.f85048b);
            }

            public final int hashCode() {
                return this.f85048b.hashCode() + (this.f85047a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f85047a);
                dest.writeSerializable(this.f85048b);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReturnBreakDown((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : OngoingCharges.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReturnBreakDown[i];
            }
        }

        public ReturnBreakDown(BigDecimal valueAppreciation, BigDecimal fees, OngoingCharges ongoingCharges) {
            Intrinsics.checkNotNullParameter(valueAppreciation, "valueAppreciation");
            Intrinsics.checkNotNullParameter(fees, "fees");
            this.f85044a = valueAppreciation;
            this.f85045b = fees;
            this.f85046c = ongoingCharges;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ReturnBreakDown)) {
                return false;
            }
            ReturnBreakDown returnBreakDown = (ReturnBreakDown) obj2;
            return Intrinsics.f(this.f85044a, returnBreakDown.f85044a) && Intrinsics.f(this.f85045b, returnBreakDown.f85045b) && Intrinsics.f(this.f85046c, returnBreakDown.f85046c);
        }

        public final int hashCode() {
            int iD = t61.a.d(this.f85045b, this.f85044a.hashCode() * 31, 31);
            OngoingCharges ongoingCharges = this.f85046c;
            return iD + (ongoingCharges == null ? 0 : ongoingCharges.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f85044a);
            dest.writeSerializable(this.f85045b);
            OngoingCharges ongoingCharges = this.f85046c;
            if (ongoingCharges == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                ongoingCharges.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/robo/api/model/RiskMetrics$RiskOverviewItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_robo_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RiskOverviewItem implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<RiskOverviewItem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f85050b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RiskOverviewItem(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RiskOverviewItem[i];
            }
        }

        public RiskOverviewItem(String icon, String description) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(description, "description");
            this.f85049a = icon;
            this.f85050b = description;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RiskOverviewItem)) {
                return false;
            }
            RiskOverviewItem riskOverviewItem = (RiskOverviewItem) obj2;
            return Intrinsics.f(this.f85049a, riskOverviewItem.f85049a) && Intrinsics.f(this.f85050b, riskOverviewItem.f85050b);
        }

        public final int hashCode() {
            return this.f85050b.hashCode() + (this.f85049a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85049a);
            dest.writeString(this.f85050b);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            BigDecimal bigDecimal;
            BigDecimal bigDecimal2;
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal5 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal6 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal7 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal8 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal9 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal10 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal11 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal12 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal13 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal14 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal15 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal16 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal17 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal18 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal19 = (BigDecimal) parcel.readSerializable();
            ReturnBreakDown returnBreakDownCreateFromParcel = parcel.readInt() == 0 ? null : ReturnBreakDown.CREATOR.createFromParcel(parcel);
            ReturnBreakDown returnBreakDownCreateFromParcel2 = parcel.readInt() == 0 ? null : ReturnBreakDown.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                bigDecimal = bigDecimal3;
                arrayList = null;
                bigDecimal2 = bigDecimal4;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                bigDecimal = bigDecimal3;
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(RiskOverviewItem.CREATOR, parcel, arrayList2, iA, 1);
                    i = i;
                    bigDecimal4 = bigDecimal4;
                }
                bigDecimal2 = bigDecimal4;
                arrayList = arrayList2;
            }
            return new RiskMetrics(bigDecimal, bigDecimal2, bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8, bigDecimal9, bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13, bigDecimal14, bigDecimal15, bigDecimal16, bigDecimal17, bigDecimal18, bigDecimal19, returnBreakDownCreateFromParcel, returnBreakDownCreateFromParcel2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RiskMetrics[i];
        }
    }

    public RiskMetrics(BigDecimal averageAnnualReturn, BigDecimal standardDeviation, BigDecimal bigDecimal, BigDecimal medianReturn, BigDecimal bestYearReturn, BigDecimal maxDrawdown, BigDecimal averageDrawdown, BigDecimal bigDecimal2, BigDecimal sharpeRatio, BigDecimal valueAtRisk, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal annualTotalReturn, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, ReturnBreakDown returnBreakDown, ReturnBreakDown returnBreakDown2, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(averageAnnualReturn, "averageAnnualReturn");
        Intrinsics.checkNotNullParameter(standardDeviation, "standardDeviation");
        Intrinsics.checkNotNullParameter(medianReturn, "medianReturn");
        Intrinsics.checkNotNullParameter(bestYearReturn, "bestYearReturn");
        Intrinsics.checkNotNullParameter(maxDrawdown, "maxDrawdown");
        Intrinsics.checkNotNullParameter(averageDrawdown, "averageDrawdown");
        Intrinsics.checkNotNullParameter(sharpeRatio, "sharpeRatio");
        Intrinsics.checkNotNullParameter(valueAtRisk, "valueAtRisk");
        Intrinsics.checkNotNullParameter(annualTotalReturn, "annualTotalReturn");
        this.f85030a = averageAnnualReturn;
        this.f85031b = standardDeviation;
        this.f85032c = bigDecimal;
        this.d = medianReturn;
        this.e = bestYearReturn;
        this.f = maxDrawdown;
        this.f85033g = averageDrawdown;
        this.f85034h = bigDecimal2;
        this.i = sharpeRatio;
        this.f85035j = valueAtRisk;
        this.k = bigDecimal3;
        this.f85036l = bigDecimal4;
        this.f85037m = annualTotalReturn;
        this.f85038n = bigDecimal5;
        this.o = bigDecimal6;
        this.f85039p = bigDecimal7;
        this.f85040q = bigDecimal8;
        this.f85041r = returnBreakDown;
        this.f85042s = returnBreakDown2;
        this.f85043t = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RiskMetrics)) {
            return false;
        }
        RiskMetrics riskMetrics = (RiskMetrics) obj2;
        return Intrinsics.f(this.f85030a, riskMetrics.f85030a) && Intrinsics.f(this.f85031b, riskMetrics.f85031b) && Intrinsics.f(this.f85032c, riskMetrics.f85032c) && Intrinsics.f(this.d, riskMetrics.d) && Intrinsics.f(this.e, riskMetrics.e) && Intrinsics.f(this.f, riskMetrics.f) && Intrinsics.f(this.f85033g, riskMetrics.f85033g) && Intrinsics.f(this.f85034h, riskMetrics.f85034h) && Intrinsics.f(this.i, riskMetrics.i) && Intrinsics.f(this.f85035j, riskMetrics.f85035j) && Intrinsics.f(this.k, riskMetrics.k) && Intrinsics.f(this.f85036l, riskMetrics.f85036l) && Intrinsics.f(this.f85037m, riskMetrics.f85037m) && Intrinsics.f(this.f85038n, riskMetrics.f85038n) && Intrinsics.f(this.o, riskMetrics.o) && Intrinsics.f(this.f85039p, riskMetrics.f85039p) && Intrinsics.f(this.f85040q, riskMetrics.f85040q) && Intrinsics.f(this.f85041r, riskMetrics.f85041r) && Intrinsics.f(this.f85042s, riskMetrics.f85042s) && Intrinsics.f(this.f85043t, riskMetrics.f85043t);
    }

    public final int hashCode() {
        int iD = t61.a.d(this.f85031b, this.f85030a.hashCode() * 31, 31);
        BigDecimal bigDecimal = this.f85032c;
        int iD2 = t61.a.d(this.f85033g, t61.a.d(this.f, t61.a.d(this.e, t61.a.d(this.d, (iD + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31, 31), 31), 31), 31);
        BigDecimal bigDecimal2 = this.f85034h;
        int iD3 = t61.a.d(this.f85035j, t61.a.d(this.i, (iD2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31, 31), 31);
        BigDecimal bigDecimal3 = this.k;
        int iHashCode = (iD3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.f85036l;
        int iD4 = t61.a.d(this.f85037m, (iHashCode + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31, 31);
        BigDecimal bigDecimal5 = this.f85038n;
        int iHashCode2 = (iD4 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.o;
        int iHashCode3 = (iHashCode2 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.f85039p;
        int iHashCode4 = (iHashCode3 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.f85040q;
        int iHashCode5 = (iHashCode4 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        ReturnBreakDown returnBreakDown = this.f85041r;
        int iHashCode6 = (iHashCode5 + (returnBreakDown == null ? 0 : returnBreakDown.hashCode())) * 31;
        ReturnBreakDown returnBreakDown2 = this.f85042s;
        int iHashCode7 = (iHashCode6 + (returnBreakDown2 == null ? 0 : returnBreakDown2.hashCode())) * 31;
        List list = this.f85043t;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f85030a);
        dest.writeSerializable(this.f85031b);
        dest.writeSerializable(this.f85032c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f85033g);
        dest.writeSerializable(this.f85034h);
        dest.writeSerializable(this.i);
        dest.writeSerializable(this.f85035j);
        dest.writeSerializable(this.k);
        dest.writeSerializable(this.f85036l);
        dest.writeSerializable(this.f85037m);
        dest.writeSerializable(this.f85038n);
        dest.writeSerializable(this.o);
        dest.writeSerializable(this.f85039p);
        dest.writeSerializable(this.f85040q);
        ReturnBreakDown returnBreakDown = this.f85041r;
        if (returnBreakDown == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            returnBreakDown.writeToParcel(dest, i);
        }
        ReturnBreakDown returnBreakDown2 = this.f85042s;
        if (returnBreakDown2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            returnBreakDown2.writeToParcel(dest, i);
        }
        List list = this.f85043t;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            ((RiskOverviewItem) itQ.next()).writeToParcel(dest, i);
        }
    }
}
