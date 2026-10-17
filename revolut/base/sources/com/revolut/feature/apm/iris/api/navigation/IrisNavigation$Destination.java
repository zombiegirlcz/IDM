package com.revolut.feature.apm.iris.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.transfers.ApmPaymentProfile;
import com.revolut.feature.apm.iris.api.navigation.IrisNavigation$StartType;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/revolut/feature/apm/iris/api/navigation/IrisNavigation$Destination", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/apm/iris/api/navigation/IrisNavigation$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_apm_iris_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IrisNavigation$Destination extends InternalDestination<IrisNavigation$InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<IrisNavigation$Destination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IrisNavigation$StartType f62481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ApmPaymentProfile f62482c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IrisNavigation$Destination((IrisNavigation$StartType) parcel.readParcelable(IrisNavigation$Destination.class.getClassLoader()), (ApmPaymentProfile) parcel.readParcelable(IrisNavigation$Destination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IrisNavigation$Destination[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IrisNavigation$Destination() {
        this(null, 0 == true ? 1 : 0, 3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IrisNavigation$Destination)) {
            return false;
        }
        IrisNavigation$Destination irisNavigation$Destination = (IrisNavigation$Destination) obj2;
        return Intrinsics.f(this.f62481b, irisNavigation$Destination.f62481b) && this.f62482c == irisNavigation$Destination.f62482c;
    }

    public final int hashCode() {
        return this.f62482c.hashCode() + (this.f62481b.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f62481b, i);
        dest.writeParcelable(this.f62482c, i);
    }

    public /* synthetic */ IrisNavigation$Destination(IrisNavigation$StartType irisNavigation$StartType, ApmPaymentProfile apmPaymentProfile, int i) {
        this((i & 1) != 0 ? IrisNavigation$StartType.Area.f62485a : irisNavigation$StartType, (i & 2) != 0 ? ApmPaymentProfile.PERSONAL : apmPaymentProfile);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IrisNavigation$Destination(IrisNavigation$StartType startType, ApmPaymentProfile profile) {
        super(new IrisNavigation$InputData(startType, profile));
        Intrinsics.checkNotNullParameter(startType, "startType");
        Intrinsics.checkNotNullParameter(profile, "profile");
        this.f62481b = startType;
        this.f62482c = profile;
    }
}
