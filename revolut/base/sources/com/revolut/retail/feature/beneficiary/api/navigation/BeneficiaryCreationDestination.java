package com.revolut.retail.feature.beneficiary.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared.beneficiary.api.navigation.BeneficiaryCreationKompotFinishMode;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.feature.transfer.models.ScannedBillDetails;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/api/navigation/BeneficiaryCreationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BeneficiaryCreationDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<BeneficiaryCreationDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BeneficiaryCreationKompotFinishMode f99622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BeneficiaryCreationKompotInputData.CreationConfiguration f99623b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BeneficiaryCreationDestination((BeneficiaryCreationKompotFinishMode) parcel.readParcelable(BeneficiaryCreationDestination.class.getClassLoader()), (BeneficiaryCreationKompotInputData.CreationConfiguration) parcel.readParcelable(BeneficiaryCreationDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BeneficiaryCreationDestination[i];
        }
    }

    public BeneficiaryCreationDestination(BeneficiaryCreationKompotFinishMode finishMode, BeneficiaryCreationKompotInputData.CreationConfiguration creationConfig) {
        Intrinsics.checkNotNullParameter(finishMode, "finishMode");
        Intrinsics.checkNotNullParameter(creationConfig, "creationConfig");
        this.f99622a = finishMode;
        this.f99623b = creationConfig;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BeneficiaryCreationKompotInputData.CreationConfiguration getF99623b() {
        return this.f99623b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BeneficiaryCreationKompotFinishMode getF99622a() {
        return this.f99622a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BeneficiaryCreationDestination)) {
            return false;
        }
        BeneficiaryCreationDestination beneficiaryCreationDestination = (BeneficiaryCreationDestination) obj2;
        return Intrinsics.f(this.f99622a, beneficiaryCreationDestination.f99622a) && Intrinsics.f(this.f99623b, beneficiaryCreationDestination.f99623b);
    }

    public final int hashCode() {
        return this.f99623b.hashCode() + (this.f99622a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f99622a, i);
        dest.writeParcelable(this.f99623b, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ BeneficiaryCreationDestination(BeneficiaryCreationKompotInputData.CreationConfiguration creationConfiguration) {
        this(new BeneficiaryCreationKompotFinishMode.NavigateToTransfer.Default((TransferMoneyPocket) null, (ScannedBillDetails) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), 15), creationConfiguration);
    }
}
