package com.revolut.feature.payments.groups.impl.ui_chat.chat;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/payments/groups/impl/ui_chat/chat/GroupChatScreenContract$ModalSteps", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "InviteNewMembers", "SettingsScreen", "Qr", "EligibilityUnsupportedDialog", "Lcom/revolut/feature/payments/groups/impl/ui_chat/chat/GroupChatScreenContract$ModalSteps$EligibilityUnsupportedDialog;", "Lcom/revolut/feature/payments/groups/impl/ui_chat/chat/GroupChatScreenContract$ModalSteps$InviteNewMembers;", "Lcom/revolut/feature/payments/groups/impl/ui_chat/chat/GroupChatScreenContract$ModalSteps$Qr;", "Lcom/revolut/feature/payments/groups/impl/ui_chat/chat/GroupChatScreenContract$ModalSteps$SettingsScreen;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface GroupChatScreenContract$ModalSteps extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_chat/chat/GroupChatScreenContract$ModalSteps$EligibilityUnsupportedDialog;", "Lcom/revolut/feature/payments/groups/impl/ui_chat/chat/GroupChatScreenContract$ModalSteps;", "<init>", "()V", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EligibilityUnsupportedDialog implements GroupChatScreenContract$ModalSteps {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EligibilityUnsupportedDialog f79338a = new EligibilityUnsupportedDialog();

        @NotNull
        public static final Parcelable.Creator<EligibilityUnsupportedDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EligibilityUnsupportedDialog.f79338a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EligibilityUnsupportedDialog[i];
            }
        }

        private EligibilityUnsupportedDialog() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_chat/chat/GroupChatScreenContract$ModalSteps$InviteNewMembers;", "Lcom/revolut/feature/payments/groups/impl/ui_chat/chat/GroupChatScreenContract$ModalSteps;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InviteNewMembers implements GroupChatScreenContract$ModalSteps {

        @NotNull
        public static final Parcelable.Creator<InviteNewMembers> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f79339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f79340b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f79341c;
        public final wi0.b d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new InviteNewMembers(arrayList, parcel.readString(), (b) parcel.readSerializable(), (wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InviteNewMembers[i];
            }
        }

        public InviteNewMembers(List existingContacts, String groupId, b bVar, wi0.b bVar2) {
            Intrinsics.checkNotNullParameter(existingContacts, "existingContacts");
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            this.f79339a = existingContacts;
            this.f79340b = groupId;
            this.f79341c = bVar;
            this.d = bVar2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InviteNewMembers)) {
                return false;
            }
            InviteNewMembers inviteNewMembers = (InviteNewMembers) obj2;
            return Intrinsics.f(this.f79339a, inviteNewMembers.f79339a) && Intrinsics.f(this.f79340b, inviteNewMembers.f79340b) && Intrinsics.f(this.f79341c, inviteNewMembers.f79341c) && Intrinsics.f(this.d, inviteNewMembers.d);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f79339a.hashCode() * 31, 31, this.f79340b);
            b bVar = this.f79341c;
            int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
            wi0.b bVar2 = this.d;
            return iHashCode + (bVar2 != null ? bVar2.f297794a.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f79339a, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            dest.writeString(this.f79340b);
            dest.writeSerializable(this.f79341c);
            dest.writeSerializable(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_chat/chat/GroupChatScreenContract$ModalSteps$Qr;", "Lcom/revolut/feature/payments/groups/impl/ui_chat/chat/GroupChatScreenContract$ModalSteps;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Qr implements GroupChatScreenContract$ModalSteps {

        @NotNull
        public static final Parcelable.Creator<Qr> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f79342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f79343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f79344c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Qr(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Qr[i];
            }
        }

        public Qr(String str, String groupName, String inviteLink) {
            Intrinsics.checkNotNullParameter(groupName, "groupName");
            Intrinsics.checkNotNullParameter(inviteLink, "inviteLink");
            this.f79342a = str;
            this.f79343b = groupName;
            this.f79344c = inviteLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Qr)) {
                return false;
            }
            Qr qr10 = (Qr) obj2;
            return Intrinsics.f(this.f79342a, qr10.f79342a) && Intrinsics.f(this.f79343b, qr10.f79343b) && Intrinsics.f(this.f79344c, qr10.f79344c);
        }

        public final int hashCode() {
            String str = this.f79342a;
            return this.f79344c.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f79343b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79342a);
            dest.writeString(this.f79343b);
            dest.writeString(this.f79344c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_chat/chat/GroupChatScreenContract$ModalSteps$SettingsScreen;", "Lcom/revolut/feature/payments/groups/impl/ui_chat/chat/GroupChatScreenContract$ModalSteps;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SettingsScreen implements GroupChatScreenContract$ModalSteps {

        @NotNull
        public static final Parcelable.Creator<SettingsScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PaymentGroup f79345a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SettingsScreen((PaymentGroup) parcel.readParcelable(SettingsScreen.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SettingsScreen[i];
            }
        }

        public SettingsScreen(PaymentGroup group) {
            Intrinsics.checkNotNullParameter(group, "group");
            this.f79345a = group;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SettingsScreen) && Intrinsics.f(this.f79345a, ((SettingsScreen) obj2).f79345a);
        }

        public final int hashCode() {
            return this.f79345a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79345a, i);
        }
    }
}
