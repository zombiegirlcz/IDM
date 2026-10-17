package com.revolut.feature.tax_residency.impl.v2.ui.direct_tin_flow;

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
import kpe.c;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tax_residency/impl/v2/ui/direct_tin_flow/DirectTinFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DirectTinFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DirectTinFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f90237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f90238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f90239c;
    public final String d;
    public final CountryRule e;
    public final UserSpecificRule f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f90240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AnalyticsProduct f90241h;
    public final BackNavigationType i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVar = (b) parcel.readSerializable();
            c cVarValueOf = c.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            CountryRule countryRuleCreateFromParcel = CountryRule.CREATOR.createFromParcel(parcel);
            UserSpecificRule userSpecificRuleCreateFromParcel = UserSpecificRule.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(DeclaredTaxResidency.CREATOR, parcel, arrayList, iA, 1);
            }
            return new DirectTinFlowContract$InputData(bVar, cVarValueOf, string, string2, countryRuleCreateFromParcel, userSpecificRuleCreateFromParcel, arrayList, (AnalyticsProduct) parcel.readParcelable(DirectTinFlowContract$InputData.class.getClassLoader()), (BackNavigationType) parcel.readParcelable(DirectTinFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DirectTinFlowContract$InputData[i];
        }
    }

    public DirectTinFlowContract$InputData(b country, c type, String str, String stepId, CountryRule countryRule, UserSpecificRule userSpecificRule, List declaredTaxResidencies, AnalyticsProduct analyticsProduct, BackNavigationType backNavigationType) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        Intrinsics.checkNotNullParameter(countryRule, "countryRule");
        Intrinsics.checkNotNullParameter(userSpecificRule, "userSpecificRule");
        Intrinsics.checkNotNullParameter(declaredTaxResidencies, "declaredTaxResidencies");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
        this.f90237a = country;
        this.f90238b = type;
        this.f90239c = str;
        this.d = stepId;
        this.e = countryRule;
        this.f = userSpecificRule;
        this.f90240g = declaredTaxResidencies;
        this.f90241h = analyticsProduct;
        this.i = backNavigationType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DirectTinFlowContract$InputData)) {
            return false;
        }
        DirectTinFlowContract$InputData directTinFlowContract$InputData = (DirectTinFlowContract$InputData) obj2;
        return Intrinsics.f(this.f90237a, directTinFlowContract$InputData.f90237a) && this.f90238b == directTinFlowContract$InputData.f90238b && Intrinsics.f(this.f90239c, directTinFlowContract$InputData.f90239c) && Intrinsics.f(this.d, directTinFlowContract$InputData.d) && Intrinsics.f(this.e, directTinFlowContract$InputData.e) && Intrinsics.f(this.f, directTinFlowContract$InputData.f) && Intrinsics.f(this.f90240g, directTinFlowContract$InputData.f90240g) && Intrinsics.f(this.f90241h, directTinFlowContract$InputData.f90241h) && this.i == directTinFlowContract$InputData.i;
    }

    public final int hashCode() {
        int iHashCode = (this.f90238b.hashCode() + (this.f90237a.f297794a.hashCode() * 31)) * 31;
        String str = this.f90239c;
        return this.i.hashCode() + l.a(p.a.d((this.f.hashCode() + ((this.e.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31)) * 31, 31, this.f90240g), 31, this.f90241h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f90237a);
        dest.writeString(this.f90238b.name());
        dest.writeString(this.f90239c);
        dest.writeString(this.d);
        this.e.writeToParcel(dest, i);
        this.f.writeToParcel(dest, i);
        Iterator itV = p.a.v(this.f90240g, dest);
        while (itV.hasNext()) {
            ((DeclaredTaxResidency) itV.next()).writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f90241h, i);
        dest.writeParcelable(this.i, i);
    }
}
