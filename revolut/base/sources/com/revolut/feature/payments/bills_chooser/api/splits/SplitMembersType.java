package com.revolut.feature.payments.bills_chooser.api.splits;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/api/splits/SplitMembersType;", "Landroid/os/Parcelable;", "Group", "Split", "Lcom/revolut/feature/payments/bills_chooser/api/splits/SplitMembersType$Group;", "Lcom/revolut/feature/payments/bills_chooser/api/splits/SplitMembersType$Split;", "feature_payments_bills_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SplitMembersType extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/api/splits/SplitMembersType$Group;", "Lcom/revolut/feature/payments/bills_chooser/api/splits/SplitMembersType;", "", "toString", "()Ljava/lang/String;", "feature_payments_bills_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Group implements SplitMembersType {

        @NotNull
        public static final Parcelable.Creator<Group> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SplitMemberType.GroupMember f79221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f79222b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                SplitMemberType.GroupMember groupMemberCreateFromParcel = SplitMemberType.GroupMember.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(SplitMemberType.GroupMember.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Group(groupMemberCreateFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Group[i];
            }
        }

        public Group(SplitMemberType.GroupMember owner, List members) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(members, "members");
            this.f79221a = owner;
            this.f79222b = members;
        }

        public static Group a(Group group, SplitMemberType.GroupMember owner, List members, int i) {
            if ((i & 1) != 0) {
                owner = group.f79221a;
            }
            if ((i & 2) != 0) {
                members = group.f79222b;
            }
            group.getClass();
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(members, "members");
            return new Group(owner, members);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Group)) {
                return false;
            }
            Group group = (Group) obj2;
            return Intrinsics.f(this.f79221a, group.f79221a) && Intrinsics.f(this.f79222b, group.f79222b);
        }

        public final int hashCode() {
            return this.f79222b.hashCode() + (this.f79221a.f79216a.hashCode() * 31);
        }

        @Override // com.revolut.feature.payments.bills_chooser.api.splits.SplitMembersType
        public final SplitMemberType u2() {
            return this.f79221a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f79221a.writeToParcel(dest, i);
            Iterator itV = p.a.v(this.f79222b, dest);
            while (itV.hasNext()) {
                ((SplitMemberType.GroupMember) itV.next()).writeToParcel(dest, i);
            }
        }

        @Override // com.revolut.feature.payments.bills_chooser.api.splits.SplitMembersType
        /* JADX INFO: renamed from: x7, reason: from getter */
        public final List getF79224b() {
            return this.f79222b;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/api/splits/SplitMembersType$Split;", "Lcom/revolut/feature/payments/bills_chooser/api/splits/SplitMembersType;", "", "toString", "()Ljava/lang/String;", "feature_payments_bills_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Split implements SplitMembersType {

        @NotNull
        public static final Parcelable.Creator<Split> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SplitMemberType.SplitMember f79223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f79224b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                SplitMemberType.SplitMember splitMember = (SplitMemberType.SplitMember) j6.a.f(parcel, "parcel", Split.class);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Split.class, parcel, arrayList, iE, 1);
                }
                return new Split(splitMember, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Split[i];
            }
        }

        public Split(SplitMemberType.SplitMember owner, List members) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(members, "members");
            this.f79223a = owner;
            this.f79224b = members;
        }

        public static Split a(Split split, SplitMemberType.SplitMember owner, List members, int i) {
            if ((i & 1) != 0) {
                owner = split.f79223a;
            }
            if ((i & 2) != 0) {
                members = split.f79224b;
            }
            split.getClass();
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(members, "members");
            return new Split(owner, members);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Split)) {
                return false;
            }
            Split split = (Split) obj2;
            return Intrinsics.f(this.f79223a, split.f79223a) && Intrinsics.f(this.f79224b, split.f79224b);
        }

        public final int hashCode() {
            return this.f79224b.hashCode() + (this.f79223a.hashCode() * 31);
        }

        @Override // com.revolut.feature.payments.bills_chooser.api.splits.SplitMembersType
        public final SplitMemberType u2() {
            return this.f79223a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79223a, i);
            Iterator itV = p.a.v(this.f79224b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }

        @Override // com.revolut.feature.payments.bills_chooser.api.splits.SplitMembersType
        /* JADX INFO: renamed from: x7, reason: from getter */
        public final List getF79224b() {
            return this.f79224b;
        }
    }

    SplitMemberType u2();

    /* JADX INFO: renamed from: x7 */
    List getF79224b();
}
