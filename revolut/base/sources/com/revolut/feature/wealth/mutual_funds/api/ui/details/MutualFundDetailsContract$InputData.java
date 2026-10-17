package com.revolut.feature.wealth.mutual_funds.api.ui.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/revolut/feature/wealth/mutual_funds/api/ui/details/MutualFundDetailsContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_wealth_mutual_funds_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MutualFundDetailsContract$InputData implements IOData$Input {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutualFundDetailsContract$MutualFundDetailsScreenConfig f95714a;

    @NotNull
    public static final Parcelable.Creator<MutualFundDetailsContract$InputData> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MutualFundDetailsContract$InputData(MutualFundDetailsContract$MutualFundDetailsScreenConfig.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MutualFundDetailsContract$InputData[i];
        }
    }

    public MutualFundDetailsContract$InputData(MutualFundDetailsContract$MutualFundDetailsScreenConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f95714a = config;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof MutualFundDetailsContract$InputData) && Intrinsics.f(this.f95714a, ((MutualFundDetailsContract$InputData) obj2).f95714a);
    }

    public final int hashCode() {
        return this.f95714a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f95714a.writeToParcel(dest, i);
    }
}
