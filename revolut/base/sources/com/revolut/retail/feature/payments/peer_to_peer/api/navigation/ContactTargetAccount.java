package com.revolut.retail.feature.payments.peer_to_peer.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillLinkDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.i3;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/ContactTargetAccount;", "Landroid/os/Parcelable;", "Subaccount", "SplitBillLink", "PersonalAccount", "Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/ContactTargetAccount$PersonalAccount;", "Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/ContactTargetAccount$SplitBillLink;", "Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/ContactTargetAccount$Subaccount;", "feature_payments_peer_to_peer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ContactTargetAccount extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/ContactTargetAccount$PersonalAccount;", "Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/ContactTargetAccount;", "<init>", "()V", "feature_payments_peer_to_peer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PersonalAccount implements ContactTargetAccount {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PersonalAccount f102259a = new PersonalAccount();

        @NotNull
        public static final Parcelable.Creator<PersonalAccount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PersonalAccount.f102259a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PersonalAccount[i];
            }
        }

        private PersonalAccount() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/ContactTargetAccount$SplitBillLink;", "Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/ContactTargetAccount;", "", "toString", "()Ljava/lang/String;", "feature_payments_peer_to_peer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SplitBillLink implements ContactTargetAccount {

        @NotNull
        public static final Parcelable.Creator<SplitBillLink> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SplitBillLinkDetails f102260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i3 f102261b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SplitBillLink((SplitBillLinkDetails) parcel.readParcelable(SplitBillLink.class.getClassLoader()), (i3) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SplitBillLink[i];
            }
        }

        public SplitBillLink(SplitBillLinkDetails details, i3 i3Var) {
            Intrinsics.checkNotNullParameter(details, "details");
            this.f102260a = details;
            this.f102261b = i3Var;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SplitBillLink)) {
                return false;
            }
            SplitBillLink splitBillLink = (SplitBillLink) obj2;
            return Intrinsics.f(this.f102260a, splitBillLink.f102260a) && Intrinsics.f(this.f102261b, splitBillLink.f102261b);
        }

        public final int hashCode() {
            int iHashCode = this.f102260a.hashCode() * 31;
            i3 i3Var = this.f102261b;
            return iHashCode + (i3Var == null ? 0 : i3Var.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102260a, i);
            dest.writeSerializable(this.f102261b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/ContactTargetAccount$Subaccount;", "Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/ContactTargetAccount;", "", "toString", "()Ljava/lang/String;", "feature_payments_peer_to_peer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Subaccount implements ContactTargetAccount {

        @NotNull
        public static final Parcelable.Creator<Subaccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f102263b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Subaccount(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Subaccount[i];
            }
        }

        public Subaccount(String paymentLinkId, String str) {
            Intrinsics.checkNotNullParameter(paymentLinkId, "paymentLinkId");
            this.f102262a = paymentLinkId;
            this.f102263b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Subaccount)) {
                return false;
            }
            Subaccount subaccount = (Subaccount) obj2;
            return Intrinsics.f(this.f102262a, subaccount.f102262a) && Intrinsics.f(this.f102263b, subaccount.f102263b);
        }

        public final int hashCode() {
            int iHashCode = this.f102262a.hashCode() * 31;
            String str = this.f102263b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102262a);
            dest.writeString(this.f102263b);
        }
    }
}
