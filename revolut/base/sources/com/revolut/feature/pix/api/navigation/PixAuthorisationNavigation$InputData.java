package com.revolut.feature.pix.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/pix/api/navigation/PixAuthorisationNavigation$InputData", "Lcom/revolut/feature/pix/api/navigation/PixNavigation$InputData;", "Request", "Details", "Lcom/revolut/feature/pix/api/navigation/PixAuthorisationNavigation$InputData$Details;", "Lcom/revolut/feature/pix/api/navigation/PixAuthorisationNavigation$InputData$Request;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PixAuthorisationNavigation$InputData extends PixNavigation$InputData {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/navigation/PixAuthorisationNavigation$InputData$Details;", "Lcom/revolut/feature/pix/api/navigation/PixAuthorisationNavigation$InputData;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details implements PixAuthorisationNavigation$InputData {

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80498a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Details(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        public Details(String authorisationId) {
            Intrinsics.checkNotNullParameter(authorisationId, "authorisationId");
            this.f80498a = authorisationId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Details) && Intrinsics.f(this.f80498a, ((Details) obj2).f80498a);
        }

        public final int hashCode() {
            return this.f80498a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80498a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/navigation/PixAuthorisationNavigation$InputData$Request;", "Lcom/revolut/feature/pix/api/navigation/PixAuthorisationNavigation$InputData;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Request implements PixAuthorisationNavigation$InputData {

        @NotNull
        public static final Parcelable.Creator<Request> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PixQrCodeDecodeData f80500b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Request(parcel.readString(), parcel.readInt() == 0 ? null : PixQrCodeDecodeData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Request[i];
            }
        }

        public Request(String authorisationId, PixQrCodeDecodeData pixQrCodeDecodeData) {
            Intrinsics.checkNotNullParameter(authorisationId, "authorisationId");
            this.f80499a = authorisationId;
            this.f80500b = pixQrCodeDecodeData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Request)) {
                return false;
            }
            Request request = (Request) obj2;
            return Intrinsics.f(this.f80499a, request.f80499a) && Intrinsics.f(this.f80500b, request.f80500b);
        }

        public final int hashCode() {
            int iHashCode = this.f80499a.hashCode() * 31;
            PixQrCodeDecodeData pixQrCodeDecodeData = this.f80500b;
            return iHashCode + (pixQrCodeDecodeData == null ? 0 : pixQrCodeDecodeData.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80499a);
            PixQrCodeDecodeData pixQrCodeDecodeData = this.f80500b;
            if (pixQrCodeDecodeData == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                pixQrCodeDecodeData.writeToParcel(dest, i);
            }
        }
    }
}
