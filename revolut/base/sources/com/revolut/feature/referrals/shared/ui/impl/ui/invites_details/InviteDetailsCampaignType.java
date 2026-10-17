package com.revolut.feature.referrals.shared.ui.impl.ui.invites_details;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_details/InviteDetailsCampaignType;", "Landroid/os/Parcelable;", "SeparateDeadline", "General", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_details/InviteDetailsCampaignType$General;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_details/InviteDetailsCampaignType$SeparateDeadline;", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InviteDetailsCampaignType extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_details/InviteDetailsCampaignType$General;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_details/InviteDetailsCampaignType;", "<init>", "()V", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class General implements InviteDetailsCampaignType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final General f81866a = new General();

        @NotNull
        public static final Parcelable.Creator<General> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return General.f81866a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new General[i];
            }
        }

        private General() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_details/InviteDetailsCampaignType$SeparateDeadline;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_details/InviteDetailsCampaignType;", "<init>", "()V", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SeparateDeadline implements InviteDetailsCampaignType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SeparateDeadline f81867a = new SeparateDeadline();

        @NotNull
        public static final Parcelable.Creator<SeparateDeadline> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SeparateDeadline.f81867a;
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
