package com.revolut.feature.add_card_to_google_pay_shared.api.confirm;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/add_card_to_google_pay_shared/api/confirm/GooglePayOtpVerificationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_add_card_to_google_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GooglePayOtpVerificationDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<GooglePayOtpVerificationDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f60858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f60859b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(GooglePayOtpVerificationDestination.class, parcel, arrayList, iE, 1);
            }
            return new GooglePayOtpVerificationDestination(arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GooglePayOtpVerificationDestination[i];
        }
    }

    public GooglePayOtpVerificationDestination(List cardOtpList, boolean z) {
        Intrinsics.checkNotNullParameter(cardOtpList, "cardOtpList");
        this.f60858a = cardOtpList;
        this.f60859b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof GooglePayOtpVerificationDestination)) {
            return false;
        }
        GooglePayOtpVerificationDestination googlePayOtpVerificationDestination = (GooglePayOtpVerificationDestination) obj2;
        return Intrinsics.f(this.f60858a, googlePayOtpVerificationDestination.f60858a) && this.f60859b == googlePayOtpVerificationDestination.f60859b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f60859b) + (this.f60858a.hashCode() * 31);
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: n1, reason: from getter */
    public final boolean getF60859b() {
        return this.f60859b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f60858a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeInt(this.f60859b ? 1 : 0);
    }
}
