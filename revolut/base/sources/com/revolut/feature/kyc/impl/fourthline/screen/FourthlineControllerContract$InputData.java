package com.revolut.feature.kyc.impl.fourthline.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.kyc_documents_scan.api.models.DocType;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/kyc/impl/fourthline/screen/FourthlineControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FourthlineControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FourthlineControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DocType f77767c;
    public final String d;
    public final AnalyticsProduct e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FourthlineControllerContract$InputData(parcel.readString(), parcel.readString(), (DocType) parcel.readParcelable(FourthlineControllerContract$InputData.class.getClassLoader()), parcel.readString(), (AnalyticsProduct) parcel.readParcelable(FourthlineControllerContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FourthlineControllerContract$InputData[i];
        }
    }

    public FourthlineControllerContract$InputData(String checkId, String validationCode, DocType documentType, String issuingCountryISO3, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(checkId, "checkId");
        Intrinsics.checkNotNullParameter(validationCode, "validationCode");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(issuingCountryISO3, "issuingCountryISO3");
        this.f77765a = checkId;
        this.f77766b = validationCode;
        this.f77767c = documentType;
        this.d = issuingCountryISO3;
        this.e = analyticsProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FourthlineControllerContract$InputData)) {
            return false;
        }
        FourthlineControllerContract$InputData fourthlineControllerContract$InputData = (FourthlineControllerContract$InputData) obj2;
        return Intrinsics.f(this.f77765a, fourthlineControllerContract$InputData.f77765a) && Intrinsics.f(this.f77766b, fourthlineControllerContract$InputData.f77766b) && Intrinsics.f(this.f77767c, fourthlineControllerContract$InputData.f77767c) && Intrinsics.f(this.d, fourthlineControllerContract$InputData.d) && Intrinsics.f(this.e, fourthlineControllerContract$InputData.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f77765a.hashCode() * 31, 31, this.f77766b), 31, this.f77767c.f77926a), 31, this.d);
        AnalyticsProduct analyticsProduct = this.e;
        return iC + (analyticsProduct == null ? 0 : analyticsProduct.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77765a);
        dest.writeString(this.f77766b);
        dest.writeParcelable(this.f77767c, i);
        dest.writeString(this.d);
        dest.writeParcelable(this.e, i);
    }
}
