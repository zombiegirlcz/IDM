package com.revolut.feature.payments.groups.impl.mappers.settings;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oq9.o;
import org.jetbrains.annotations.NotNull;
import st9.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/mappers/settings/GroupSettingsAction;", "Landroid/os/Parcelable;", "<init>", "()V", "RemoveMember", "ReInviteMember", "SmartSettlementSetting", "LeaveGroup", "Report", "Lcom/revolut/feature/payments/groups/impl/mappers/settings/GroupSettingsAction$LeaveGroup;", "Lcom/revolut/feature/payments/groups/impl/mappers/settings/GroupSettingsAction$ReInviteMember;", "Lcom/revolut/feature/payments/groups/impl/mappers/settings/GroupSettingsAction$RemoveMember;", "Lcom/revolut/feature/payments/groups/impl/mappers/settings/GroupSettingsAction$Report;", "Lcom/revolut/feature/payments/groups/impl/mappers/settings/GroupSettingsAction$SmartSettlementSetting;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class GroupSettingsAction implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/mappers/settings/GroupSettingsAction$LeaveGroup;", "Lcom/revolut/feature/payments/groups/impl/mappers/settings/GroupSettingsAction;", "<init>", "()V", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LeaveGroup extends GroupSettingsAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LeaveGroup f79321a = new LeaveGroup();

        @NotNull
        public static final Parcelable.Creator<LeaveGroup> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LeaveGroup.f79321a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LeaveGroup[i];
            }
        }

        private LeaveGroup() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/mappers/settings/GroupSettingsAction$ReInviteMember;", "Lcom/revolut/feature/payments/groups/impl/mappers/settings/GroupSettingsAction;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReInviteMember extends GroupSettingsAction {

        @NotNull
        public static final Parcelable.Creator<ReInviteMember> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f79322a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReInviteMember((o) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReInviteMember[i];
            }
        }

        public ReInviteMember(o member) {
            Intrinsics.checkNotNullParameter(member, "member");
            this.f79322a = member;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ReInviteMember) && Intrinsics.f(this.f79322a, ((ReInviteMember) obj2).f79322a);
        }

        public final int hashCode() {
            return this.f79322a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f79322a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/mappers/settings/GroupSettingsAction$RemoveMember;", "Lcom/revolut/feature/payments/groups/impl/mappers/settings/GroupSettingsAction;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RemoveMember extends GroupSettingsAction {

        @NotNull
        public static final Parcelable.Creator<RemoveMember> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f79323a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RemoveMember((o) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RemoveMember[i];
            }
        }

        public RemoveMember(o member) {
            Intrinsics.checkNotNullParameter(member, "member");
            this.f79323a = member;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RemoveMember) && Intrinsics.f(this.f79323a, ((RemoveMember) obj2).f79323a);
        }

        public final int hashCode() {
            return this.f79323a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f79323a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/mappers/settings/GroupSettingsAction$Report;", "Lcom/revolut/feature/payments/groups/impl/mappers/settings/GroupSettingsAction;", "<init>", "()V", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Report extends GroupSettingsAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Report f79324a = new Report();

        @NotNull
        public static final Parcelable.Creator<Report> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Report.f79324a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Report[i];
            }
        }

        private Report() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/mappers/settings/GroupSettingsAction$SmartSettlementSetting;", "Lcom/revolut/feature/payments/groups/impl/mappers/settings/GroupSettingsAction;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SmartSettlementSetting extends GroupSettingsAction {

        @NotNull
        public static final Parcelable.Creator<SmartSettlementSetting> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f79325a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SmartSettlementSetting(b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SmartSettlementSetting[i];
            }
        }

        public SmartSettlementSetting(b value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f79325a = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SmartSettlementSetting) && this.f79325a == ((SmartSettlementSetting) obj2).f79325a;
        }

        public final int hashCode() {
            return this.f79325a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79325a.name());
        }
    }

    private GroupSettingsAction() {
    }
}
