package com.revolut.feature.tax_residency.impl.v2.ui.multi_residency_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.tax_residency.api.BackNavigationType;
import com.revolut.feature.tax_residency.impl.v2.models.CountryRule;
import com.revolut.feature.tax_residency.impl.v2.models.DeclaredTaxResidency;
import com.revolut.feature.tax_residency.impl.v2.models.TaxResidencyFlowContext;
import com.revolut.feature.tax_residency.impl.v2.models.UserSpecificRule;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tax_residency/impl/v2/ui/multi_residency_flow/MultiResidencyFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultiResidencyFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<MultiResidencyFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f90274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f90275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f90276c;
    public final Map d;
    public final Map e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TaxResidencyFlowContext f90277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f90278h;
    public final AnalyticsProduct i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BackNavigationType f90279j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            wi0.b bVar = (wi0.b) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            boolean z = parcel.readInt() != 0;
            int i2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                linkedHashMap.put(parcel.readSerializable(), CountryRule.CREATOR.createFromParcel(parcel));
            }
            int i5 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                linkedHashMap2.put(parcel.readSerializable(), UserSpecificRule.CREATOR.createFromParcel(parcel));
            }
            int i21 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i21);
            while (iA != i21) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(DeclaredTaxResidency.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new MultiResidencyFlowContract$InputData((AnalyticsProduct) parcel.readParcelable(MultiResidencyFlowContract$InputData.class.getClassLoader()), (BackNavigationType) parcel.readParcelable(MultiResidencyFlowContract$InputData.class.getClassLoader()), TaxResidencyFlowContext.CREATOR.createFromParcel(parcel), parcel.readString(), arrayList, arrayList2, linkedHashMap, linkedHashMap2, bVar, z);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MultiResidencyFlowContract$InputData[i];
        }
    }

    public MultiResidencyFlowContract$InputData(AnalyticsProduct analyticsProduct, BackNavigationType backNavigationType, TaxResidencyFlowContext flowContext, String stepId, ArrayList suggestedCountries, List declaredTaxResidencies, Map countryRules, Map userSpecificRules, wi0.b userCountry, boolean z) {
        Intrinsics.checkNotNullParameter(userCountry, "userCountry");
        Intrinsics.checkNotNullParameter(suggestedCountries, "suggestedCountries");
        Intrinsics.checkNotNullParameter(countryRules, "countryRules");
        Intrinsics.checkNotNullParameter(userSpecificRules, "userSpecificRules");
        Intrinsics.checkNotNullParameter(declaredTaxResidencies, "declaredTaxResidencies");
        Intrinsics.checkNotNullParameter(flowContext, "flowContext");
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
        this.f90274a = userCountry;
        this.f90275b = suggestedCountries;
        this.f90276c = z;
        this.d = countryRules;
        this.e = userSpecificRules;
        this.f = declaredTaxResidencies;
        this.f90277g = flowContext;
        this.f90278h = stepId;
        this.i = analyticsProduct;
        this.f90279j = backNavigationType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MultiResidencyFlowContract$InputData)) {
            return false;
        }
        MultiResidencyFlowContract$InputData multiResidencyFlowContract$InputData = (MultiResidencyFlowContract$InputData) obj2;
        return Intrinsics.f(this.f90274a, multiResidencyFlowContract$InputData.f90274a) && this.f90275b.equals(multiResidencyFlowContract$InputData.f90275b) && this.f90276c == multiResidencyFlowContract$InputData.f90276c && this.d.equals(multiResidencyFlowContract$InputData.d) && this.e.equals(multiResidencyFlowContract$InputData.e) && Intrinsics.f(this.f, multiResidencyFlowContract$InputData.f) && Intrinsics.f(this.f90277g, multiResidencyFlowContract$InputData.f90277g) && Intrinsics.f(this.f90278h, multiResidencyFlowContract$InputData.f90278h) && Intrinsics.f(this.i, multiResidencyFlowContract$InputData.i) && this.f90279j == multiResidencyFlowContract$InputData.f90279j;
    }

    public final int hashCode() {
        return this.f90279j.hashCode() + l.a(p.a.c((this.f90277g.hashCode() + p.a.d(p.a.e(p.a.e(j6.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f90275b, this.f90274a.f297794a.hashCode() * 31, 31), 31, this.f90276c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.f90278h), 31, this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f90274a);
        Iterator itY = j6.a.y(this.f90275b, dest);
        while (itY.hasNext()) {
            dest.writeSerializable((Serializable) itY.next());
        }
        dest.writeInt(this.f90276c ? 1 : 0);
        Iterator itZ = j6.a.z(this.d, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeSerializable((Serializable) entry.getKey());
            ((CountryRule) entry.getValue()).writeToParcel(dest, i);
        }
        Iterator itZ2 = j6.a.z(this.e, dest);
        while (itZ2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itZ2.next();
            dest.writeSerializable((Serializable) entry2.getKey());
            ((UserSpecificRule) entry2.getValue()).writeToParcel(dest, i);
        }
        Iterator itV = p.a.v(this.f, dest);
        while (itV.hasNext()) {
            ((DeclaredTaxResidency) itV.next()).writeToParcel(dest, i);
        }
        this.f90277g.writeToParcel(dest, i);
        dest.writeString(this.f90278h);
        dest.writeParcelable(this.i, i);
        dest.writeParcelable(this.f90279j, i);
    }
}
