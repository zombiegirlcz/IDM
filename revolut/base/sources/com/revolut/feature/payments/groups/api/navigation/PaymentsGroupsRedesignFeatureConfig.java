package com.revolut.feature.payments.groups.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okl.m;
import oq9.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/payments/groups/api/navigation/PaymentsGroupsRedesignFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "BillSelection", "BillSplit", "GroupDetails", "GroupBillDetails", "JoinGroup", "Lcom/revolut/feature/payments/groups/api/navigation/PaymentsGroupsRedesignFeatureConfig$BillSelection;", "Lcom/revolut/feature/payments/groups/api/navigation/PaymentsGroupsRedesignFeatureConfig$BillSplit;", "Lcom/revolut/feature/payments/groups/api/navigation/PaymentsGroupsRedesignFeatureConfig$GroupBillDetails;", "Lcom/revolut/feature/payments/groups/api/navigation/PaymentsGroupsRedesignFeatureConfig$GroupDetails;", "Lcom/revolut/feature/payments/groups/api/navigation/PaymentsGroupsRedesignFeatureConfig$JoinGroup;", "feature_payments_groups_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PaymentsGroupsRedesignFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/groups/api/navigation/PaymentsGroupsRedesignFeatureConfig$BillSelection;", "Lcom/revolut/feature/payments/groups/api/navigation/PaymentsGroupsRedesignFeatureConfig;", "", "toString", "()Ljava/lang/String;", "BridgeDestination", "feature_payments_groups_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BillSelection extends PaymentsGroupsRedesignFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<BillSelection> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final PaymentGroup f79297g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f79298h;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/groups/api/navigation/PaymentsGroupsRedesignFeatureConfig$BillSelection$BridgeDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class BridgeDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<BridgeDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PaymentGroup f79299a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List f79300b;

            /* JADX INFO: loaded from: classes5.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    PaymentGroup paymentGroup = (PaymentGroup) j6.a.f(parcel, "parcel", BridgeDestination.class);
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = j6.a.e(BridgeDestination.class, parcel, arrayList, iE, 1);
                    }
                    return new BridgeDestination(paymentGroup, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new BridgeDestination[i];
                }
            }

            public BridgeDestination(PaymentGroup group, List selectedBills) {
                Intrinsics.checkNotNullParameter(group, "group");
                Intrinsics.checkNotNullParameter(selectedBills, "selectedBills");
                this.f79299a = group;
                this.f79300b = selectedBills;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof BridgeDestination)) {
                    return false;
                }
                BridgeDestination bridgeDestination = (BridgeDestination) obj2;
                return Intrinsics.f(this.f79299a, bridgeDestination.f79299a) && Intrinsics.f(this.f79300b, bridgeDestination.f79300b);
            }

            public final int hashCode() {
                return this.f79300b.hashCode() + (this.f79299a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f79299a, i);
                Iterator itV = p.a.v(this.f79300b, dest);
                while (itV.hasNext()) {
                    dest.writeParcelable((Parcelable) itV.next(), i);
                }
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                PaymentGroup paymentGroup = (PaymentGroup) j6.a.f(parcel, "parcel", BillSelection.class);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(BillSelection.class, parcel, arrayList, iE, 1);
                }
                return new BillSelection(paymentGroup, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BillSelection[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BillSelection(PaymentGroup group, List selectedBills) {
            super(new BridgeDestination(group, selectedBills));
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(selectedBills, "selectedBills");
            this.f79297g = group;
            this.f79298h = selectedBills;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BillSelection)) {
                return false;
            }
            BillSelection billSelection = (BillSelection) obj2;
            return Intrinsics.f(this.f79297g, billSelection.f79297g) && Intrinsics.f(this.f79298h, billSelection.f79298h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f79298h.hashCode() + (this.f79297g.hashCode() * 31);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79297g, i);
            Iterator itV = p.a.v(this.f79298h, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/groups/api/navigation/PaymentsGroupsRedesignFeatureConfig$BillSplit;", "Lcom/revolut/feature/payments/groups/api/navigation/PaymentsGroupsRedesignFeatureConfig;", "", "toString", "()Ljava/lang/String;", "BridgeDestination", "feature_payments_groups_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BillSplit extends PaymentsGroupsRedesignFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<BillSplit> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final PaymentGroup f79301g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final o f79302h;
        public final List i;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/groups/api/navigation/PaymentsGroupsRedesignFeatureConfig$BillSplit$BridgeDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class BridgeDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<BridgeDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PaymentGroup f79303a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final o f79304b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final List f79305c;

            /* JADX INFO: loaded from: classes5.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    PaymentGroup paymentGroup = (PaymentGroup) j6.a.f(parcel, "parcel", BridgeDestination.class);
                    o oVar = (o) parcel.readSerializable();
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = j6.a.e(BridgeDestination.class, parcel, arrayList, iE, 1);
                    }
                    return new BridgeDestination(paymentGroup, oVar, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new BridgeDestination[i];
                }
            }

            public BridgeDestination(PaymentGroup group, o owner, List selectedBills) {
                Intrinsics.checkNotNullParameter(group, "group");
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(selectedBills, "selectedBills");
                this.f79303a = group;
                this.f79304b = owner;
                this.f79305c = selectedBills;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof BridgeDestination)) {
                    return false;
                }
                BridgeDestination bridgeDestination = (BridgeDestination) obj2;
                return Intrinsics.f(this.f79303a, bridgeDestination.f79303a) && Intrinsics.f(this.f79304b, bridgeDestination.f79304b) && Intrinsics.f(this.f79305c, bridgeDestination.f79305c);
            }

            public final int hashCode() {
                return this.f79305c.hashCode() + m.d(this.f79304b, this.f79303a.hashCode() * 31, 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f79303a, i);
                dest.writeSerializable(this.f79304b);
                Iterator itV = p.a.v(this.f79305c, dest);
                while (itV.hasNext()) {
                    dest.writeParcelable((Parcelable) itV.next(), i);
                }
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                PaymentGroup paymentGroup = (PaymentGroup) j6.a.f(parcel, "parcel", BillSplit.class);
                o oVar = (o) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(BillSplit.class, parcel, arrayList, iE, 1);
                }
                return new BillSplit(paymentGroup, oVar, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BillSplit[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BillSplit(PaymentGroup group, o owner, List selectedBills) {
            super(new BridgeDestination(group, owner, selectedBills));
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(selectedBills, "selectedBills");
            this.f79301g = group;
            this.f79302h = owner;
            this.i = selectedBills;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BillSplit)) {
                return false;
            }
            BillSplit billSplit = (BillSplit) obj2;
            return Intrinsics.f(this.f79301g, billSplit.f79301g) && Intrinsics.f(this.f79302h, billSplit.f79302h) && Intrinsics.f(this.i, billSplit.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.i.hashCode() + m.d(this.f79302h, this.f79301g.hashCode() * 31, 31);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79301g, i);
            dest.writeSerializable(this.f79302h);
            Iterator itV = p.a.v(this.i, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/groups/api/navigation/PaymentsGroupsRedesignFeatureConfig$GroupBillDetails;", "Lcom/revolut/feature/payments/groups/api/navigation/PaymentsGroupsRedesignFeatureConfig;", "", "toString", "()Ljava/lang/String;", "BridgeDestination", "feature_payments_groups_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GroupBillDetails extends PaymentsGroupsRedesignFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<GroupBillDetails> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final PaymentGroup f79306g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f79307h;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/groups/api/navigation/PaymentsGroupsRedesignFeatureConfig$GroupBillDetails$BridgeDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class BridgeDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<BridgeDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PaymentGroup f79308a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f79309b;

            /* JADX INFO: loaded from: classes5.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new BridgeDestination((PaymentGroup) parcel.readParcelable(BridgeDestination.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new BridgeDestination[i];
                }
            }

            public BridgeDestination(PaymentGroup group, String billId) {
                Intrinsics.checkNotNullParameter(group, "group");
                Intrinsics.checkNotNullParameter(billId, "billId");
                this.f79308a = group;
                this.f79309b = billId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof BridgeDestination)) {
                    return false;
                }
                BridgeDestination bridgeDestination = (BridgeDestination) obj2;
                return Intrinsics.f(this.f79308a, bridgeDestination.f79308a) && Intrinsics.f(this.f79309b, bridgeDestination.f79309b);
            }

            public final int hashCode() {
                return this.f79309b.hashCode() + (this.f79308a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f79308a, i);
                dest.writeString(this.f79309b);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GroupBillDetails((PaymentGroup) parcel.readParcelable(GroupBillDetails.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GroupBillDetails[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GroupBillDetails(PaymentGroup group, String billId) {
            super(new BridgeDestination(group, billId));
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(billId, "billId");
            this.f79306g = group;
            this.f79307h = billId;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof GroupBillDetails)) {
                return false;
            }
            GroupBillDetails groupBillDetails = (GroupBillDetails) obj2;
            return Intrinsics.f(this.f79306g, groupBillDetails.f79306g) && Intrinsics.f(this.f79307h, groupBillDetails.f79307h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f79307h.hashCode() + (this.f79306g.hashCode() * 31);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79306g, i);
            dest.writeString(this.f79307h);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/groups/api/navigation/PaymentsGroupsRedesignFeatureConfig$GroupDetails;", "Lcom/revolut/feature/payments/groups/api/navigation/PaymentsGroupsRedesignFeatureConfig;", "", "toString", "()Ljava/lang/String;", "BridgeDestination", "feature_payments_groups_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GroupDetails extends PaymentsGroupsRedesignFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<GroupDetails> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final PaymentGroup f79310g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f79311h;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/groups/api/navigation/PaymentsGroupsRedesignFeatureConfig$GroupDetails$BridgeDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class BridgeDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<BridgeDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PaymentGroup f79312a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f79313b;

            /* JADX INFO: loaded from: classes5.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new BridgeDestination((PaymentGroup) parcel.readParcelable(BridgeDestination.class.getClassLoader()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new BridgeDestination[i];
                }
            }

            public BridgeDestination(PaymentGroup group, boolean z) {
                Intrinsics.checkNotNullParameter(group, "group");
                this.f79312a = group;
                this.f79313b = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof BridgeDestination)) {
                    return false;
                }
                BridgeDestination bridgeDestination = (BridgeDestination) obj2;
                return Intrinsics.f(this.f79312a, bridgeDestination.f79312a) && this.f79313b == bridgeDestination.f79313b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f79313b) + (this.f79312a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f79312a, i);
                dest.writeInt(this.f79313b ? 1 : 0);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GroupDetails((PaymentGroup) parcel.readParcelable(GroupDetails.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GroupDetails[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GroupDetails(PaymentGroup group, boolean z) {
            super(new BridgeDestination(group, z));
            Intrinsics.checkNotNullParameter(group, "group");
            this.f79310g = group;
            this.f79311h = z;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof GroupDetails)) {
                return false;
            }
            GroupDetails groupDetails = (GroupDetails) obj2;
            return Intrinsics.f(this.f79310g, groupDetails.f79310g) && this.f79311h == groupDetails.f79311h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return Boolean.hashCode(this.f79311h) + (this.f79310g.hashCode() * 31);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79310g, i);
            dest.writeInt(this.f79311h ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/groups/api/navigation/PaymentsGroupsRedesignFeatureConfig$JoinGroup;", "Lcom/revolut/feature/payments/groups/api/navigation/PaymentsGroupsRedesignFeatureConfig;", "", "toString", "()Ljava/lang/String;", "BridgeDestination", "feature_payments_groups_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JoinGroup extends PaymentsGroupsRedesignFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<JoinGroup> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f79314g;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/groups/api/navigation/PaymentsGroupsRedesignFeatureConfig$JoinGroup$BridgeDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class BridgeDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<BridgeDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f79315a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new BridgeDestination(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new BridgeDestination[i];
                }
            }

            public BridgeDestination(String groupInvitationCode) {
                Intrinsics.checkNotNullParameter(groupInvitationCode, "groupInvitationCode");
                this.f79315a = groupInvitationCode;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF79315a() {
                return this.f79315a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof BridgeDestination) && Intrinsics.f(this.f79315a, ((BridgeDestination) obj2).f79315a);
            }

            public final int hashCode() {
                return this.f79315a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f79315a);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JoinGroup(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JoinGroup[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JoinGroup(String groupInvitationCode) {
            super(new BridgeDestination(groupInvitationCode));
            Intrinsics.checkNotNullParameter(groupInvitationCode, "groupInvitationCode");
            this.f79314g = groupInvitationCode;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof JoinGroup) && Intrinsics.f(this.f79314g, ((JoinGroup) obj2).f79314g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f79314g.hashCode();
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79314g);
        }
    }

    public PaymentsGroupsRedesignFeatureConfig(KompotDestination kompotDestination) {
        super((ActivityAnimation) null, (ParcelableDestination) kompotDestination, false, (Integer) null, 0, 61);
    }
}
