package com.revolut.retail.feature.trading_onboarding.impl.ui.extended_hours;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/trading_onboarding/impl/ui/extended_hours/ExtendedHoursBackendFlowContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExtendedHoursBackendFlowContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExtendedHoursBackendFlowContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NaviCommand f104154b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExtendedHoursBackendFlowContract$Configuration((NaviCommand) parcel.readParcelable(ExtendedHoursBackendFlowContract$Configuration.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExtendedHoursBackendFlowContract$Configuration[i];
        }
    }

    public ExtendedHoursBackendFlowContract$Configuration(NaviCommand naviCommand, String portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f104153a = portfolioId;
        this.f104154b = naviCommand;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExtendedHoursBackendFlowContract$Configuration)) {
            return false;
        }
        ExtendedHoursBackendFlowContract$Configuration extendedHoursBackendFlowContract$Configuration = (ExtendedHoursBackendFlowContract$Configuration) obj2;
        return Intrinsics.f(this.f104153a, extendedHoursBackendFlowContract$Configuration.f104153a) && Intrinsics.f(this.f104154b, extendedHoursBackendFlowContract$Configuration.f104154b);
    }

    public final int hashCode() {
        int iHashCode = this.f104153a.hashCode() * 31;
        NaviCommand naviCommand = this.f104154b;
        return iHashCode + (naviCommand == null ? 0 : naviCommand.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104153a);
        dest.writeParcelable(this.f104154b, i);
    }
}
