package com.revolut.feature.wealth.models.portfolio_metrics;

import android.os.Parcel;
import android.os.Parcelable;
import h30.l;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0004\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/models/portfolio_metrics/AssetSubclassAllocation;", "Landroid/os/Parcelable;", "Stocks", "Bonds", "Commodities", "Cash", "AssetSubclassAdjustment", "vdh/a", "Lcom/revolut/feature/wealth/models/portfolio_metrics/AssetSubclassAllocation$Bonds;", "Lcom/revolut/feature/wealth/models/portfolio_metrics/AssetSubclassAllocation$Cash;", "Lcom/revolut/feature/wealth/models/portfolio_metrics/AssetSubclassAllocation$Commodities;", "Lcom/revolut/feature/wealth/models/portfolio_metrics/AssetSubclassAllocation$Stocks;", "feature_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AssetSubclassAllocation extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/models/portfolio_metrics/AssetSubclassAllocation$AssetSubclassAdjustment;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AssetSubclassAdjustment implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<AssetSubclassAdjustment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final vdh.a f95676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BigDecimal f95677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f95678c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AssetSubclassAdjustment(vdh.a.valueOf(parcel.readString()), (BigDecimal) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AssetSubclassAdjustment[i];
            }
        }

        public AssetSubclassAdjustment(vdh.a type, BigDecimal weight, String rationale) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(weight, "weight");
            Intrinsics.checkNotNullParameter(rationale, "rationale");
            this.f95676a = type;
            this.f95677b = weight;
            this.f95678c = rationale;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AssetSubclassAdjustment)) {
                return false;
            }
            AssetSubclassAdjustment assetSubclassAdjustment = (AssetSubclassAdjustment) obj2;
            return this.f95676a == assetSubclassAdjustment.f95676a && Intrinsics.f(this.f95677b, assetSubclassAdjustment.f95677b) && Intrinsics.f(this.f95678c, assetSubclassAdjustment.f95678c);
        }

        public final int hashCode() {
            return this.f95678c.hashCode() + t61.a.d(this.f95677b, this.f95676a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95676a.name());
            dest.writeSerializable(this.f95677b);
            dest.writeString(this.f95678c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/models/portfolio_metrics/AssetSubclassAllocation$Bonds;", "Lcom/revolut/feature/wealth/models/portfolio_metrics/AssetSubclassAllocation;", "", "toString", "()Ljava/lang/String;", "feature_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Bonds implements AssetSubclassAllocation {

        @NotNull
        public static final Parcelable.Creator<Bonds> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BigDecimal f95679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f95680b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f95681c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(AssetSubclassAdjustment.CREATOR, parcel, arrayList2, iA, 1);
                    }
                    arrayList = arrayList2;
                }
                return new Bonds(string, bigDecimal, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Bonds[i];
            }
        }

        public Bonds(String ref2, BigDecimal allocation, ArrayList arrayList) {
            Intrinsics.checkNotNullParameter(allocation, "allocation");
            Intrinsics.checkNotNullParameter(ref2, "ref");
            this.f95679a = allocation;
            this.f95680b = ref2;
            this.f95681c = arrayList;
        }

        @Override // com.revolut.feature.wealth.models.portfolio_metrics.AssetSubclassAllocation
        /* JADX INFO: renamed from: U0, reason: from getter */
        public final List getF95690c() {
            return this.f95681c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Bonds)) {
                return false;
            }
            Bonds bonds = (Bonds) obj2;
            return Intrinsics.f(this.f95679a, bonds.f95679a) && Intrinsics.f(this.f95680b, bonds.f95680b) && Intrinsics.f(this.f95681c, bonds.f95681c);
        }

        @Override // com.revolut.feature.wealth.models.portfolio_metrics.AssetSubclassAllocation
        /* JADX INFO: renamed from: getAllocation, reason: from getter */
        public final BigDecimal getF95688a() {
            return this.f95679a;
        }

        public final int hashCode() {
            int iC = p.a.c(this.f95679a.hashCode() * 31, 31, this.f95680b);
            List list = this.f95681c;
            return iC + (list == null ? 0 : list.hashCode());
        }

        @Override // com.revolut.feature.wealth.models.portfolio_metrics.AssetSubclassAllocation
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getF95689b() {
            return this.f95680b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f95679a);
            dest.writeString(this.f95680b);
            List list = this.f95681c;
            if (list == null) {
                dest.writeInt(0);
                return;
            }
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((AssetSubclassAdjustment) itQ.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/models/portfolio_metrics/AssetSubclassAllocation$Cash;", "Lcom/revolut/feature/wealth/models/portfolio_metrics/AssetSubclassAllocation;", "", "toString", "()Ljava/lang/String;", "feature_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Cash implements AssetSubclassAllocation {

        @NotNull
        public static final Parcelable.Creator<Cash> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BigDecimal f95682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f95683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f95684c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                b bVar = (b) parcel.readSerializable();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(AssetSubclassAdjustment.CREATOR, parcel, arrayList2, iA, 1);
                    }
                    arrayList = arrayList2;
                }
                return new Cash(bigDecimal, bVar, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cash[i];
            }
        }

        public Cash(BigDecimal allocation, b currency, ArrayList arrayList) {
            Intrinsics.checkNotNullParameter(allocation, "allocation");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f95682a = allocation;
            this.f95683b = currency;
            this.f95684c = arrayList;
        }

        @Override // com.revolut.feature.wealth.models.portfolio_metrics.AssetSubclassAllocation
        /* JADX INFO: renamed from: U0, reason: from getter */
        public final List getF95690c() {
            return this.f95684c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Cash)) {
                return false;
            }
            Cash cash = (Cash) obj2;
            return Intrinsics.f(this.f95682a, cash.f95682a) && Intrinsics.f(this.f95683b, cash.f95683b) && Intrinsics.f(this.f95684c, cash.f95684c);
        }

        @Override // com.revolut.feature.wealth.models.portfolio_metrics.AssetSubclassAllocation
        /* JADX INFO: renamed from: getAllocation, reason: from getter */
        public final BigDecimal getF95688a() {
            return this.f95682a;
        }

        public final int hashCode() {
            int iJ = l.j(this.f95683b, this.f95682a.hashCode() * 31, 31);
            List list = this.f95684c;
            return iJ + (list == null ? 0 : list.hashCode());
        }

        @Override // com.revolut.feature.wealth.models.portfolio_metrics.AssetSubclassAllocation
        /* JADX INFO: renamed from: i */
        public final String getF95689b() {
            return this.f95683b.f306286a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f95682a);
            dest.writeSerializable(this.f95683b);
            List list = this.f95684c;
            if (list == null) {
                dest.writeInt(0);
                return;
            }
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((AssetSubclassAdjustment) itQ.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/models/portfolio_metrics/AssetSubclassAllocation$Commodities;", "Lcom/revolut/feature/wealth/models/portfolio_metrics/AssetSubclassAllocation;", "", "toString", "()Ljava/lang/String;", "feature_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Commodities implements AssetSubclassAllocation {

        @NotNull
        public static final Parcelable.Creator<Commodities> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BigDecimal f95685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f95686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f95687c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(AssetSubclassAdjustment.CREATOR, parcel, arrayList2, iA, 1);
                    }
                    arrayList = arrayList2;
                }
                return new Commodities(string, bigDecimal, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Commodities[i];
            }
        }

        public Commodities(String ref2, BigDecimal allocation, ArrayList arrayList) {
            Intrinsics.checkNotNullParameter(allocation, "allocation");
            Intrinsics.checkNotNullParameter(ref2, "ref");
            this.f95685a = allocation;
            this.f95686b = ref2;
            this.f95687c = arrayList;
        }

        @Override // com.revolut.feature.wealth.models.portfolio_metrics.AssetSubclassAllocation
        /* JADX INFO: renamed from: U0, reason: from getter */
        public final List getF95690c() {
            return this.f95687c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Commodities)) {
                return false;
            }
            Commodities commodities = (Commodities) obj2;
            return Intrinsics.f(this.f95685a, commodities.f95685a) && Intrinsics.f(this.f95686b, commodities.f95686b) && Intrinsics.f(this.f95687c, commodities.f95687c);
        }

        @Override // com.revolut.feature.wealth.models.portfolio_metrics.AssetSubclassAllocation
        /* JADX INFO: renamed from: getAllocation, reason: from getter */
        public final BigDecimal getF95688a() {
            return this.f95685a;
        }

        public final int hashCode() {
            int iC = p.a.c(this.f95685a.hashCode() * 31, 31, this.f95686b);
            List list = this.f95687c;
            return iC + (list == null ? 0 : list.hashCode());
        }

        @Override // com.revolut.feature.wealth.models.portfolio_metrics.AssetSubclassAllocation
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getF95689b() {
            return this.f95686b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f95685a);
            dest.writeString(this.f95686b);
            List list = this.f95687c;
            if (list == null) {
                dest.writeInt(0);
                return;
            }
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((AssetSubclassAdjustment) itQ.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/models/portfolio_metrics/AssetSubclassAllocation$Stocks;", "Lcom/revolut/feature/wealth/models/portfolio_metrics/AssetSubclassAllocation;", "", "toString", "()Ljava/lang/String;", "feature_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Stocks implements AssetSubclassAllocation {

        @NotNull
        public static final Parcelable.Creator<Stocks> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BigDecimal f95688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f95689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f95690c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(AssetSubclassAdjustment.CREATOR, parcel, arrayList2, iA, 1);
                    }
                    arrayList = arrayList2;
                }
                return new Stocks(string, bigDecimal, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Stocks[i];
            }
        }

        public Stocks(String ref2, BigDecimal allocation, ArrayList arrayList) {
            Intrinsics.checkNotNullParameter(allocation, "allocation");
            Intrinsics.checkNotNullParameter(ref2, "ref");
            this.f95688a = allocation;
            this.f95689b = ref2;
            this.f95690c = arrayList;
        }

        @Override // com.revolut.feature.wealth.models.portfolio_metrics.AssetSubclassAllocation
        /* JADX INFO: renamed from: U0, reason: from getter */
        public final List getF95690c() {
            return this.f95690c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Stocks)) {
                return false;
            }
            Stocks stocks = (Stocks) obj2;
            return Intrinsics.f(this.f95688a, stocks.f95688a) && Intrinsics.f(this.f95689b, stocks.f95689b) && Intrinsics.f(this.f95690c, stocks.f95690c);
        }

        @Override // com.revolut.feature.wealth.models.portfolio_metrics.AssetSubclassAllocation
        /* JADX INFO: renamed from: getAllocation, reason: from getter */
        public final BigDecimal getF95688a() {
            return this.f95688a;
        }

        public final int hashCode() {
            int iC = p.a.c(this.f95688a.hashCode() * 31, 31, this.f95689b);
            List list = this.f95690c;
            return iC + (list == null ? 0 : list.hashCode());
        }

        @Override // com.revolut.feature.wealth.models.portfolio_metrics.AssetSubclassAllocation
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getF95689b() {
            return this.f95689b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f95688a);
            dest.writeString(this.f95689b);
            List list = this.f95690c;
            if (list == null) {
                dest.writeInt(0);
                return;
            }
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((AssetSubclassAdjustment) itQ.next()).writeToParcel(dest, i);
            }
        }
    }

    /* JADX INFO: renamed from: U0 */
    List getF95690c();

    /* JADX INFO: renamed from: getAllocation */
    BigDecimal getF95688a();

    /* JADX INFO: renamed from: i */
    String getF95689b();
}
