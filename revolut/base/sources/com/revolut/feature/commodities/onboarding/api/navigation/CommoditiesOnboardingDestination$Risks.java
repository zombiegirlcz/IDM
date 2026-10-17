package com.revolut.feature.commodities.onboarding.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/revolut/feature/commodities/onboarding/api/navigation/CommoditiesOnboardingDestination$Risks", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "", "", "toString", "()Ljava/lang/String;", "feature_commodities_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CommoditiesOnboardingDestination$Risks extends InternalDestination<IOData$EmptyInput> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CommoditiesOnboardingDestination$Risks> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NaviCommand f65948b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CommoditiesOnboardingDestination$Risks((NaviCommand) parcel.readParcelable(CommoditiesOnboardingDestination$Risks.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CommoditiesOnboardingDestination$Risks[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommoditiesOnboardingDestination$Risks(NaviCommand nextCommand) {
        super(IOData$EmptyInput.f98299a);
        Intrinsics.checkNotNullParameter(nextCommand, "nextCommand");
        this.f65948b = nextCommand;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CommoditiesOnboardingDestination$Risks) && Intrinsics.f(this.f65948b, ((CommoditiesOnboardingDestination$Risks) obj2).f65948b);
    }

    public final int hashCode() {
        return this.f65948b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f65948b, i);
    }
}
