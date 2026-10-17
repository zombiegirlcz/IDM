package com.revolut.feature.referrals.shared.ui.impl.ui.invites_list;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pwa.i;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_list/InvitesListScreenCampaignType;", "Landroid/os/Parcelable;", "General", "SeparateDeadline", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_list/InvitesListScreenCampaignType$General;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_list/InvitesListScreenCampaignType$SeparateDeadline;", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InvitesListScreenCampaignType extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_list/InvitesListScreenCampaignType$General;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_list/InvitesListScreenCampaignType;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class General implements InvitesListScreenCampaignType {

        @NotNull
        public static final Parcelable.Creator<General> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f81894a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new General(i.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new General[i];
            }
        }

        public General(i type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f81894a = type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof General) && this.f81894a == ((General) obj2).f81894a;
        }

        public final int hashCode() {
            return this.f81894a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81894a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_list/InvitesListScreenCampaignType$SeparateDeadline;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_list/InvitesListScreenCampaignType;", "<init>", "()V", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SeparateDeadline implements InvitesListScreenCampaignType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SeparateDeadline f81895a = new SeparateDeadline();

        @NotNull
        public static final Parcelable.Creator<SeparateDeadline> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SeparateDeadline.f81895a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SeparateDeadline[i];
            }
        }

        private SeparateDeadline() {
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
}
