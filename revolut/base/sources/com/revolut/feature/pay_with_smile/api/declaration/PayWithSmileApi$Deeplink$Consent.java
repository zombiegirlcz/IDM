package com.revolut.feature.pay_with_smile.api.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pay_with_smile/api/declaration/PayWithSmileApi$Deeplink$Consent", "", "", "toString", "()Ljava/lang/String;", "feature_pay_with_smile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PayWithSmileApi$Deeplink$Consent implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<PayWithSmileApi$Deeplink$Consent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78947a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PayWithSmileApi$Deeplink$Consent(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PayWithSmileApi$Deeplink$Consent[i];
        }
    }

    public PayWithSmileApi$Deeplink$Consent() {
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
        return (obj2 instanceof PayWithSmileApi$Deeplink$Consent) && Intrinsics.f(this.f78947a, ((PayWithSmileApi$Deeplink$Consent) obj2).f78947a);
    }

    public final int hashCode() {
        String str = this.f78947a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78947a);
    }

    public PayWithSmileApi$Deeplink$Consent(String str) {
        this.f78947a = str;
    }
}
