package com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer.models.quotes.TransferQuoteUserIdentifier;
import com.revolut.feature.transfer.models.transfer.TransferTrustData;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import krf.c;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_request_approval/impl/ui_kompot/manual/ManualTransferData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_transfer_request_approval_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ManualTransferData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ManualTransferData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FundingSource f92455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f92456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransferTrustData f92457c;
    public final c d;
    public final TransferQuoteUserIdentifier e;
    public final b f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ManualTransferData((FundingSource) parcel.readParcelable(ManualTransferData.class.getClassLoader()), (AccountId) parcel.readParcelable(ManualTransferData.class.getClassLoader()), (TransferTrustData) parcel.readParcelable(ManualTransferData.class.getClassLoader()), (c) parcel.readSerializable(), (TransferQuoteUserIdentifier) parcel.readParcelable(ManualTransferData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ManualTransferData[i];
        }
    }

    public ManualTransferData(FundingSource fundingSource, AccountId accountId, TransferTrustData trustData, c cVar, TransferQuoteUserIdentifier transferQuoteUserIdentifier) {
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(trustData, "trustData");
        this.f92455a = fundingSource;
        this.f92456b = accountId;
        this.f92457c = trustData;
        this.d = cVar;
        this.e = transferQuoteUserIdentifier;
        this.f = fundingSource.f92241b;
    }

    public static ManualTransferData a(ManualTransferData manualTransferData, FundingSource fundingSource, AccountId accountId, TransferTrustData transferTrustData, c cVar, int i) {
        if ((i & 1) != 0) {
            fundingSource = manualTransferData.f92455a;
        }
        FundingSource fundingSource2 = fundingSource;
        if ((i & 2) != 0) {
            accountId = manualTransferData.f92456b;
        }
        AccountId accountId2 = accountId;
        if ((i & 4) != 0) {
            transferTrustData = manualTransferData.f92457c;
        }
        TransferTrustData trustData = transferTrustData;
        if ((i & 8) != 0) {
            cVar = manualTransferData.d;
        }
        TransferQuoteUserIdentifier transferQuoteUserIdentifier = manualTransferData.e;
        manualTransferData.getClass();
        Intrinsics.checkNotNullParameter(fundingSource2, "fundingSource");
        Intrinsics.checkNotNullParameter(accountId2, "accountId");
        Intrinsics.checkNotNullParameter(trustData, "trustData");
        return new ManualTransferData(fundingSource2, accountId2, trustData, cVar, transferQuoteUserIdentifier);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ManualTransferData)) {
            return false;
        }
        ManualTransferData manualTransferData = (ManualTransferData) obj2;
        return Intrinsics.f(this.f92455a, manualTransferData.f92455a) && Intrinsics.f(this.f92456b, manualTransferData.f92456b) && Intrinsics.f(this.f92457c, manualTransferData.f92457c) && Intrinsics.f(this.d, manualTransferData.d) && Intrinsics.f(this.e, manualTransferData.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f92457c.hashCode() + l.b(this.f92456b, this.f92455a.hashCode() * 31, 31)) * 31;
        c cVar = this.d;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        TransferQuoteUserIdentifier transferQuoteUserIdentifier = this.e;
        return iHashCode2 + (transferQuoteUserIdentifier != null ? transferQuoteUserIdentifier.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f92455a, i);
        dest.writeParcelable(this.f92456b, i);
        dest.writeParcelable(this.f92457c, i);
        dest.writeSerializable(this.d);
        dest.writeParcelable(this.e, i);
    }
}
