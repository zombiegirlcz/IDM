package com.revolut.feature.external_accounts.impl.ui.brazil.open_finance;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import og6.i;
import org.jetbrains.annotations.NotNull;
import tof.a3;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/brazil/open_finance/OpenFinanceScreenContract$Output", "Laii/r;", "Landroid/os/Parcelable;", "<init>", "()V", "ConsentsGroupClicked", "LinkedAccountsGroupClicked", "TransactionClicked", "PixAutomaticoConsentsClicked", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/OpenFinanceScreenContract$Output$ConsentsGroupClicked;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/OpenFinanceScreenContract$Output$LinkedAccountsGroupClicked;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/OpenFinanceScreenContract$Output$PixAutomaticoConsentsClicked;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/OpenFinanceScreenContract$Output$TransactionClicked;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OpenFinanceScreenContract$Output implements r, Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/OpenFinanceScreenContract$Output$ConsentsGroupClicked;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/OpenFinanceScreenContract$Output;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConsentsGroupClicked extends OpenFinanceScreenContract$Output {

        @NotNull
        public static final Parcelable.Creator<ConsentsGroupClicked> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f72653b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConsentsGroupClicked(parcel.readString(), i.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConsentsGroupClicked[i];
            }
        }

        public ConsentsGroupClicked(String thirdPartyTitle, i consentType) {
            Intrinsics.checkNotNullParameter(thirdPartyTitle, "thirdPartyTitle");
            Intrinsics.checkNotNullParameter(consentType, "consentType");
            this.f72652a = thirdPartyTitle;
            this.f72653b = consentType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ConsentsGroupClicked)) {
                return false;
            }
            ConsentsGroupClicked consentsGroupClicked = (ConsentsGroupClicked) obj2;
            return Intrinsics.f(this.f72652a, consentsGroupClicked.f72652a) && this.f72653b == consentsGroupClicked.f72653b;
        }

        public final int hashCode() {
            return this.f72653b.hashCode() + (this.f72652a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72652a);
            dest.writeString(this.f72653b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/OpenFinanceScreenContract$Output$LinkedAccountsGroupClicked;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/OpenFinanceScreenContract$Output;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LinkedAccountsGroupClicked extends OpenFinanceScreenContract$Output {

        @NotNull
        public static final Parcelable.Creator<LinkedAccountsGroupClicked> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72654a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkedAccountsGroupClicked(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkedAccountsGroupClicked[i];
            }
        }

        public LinkedAccountsGroupClicked(String thirdPartyTitle) {
            Intrinsics.checkNotNullParameter(thirdPartyTitle, "thirdPartyTitle");
            this.f72654a = thirdPartyTitle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LinkedAccountsGroupClicked) && Intrinsics.f(this.f72654a, ((LinkedAccountsGroupClicked) obj2).f72654a);
        }

        public final int hashCode() {
            return this.f72654a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72654a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/OpenFinanceScreenContract$Output$PixAutomaticoConsentsClicked;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/OpenFinanceScreenContract$Output;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PixAutomaticoConsentsClicked extends OpenFinanceScreenContract$Output {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PixAutomaticoConsentsClicked f72655a = new PixAutomaticoConsentsClicked();

        @NotNull
        public static final Parcelable.Creator<PixAutomaticoConsentsClicked> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PixAutomaticoConsentsClicked.f72655a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PixAutomaticoConsentsClicked[i];
            }
        }

        private PixAutomaticoConsentsClicked() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/OpenFinanceScreenContract$Output$TransactionClicked;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/OpenFinanceScreenContract$Output;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionClicked extends OpenFinanceScreenContract$Output {

        @NotNull
        public static final Parcelable.Creator<TransactionClicked> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a3 f72656a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionClicked((a3) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionClicked[i];
            }
        }

        public TransactionClicked(a3 transaction) {
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            this.f72656a = transaction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TransactionClicked) && Intrinsics.f(this.f72656a, ((TransactionClicked) obj2).f72656a);
        }

        public final int hashCode() {
            return this.f72656a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f72656a);
        }
    }

    private OpenFinanceScreenContract$Output() {
    }
}
