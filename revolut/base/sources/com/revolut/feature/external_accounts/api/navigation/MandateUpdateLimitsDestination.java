package com.revolut.feature.external_accounts.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.external_accounts.api.model.Mandate;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/MandateUpdateLimitsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MandateUpdateLimitsDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<MandateUpdateLimitsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mandate f72337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f72338b;

    /* JADX INFO: loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MandateUpdateLimitsDestination(Mandate.CREATOR.createFromParcel(parcel), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MandateUpdateLimitsDestination[i];
        }
    }

    public MandateUpdateLimitsDestination(Mandate mandate, d topupAmount) {
        Intrinsics.checkNotNullParameter(mandate, "mandate");
        Intrinsics.checkNotNullParameter(topupAmount, "topupAmount");
        this.f72337a = mandate;
        this.f72338b = topupAmount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MandateUpdateLimitsDestination)) {
            return false;
        }
        MandateUpdateLimitsDestination mandateUpdateLimitsDestination = (MandateUpdateLimitsDestination) obj2;
        return Intrinsics.f(this.f72337a, mandateUpdateLimitsDestination.f72337a) && Intrinsics.f(this.f72338b, mandateUpdateLimitsDestination.f72338b);
    }

    public final int hashCode() {
        return this.f72338b.hashCode() + (this.f72337a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f72337a.writeToParcel(dest, i);
        dest.writeSerializable(this.f72338b);
    }
}
