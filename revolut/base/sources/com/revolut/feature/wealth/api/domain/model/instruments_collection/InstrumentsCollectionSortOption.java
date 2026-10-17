package com.revolut.feature.wealth.api.domain.model.instruments_collection;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zzg.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionSortOption;", "Landroid/os/Parcelable;", "AlphabeticalOrder", "MostOwned", "RemainingYears", "YieldToMaturity", "MostTraded", "PriceChange1Day", "zzg/s", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionSortOption$AlphabeticalOrder;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionSortOption$MostOwned;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionSortOption$MostTraded;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionSortOption$PriceChange1Day;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionSortOption$RemainingYears;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionSortOption$YieldToMaturity;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InstrumentsCollectionSortOption extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionSortOption$AlphabeticalOrder;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionSortOption;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AlphabeticalOrder implements InstrumentsCollectionSortOption {

        @NotNull
        public static final Parcelable.Creator<AlphabeticalOrder> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f95277a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AlphabeticalOrder(parcel.readInt() == 0 ? null : s.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AlphabeticalOrder[i];
            }
        }

        public AlphabeticalOrder() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AlphabeticalOrder) && this.f95277a == ((AlphabeticalOrder) obj2).f95277a;
        }

        public final int hashCode() {
            s sVar = this.f95277a;
            if (sVar == null) {
                return 0;
            }
            return sVar.hashCode();
        }

        @Override // com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionSortOption
        /* JADX INFO: renamed from: k, reason: from getter */
        public final s getF95282a() {
            return this.f95277a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            s sVar = this.f95277a;
            if (sVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(sVar.name());
            }
        }

        public /* synthetic */ AlphabeticalOrder(int i) {
            this(s.DESC);
        }

        public AlphabeticalOrder(s sVar) {
            this.f95277a = sVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionSortOption$MostOwned;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionSortOption;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MostOwned implements InstrumentsCollectionSortOption {

        @NotNull
        public static final Parcelable.Creator<MostOwned> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f95278a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MostOwned(parcel.readInt() == 0 ? null : s.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MostOwned[i];
            }
        }

        public MostOwned() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MostOwned) && this.f95278a == ((MostOwned) obj2).f95278a;
        }

        public final int hashCode() {
            s sVar = this.f95278a;
            if (sVar == null) {
                return 0;
            }
            return sVar.hashCode();
        }

        @Override // com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionSortOption
        /* JADX INFO: renamed from: k, reason: from getter */
        public final s getF95282a() {
            return this.f95278a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            s sVar = this.f95278a;
            if (sVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(sVar.name());
            }
        }

        public /* synthetic */ MostOwned(int i) {
            this(s.DESC);
        }

        public MostOwned(s sVar) {
            this.f95278a = sVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionSortOption$MostTraded;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionSortOption;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MostTraded implements InstrumentsCollectionSortOption {

        @NotNull
        public static final Parcelable.Creator<MostTraded> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f95279a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MostTraded(parcel.readInt() == 0 ? null : s.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MostTraded[i];
            }
        }

        public MostTraded() {
            this(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MostTraded) && this.f95279a == ((MostTraded) obj2).f95279a;
        }

        public final int hashCode() {
            s sVar = this.f95279a;
            if (sVar == null) {
                return 0;
            }
            return sVar.hashCode();
        }

        @Override // com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionSortOption
        /* JADX INFO: renamed from: k, reason: from getter */
        public final s getF95282a() {
            return this.f95279a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            s sVar = this.f95279a;
            if (sVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(sVar.name());
            }
        }

        public MostTraded(s sVar) {
            this.f95279a = sVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionSortOption$PriceChange1Day;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionSortOption;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PriceChange1Day implements InstrumentsCollectionSortOption {

        @NotNull
        public static final Parcelable.Creator<PriceChange1Day> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f95280a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PriceChange1Day(parcel.readInt() == 0 ? null : s.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PriceChange1Day[i];
            }
        }

        public PriceChange1Day() {
            this(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PriceChange1Day) && this.f95280a == ((PriceChange1Day) obj2).f95280a;
        }

        public final int hashCode() {
            s sVar = this.f95280a;
            if (sVar == null) {
                return 0;
            }
            return sVar.hashCode();
        }

        @Override // com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionSortOption
        /* JADX INFO: renamed from: k, reason: from getter */
        public final s getF95282a() {
            return this.f95280a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            s sVar = this.f95280a;
            if (sVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(sVar.name());
            }
        }

        public PriceChange1Day(s sVar) {
            this.f95280a = sVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionSortOption$RemainingYears;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionSortOption;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RemainingYears implements InstrumentsCollectionSortOption {

        @NotNull
        public static final Parcelable.Creator<RemainingYears> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f95281a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RemainingYears(parcel.readInt() == 0 ? null : s.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RemainingYears[i];
            }
        }

        public RemainingYears() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RemainingYears) && this.f95281a == ((RemainingYears) obj2).f95281a;
        }

        public final int hashCode() {
            s sVar = this.f95281a;
            if (sVar == null) {
                return 0;
            }
            return sVar.hashCode();
        }

        @Override // com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionSortOption
        /* JADX INFO: renamed from: k, reason: from getter */
        public final s getF95282a() {
            return this.f95281a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            s sVar = this.f95281a;
            if (sVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(sVar.name());
            }
        }

        public /* synthetic */ RemainingYears(int i) {
            this(s.DESC);
        }

        public RemainingYears(s sVar) {
            this.f95281a = sVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionSortOption$YieldToMaturity;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionSortOption;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class YieldToMaturity implements InstrumentsCollectionSortOption {

        @NotNull
        public static final Parcelable.Creator<YieldToMaturity> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f95282a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new YieldToMaturity(parcel.readInt() == 0 ? null : s.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new YieldToMaturity[i];
            }
        }

        public YieldToMaturity() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof YieldToMaturity) && this.f95282a == ((YieldToMaturity) obj2).f95282a;
        }

        public final int hashCode() {
            s sVar = this.f95282a;
            if (sVar == null) {
                return 0;
            }
            return sVar.hashCode();
        }

        @Override // com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionSortOption
        /* JADX INFO: renamed from: k, reason: from getter */
        public final s getF95282a() {
            return this.f95282a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            s sVar = this.f95282a;
            if (sVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(sVar.name());
            }
        }

        public /* synthetic */ YieldToMaturity(int i) {
            this(s.DESC);
        }

        public YieldToMaturity(s sVar) {
            this.f95282a = sVar;
        }
    }

    /* JADX INFO: renamed from: k */
    s getF95282a();
}
