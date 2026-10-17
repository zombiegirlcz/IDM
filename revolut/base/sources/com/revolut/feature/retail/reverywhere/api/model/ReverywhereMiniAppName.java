package com.revolut.feature.retail.reverywhere.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0004\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/reverywhere/api/model/ReverywhereMiniAppName;", "Landroid/os/Parcelable;", "Companion", "AirportTransfers", "Stations", "LuggageStorage", "Other", "a", "Lcom/revolut/feature/retail/reverywhere/api/model/ReverywhereMiniAppName$AirportTransfers;", "Lcom/revolut/feature/retail/reverywhere/api/model/ReverywhereMiniAppName$LuggageStorage;", "Lcom/revolut/feature/retail/reverywhere/api/model/ReverywhereMiniAppName$Other;", "Lcom/revolut/feature/retail/reverywhere/api/model/ReverywhereMiniAppName$Stations;", "feature_retail_reverywhere_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ReverywhereMiniAppName extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f82891a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/reverywhere/api/model/ReverywhereMiniAppName$AirportTransfers;", "Lcom/revolut/feature/retail/reverywhere/api/model/ReverywhereMiniAppName;", "<init>", "()V", "feature_retail_reverywhere_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AirportTransfers implements ReverywhereMiniAppName {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AirportTransfers f82887a = new AirportTransfers();

        @NotNull
        public static final Parcelable.Creator<AirportTransfers> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AirportTransfers.f82887a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AirportTransfers[i];
            }
        }

        private AirportTransfers() {
        }

        @Override // com.revolut.feature.retail.reverywhere.api.model.ReverywhereMiniAppName
        /* JADX INFO: renamed from: K0 */
        public final String getF82889a() {
            return "AIRPORT_TRANSFERS";
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/reverywhere/api/model/ReverywhereMiniAppName$LuggageStorage;", "Lcom/revolut/feature/retail/reverywhere/api/model/ReverywhereMiniAppName;", "<init>", "()V", "feature_retail_reverywhere_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LuggageStorage implements ReverywhereMiniAppName {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LuggageStorage f82888a = new LuggageStorage();

        @NotNull
        public static final Parcelable.Creator<LuggageStorage> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LuggageStorage.f82888a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LuggageStorage[i];
            }
        }

        private LuggageStorage() {
        }

        @Override // com.revolut.feature.retail.reverywhere.api.model.ReverywhereMiniAppName
        /* JADX INFO: renamed from: K0 */
        public final String getF82889a() {
            return "LUGGAGE_STORAGE";
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/reverywhere/api/model/ReverywhereMiniAppName$Other;", "Lcom/revolut/feature/retail/reverywhere/api/model/ReverywhereMiniAppName;", "", "toString", "()Ljava/lang/String;", "feature_retail_reverywhere_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Other implements ReverywhereMiniAppName {

        @NotNull
        public static final Parcelable.Creator<Other> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82889a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Other(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Other[i];
            }
        }

        public Other(String raw) {
            Intrinsics.checkNotNullParameter(raw, "raw");
            this.f82889a = raw;
        }

        @Override // com.revolut.feature.retail.reverywhere.api.model.ReverywhereMiniAppName
        /* JADX INFO: renamed from: K0, reason: from getter */
        public final String getF82889a() {
            return this.f82889a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Other) && Intrinsics.f(this.f82889a, ((Other) obj2).f82889a);
        }

        public final int hashCode() {
            return this.f82889a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82889a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/reverywhere/api/model/ReverywhereMiniAppName$Stations;", "Lcom/revolut/feature/retail/reverywhere/api/model/ReverywhereMiniAppName;", "<init>", "()V", "feature_retail_reverywhere_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Stations implements ReverywhereMiniAppName {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Stations f82890a = new Stations();

        @NotNull
        public static final Parcelable.Creator<Stations> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Stations.f82890a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Stations[i];
            }
        }

        private Stations() {
        }

        @Override // com.revolut.feature.retail.reverywhere.api.model.ReverywhereMiniAppName
        /* JADX INFO: renamed from: K0 */
        public final String getF82889a() {
            return "STATIONS";
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

    /* JADX INFO: renamed from: com.revolut.feature.retail.reverywhere.api.model.ReverywhereMiniAppName$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f82891a = new Companion();

        private Companion() {
        }

        public static ReverywhereMiniAppName a(String raw) {
            Intrinsics.checkNotNullParameter(raw, "raw");
            int iHashCode = raw.hashCode();
            if (iHashCode != -1547133132) {
                if (iHashCode != -1068479694) {
                    if (iHashCode == 2100958655 && raw.equals("STATIONS")) {
                        return Stations.f82890a;
                    }
                } else if (raw.equals("LUGGAGE_STORAGE")) {
                    return LuggageStorage.f82888a;
                }
            } else if (raw.equals("AIRPORT_TRANSFERS")) {
                return AirportTransfers.f82887a;
            }
            return new Other(raw);
        }
    }

    /* JADX INFO: renamed from: K0 */
    String getF82889a();
}
