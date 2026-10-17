package com.revolut.feature.payees.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payees.api.models.PayeesInputData;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payees/api/navigation/PayeesDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_payees_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PayeesDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<PayeesDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayeesInputData f78991a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PayeesDestination(PayeesInputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PayeesDestination[i];
        }
    }

    public PayeesDestination(PayeesInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f78991a = inputData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PayeesDestination) && Intrinsics.f(this.f78991a, ((PayeesDestination) obj2).f78991a);
    }

    public final int hashCode() {
        return this.f78991a.f78987a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f78991a.writeToParcel(dest, i);
    }
}
