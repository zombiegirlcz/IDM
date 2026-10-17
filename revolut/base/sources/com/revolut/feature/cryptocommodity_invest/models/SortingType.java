package com.revolut.feature.cryptocommodity_invest.models;

import android.os.Parcel;
import android.os.Parcelable;
import ifk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ty5.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/models/SortingType;", "Landroid/os/Parcelable;", "<init>", "()V", "MarketCap", "CurrentPrice", "PriceChange", "MostBought", "MostSold", "VolumeChange", "Lcom/revolut/feature/cryptocommodity_invest/models/SortingType$CurrentPrice;", "Lcom/revolut/feature/cryptocommodity_invest/models/SortingType$MarketCap;", "Lcom/revolut/feature/cryptocommodity_invest/models/SortingType$MostBought;", "Lcom/revolut/feature/cryptocommodity_invest/models/SortingType$MostSold;", "Lcom/revolut/feature/cryptocommodity_invest/models/SortingType$PriceChange;", "Lcom/revolut/feature/cryptocommodity_invest/models/SortingType$VolumeChange;", "feature_cryptocommodity_invest_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SortingType implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/models/SortingType$CurrentPrice;", "Lcom/revolut/feature/cryptocommodity_invest/models/SortingType;", "", "toString", "()Ljava/lang/String;", "feature_cryptocommodity_invest_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CurrentPrice extends SortingType {

        @NotNull
        public static final Parcelable.Creator<CurrentPrice> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ty5.a f71595a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CurrentPrice(ty5.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrentPrice[i];
            }
        }

        public CurrentPrice() {
            this(0);
        }

        @Override // com.revolut.feature.cryptocommodity_invest.models.SortingType
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ty5.a getF71600a() {
            return this.f71595a;
        }

        @Override // com.revolut.feature.cryptocommodity_invest.models.SortingType
        public final SortingType b() {
            return new CurrentPrice(b.N(this.f71595a));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CurrentPrice) && this.f71595a == ((CurrentPrice) obj2).f71595a;
        }

        public final int hashCode() {
            return this.f71595a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71595a.name());
        }

        public CurrentPrice(ty5.a ordination) {
            Intrinsics.checkNotNullParameter(ordination, "ordination");
            this.f71595a = ordination;
        }

        public /* synthetic */ CurrentPrice(int i) {
            this(ty5.a.DESCENDING);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/models/SortingType$MarketCap;", "Lcom/revolut/feature/cryptocommodity_invest/models/SortingType;", "", "toString", "()Ljava/lang/String;", "feature_cryptocommodity_invest_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MarketCap extends SortingType {

        @NotNull
        public static final Parcelable.Creator<MarketCap> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ty5.a f71596a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MarketCap(ty5.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MarketCap[i];
            }
        }

        public MarketCap() {
            this(0);
        }

        @Override // com.revolut.feature.cryptocommodity_invest.models.SortingType
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ty5.a getF71600a() {
            return this.f71596a;
        }

        @Override // com.revolut.feature.cryptocommodity_invest.models.SortingType
        public final SortingType b() {
            return new MarketCap(b.N(this.f71596a));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MarketCap) && this.f71596a == ((MarketCap) obj2).f71596a;
        }

        public final int hashCode() {
            return this.f71596a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71596a.name());
        }

        public MarketCap(ty5.a ordination) {
            Intrinsics.checkNotNullParameter(ordination, "ordination");
            this.f71596a = ordination;
        }

        public /* synthetic */ MarketCap(int i) {
            this(ty5.a.DESCENDING);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/models/SortingType$MostBought;", "Lcom/revolut/feature/cryptocommodity_invest/models/SortingType;", "", "toString", "()Ljava/lang/String;", "feature_cryptocommodity_invest_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MostBought extends SortingType {

        @NotNull
        public static final Parcelable.Creator<MostBought> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ty5.a f71597a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MostBought(ty5.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MostBought[i];
            }
        }

        public MostBought() {
            this(0);
        }

        @Override // com.revolut.feature.cryptocommodity_invest.models.SortingType
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ty5.a getF71600a() {
            return this.f71597a;
        }

        @Override // com.revolut.feature.cryptocommodity_invest.models.SortingType
        public final SortingType b() {
            return new MostBought(b.N(this.f71597a));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MostBought) && this.f71597a == ((MostBought) obj2).f71597a;
        }

        public final int hashCode() {
            return this.f71597a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71597a.name());
        }

        public MostBought(ty5.a ordination) {
            Intrinsics.checkNotNullParameter(ordination, "ordination");
            this.f71597a = ordination;
        }

        public /* synthetic */ MostBought(int i) {
            this(ty5.a.DESCENDING);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/models/SortingType$MostSold;", "Lcom/revolut/feature/cryptocommodity_invest/models/SortingType;", "", "toString", "()Ljava/lang/String;", "feature_cryptocommodity_invest_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MostSold extends SortingType {

        @NotNull
        public static final Parcelable.Creator<MostSold> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ty5.a f71598a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MostSold(ty5.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MostSold[i];
            }
        }

        public MostSold() {
            this(0);
        }

        @Override // com.revolut.feature.cryptocommodity_invest.models.SortingType
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ty5.a getF71600a() {
            return this.f71598a;
        }

        @Override // com.revolut.feature.cryptocommodity_invest.models.SortingType
        public final SortingType b() {
            return new MostSold(b.N(this.f71598a));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MostSold) && this.f71598a == ((MostSold) obj2).f71598a;
        }

        public final int hashCode() {
            return this.f71598a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71598a.name());
        }

        public MostSold(ty5.a ordination) {
            Intrinsics.checkNotNullParameter(ordination, "ordination");
            this.f71598a = ordination;
        }

        public /* synthetic */ MostSold(int i) {
            this(ty5.a.DESCENDING);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/models/SortingType$PriceChange;", "Lcom/revolut/feature/cryptocommodity_invest/models/SortingType;", "", "toString", "()Ljava/lang/String;", "feature_cryptocommodity_invest_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PriceChange extends SortingType {

        @NotNull
        public static final Parcelable.Creator<PriceChange> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ty5.a f71599a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PriceChange(ty5.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PriceChange[i];
            }
        }

        public PriceChange() {
            this(0);
        }

        @Override // com.revolut.feature.cryptocommodity_invest.models.SortingType
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ty5.a getF71600a() {
            return this.f71599a;
        }

        @Override // com.revolut.feature.cryptocommodity_invest.models.SortingType
        public final SortingType b() {
            return new PriceChange(b.N(this.f71599a));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PriceChange) && this.f71599a == ((PriceChange) obj2).f71599a;
        }

        public final int hashCode() {
            return this.f71599a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71599a.name());
        }

        public PriceChange(ty5.a ordination) {
            Intrinsics.checkNotNullParameter(ordination, "ordination");
            this.f71599a = ordination;
        }

        public /* synthetic */ PriceChange(int i) {
            this(ty5.a.DESCENDING);
        }
    }

    private SortingType() {
    }

    /* JADX INFO: renamed from: a */
    public abstract a getF71600a();

    public abstract SortingType b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/models/SortingType$VolumeChange;", "Lcom/revolut/feature/cryptocommodity_invest/models/SortingType;", "", "toString", "()Ljava/lang/String;", "feature_cryptocommodity_invest_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VolumeChange extends SortingType {

        @NotNull
        public static final Parcelable.Creator<VolumeChange> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ty5.a f71600a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VolumeChange(ty5.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VolumeChange[i];
            }
        }

        public VolumeChange(ty5.a ordination) {
            Intrinsics.checkNotNullParameter(ordination, "ordination");
            this.f71600a = ordination;
        }

        @Override // com.revolut.feature.cryptocommodity_invest.models.SortingType
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ty5.a getF71600a() {
            return this.f71600a;
        }

        @Override // com.revolut.feature.cryptocommodity_invest.models.SortingType
        public final SortingType b() {
            return new VolumeChange(b.N(this.f71600a));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof VolumeChange) && this.f71600a == ((VolumeChange) obj2).f71600a;
        }

        public final int hashCode() {
            return this.f71600a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71600a.name());
        }

        public VolumeChange() {
            this(ty5.a.DESCENDING);
        }
    }
}
