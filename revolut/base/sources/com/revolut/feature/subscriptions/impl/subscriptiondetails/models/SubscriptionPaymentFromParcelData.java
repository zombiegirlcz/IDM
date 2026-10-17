package com.revolut.feature.subscriptions.impl.subscriptiondetails.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import h30.l;
import io3.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/models/SubscriptionPaymentFromParcelData;", "Landroid/os/Parcelable;", "<init>", "()V", "SubscriptionPaymentFromPocketData", "SubscriptionPaymentFromBillAccount", "EditPaymentSourceInfo", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/models/SubscriptionPaymentFromParcelData$SubscriptionPaymentFromBillAccount;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/models/SubscriptionPaymentFromParcelData$SubscriptionPaymentFromPocketData;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SubscriptionPaymentFromParcelData implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/models/SubscriptionPaymentFromParcelData$EditPaymentSourceInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditPaymentSourceInfo implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<EditPaymentSourceInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccountId f89300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f89301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f89302c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditPaymentSourceInfo((AccountId) parcel.readParcelable(EditPaymentSourceInfo.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditPaymentSourceInfo[i];
            }
        }

        public EditPaymentSourceInfo(AccountId accountId, String str, String paymentId, boolean z) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            this.f89300a = accountId;
            this.f89301b = str;
            this.f89302c = paymentId;
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditPaymentSourceInfo)) {
                return false;
            }
            EditPaymentSourceInfo editPaymentSourceInfo = (EditPaymentSourceInfo) obj2;
            return Intrinsics.f(this.f89300a, editPaymentSourceInfo.f89300a) && Intrinsics.f(this.f89301b, editPaymentSourceInfo.f89301b) && Intrinsics.f(this.f89302c, editPaymentSourceInfo.f89302c) && this.d == editPaymentSourceInfo.d;
        }

        public final int hashCode() {
            int iHashCode = this.f89300a.hashCode() * 31;
            String str = this.f89301b;
            return Boolean.hashCode(this.d) + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f89302c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89300a, i);
            dest.writeString(this.f89301b);
            dest.writeString(this.f89302c);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/models/SubscriptionPaymentFromParcelData$SubscriptionPaymentFromBillAccount;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/models/SubscriptionPaymentFromParcelData;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SubscriptionPaymentFromBillAccount extends SubscriptionPaymentFromParcelData {

        @NotNull
        public static final Parcelable.Creator<SubscriptionPaymentFromBillAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o61.a f89303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EditPaymentSourceInfo f89304b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SubscriptionPaymentFromBillAccount((o61.a) parcel.readSerializable(), parcel.readInt() == 0 ? null : EditPaymentSourceInfo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SubscriptionPaymentFromBillAccount[i];
            }
        }

        public SubscriptionPaymentFromBillAccount(o61.a data, EditPaymentSourceInfo editPaymentSourceInfo) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f89303a = data;
            this.f89304b = editPaymentSourceInfo;
        }

        @Override // com.revolut.feature.subscriptions.impl.subscriptiondetails.models.SubscriptionPaymentFromParcelData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final EditPaymentSourceInfo getF89307c() {
            return this.f89304b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SubscriptionPaymentFromBillAccount)) {
                return false;
            }
            SubscriptionPaymentFromBillAccount subscriptionPaymentFromBillAccount = (SubscriptionPaymentFromBillAccount) obj2;
            return Intrinsics.f(this.f89303a, subscriptionPaymentFromBillAccount.f89303a) && Intrinsics.f(this.f89304b, subscriptionPaymentFromBillAccount.f89304b);
        }

        public final int hashCode() {
            int iHashCode = this.f89303a.hashCode() * 31;
            EditPaymentSourceInfo editPaymentSourceInfo = this.f89304b;
            return iHashCode + (editPaymentSourceInfo == null ? 0 : editPaymentSourceInfo.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f89303a);
            EditPaymentSourceInfo editPaymentSourceInfo = this.f89304b;
            if (editPaymentSourceInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                editPaymentSourceInfo.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/models/SubscriptionPaymentFromParcelData$SubscriptionPaymentFromPocketData;", "Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/models/SubscriptionPaymentFromParcelData;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SubscriptionPaymentFromPocketData extends SubscriptionPaymentFromParcelData {

        @NotNull
        public static final Parcelable.Creator<SubscriptionPaymentFromPocketData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccountId f89305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f89306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EditPaymentSourceInfo f89307c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SubscriptionPaymentFromPocketData((AccountId) parcel.readParcelable(SubscriptionPaymentFromPocketData.class.getClassLoader()), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : EditPaymentSourceInfo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SubscriptionPaymentFromPocketData[i];
            }
        }

        public SubscriptionPaymentFromPocketData(AccountId accountId, d pocket, EditPaymentSourceInfo editPaymentSourceInfo) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(pocket, "pocket");
            this.f89305a = accountId;
            this.f89306b = pocket;
            this.f89307c = editPaymentSourceInfo;
        }

        @Override // com.revolut.feature.subscriptions.impl.subscriptiondetails.models.SubscriptionPaymentFromParcelData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final EditPaymentSourceInfo getF89307c() {
            return this.f89307c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SubscriptionPaymentFromPocketData)) {
                return false;
            }
            SubscriptionPaymentFromPocketData subscriptionPaymentFromPocketData = (SubscriptionPaymentFromPocketData) obj2;
            return Intrinsics.f(this.f89305a, subscriptionPaymentFromPocketData.f89305a) && Intrinsics.f(this.f89306b, subscriptionPaymentFromPocketData.f89306b) && Intrinsics.f(this.f89307c, subscriptionPaymentFromPocketData.f89307c);
        }

        public final int hashCode() {
            int iG = l.g(this.f89306b, this.f89305a.hashCode() * 31, 31);
            EditPaymentSourceInfo editPaymentSourceInfo = this.f89307c;
            return iG + (editPaymentSourceInfo == null ? 0 : editPaymentSourceInfo.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89305a, i);
            dest.writeSerializable(this.f89306b);
            EditPaymentSourceInfo editPaymentSourceInfo = this.f89307c;
            if (editPaymentSourceInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                editPaymentSourceInfo.writeToParcel(dest, i);
            }
        }
    }

    private SubscriptionPaymentFromParcelData() {
    }

    /* JADX INFO: renamed from: a */
    public abstract EditPaymentSourceInfo getF89307c();
}
