package com.revolut.feature.apm.payto.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import j02.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/payto/api/navigation/PayToConfirmationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_apm_payto_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PayToConfirmationDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<PayToConfirmationDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f62743b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PayToConfirmationDestination(parcel.readString(), n.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PayToConfirmationDestination[i];
        }
    }

    public PayToConfirmationDestination(String id10, n type) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f62742a = id10;
        this.f62743b = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PayToConfirmationDestination)) {
            return false;
        }
        PayToConfirmationDestination payToConfirmationDestination = (PayToConfirmationDestination) obj2;
        return Intrinsics.f(this.f62742a, payToConfirmationDestination.f62742a) && this.f62743b == payToConfirmationDestination.f62743b;
    }

    public final int hashCode() {
        return this.f62743b.hashCode() + (this.f62742a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f62742a);
        dest.writeString(this.f62743b.name());
    }
}
