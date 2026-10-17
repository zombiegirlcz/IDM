package com.revolut.feature.add_card_to_google_pay_shared.api.confirm;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/add_card_to_google_pay_shared/api/confirm/GooglePayConfirmationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_add_card_to_google_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GooglePayConfirmationDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<GooglePayConfirmationDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f60857b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GooglePayConfirmationDestination(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GooglePayConfirmationDestination[i];
        }
    }

    public GooglePayConfirmationDestination(String cardInfoEncodedBase64, boolean z) {
        Intrinsics.checkNotNullParameter(cardInfoEncodedBase64, "cardInfoEncodedBase64");
        this.f60856a = cardInfoEncodedBase64;
        this.f60857b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof GooglePayConfirmationDestination)) {
            return false;
        }
        GooglePayConfirmationDestination googlePayConfirmationDestination = (GooglePayConfirmationDestination) obj2;
        return Intrinsics.f(this.f60856a, googlePayConfirmationDestination.f60856a) && this.f60857b == googlePayConfirmationDestination.f60857b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f60857b) + (this.f60856a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60856a);
        dest.writeInt(this.f60857b ? 1 : 0);
    }
}
