package com.revolut.feature.referrals.common.data.api.domain.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/referrals/common/data/api/domain/model/common/InviteTransactionWidget;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Action", "feature_shared_referrals_common_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InviteTransactionWidget implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InviteTransactionWidget> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Action f81730c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/common/data/api/domain/model/common/InviteTransactionWidget$Action;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_common_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Action implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Action> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81732b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Action(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Action[i];
            }
        }

        public Action(String title, String deeplink) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.f81731a = title;
            this.f81732b = deeplink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Action)) {
                return false;
            }
            Action action = (Action) obj2;
            return Intrinsics.f(this.f81731a, action.f81731a) && Intrinsics.f(this.f81732b, action.f81732b);
        }

        public final int hashCode() {
            return this.f81732b.hashCode() + (this.f81731a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81731a);
            dest.writeString(this.f81732b);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InviteTransactionWidget(parcel.readString(), parcel.readString(), Action.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InviteTransactionWidget[i];
        }
    }

    public InviteTransactionWidget(String title, String subtitle, Action cta2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(cta2, "cta");
        this.f81728a = title;
        this.f81729b = subtitle;
        this.f81730c = cta2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InviteTransactionWidget)) {
            return false;
        }
        InviteTransactionWidget inviteTransactionWidget = (InviteTransactionWidget) obj2;
        return Intrinsics.f(this.f81728a, inviteTransactionWidget.f81728a) && Intrinsics.f(this.f81729b, inviteTransactionWidget.f81729b) && Intrinsics.f(this.f81730c, inviteTransactionWidget.f81730c);
    }

    public final int hashCode() {
        return this.f81730c.hashCode() + p.a.c(this.f81728a.hashCode() * 31, 31, this.f81729b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81728a);
        dest.writeString(this.f81729b);
        this.f81730c.writeToParcel(dest, i);
    }
}
