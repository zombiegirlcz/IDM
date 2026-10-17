package com.revolut.feature.payments.splitbill.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/splitbill/api/navigation/SplitBillConfiguration;", "Landroid/os/Parcelable;", "Empty", "WithBills", "WithContacts", "Lcom/revolut/feature/payments/splitbill/api/navigation/SplitBillConfiguration$Empty;", "Lcom/revolut/feature/payments/splitbill/api/navigation/SplitBillConfiguration$WithBills;", "Lcom/revolut/feature/payments/splitbill/api/navigation/SplitBillConfiguration$WithContacts;", "feature_payments_splitbill_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SplitBillConfiguration extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/splitbill/api/navigation/SplitBillConfiguration$Empty;", "Lcom/revolut/feature/payments/splitbill/api/navigation/SplitBillConfiguration;", "<init>", "()V", "feature_payments_splitbill_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Empty implements SplitBillConfiguration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Empty f79815a = new Empty();

        @NotNull
        public static final Parcelable.Creator<Empty> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Empty.f79815a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Empty[i];
            }
        }

        private Empty() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/splitbill/api/navigation/SplitBillConfiguration$WithBills;", "Lcom/revolut/feature/payments/splitbill/api/navigation/SplitBillConfiguration;", "", "toString", "()Ljava/lang/String;", "feature_payments_splitbill_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithBills implements SplitBillConfiguration {

        @NotNull
        public static final Parcelable.Creator<WithBills> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f79816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f79817b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f79818c;
        public final boolean d;
        public final AccountId.Joint e;

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
                    iE = j6.a.e(WithBills.class, parcel, arrayList, iE, 1);
                }
                boolean z3 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    cls = WithBills.class;
                    z = true;
                } else {
                    cls = WithBills.class;
                    z = false;
                }
                return new WithBills(arrayList, z3, z, parcel.readInt() != 0, (AccountId.Joint) parcel.readParcelable(cls.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithBills[i];
            }
        }

        public WithBills(List preselectedBills, boolean z, boolean z3, boolean z4, AccountId.Joint joint) {
            Intrinsics.checkNotNullParameter(preselectedBills, "preselectedBills");
            this.f79816a = preselectedBills;
            this.f79817b = z;
            this.f79818c = z3;
            this.d = z4;
            this.e = joint;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WithBills)) {
                return false;
            }
            WithBills withBills = (WithBills) obj2;
            return Intrinsics.f(this.f79816a, withBills.f79816a) && this.f79817b == withBills.f79817b && this.f79818c == withBills.f79818c && this.d == withBills.d && Intrinsics.f(this.e, withBills.e);
        }

        public final int hashCode() {
            int iC = j6.a.c(j6.a.c(j6.a.c(this.f79816a.hashCode() * 31, 31, this.f79817b), 31, this.f79818c), 31, this.d);
            AccountId.Joint joint = this.e;
            return iC + (joint == null ? 0 : joint.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f79816a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeInt(this.f79817b ? 1 : 0);
            dest.writeInt(this.f79818c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeParcelable(this.e, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/splitbill/api/navigation/SplitBillConfiguration$WithContacts;", "Lcom/revolut/feature/payments/splitbill/api/navigation/SplitBillConfiguration;", "", "toString", "()Ljava/lang/String;", "feature_payments_splitbill_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithContacts implements SplitBillConfiguration {

        @NotNull
        public static final Parcelable.Creator<WithContacts> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f79819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AccountId.Joint f79820b;

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
                return new WithContacts(arrayList, (AccountId.Joint) parcel.readParcelable(WithContacts.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithContacts[i];
            }
        }

        public WithContacts(List preselectedContacts, AccountId.Joint joint) {
            Intrinsics.checkNotNullParameter(preselectedContacts, "preselectedContacts");
            this.f79819a = preselectedContacts;
            this.f79820b = joint;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WithContacts)) {
                return false;
            }
            WithContacts withContacts = (WithContacts) obj2;
            return Intrinsics.f(this.f79819a, withContacts.f79819a) && Intrinsics.f(this.f79820b, withContacts.f79820b);
        }

        public final int hashCode() {
            int iHashCode = this.f79819a.hashCode() * 31;
            AccountId.Joint joint = this.f79820b;
            return iHashCode + (joint == null ? 0 : joint.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f79819a, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            dest.writeParcelable(this.f79820b, i);
        }
    }
}
