package com.revolut.feature.tax_residency.impl.v2.ui.fatca_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.tax_residency.api.BackNavigationType;
import com.revolut.feature.tax_residency.impl.v2.models.CountryRule;
import com.revolut.feature.tax_residency.impl.v2.models.DeclaredTaxResidency;
import com.revolut.feature.tax_residency.impl.v2.models.UserSpecificRule;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tax_residency/impl/v2/ui/fatca_flow/FatcaFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FatcaFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FatcaFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f90251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f90253c;
    public final CountryRule d;
    public final UserSpecificRule e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AnalyticsProduct f90254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BackNavigationType f90255h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int iA = 0;
            boolean z = parcel.readInt() != 0;
            String string = parcel.readString();
            String string2 = parcel.readString();
            CountryRule countryRuleCreateFromParcel = CountryRule.CREATOR.createFromParcel(parcel);
            UserSpecificRule userSpecificRuleCreateFromParcel = UserSpecificRule.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(DeclaredTaxResidency.CREATOR, parcel, arrayList, iA, 1);
            }
            return new FatcaFlowContract$InputData(z, string, string2, countryRuleCreateFromParcel, userSpecificRuleCreateFromParcel, arrayList, (AnalyticsProduct) parcel.readParcelable(FatcaFlowContract$InputData.class.getClassLoader()), (BackNavigationType) parcel.readParcelable(FatcaFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FatcaFlowContract$InputData[i];
        }
    }

    public FatcaFlowContract$InputData(boolean z, String stepId, String str, CountryRule countryRule, UserSpecificRule userSpecificRule, List declaredTaxResidencies, AnalyticsProduct analyticsProduct, BackNavigationType backNavigationType) {
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        Intrinsics.checkNotNullParameter(countryRule, "countryRule");
        Intrinsics.checkNotNullParameter(userSpecificRule, "userSpecificRule");
        Intrinsics.checkNotNullParameter(declaredTaxResidencies, "declaredTaxResidencies");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
        this.f90251a = z;
        this.f90252b = stepId;
        this.f90253c = str;
        this.d = countryRule;
        this.e = userSpecificRule;
        this.f = declaredTaxResidencies;
        this.f90254g = analyticsProduct;
        this.f90255h = backNavigationType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FatcaFlowContract$InputData)) {
            return false;
        }
        FatcaFlowContract$InputData fatcaFlowContract$InputData = (FatcaFlowContract$InputData) obj2;
        return this.f90251a == fatcaFlowContract$InputData.f90251a && Intrinsics.f(this.f90252b, fatcaFlowContract$InputData.f90252b) && Intrinsics.f(this.f90253c, fatcaFlowContract$InputData.f90253c) && Intrinsics.f(this.d, fatcaFlowContract$InputData.d) && Intrinsics.f(this.e, fatcaFlowContract$InputData.e) && Intrinsics.f(this.f, fatcaFlowContract$InputData.f) && Intrinsics.f(this.f90254g, fatcaFlowContract$InputData.f90254g) && this.f90255h == fatcaFlowContract$InputData.f90255h;
    }

    public final int hashCode() {
        int iC = p.a.c(Boolean.hashCode(this.f90251a) * 31, 31, this.f90252b);
        String str = this.f90253c;
        return this.f90255h.hashCode() + l.a(p.a.d((this.e.hashCode() + ((this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.f), 31, this.f90254g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f90251a ? 1 : 0);
        dest.writeString(this.f90252b);
        dest.writeString(this.f90253c);
        this.d.writeToParcel(dest, i);
        this.e.writeToParcel(dest, i);
        Iterator itV = p.a.v(this.f, dest);
        while (itV.hasNext()) {
            ((DeclaredTaxResidency) itV.next()).writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f90254g, i);
        dest.writeParcelable(this.f90255h, i);
    }
}
