package com.revolut.feature.tax_residency.impl.v2.ui.crs_flow;

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
import wi0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tax_residency/impl/v2/ui/crs_flow/CrsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CrsFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CrsFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f90203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f90204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f90205c;
    public final Map d;
    public final ArrayList e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TaxResidencyFlowContext f90206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f90207h;
    public final AnalyticsProduct i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BackNavigationType f90208j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVar = (b) parcel.readSerializable();
            int iA = 0;
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readSerializable(), CountryRule.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i3);
            for (int i5 = 0; i5 != i3; i5++) {
                linkedHashMap2.put(parcel.readSerializable(), UserSpecificRule.CREATOR.createFromParcel(parcel));
            }
            int i6 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i6);
            int iC = 0;
            while (iC != i6) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            int i21 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i21);
            while (iA != i21) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(DeclaredTaxResidency.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new CrsFlowContract$InputData((AnalyticsProduct) parcel.readParcelable(CrsFlowContract$InputData.class.getClassLoader()), (BackNavigationType) parcel.readParcelable(CrsFlowContract$InputData.class.getClassLoader()), TaxResidencyFlowContext.CREATOR.createFromParcel(parcel), parcel.readString(), arrayList, arrayList2, linkedHashMap, linkedHashMap2, bVar, z);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CrsFlowContract$InputData[i];
        }
    }

    public CrsFlowContract$InputData(AnalyticsProduct analyticsProduct, BackNavigationType backNavigationType, TaxResidencyFlowContext flowContext, String stepId, ArrayList suggestedCountries, List declaredTaxResidencies, Map countryRules, Map userSpecificRules, b userCountry, boolean z) {
        Intrinsics.checkNotNullParameter(userCountry, "userCountry");
        Intrinsics.checkNotNullParameter(countryRules, "countryRules");
        Intrinsics.checkNotNullParameter(userSpecificRules, "userSpecificRules");
        Intrinsics.checkNotNullParameter(suggestedCountries, "suggestedCountries");
        Intrinsics.checkNotNullParameter(declaredTaxResidencies, "declaredTaxResidencies");
        Intrinsics.checkNotNullParameter(flowContext, "flowContext");
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
        this.f90203a = userCountry;
        this.f90204b = z;
        this.f90205c = countryRules;
        this.d = userSpecificRules;
        this.e = suggestedCountries;
        this.f = declaredTaxResidencies;
        this.f90206g = flowContext;
        this.f90207h = stepId;
        this.i = analyticsProduct;
        this.f90208j = backNavigationType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CrsFlowContract$InputData)) {
            return false;
        }
        CrsFlowContract$InputData crsFlowContract$InputData = (CrsFlowContract$InputData) obj2;
        return Intrinsics.f(this.f90203a, crsFlowContract$InputData.f90203a) && this.f90204b == crsFlowContract$InputData.f90204b && this.f90205c.equals(crsFlowContract$InputData.f90205c) && this.d.equals(crsFlowContract$InputData.d) && this.e.equals(crsFlowContract$InputData.e) && Intrinsics.f(this.f, crsFlowContract$InputData.f) && Intrinsics.f(this.f90206g, crsFlowContract$InputData.f90206g) && Intrinsics.f(this.f90207h, crsFlowContract$InputData.f90207h) && Intrinsics.f(this.i, crsFlowContract$InputData.i) && this.f90208j == crsFlowContract$InputData.f90208j;
    }

    public final int hashCode() {
        return this.f90208j.hashCode() + l.a(p.a.c((this.f90206g.hashCode() + p.a.d(com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, p.a.e(p.a.e(j6.a.c(this.f90203a.f297794a.hashCode() * 31, 31, this.f90204b), 31, this.f90205c), 31, this.d), 31), 31, this.f)) * 31, 31, this.f90207h), 31, this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f90203a);
        dest.writeInt(this.f90204b ? 1 : 0);
        Iterator itZ = j6.a.z(this.f90205c, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeSerializable((Serializable) entry.getKey());
            ((CountryRule) entry.getValue()).writeToParcel(dest, i);
        }
        Iterator itZ2 = j6.a.z(this.d, dest);
        while (itZ2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itZ2.next();
            dest.writeSerializable((Serializable) entry2.getKey());
            ((UserSpecificRule) entry2.getValue()).writeToParcel(dest, i);
        }
        Iterator itY = j6.a.y(this.e, dest);
        while (itY.hasNext()) {
            dest.writeSerializable((Serializable) itY.next());
        }
        Iterator itV = p.a.v(this.f, dest);
        while (itV.hasNext()) {
            ((DeclaredTaxResidency) itV.next()).writeToParcel(dest, i);
        }
        this.f90206g.writeToParcel(dest, i);
        dest.writeString(this.f90207h);
        dest.writeParcelable(this.i, i);
        dest.writeParcelable(this.f90208j, i);
    }
}
