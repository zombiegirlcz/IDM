package com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import fyi.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import svi.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/retail/feature/airportlounges/impl/ui/screens/pass_details/AirportLoungePassDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "PreloadedScreenData", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AirportLoungePassDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AirportLoungePassDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PreloadedScreenData f99122a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/pass_details/AirportLoungePassDetailsScreenContract$InputData$PreloadedScreenData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PreloadedScreenData implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PreloadedScreenData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f99123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f99124b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PreloadedScreenData((k) parcel.readSerializable(), (e) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PreloadedScreenData[i];
            }
        }

        public PreloadedScreenData(k pass, e loungePassQrCode) {
            Intrinsics.checkNotNullParameter(pass, "pass");
            Intrinsics.checkNotNullParameter(loungePassQrCode, "loungePassQrCode");
            this.f99123a = pass;
            this.f99124b = loungePassQrCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PreloadedScreenData)) {
                return false;
            }
            PreloadedScreenData preloadedScreenData = (PreloadedScreenData) obj2;
            return Intrinsics.f(this.f99123a, preloadedScreenData.f99123a) && Intrinsics.f(this.f99124b, preloadedScreenData.f99124b);
        }

        public final int hashCode() {
            return this.f99124b.hashCode() + (this.f99123a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f99123a);
            dest.writeSerializable(this.f99124b);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AirportLoungePassDetailsScreenContract$InputData(parcel.readInt() == 0 ? null : PreloadedScreenData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AirportLoungePassDetailsScreenContract$InputData[i];
        }
    }

    public AirportLoungePassDetailsScreenContract$InputData(PreloadedScreenData preloadedScreenData) {
        this.f99122a = preloadedScreenData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof AirportLoungePassDetailsScreenContract$InputData) && Intrinsics.f(this.f99122a, ((AirportLoungePassDetailsScreenContract$InputData) obj2).f99122a);
    }

    public final int hashCode() {
        PreloadedScreenData preloadedScreenData = this.f99122a;
        if (preloadedScreenData == null) {
            return 0;
        }
        return preloadedScreenData.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        PreloadedScreenData preloadedScreenData = this.f99122a;
        if (preloadedScreenData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            preloadedScreenData.writeToParcel(dest, i);
        }
    }

    public AirportLoungePassDetailsScreenContract$InputData() {
        this(null);
    }
}
