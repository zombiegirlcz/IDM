package com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/revolut/retail/feature/trading_onboarding/impl/ui/failed_prompt/flow/GiaOnboardingFailedFlowContract$Destination", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/retail/feature/trading_onboarding/impl/ui/failed_prompt/flow/GiaOnboardingFailedFlowContract$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GiaOnboardingFailedFlowContract$Destination extends InternalDestination<GiaOnboardingFailedFlowContract$InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<GiaOnboardingFailedFlowContract$Destination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GiaOnboardingFailedFlowContract$InputData f104156b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GiaOnboardingFailedFlowContract$Destination(GiaOnboardingFailedFlowContract$InputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GiaOnboardingFailedFlowContract$Destination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiaOnboardingFailedFlowContract$Destination(GiaOnboardingFailedFlowContract$InputData input) {
        super(input);
        Intrinsics.checkNotNullParameter(input, "input");
        this.f104156b = input;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof GiaOnboardingFailedFlowContract$Destination) && Intrinsics.f(this.f104156b, ((GiaOnboardingFailedFlowContract$Destination) obj2).f104156b);
    }

    public final int hashCode() {
        return this.f104156b.f104157a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f104156b.writeToParcel(dest, i);
    }
}
