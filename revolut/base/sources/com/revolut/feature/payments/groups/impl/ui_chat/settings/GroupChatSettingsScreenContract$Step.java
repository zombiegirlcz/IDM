package com.revolut.feature.payments.groups.impl.ui_chat.settings;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oq9.c0;
import oq9.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"com/revolut/feature/payments/groups/impl/ui_chat/settings/GroupChatSettingsScreenContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ChangeGroupName", "ManageMembers", "OpenQrCodeScreen", "BillDetailsScreen", "SettlementDetailsScreen", "GroupTransactionsScreen", "ChangeBackgroundDialog", "Lcom/revolut/feature/payments/groups/impl/ui_chat/settings/GroupChatSettingsScreenContract$Step$BillDetailsScreen;", "Lcom/revolut/feature/payments/groups/impl/ui_chat/settings/GroupChatSettingsScreenContract$Step$ChangeBackgroundDialog;", "Lcom/revolut/feature/payments/groups/impl/ui_chat/settings/GroupChatSettingsScreenContract$Step$ChangeGroupName;", "Lcom/revolut/feature/payments/groups/impl/ui_chat/settings/GroupChatSettingsScreenContract$Step$GroupTransactionsScreen;", "Lcom/revolut/feature/payments/groups/impl/ui_chat/settings/GroupChatSettingsScreenContract$Step$ManageMembers;", "Lcom/revolut/feature/payments/groups/impl/ui_chat/settings/GroupChatSettingsScreenContract$Step$OpenQrCodeScreen;", "Lcom/revolut/feature/payments/groups/impl/ui_chat/settings/GroupChatSettingsScreenContract$Step$SettlementDetailsScreen;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface GroupChatSettingsScreenContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_chat/settings/GroupChatSettingsScreenContract$Step$BillDetailsScreen;", "Lcom/revolut/feature/payments/groups/impl/ui_chat/settings/GroupChatSettingsScreenContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BillDetailsScreen implements GroupChatSettingsScreenContract$Step {

        @NotNull
        public static final Parcelable.Creator<BillDetailsScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f79376a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BillDetailsScreen((i) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BillDetailsScreen[i];
            }
        }

        public BillDetailsScreen(i bill) {
            Intrinsics.checkNotNullParameter(bill, "bill");
            this.f79376a = bill;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BillDetailsScreen) && Intrinsics.f(this.f79376a, ((BillDetailsScreen) obj2).f79376a);
        }

        public final int hashCode() {
            return this.f79376a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f79376a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_chat/settings/GroupChatSettingsScreenContract$Step$ChangeBackgroundDialog;", "Lcom/revolut/feature/payments/groups/impl/ui_chat/settings/GroupChatSettingsScreenContract$Step;", "<init>", "()V", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChangeBackgroundDialog implements GroupChatSettingsScreenContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChangeBackgroundDialog f79377a = new ChangeBackgroundDialog();

        @NotNull
        public static final Parcelable.Creator<ChangeBackgroundDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChangeBackgroundDialog.f79377a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChangeBackgroundDialog[i];
            }
        }

        private ChangeBackgroundDialog() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_chat/settings/GroupChatSettingsScreenContract$Step$ChangeGroupName;", "Lcom/revolut/feature/payments/groups/impl/ui_chat/settings/GroupChatSettingsScreenContract$Step;", "<init>", "()V", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChangeGroupName implements GroupChatSettingsScreenContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChangeGroupName f79378a = new ChangeGroupName();

        @NotNull
        public static final Parcelable.Creator<ChangeGroupName> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChangeGroupName.f79378a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChangeGroupName[i];
            }
        }

        private ChangeGroupName() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_chat/settings/GroupChatSettingsScreenContract$Step$GroupTransactionsScreen;", "Lcom/revolut/feature/payments/groups/impl/ui_chat/settings/GroupChatSettingsScreenContract$Step;", "<init>", "()V", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GroupTransactionsScreen implements GroupChatSettingsScreenContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GroupTransactionsScreen f79379a = new GroupTransactionsScreen();

        @NotNull
        public static final Parcelable.Creator<GroupTransactionsScreen> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GroupTransactionsScreen.f79379a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GroupTransactionsScreen[i];
            }
        }

        private GroupTransactionsScreen() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_chat/settings/GroupChatSettingsScreenContract$Step$ManageMembers;", "Lcom/revolut/feature/payments/groups/impl/ui_chat/settings/GroupChatSettingsScreenContract$Step;", "<init>", "()V", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ManageMembers implements GroupChatSettingsScreenContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ManageMembers f79380a = new ManageMembers();

        @NotNull
        public static final Parcelable.Creator<ManageMembers> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ManageMembers.f79380a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ManageMembers[i];
            }
        }

        private ManageMembers() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_chat/settings/GroupChatSettingsScreenContract$Step$OpenQrCodeScreen;", "Lcom/revolut/feature/payments/groups/impl/ui_chat/settings/GroupChatSettingsScreenContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenQrCodeScreen implements GroupChatSettingsScreenContract$Step {

        @NotNull
        public static final Parcelable.Creator<OpenQrCodeScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f79381a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenQrCodeScreen(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenQrCodeScreen[i];
            }
        }

        public OpenQrCodeScreen(String joinUri) {
            Intrinsics.checkNotNullParameter(joinUri, "joinUri");
            this.f79381a = joinUri;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OpenQrCodeScreen) && Intrinsics.f(this.f79381a, ((OpenQrCodeScreen) obj2).f79381a);
        }

        public final int hashCode() {
            return this.f79381a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79381a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_chat/settings/GroupChatSettingsScreenContract$Step$SettlementDetailsScreen;", "Lcom/revolut/feature/payments/groups/impl/ui_chat/settings/GroupChatSettingsScreenContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SettlementDetailsScreen implements GroupChatSettingsScreenContract$Step {

        @NotNull
        public static final Parcelable.Creator<SettlementDetailsScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c0 f79382a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SettlementDetailsScreen((c0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SettlementDetailsScreen[i];
            }
        }

        public SettlementDetailsScreen(c0 settlement) {
            Intrinsics.checkNotNullParameter(settlement, "settlement");
            this.f79382a = settlement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SettlementDetailsScreen) && Intrinsics.f(this.f79382a, ((SettlementDetailsScreen) obj2).f79382a);
        }

        public final int hashCode() {
            return this.f79382a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f79382a);
        }
    }
}
