package com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.tax_residency.api.BackNavigationType;
import com.revolut.feature.tax_residency.impl.v2.models.CountryRule;
import com.revolut.feature.tax_residency.impl.v2.models.UserSpecificRule;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tax_residency/impl/v2/ui/declaration_flow/TaxResidencyDeclarationFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxResidencyDeclarationFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TaxResidencyDeclarationFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f90216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CountryRule f90217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UserSpecificRule f90218c;
    public final TaxResidencyDeclarationFlowContract$UseCase d;
    public final AnalyticsProduct e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f90219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BackNavigationType f90220h;
    public final boolean i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TaxResidencyDeclarationFlowContract$InputData((b) parcel.readSerializable(), CountryRule.CREATOR.createFromParcel(parcel), UserSpecificRule.CREATOR.createFromParcel(parcel), (TaxResidencyDeclarationFlowContract$UseCase) parcel.readParcelable(TaxResidencyDeclarationFlowContract$InputData.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(TaxResidencyDeclarationFlowContract$InputData.class.getClassLoader()), parcel.readString(), parcel.readString(), (BackNavigationType) parcel.readParcelable(TaxResidencyDeclarationFlowContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxResidencyDeclarationFlowContract$InputData[i];
        }
    }

    public TaxResidencyDeclarationFlowContract$InputData(b countryCode, CountryRule countryRule, UserSpecificRule userSpecificRule, TaxResidencyDeclarationFlowContract$UseCase useCase, AnalyticsProduct analyticsProduct, String str, String stepId, BackNavigationType backNavigationType, boolean z) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(countryRule, "countryRule");
        Intrinsics.checkNotNullParameter(userSpecificRule, "userSpecificRule");
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
        this.f90216a = countryCode;
        this.f90217b = countryRule;
        this.f90218c = userSpecificRule;
        this.d = useCase;
        this.e = analyticsProduct;
        this.f = str;
        this.f90219g = stepId;
        this.f90220h = backNavigationType;
        this.i = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxResidencyDeclarationFlowContract$InputData)) {
            return false;
        }
        TaxResidencyDeclarationFlowContract$InputData taxResidencyDeclarationFlowContract$InputData = (TaxResidencyDeclarationFlowContract$InputData) obj2;
        return Intrinsics.f(this.f90216a, taxResidencyDeclarationFlowContract$InputData.f90216a) && Intrinsics.f(this.f90217b, taxResidencyDeclarationFlowContract$InputData.f90217b) && Intrinsics.f(this.f90218c, taxResidencyDeclarationFlowContract$InputData.f90218c) && Intrinsics.f(this.d, taxResidencyDeclarationFlowContract$InputData.d) && Intrinsics.f(this.e, taxResidencyDeclarationFlowContract$InputData.e) && Intrinsics.f(this.f, taxResidencyDeclarationFlowContract$InputData.f) && Intrinsics.f(this.f90219g, taxResidencyDeclarationFlowContract$InputData.f90219g) && this.f90220h == taxResidencyDeclarationFlowContract$InputData.f90220h && this.i == taxResidencyDeclarationFlowContract$InputData.i;
    }

    public final int hashCode() {
        int iA = l.a((this.d.hashCode() + ((this.f90218c.hashCode() + ((this.f90217b.hashCode() + (this.f90216a.f297794a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e);
        String str = this.f;
        return Boolean.hashCode(this.i) + ((this.f90220h.hashCode() + p.a.c((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.f90219g)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f90216a);
        this.f90217b.writeToParcel(dest, i);
        this.f90218c.writeToParcel(dest, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeString(this.f);
        dest.writeString(this.f90219g);
        dest.writeParcelable(this.f90220h, i);
        dest.writeInt(this.i ? 1 : 0);
    }
}
