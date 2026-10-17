package com.revolut.feature.raffle.impl.screen.share_raffle;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.raffle.impl.data.models.RaffleCampaign$ShareInfo;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/raffle/impl/screen/share_raffle/ShareRaffleScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_raffle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShareRaffleScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ShareRaffleScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RaffleCampaign$ShareInfo f81642a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShareRaffleScreenContract$InputData(RaffleCampaign$ShareInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShareRaffleScreenContract$InputData[i];
        }
    }

    public ShareRaffleScreenContract$InputData(RaffleCampaign$ShareInfo shareInfo) {
        Intrinsics.checkNotNullParameter(shareInfo, "shareInfo");
        this.f81642a = shareInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ShareRaffleScreenContract$InputData) && Intrinsics.f(this.f81642a, ((ShareRaffleScreenContract$InputData) obj2).f81642a);
    }

    public final int hashCode() {
        return this.f81642a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f81642a.writeToParcel(dest, i);
    }
}
