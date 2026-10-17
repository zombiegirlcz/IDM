package com.revolut.feature.payments.splitbill.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.a3;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/payments/splitbill/api/navigation/SplitBillFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "ChooseBillsEmpty", "ChooseBills", "ChooseContacts", "Lcom/revolut/feature/payments/splitbill/api/navigation/SplitBillFeatureConfig$ChooseBills;", "Lcom/revolut/feature/payments/splitbill/api/navigation/SplitBillFeatureConfig$ChooseBillsEmpty;", "Lcom/revolut/feature/payments/splitbill/api/navigation/SplitBillFeatureConfig$ChooseContacts;", "feature_payments_splitbill_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SplitBillFeatureConfig implements FeatureConfig {

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/splitbill/api/navigation/SplitBillFeatureConfig$ChooseBills;", "Lcom/revolut/feature/payments/splitbill/api/navigation/SplitBillFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_payments_splitbill_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChooseBills extends SplitBillFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<ChooseBills> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f79821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x0a.a f79822b;

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
                return new ChooseBills(arrayList, x0a.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChooseBills[i];
            }
        }

        public ChooseBills(List contacts, x0a.a source) {
            Intrinsics.checkNotNullParameter(contacts, "contacts");
            Intrinsics.checkNotNullParameter(source, "source");
            this.f79821a = contacts;
            this.f79822b = source;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ChooseBills)) {
                return false;
            }
            ChooseBills chooseBills = (ChooseBills) obj2;
            return Intrinsics.f(this.f79821a, chooseBills.f79821a) && this.f79822b == chooseBills.f79822b;
        }

        public final int hashCode() {
            return this.f79822b.hashCode() + (this.f79821a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f79821a, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            dest.writeString(this.f79822b.name());
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/splitbill/api/navigation/SplitBillFeatureConfig$ChooseBillsEmpty;", "Lcom/revolut/feature/payments/splitbill/api/navigation/SplitBillFeatureConfig;", "<init>", "()V", "feature_payments_splitbill_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChooseBillsEmpty extends SplitBillFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChooseBillsEmpty f79823a = new ChooseBillsEmpty();

        @NotNull
        public static final Parcelable.Creator<ChooseBillsEmpty> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChooseBillsEmpty.f79823a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChooseBillsEmpty[i];
            }
        }

        private ChooseBillsEmpty() {
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

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/splitbill/api/navigation/SplitBillFeatureConfig$ChooseContacts;", "Lcom/revolut/feature/payments/splitbill/api/navigation/SplitBillFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_payments_splitbill_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChooseContacts extends SplitBillFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<ChooseContacts> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f79824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f79825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f79826c;
        public final boolean d;
        public final a3 e;
        public final AccountId.Joint f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                boolean z4;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z6 = false;
                boolean z11 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z6 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = true;
                    z11 = z;
                }
                if (parcel.readInt() != 0) {
                    z4 = z3;
                } else {
                    z4 = z3;
                    z3 = z;
                }
                if (parcel.readInt() == 0) {
                    z4 = z;
                }
                return new ChooseContacts(z6, z11, z3, z4, (a3) parcel.readSerializable(), (AccountId.Joint) parcel.readParcelable(ChooseContacts.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChooseContacts[i];
            }
        }

        public ChooseContacts(boolean z, boolean z3, boolean z4, boolean z6, a3 a3Var, AccountId.Joint joint) {
            this.f79824a = z;
            this.f79825b = z3;
            this.f79826c = z4;
            this.d = z6;
            this.e = a3Var;
            this.f = joint;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ChooseContacts)) {
                return false;
            }
            ChooseContacts chooseContacts = (ChooseContacts) obj2;
            return this.f79824a == chooseContacts.f79824a && this.f79825b == chooseContacts.f79825b && this.f79826c == chooseContacts.f79826c && this.d == chooseContacts.d && Intrinsics.f(this.e, chooseContacts.e) && Intrinsics.f(this.f, chooseContacts.f);
        }

        public final int hashCode() {
            int iC = j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f79824a) * 31, 31, this.f79825b), 31, this.f79826c), 31, this.d);
            a3 a3Var = this.e;
            int iHashCode = (iC + (a3Var == null ? 0 : a3Var.hashCode())) * 31;
            AccountId.Joint joint = this.f;
            return iHashCode + (joint != null ? joint.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f79824a ? 1 : 0);
            dest.writeInt(this.f79825b ? 1 : 0);
            dest.writeInt(this.f79826c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeSerializable(this.e);
            dest.writeParcelable(this.f, i);
        }
    }

    private SplitBillFeatureConfig() {
    }
}
