package com.revolut.retail.feature.airportlounges.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.abexperiments.models.ReleaseFlagExperiment;
import com.revolut.feature.toggles.models.RemoteFeatureDefinition;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class AirportLoungesApi$Toggles {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/api/AirportLoungesApi$Toggles$AirportLoungesAny2Any;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_retail_airport_lounges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AirportLoungesAny2Any extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AirportLoungesAny2Any f98909c = new AirportLoungesAny2Any();

        @NotNull
        public static final Parcelable.Creator<AirportLoungesAny2Any> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AirportLoungesAny2Any.f98909c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AirportLoungesAny2Any[i];
            }
        }

        private AirportLoungesAny2Any() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("loungesAnyToAny");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/api/AirportLoungesApi$Toggles$AirportLoungesPassActivity;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_retail_airport_lounges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AirportLoungesPassActivity extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AirportLoungesPassActivity f98910c = new AirportLoungesPassActivity();

        @NotNull
        public static final Parcelable.Creator<AirportLoungesPassActivity> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AirportLoungesPassActivity.f98910c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AirportLoungesPassActivity[i];
            }
        }

        private AirportLoungesPassActivity() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("loungesPassActivity");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/api/AirportLoungesApi$Toggles$AirportLoungesQrCodeBrightness;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_retail_airport_lounges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AirportLoungesQrCodeBrightness extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AirportLoungesQrCodeBrightness f98911c = new AirportLoungesQrCodeBrightness();

        @NotNull
        public static final Parcelable.Creator<AirportLoungesQrCodeBrightness> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AirportLoungesQrCodeBrightness.f98911c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AirportLoungesQrCodeBrightness[i];
            }
        }

        private AirportLoungesQrCodeBrightness() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("airportQRCodeBrightness");
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

    private AirportLoungesApi$Toggles() {
    }

    public static List a() {
        return v.k(AirportLoungesAny2Any.f98909c, AirportLoungesPassActivity.f98910c, AirportLoungesQrCodeBrightness.f98911c);
    }
}
