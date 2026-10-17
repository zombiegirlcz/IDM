package com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.domain.models.topup.TopUpContext;
import com.revolut.feature.external_accounts.api.navigation.CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CrossBorderEasyBankTransferFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CrossBorderEasyBankTransferFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f72814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TopUpContext f72815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData f72816c;
    public final AnalyticsProduct d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CrossBorderEasyBankTransferFlowContract$InputData((dj0.d) parcel.readSerializable(), (TopUpContext) parcel.readParcelable(CrossBorderEasyBankTransferFlowContract$InputData.class.getClassLoader()), (CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData) parcel.readParcelable(CrossBorderEasyBankTransferFlowContract$InputData.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(CrossBorderEasyBankTransferFlowContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CrossBorderEasyBankTransferFlowContract$InputData[i];
        }
    }

    public CrossBorderEasyBankTransferFlowContract$InputData(dj0.d amount, TopUpContext topUpContext, CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData crossBorderEasyBankTransferDescriptor$PreselectedInstitutionData, AnalyticsProduct analyticsProduct, boolean z) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(topUpContext, "topUpContext");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f72814a = amount;
        this.f72815b = topUpContext;
        this.f72816c = crossBorderEasyBankTransferDescriptor$PreselectedInstitutionData;
        this.d = analyticsProduct;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CrossBorderEasyBankTransferFlowContract$InputData)) {
            return false;
        }
        CrossBorderEasyBankTransferFlowContract$InputData crossBorderEasyBankTransferFlowContract$InputData = (CrossBorderEasyBankTransferFlowContract$InputData) obj2;
        return Intrinsics.f(this.f72814a, crossBorderEasyBankTransferFlowContract$InputData.f72814a) && Intrinsics.f(this.f72815b, crossBorderEasyBankTransferFlowContract$InputData.f72815b) && Intrinsics.f(this.f72816c, crossBorderEasyBankTransferFlowContract$InputData.f72816c) && Intrinsics.f(this.d, crossBorderEasyBankTransferFlowContract$InputData.d) && this.e == crossBorderEasyBankTransferFlowContract$InputData.e;
    }

    public final int hashCode() {
        int iHashCode = (this.f72815b.hashCode() + (this.f72814a.hashCode() * 31)) * 31;
        CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData crossBorderEasyBankTransferDescriptor$PreselectedInstitutionData = this.f72816c;
        return Boolean.hashCode(this.e) + l.a((iHashCode + (crossBorderEasyBankTransferDescriptor$PreselectedInstitutionData == null ? 0 : crossBorderEasyBankTransferDescriptor$PreselectedInstitutionData.hashCode())) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f72814a);
        dest.writeParcelable(this.f72815b, i);
        dest.writeParcelable(this.f72816c, i);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
    }
}
