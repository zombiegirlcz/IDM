package com.revolut.feature.pix.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.pix.api.model.PixKey;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeData;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/pix/api/navigation/PixQrNavigation$InputData", "Lcom/revolut/feature/pix/api/navigation/PixNavigation$InputData;", "Send", "Request", "Lcom/revolut/feature/pix/api/navigation/PixQrNavigation$InputData$Request;", "Lcom/revolut/feature/pix/api/navigation/PixQrNavigation$InputData$Send;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PixQrNavigation$InputData extends PixNavigation$InputData {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/navigation/PixQrNavigation$InputData$Request;", "Lcom/revolut/feature/pix/api/navigation/PixQrNavigation$InputData;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Request implements PixQrNavigation$InputData {

        @NotNull
        public static final Parcelable.Creator<Request> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PixKey f80515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f80516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AccountId f80517c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Request((AccountId) parcel.readParcelable(Request.class.getClassLoader()), (PixKey) parcel.readParcelable(Request.class.getClassLoader()), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Request[i];
            }
        }

        public Request(AccountId accountId, PixKey pixKey, d dVar) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f80515a = pixKey;
            this.f80516b = dVar;
            this.f80517c = accountId;
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
            return Intrinsics.f(this.f80515a, request.f80515a) && Intrinsics.f(this.f80516b, request.f80516b) && Intrinsics.f(this.f80517c, request.f80517c);
        }

        public final int hashCode() {
            PixKey pixKey = this.f80515a;
            int iHashCode = (pixKey == null ? 0 : pixKey.hashCode()) * 31;
            d dVar = this.f80516b;
            return this.f80517c.hashCode() + ((iHashCode + (dVar != null ? dVar.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80515a, i);
            dest.writeSerializable(this.f80516b);
            dest.writeParcelable(this.f80517c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/navigation/PixQrNavigation$InputData$Send;", "Lcom/revolut/feature/pix/api/navigation/PixQrNavigation$InputData;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Send implements PixQrNavigation$InputData {

        @NotNull
        public static final Parcelable.Creator<Send> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PixQrCodeDecodeData f80519b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Send(parcel.readString(), PixQrCodeDecodeData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Send[i];
            }
        }

        public Send(String decodedOperationId, PixQrCodeDecodeData qrCodeDecodeData) {
            Intrinsics.checkNotNullParameter(decodedOperationId, "decodedOperationId");
            Intrinsics.checkNotNullParameter(qrCodeDecodeData, "qrCodeDecodeData");
            this.f80518a = decodedOperationId;
            this.f80519b = qrCodeDecodeData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Send)) {
                return false;
            }
            Send send = (Send) obj2;
            return Intrinsics.f(this.f80518a, send.f80518a) && Intrinsics.f(this.f80519b, send.f80519b);
        }

        public final int hashCode() {
            return this.f80519b.hashCode() + (this.f80518a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80518a);
            this.f80519b.writeToParcel(dest, i);
        }
    }
}
