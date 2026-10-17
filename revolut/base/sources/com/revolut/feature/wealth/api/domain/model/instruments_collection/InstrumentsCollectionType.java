package com.revolut.feature.wealth.api.domain.model.instruments_collection;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nel.z;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionType;", "Landroid/os/Parcelable;", "Bonds", "Etfs", "Related", "RecommendedBuy", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionType$Bonds;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionType$Etfs;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionType$RecommendedBuy;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionType$Related;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InstrumentsCollectionType extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionType$Bonds;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionType;", "<init>", "()V", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Bonds implements InstrumentsCollectionType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Bonds f95283a = new Bonds();

        @NotNull
        public static final Parcelable.Creator<Bonds> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Bonds.f95283a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Bonds[i];
            }
        }

        private Bonds() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionType$Etfs;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionType;", "<init>", "()V", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Etfs implements InstrumentsCollectionType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Etfs f95284a = new Etfs();

        @NotNull
        public static final Parcelable.Creator<Etfs> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Etfs.f95284a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Etfs[i];
            }
        }

        private Etfs() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionType$RecommendedBuy;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionType;", "<init>", "()V", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @d
    public static final class RecommendedBuy implements InstrumentsCollectionType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RecommendedBuy f95285a = new RecommendedBuy();

        @NotNull
        public static final Parcelable.Creator<RecommendedBuy> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RecommendedBuy.f95285a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecommendedBuy[i];
            }
        }

        private RecommendedBuy() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionType$Related;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionType;", "Instruments", "Index", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionType$Related$Index;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionType$Related$Instruments;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Related extends InstrumentsCollectionType {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionType$Related$Index;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionType$Related;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Index implements Related {

            @NotNull
            public static final Parcelable.Creator<Index> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f95286a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final z f95287b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Index(parcel.readString(), z.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Index[i];
                }
            }

            public Index(String ref2, z instrumentType) {
                Intrinsics.checkNotNullParameter(ref2, "ref");
                Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
                this.f95286a = ref2;
                this.f95287b = instrumentType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Index)) {
                    return false;
                }
                Index index = (Index) obj2;
                return Intrinsics.f(this.f95286a, index.f95286a) && this.f95287b == index.f95287b;
            }

            public final int hashCode() {
                return this.f95287b.hashCode() + (this.f95286a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f95286a);
                dest.writeString(this.f95287b.name());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionType$Related$Instruments;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/InstrumentsCollectionType$Related;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Instruments implements Related {

            @NotNull
            public static final Parcelable.Creator<Instruments> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f95288a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Instruments(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Instruments[i];
                }
            }

            public Instruments(String ref2) {
                Intrinsics.checkNotNullParameter(ref2, "ref");
                this.f95288a = ref2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Instruments) && Intrinsics.f(this.f95288a, ((Instruments) obj2).f95288a);
            }

            public final int hashCode() {
                return this.f95288a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f95288a);
            }
        }
    }
}
