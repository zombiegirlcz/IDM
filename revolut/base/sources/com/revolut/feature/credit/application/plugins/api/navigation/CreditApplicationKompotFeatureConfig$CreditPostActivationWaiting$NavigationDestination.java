package com.revolut.feature.credit.application.plugins.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/revolut/feature/credit/application/plugins/api/navigation/CreditApplicationKompotFeatureConfig$CreditPostActivationWaiting$NavigationDestination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditApplicationKompotFeatureConfig$CreditPostActivationWaiting$NavigationDestination implements KompotDestination {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CreditApplicationKompotFeatureConfig$CreditPostActivationWaiting$NavigationDestination f66614a = new CreditApplicationKompotFeatureConfig$CreditPostActivationWaiting$NavigationDestination();

    @NotNull
    public static final Parcelable.Creator<CreditApplicationKompotFeatureConfig$CreditPostActivationWaiting$NavigationDestination> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return CreditApplicationKompotFeatureConfig$CreditPostActivationWaiting$NavigationDestination.f66614a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditApplicationKompotFeatureConfig$CreditPostActivationWaiting$NavigationDestination[i];
        }
    }

    private CreditApplicationKompotFeatureConfig$CreditPostActivationWaiting$NavigationDestination() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof CreditApplicationKompotFeatureConfig$CreditPostActivationWaiting$NavigationDestination);
    }

    public final int hashCode() {
        return -1916095030;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
