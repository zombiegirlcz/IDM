package com.revolut.feature.wealth.mutual_funds.api.ui.details;

import android.os.Parcel;
import android.os.Parcelable;
import eel.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/mutual_funds/api/ui/details/MutualFundDetailsContract$MutualFundDetailsScreenConfig", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_mutual_funds_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MutualFundDetailsContract$MutualFundDetailsScreenConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MutualFundDetailsContract$MutualFundDetailsScreenConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f95716b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MutualFundDetailsContract$MutualFundDetailsScreenConfig(parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MutualFundDetailsContract$MutualFundDetailsScreenConfig[i];
        }
    }

    public MutualFundDetailsContract$MutualFundDetailsScreenConfig(c cVar, String securityRef) {
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        this.f95715a = securityRef;
        this.f95716b = cVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MutualFundDetailsContract$MutualFundDetailsScreenConfig)) {
            return false;
        }
        MutualFundDetailsContract$MutualFundDetailsScreenConfig mutualFundDetailsContract$MutualFundDetailsScreenConfig = (MutualFundDetailsContract$MutualFundDetailsScreenConfig) obj2;
        return Intrinsics.f(this.f95715a, mutualFundDetailsContract$MutualFundDetailsScreenConfig.f95715a) && this.f95716b == mutualFundDetailsContract$MutualFundDetailsScreenConfig.f95716b;
    }

    public final int hashCode() {
        int iHashCode = this.f95715a.hashCode() * 31;
        c cVar = this.f95716b;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f95715a);
        c cVar = this.f95716b;
        if (cVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cVar.name());
        }
    }
}
