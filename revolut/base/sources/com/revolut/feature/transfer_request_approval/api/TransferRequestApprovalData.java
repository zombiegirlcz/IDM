package com.revolut.feature.transfer_request_approval.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transfer_request_approval/api/TransferRequestApprovalData;", "Landroid/os/Parcelable;", "MoneyRequestApproval", "GroupBillsApproval", "Lcom/revolut/feature/transfer_request_approval/api/TransferRequestApprovalData$GroupBillsApproval;", "Lcom/revolut/feature/transfer_request_approval/api/TransferRequestApprovalData$MoneyRequestApproval;", "feature_transfer_request_approval_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TransferRequestApprovalData implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f92449a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_request_approval/api/TransferRequestApprovalData$GroupBillsApproval;", "Lcom/revolut/feature/transfer_request_approval/api/TransferRequestApprovalData;", "", "toString", "()Ljava/lang/String;", "feature_transfer_request_approval_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GroupBillsApproval extends TransferRequestApprovalData {

        @NotNull
        public static final Parcelable.Creator<GroupBillsApproval> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f92450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PaymentGroup f92451c;
        public final List d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                d dVar = (d) parcel.readSerializable();
                PaymentGroup paymentGroup = (PaymentGroup) parcel.readParcelable(GroupBillsApproval.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(GroupBillsApproval.class, parcel, arrayList, iE, 1);
                }
                return new GroupBillsApproval(dVar, paymentGroup, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GroupBillsApproval[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GroupBillsApproval(d money, PaymentGroup group, List selectedMembersSettleInfo) {
            super(money);
            Intrinsics.checkNotNullParameter(money, "money");
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(selectedMembersSettleInfo, "selectedMembersSettleInfo");
            this.f92450b = money;
            this.f92451c = group;
            this.d = selectedMembersSettleInfo;
        }

        @Override // com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final d getF92449a() {
            return this.f92450b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof GroupBillsApproval)) {
                return false;
            }
            GroupBillsApproval groupBillsApproval = (GroupBillsApproval) obj2;
            return Intrinsics.f(this.f92450b, groupBillsApproval.f92450b) && Intrinsics.f(this.f92451c, groupBillsApproval.f92451c) && Intrinsics.f(this.d, groupBillsApproval.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f92451c.hashCode() + (this.f92450b.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f92450b);
            dest.writeParcelable(this.f92451c, i);
            Iterator itV = p.a.v(this.d, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_request_approval/api/TransferRequestApprovalData$MoneyRequestApproval;", "Lcom/revolut/feature/transfer_request_approval/api/TransferRequestApprovalData;", "", "toString", "()Ljava/lang/String;", "feature_transfer_request_approval_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MoneyRequestApproval extends TransferRequestApprovalData {

        @NotNull
        public static final Parcelable.Creator<MoneyRequestApproval> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MoneyRequest f92452b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MoneyRequestApproval((MoneyRequest) parcel.readParcelable(MoneyRequestApproval.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoneyRequestApproval[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MoneyRequestApproval(MoneyRequest moneyRequest) {
            super(moneyRequest.d);
            Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
            this.f92452b = moneyRequest;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MoneyRequestApproval) && Intrinsics.f(this.f92452b, ((MoneyRequestApproval) obj2).f92452b);
        }

        public final int hashCode() {
            return this.f92452b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f92452b, i);
        }
    }

    public TransferRequestApprovalData(d dVar) {
        this.f92449a = dVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public d getF92449a() {
        return this.f92449a;
    }
}
