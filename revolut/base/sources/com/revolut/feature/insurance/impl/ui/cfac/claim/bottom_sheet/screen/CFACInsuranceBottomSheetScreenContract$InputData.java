package com.revolut.feature.insurance.impl.ui.cfac.claim.bottom_sheet.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance.api.models.details.CFACClaimProperties;
import com.revolut.feature.insurance.api.models.details.CFACPaymentCanceller;
import com.revolut.feature.insurance.api.models.details.CFACPaymentPurpose;
import com.revolut.kompot.common.IOData$Input;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance/impl/ui/cfac/claim/bottom_sheet/screen/CFACInsuranceBottomSheetScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CFACInsuranceBottomSheetScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CFACInsuranceBottomSheetScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f75061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nj7.a f75062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CFACClaimProperties f75063c;
    public final CFACPaymentPurpose d;
    public final CFACPaymentCanceller e;
    public final File f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CFACInsuranceBottomSheetScreenContract$InputData(parcel.readLong(), nj7.a.valueOf(parcel.readString()), (CFACClaimProperties) parcel.readParcelable(CFACInsuranceBottomSheetScreenContract$InputData.class.getClassLoader()), (CFACPaymentPurpose) parcel.readParcelable(CFACInsuranceBottomSheetScreenContract$InputData.class.getClassLoader()), (CFACPaymentCanceller) parcel.readParcelable(CFACInsuranceBottomSheetScreenContract$InputData.class.getClassLoader()), (File) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACInsuranceBottomSheetScreenContract$InputData[i];
        }
    }

    public CFACInsuranceBottomSheetScreenContract$InputData(long j2, nj7.a configuration, CFACClaimProperties claimProperties, CFACPaymentPurpose cFACPaymentPurpose, CFACPaymentCanceller cFACPaymentCanceller, File file) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(claimProperties, "claimProperties");
        this.f75061a = j2;
        this.f75062b = configuration;
        this.f75063c = claimProperties;
        this.d = cFACPaymentPurpose;
        this.e = cFACPaymentCanceller;
        this.f = file;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CFACInsuranceBottomSheetScreenContract$InputData)) {
            return false;
        }
        CFACInsuranceBottomSheetScreenContract$InputData cFACInsuranceBottomSheetScreenContract$InputData = (CFACInsuranceBottomSheetScreenContract$InputData) obj2;
        return this.f75061a == cFACInsuranceBottomSheetScreenContract$InputData.f75061a && this.f75062b == cFACInsuranceBottomSheetScreenContract$InputData.f75062b && Intrinsics.f(this.f75063c, cFACInsuranceBottomSheetScreenContract$InputData.f75063c) && Intrinsics.f(this.d, cFACInsuranceBottomSheetScreenContract$InputData.d) && Intrinsics.f(this.e, cFACInsuranceBottomSheetScreenContract$InputData.e) && Intrinsics.f(this.f, cFACInsuranceBottomSheetScreenContract$InputData.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f75063c.hashCode() + ((this.f75062b.hashCode() + (Long.hashCode(this.f75061a) * 31)) * 31)) * 31;
        CFACPaymentPurpose cFACPaymentPurpose = this.d;
        int iHashCode2 = (iHashCode + (cFACPaymentPurpose == null ? 0 : cFACPaymentPurpose.hashCode())) * 31;
        CFACPaymentCanceller cFACPaymentCanceller = this.e;
        int iHashCode3 = (iHashCode2 + (cFACPaymentCanceller == null ? 0 : cFACPaymentCanceller.hashCode())) * 31;
        File file = this.f;
        return iHashCode3 + (file != null ? file.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f75061a);
        dest.writeString(this.f75062b.name());
        dest.writeParcelable(this.f75063c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeSerializable(this.f);
    }
}
