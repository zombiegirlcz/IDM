package com.revolut.feature.referrals.common.data.api.domain.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/common/data/api/domain/model/common/ActiveOrPastInvitesInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_common_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ActiveOrPastInvitesInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ActiveOrPastInvitesInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f81705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f81706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActiveOrPastInvitesRewardInfo f81707c;
    public final MaxRewardInfo d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(ActiveOrPastInviteeDetails.CREATOR, parcel, arrayList, iA, 1);
            }
            return new ActiveOrPastInvitesInfo(arrayList, parcel.readInt(), parcel.readInt() == 0 ? null : ActiveOrPastInvitesRewardInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MaxRewardInfo.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActiveOrPastInvitesInfo[i];
        }
    }

    public ActiveOrPastInvitesInfo(ArrayList invites, int i, ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo, MaxRewardInfo maxRewardInfo) {
        Intrinsics.checkNotNullParameter(invites, "invites");
        this.f81705a = invites;
        this.f81706b = i;
        this.f81707c = activeOrPastInvitesRewardInfo;
        this.d = maxRewardInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ActiveOrPastInvitesInfo)) {
            return false;
        }
        ActiveOrPastInvitesInfo activeOrPastInvitesInfo = (ActiveOrPastInvitesInfo) obj2;
        return this.f81705a.equals(activeOrPastInvitesInfo.f81705a) && this.f81706b == activeOrPastInvitesInfo.f81706b && Intrinsics.f(this.f81707c, activeOrPastInvitesInfo.f81707c) && Intrinsics.f(this.d, activeOrPastInvitesInfo.d);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f81706b, this.f81705a.hashCode() * 31, 31);
        ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo = this.f81707c;
        int iHashCode = (iB + (activeOrPastInvitesRewardInfo == null ? 0 : activeOrPastInvitesRewardInfo.hashCode())) * 31;
        MaxRewardInfo maxRewardInfo = this.d;
        return iHashCode + (maxRewardInfo != null ? maxRewardInfo.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f81705a, dest);
        while (itY.hasNext()) {
            ((ActiveOrPastInviteeDetails) itY.next()).writeToParcel(dest, i);
        }
        dest.writeInt(this.f81706b);
        ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo = this.f81707c;
        if (activeOrPastInvitesRewardInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            activeOrPastInvitesRewardInfo.writeToParcel(dest, i);
        }
        MaxRewardInfo maxRewardInfo = this.d;
        if (maxRewardInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            maxRewardInfo.writeToParcel(dest, i);
        }
    }
}
