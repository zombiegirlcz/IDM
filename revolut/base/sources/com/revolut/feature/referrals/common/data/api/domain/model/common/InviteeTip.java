package com.revolut.feature.referrals.common.data.api.domain.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/common/data/api/domain/model/common/InviteeTip;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_common_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InviteeTip implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InviteeTip> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f81740c;
    public final String d;
    public final InviteeTipAction e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InviteeTip(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : InviteeTipAction.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InviteeTip[i];
        }
    }

    public InviteeTip(String icon, String title, String subtitle, String description, InviteeTipAction inviteeTipAction) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f81738a = icon;
        this.f81739b = title;
        this.f81740c = subtitle;
        this.d = description;
        this.e = inviteeTipAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InviteeTip)) {
            return false;
        }
        InviteeTip inviteeTip = (InviteeTip) obj2;
        return Intrinsics.f(this.f81738a, inviteeTip.f81738a) && Intrinsics.f(this.f81739b, inviteeTip.f81739b) && Intrinsics.f(this.f81740c, inviteeTip.f81740c) && Intrinsics.f(this.d, inviteeTip.d) && Intrinsics.f(this.e, inviteeTip.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f81738a.hashCode() * 31, 31, this.f81739b), 31, this.f81740c), 31, this.d);
        InviteeTipAction inviteeTipAction = this.e;
        return iC + (inviteeTipAction == null ? 0 : inviteeTipAction.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81738a);
        dest.writeString(this.f81739b);
        dest.writeString(this.f81740c);
        dest.writeString(this.d);
        InviteeTipAction inviteeTipAction = this.e;
        if (inviteeTipAction == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inviteeTipAction.writeToParcel(dest, i);
        }
    }
}
