package com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.domain.models.topup.TopUpContext;
import com.revolut.feature.external_accounts.api.navigation.EasyBankTransferDescriptor$PreselectedInstitutionInfo;
import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/link/flow/easy_bank_transfer/EasyBankTransferFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EasyBankTransferFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EasyBankTransferFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f72959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TopUpContext f72960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration f72961c;
    public final AnalyticsProduct d;
    public final EasyBankTransferDescriptor$PreselectedInstitutionInfo e;
    public final boolean f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EasyBankTransferFlowContract$InputData((dj0.d) parcel.readSerializable(), (TopUpContext) parcel.readParcelable(EasyBankTransferFlowContract$InputData.class.getClassLoader()), (ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration) parcel.readParcelable(EasyBankTransferFlowContract$InputData.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(EasyBankTransferFlowContract$InputData.class.getClassLoader()), (EasyBankTransferDescriptor$PreselectedInstitutionInfo) parcel.readParcelable(EasyBankTransferFlowContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EasyBankTransferFlowContract$InputData[i];
        }
    }

    public EasyBankTransferFlowContract$InputData(dj0.d amount, TopUpContext topUpContext, ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration externalInstitutionsConfiguration, AnalyticsProduct analyticsProduct, EasyBankTransferDescriptor$PreselectedInstitutionInfo easyBankTransferDescriptor$PreselectedInstitutionInfo, boolean z) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(topUpContext, "topUpContext");
        Intrinsics.checkNotNullParameter(externalInstitutionsConfiguration, "externalInstitutionsConfiguration");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f72959a = amount;
        this.f72960b = topUpContext;
        this.f72961c = externalInstitutionsConfiguration;
        this.d = analyticsProduct;
        this.e = easyBankTransferDescriptor$PreselectedInstitutionInfo;
        this.f = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EasyBankTransferFlowContract$InputData)) {
            return false;
        }
        EasyBankTransferFlowContract$InputData easyBankTransferFlowContract$InputData = (EasyBankTransferFlowContract$InputData) obj2;
        return Intrinsics.f(this.f72959a, easyBankTransferFlowContract$InputData.f72959a) && Intrinsics.f(this.f72960b, easyBankTransferFlowContract$InputData.f72960b) && Intrinsics.f(this.f72961c, easyBankTransferFlowContract$InputData.f72961c) && Intrinsics.f(this.d, easyBankTransferFlowContract$InputData.d) && Intrinsics.f(this.e, easyBankTransferFlowContract$InputData.e) && this.f == easyBankTransferFlowContract$InputData.f;
    }

    public final int hashCode() {
        int iA = l.a((this.f72961c.hashCode() + ((this.f72960b.hashCode() + (this.f72959a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        EasyBankTransferDescriptor$PreselectedInstitutionInfo easyBankTransferDescriptor$PreselectedInstitutionInfo = this.e;
        return Boolean.hashCode(this.f) + ((iA + (easyBankTransferDescriptor$PreselectedInstitutionInfo == null ? 0 : easyBankTransferDescriptor$PreselectedInstitutionInfo.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f72959a);
        dest.writeParcelable(this.f72960b, i);
        dest.writeParcelable(this.f72961c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeInt(this.f ? 1 : 0);
    }
}
