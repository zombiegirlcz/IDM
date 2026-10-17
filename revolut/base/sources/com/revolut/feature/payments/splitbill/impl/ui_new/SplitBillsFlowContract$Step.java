package com.revolut.feature.payments.splitbill.impl.ui_new;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.payments.bills_chooser.api.common.SplitMethod;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMembersType;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okl.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/payments/splitbill/impl/ui_new/SplitBillsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "InitFlow", "SelectContacts", "CreateGroup", "Group", "SplitSummary", "Lcom/revolut/feature/payments/splitbill/impl/ui_new/SplitBillsFlowContract$Step$CreateGroup;", "Lcom/revolut/feature/payments/splitbill/impl/ui_new/SplitBillsFlowContract$Step$Group;", "Lcom/revolut/feature/payments/splitbill/impl/ui_new/SplitBillsFlowContract$Step$InitFlow;", "Lcom/revolut/feature/payments/splitbill/impl/ui_new/SplitBillsFlowContract$Step$SelectContacts;", "Lcom/revolut/feature/payments/splitbill/impl/ui_new/SplitBillsFlowContract$Step$SplitSummary;", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SplitBillsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/splitbill/impl/ui_new/SplitBillsFlowContract$Step$CreateGroup;", "Lcom/revolut/feature/payments/splitbill/impl/ui_new/SplitBillsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreateGroup extends SplitBillsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CreateGroup> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f79837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f79838b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iE != i2) {
                    iE = j6.a.e(CreateGroup.class, parcel, arrayList2, iE, 1);
                }
                return new CreateGroup(arrayList, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateGroup[i];
            }
        }

        public CreateGroup(ArrayList selectedContacts, List bills) {
            Intrinsics.checkNotNullParameter(selectedContacts, "selectedContacts");
            Intrinsics.checkNotNullParameter(bills, "bills");
            this.f79837a = selectedContacts;
            this.f79838b = bills;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreateGroup)) {
                return false;
            }
            CreateGroup createGroup = (CreateGroup) obj2;
            return this.f79837a.equals(createGroup.f79837a) && Intrinsics.f(this.f79838b, createGroup.f79838b);
        }

        public final int hashCode() {
            return this.f79838b.hashCode() + (this.f79837a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f79837a, dest);
            while (itY.hasNext()) {
                dest.writeSerializable((Serializable) itY.next());
            }
            Iterator itV = p.a.v(this.f79838b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/splitbill/impl/ui_new/SplitBillsFlowContract$Step$Group;", "Lcom/revolut/feature/payments/splitbill/impl/ui_new/SplitBillsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Group extends SplitBillsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Group> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f79839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SplitMemberType.GroupMember f79840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PaymentGroup f79841c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Group.class, parcel, arrayList, iE, 1);
                }
                return new Group(arrayList, (SplitMemberType.GroupMember) parcel.readParcelable(Group.class.getClassLoader()), (PaymentGroup) parcel.readParcelable(Group.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Group[i];
            }
        }

        public Group(List bills, SplitMemberType.GroupMember owner, PaymentGroup group) {
            Intrinsics.checkNotNullParameter(bills, "bills");
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(group, "group");
            this.f79839a = bills;
            this.f79840b = owner;
            this.f79841c = group;
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
            return Intrinsics.f(this.f79839a, group.f79839a) && Intrinsics.f(this.f79840b, group.f79840b) && Intrinsics.f(this.f79841c, group.f79841c);
        }

        public final int hashCode() {
            return this.f79841c.hashCode() + m.d(this.f79840b.f79216a, this.f79839a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f79839a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeParcelable(this.f79840b, i);
            dest.writeParcelable(this.f79841c, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/splitbill/impl/ui_new/SplitBillsFlowContract$Step$InitFlow;", "Lcom/revolut/feature/payments/splitbill/impl/ui_new/SplitBillsFlowContract$Step;", "<init>", "()V", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InitFlow extends SplitBillsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InitFlow f79842a = new InitFlow();

        @NotNull
        public static final Parcelable.Creator<InitFlow> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InitFlow.f79842a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InitFlow[i];
            }
        }

        private InitFlow() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/splitbill/impl/ui_new/SplitBillsFlowContract$Step$SelectContacts;", "Lcom/revolut/feature/payments/splitbill/impl/ui_new/SplitBillsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectContacts extends SplitBillsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SelectContacts> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f79843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f79844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f79845c;
        public final boolean d;
        public final AccountId.Joint e;
        public final SplitMethod f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Class cls;
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (true) {
                    if (iE == i) {
                        break;
                    }
                    iE = j6.a.e(SelectContacts.class, parcel, arrayList, iE, 1);
                }
                boolean z3 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    cls = SelectContacts.class;
                    z = true;
                } else {
                    cls = SelectContacts.class;
                    z = false;
                }
                return new SelectContacts(arrayList, z3, z, parcel.readInt() != 0, (AccountId.Joint) parcel.readParcelable(cls.getClassLoader()), (SplitMethod) parcel.readParcelable(cls.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectContacts[i];
            }
        }

        public SelectContacts(List bills, boolean z, boolean z3, boolean z4, AccountId.Joint joint, SplitMethod method) {
            Intrinsics.checkNotNullParameter(bills, "bills");
            Intrinsics.checkNotNullParameter(method, "method");
            this.f79843a = bills;
            this.f79844b = z;
            this.f79845c = z3;
            this.d = z4;
            this.e = joint;
            this.f = method;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SelectContacts)) {
                return false;
            }
            SelectContacts selectContacts = (SelectContacts) obj2;
            return Intrinsics.f(this.f79843a, selectContacts.f79843a) && this.f79844b == selectContacts.f79844b && this.f79845c == selectContacts.f79845c && this.d == selectContacts.d && Intrinsics.f(this.e, selectContacts.e) && Intrinsics.f(this.f, selectContacts.f);
        }

        public final int hashCode() {
            int iC = j6.a.c(j6.a.c(j6.a.c(this.f79843a.hashCode() * 31, 31, this.f79844b), 31, this.f79845c), 31, this.d);
            AccountId.Joint joint = this.e;
            return this.f.hashCode() + ((iC + (joint == null ? 0 : joint.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f79843a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeInt(this.f79844b ? 1 : 0);
            dest.writeInt(this.f79845c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeParcelable(this.e, i);
            dest.writeParcelable(this.f, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/splitbill/impl/ui_new/SplitBillsFlowContract$Step$SplitSummary;", "Lcom/revolut/feature/payments/splitbill/impl/ui_new/SplitBillsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SplitSummary extends SplitBillsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SplitSummary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f79846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SplitMembersType.Split f79847b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SplitMethod f79848c;
        public final AccountId.Joint d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(SplitSummary.class, parcel, arrayList, iE, 1);
                }
                return new SplitSummary(arrayList, (SplitMembersType.Split) parcel.readParcelable(SplitSummary.class.getClassLoader()), (SplitMethod) parcel.readParcelable(SplitSummary.class.getClassLoader()), (AccountId.Joint) parcel.readParcelable(SplitSummary.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SplitSummary[i];
            }
        }

        public SplitSummary(List bills, SplitMembersType.Split splitMembersType, SplitMethod method, AccountId.Joint joint) {
            Intrinsics.checkNotNullParameter(bills, "bills");
            Intrinsics.checkNotNullParameter(splitMembersType, "splitMembersType");
            Intrinsics.checkNotNullParameter(method, "method");
            this.f79846a = bills;
            this.f79847b = splitMembersType;
            this.f79848c = method;
            this.d = joint;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SplitSummary)) {
                return false;
            }
            SplitSummary splitSummary = (SplitSummary) obj2;
            return Intrinsics.f(this.f79846a, splitSummary.f79846a) && Intrinsics.f(this.f79847b, splitSummary.f79847b) && Intrinsics.f(this.f79848c, splitSummary.f79848c) && Intrinsics.f(this.d, splitSummary.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f79848c.hashCode() + ((this.f79847b.hashCode() + (this.f79846a.hashCode() * 31)) * 31)) * 31;
            AccountId.Joint joint = this.d;
            return iHashCode + (joint == null ? 0 : joint.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f79846a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeParcelable(this.f79847b, i);
            dest.writeParcelable(this.f79848c, i);
            dest.writeParcelable(this.d, i);
        }
    }

    private SplitBillsFlowContract$Step() {
    }
}
