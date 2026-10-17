package com.revolut.feature.payments.bills_chooser.api.splits;

import android.os.Parcel;
import android.os.Parcelable;
import do3.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oq9.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/api/splits/SplitMemberType;", "Landroid/os/Parcelable;", "GroupMember", "SplitMember", "Lcom/revolut/feature/payments/bills_chooser/api/splits/SplitMemberType$GroupMember;", "Lcom/revolut/feature/payments/bills_chooser/api/splits/SplitMemberType$SplitMember;", "feature_payments_bills_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SplitMemberType extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/api/splits/SplitMemberType$GroupMember;", "Lcom/revolut/feature/payments/bills_chooser/api/splits/SplitMemberType;", "", "toString", "()Ljava/lang/String;", "feature_payments_bills_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GroupMember implements SplitMemberType {

        @NotNull
        public static final Parcelable.Creator<GroupMember> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f79216a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GroupMember((o) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GroupMember[i];
            }
        }

        public GroupMember(o member) {
            Intrinsics.checkNotNullParameter(member, "member");
            this.f79216a = member;
        }

        @Override // com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType
        public final String O7() {
            return this.f79216a.b();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof GroupMember) && Intrinsics.f(this.f79216a, ((GroupMember) obj2).f79216a);
        }

        public final int hashCode() {
            return this.f79216a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f79216a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/api/splits/SplitMemberType$SplitMember;", "Lcom/revolut/feature/payments/bills_chooser/api/splits/SplitMemberType;", "UserMember", "ContactMember", "Lcom/revolut/feature/payments/bills_chooser/api/splits/SplitMemberType$SplitMember$ContactMember;", "Lcom/revolut/feature/payments/bills_chooser/api/splits/SplitMemberType$SplitMember$UserMember;", "feature_payments_bills_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface SplitMember extends SplitMemberType {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/api/splits/SplitMemberType$SplitMember$ContactMember;", "Lcom/revolut/feature/payments/bills_chooser/api/splits/SplitMemberType$SplitMember;", "", "toString", "()Ljava/lang/String;", "feature_payments_bills_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ContactMember implements SplitMember {

            @NotNull
            public static final Parcelable.Creator<ContactMember> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final zm3.a f79217a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Integer f79218b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ContactMember((zm3.a) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ContactMember[i];
                }
            }

            public ContactMember(zm3.a member, Integer num) {
                Intrinsics.checkNotNullParameter(member, "member");
                this.f79217a = member;
                this.f79218b = num;
            }

            @Override // com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType.SplitMember
            /* JADX INFO: renamed from: N4, reason: from getter */
            public final Integer getF79220b() {
                return this.f79218b;
            }

            @Override // com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType
            public final String O7() {
                return xam.a.j(this.f79217a);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ContactMember)) {
                    return false;
                }
                ContactMember contactMember = (ContactMember) obj2;
                return Intrinsics.f(this.f79217a, contactMember.f79217a) && Intrinsics.f(this.f79218b, contactMember.f79218b);
            }

            public final int hashCode() {
                int iHashCode = this.f79217a.hashCode() * 31;
                Integer num = this.f79218b;
                return iHashCode + (num == null ? 0 : num.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f79217a);
                Integer num = this.f79218b;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    p.a.B(dest, 1, num);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/api/splits/SplitMemberType$SplitMember$UserMember;", "Lcom/revolut/feature/payments/bills_chooser/api/splits/SplitMemberType$SplitMember;", "", "toString", "()Ljava/lang/String;", "feature_payments_bills_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class UserMember implements SplitMember {

            @NotNull
            public static final Parcelable.Creator<UserMember> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final n f79219a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Integer f79220b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new UserMember((n) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new UserMember[i];
                }
            }

            public UserMember(n member, Integer num) {
                Intrinsics.checkNotNullParameter(member, "member");
                this.f79219a = member;
                this.f79220b = num;
            }

            @Override // com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType.SplitMember
            /* JADX INFO: renamed from: N4, reason: from getter */
            public final Integer getF79220b() {
                return this.f79220b;
            }

            @Override // com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType
            public final String O7() {
                return this.f79219a.f116408a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof UserMember)) {
                    return false;
                }
                UserMember userMember = (UserMember) obj2;
                return Intrinsics.f(this.f79219a, userMember.f79219a) && Intrinsics.f(this.f79220b, userMember.f79220b);
            }

            public final int hashCode() {
                int iHashCode = this.f79219a.hashCode() * 31;
                Integer num = this.f79220b;
                return iHashCode + (num == null ? 0 : num.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f79219a);
                Integer num = this.f79220b;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    p.a.B(dest, 1, num);
                }
            }
        }

        /* JADX INFO: renamed from: N4 */
        Integer getF79220b();
    }

    String O7();
}
