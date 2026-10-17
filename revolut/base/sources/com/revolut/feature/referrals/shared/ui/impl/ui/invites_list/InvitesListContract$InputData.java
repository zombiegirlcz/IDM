package com.revolut.feature.referrals.shared.ui.impl.ui.invites_list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pwa.n;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/referrals/shared/ui/impl/ui/invites_list/InvitesListContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "InviteMoreState", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvitesListContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InvitesListContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvitesListScreenCampaignType f81887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f81888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InviteMoreState f81889c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_list/InvitesListContract$InputData$InviteMoreState;", "Landroid/os/Parcelable;", "Enabled", "Disabled", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_list/InvitesListContract$InputData$InviteMoreState$Disabled;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_list/InvitesListContract$InputData$InviteMoreState$Enabled;", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InviteMoreState extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_list/InvitesListContract$InputData$InviteMoreState$Disabled;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_list/InvitesListContract$InputData$InviteMoreState;", "<init>", "()V", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Disabled implements InviteMoreState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Disabled f81890a = new Disabled();

            @NotNull
            public static final Parcelable.Creator<Disabled> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Disabled.f81890a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Disabled[i];
                }
            }

            private Disabled() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_list/InvitesListContract$InputData$InviteMoreState$Enabled;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_list/InvitesListContract$InputData$InviteMoreState;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Enabled implements InviteMoreState {

            @NotNull
            public static final Parcelable.Creator<Enabled> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f81891a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f81892b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Enabled(parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Enabled[i];
                }
            }

            public Enabled(String inviteText, boolean z) {
                Intrinsics.checkNotNullParameter(inviteText, "inviteText");
                this.f81891a = inviteText;
                this.f81892b = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Enabled)) {
                    return false;
                }
                Enabled enabled = (Enabled) obj2;
                return Intrinsics.f(this.f81891a, enabled.f81891a) && this.f81892b == enabled.f81892b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f81892b) + (this.f81891a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f81891a);
                dest.writeInt(this.f81892b ? 1 : 0);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            InvitesListScreenCampaignType invitesListScreenCampaignType = (InvitesListScreenCampaignType) parcel.readParcelable(InvitesListContract$InputData.class.getClassLoader());
            n nVarValueOf = n.valueOf(parcel.readString());
            InviteMoreState inviteMoreState = (InviteMoreState) parcel.readParcelable(InvitesListContract$InputData.class.getClassLoader());
            boolean z4 = false;
            boolean z6 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z6 = z;
            }
            if (parcel.readInt() == 0) {
                z3 = z;
            }
            return new InvitesListContract$InputData(invitesListScreenCampaignType, nVarValueOf, inviteMoreState, z4, z6, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvitesListContract$InputData[i];
        }
    }

    public InvitesListContract$InputData(InvitesListScreenCampaignType invitesListScreenCampaignType, n referralCampaignV4Type, InviteMoreState inviteMoreState, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(invitesListScreenCampaignType, "invitesListScreenCampaignType");
        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
        Intrinsics.checkNotNullParameter(inviteMoreState, "inviteMoreState");
        this.f81887a = invitesListScreenCampaignType;
        this.f81888b = referralCampaignV4Type;
        this.f81889c = inviteMoreState;
        this.d = z;
        this.e = z3;
        this.f = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvitesListContract$InputData)) {
            return false;
        }
        InvitesListContract$InputData invitesListContract$InputData = (InvitesListContract$InputData) obj2;
        return Intrinsics.f(this.f81887a, invitesListContract$InputData.f81887a) && this.f81888b == invitesListContract$InputData.f81888b && Intrinsics.f(this.f81889c, invitesListContract$InputData.f81889c) && this.d == invitesListContract$InputData.d && this.e == invitesListContract$InputData.e && this.f == invitesListContract$InputData.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c((this.f81889c.hashCode() + ((this.f81888b.hashCode() + (this.f81887a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f81887a, i);
        dest.writeString(this.f81888b.name());
        dest.writeParcelable(this.f81889c, i);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
    }
}
