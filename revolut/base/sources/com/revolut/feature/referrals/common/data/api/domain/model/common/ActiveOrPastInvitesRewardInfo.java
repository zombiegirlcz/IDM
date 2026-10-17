package com.revolut.feature.referrals.common.data.api.domain.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/common/data/api/domain/model/common/ActiveOrPastInvitesRewardInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_common_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ActiveOrPastInvitesRewardInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ActiveOrPastInvitesRewardInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f81708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f81709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f81710c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ActiveOrPastInvitesRewardInfo((d) parcel.readSerializable(), parcel.readString(), parcel.readString(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActiveOrPastInvitesRewardInfo[i];
        }
    }

    public ActiveOrPastInvitesRewardInfo(d money, String str, String str2, b bVar) {
        Intrinsics.checkNotNullParameter(money, "money");
        this.f81708a = money;
        this.f81709b = bVar;
        this.f81710c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ActiveOrPastInvitesRewardInfo)) {
            return false;
        }
        ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo = (ActiveOrPastInvitesRewardInfo) obj2;
        return Intrinsics.f(this.f81708a, activeOrPastInvitesRewardInfo.f81708a) && Intrinsics.f(this.f81709b, activeOrPastInvitesRewardInfo.f81709b) && Intrinsics.f(this.f81710c, activeOrPastInvitesRewardInfo.f81710c) && Intrinsics.f(this.d, activeOrPastInvitesRewardInfo.d);
    }

    public final int hashCode() {
        int iHashCode = this.f81708a.hashCode() * 31;
        b bVar = this.f81709b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.f81710c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f81708a);
        dest.writeSerializable(this.f81709b);
        dest.writeString(this.f81710c);
        dest.writeString(this.d);
    }
}
