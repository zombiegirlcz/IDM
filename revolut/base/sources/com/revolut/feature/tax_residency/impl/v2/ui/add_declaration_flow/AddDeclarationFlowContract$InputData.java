package com.revolut.feature.tax_residency.impl.v2.ui.add_declaration_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.tax_residency.api.BackNavigationType;
import com.revolut.feature.tax_residency.impl.v2.models.CountryRule;
import com.revolut.feature.tax_residency.impl.v2.models.DeclaredTaxResidency;
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
import mpe.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tax_residency/impl/v2/ui/add_declaration_flow/AddDeclarationFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddDeclarationFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AddDeclarationFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f90192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f90193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f90194c;
    public final Map d;
    public final Map e;
    public final AnalyticsProduct f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f90195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f90196h;
    public final BackNavigationType i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            g gVarValueOf = g.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            int iA = 0;
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(DeclaredTaxResidency.CREATOR, parcel, arrayList2, iA, 1);
            }
            int i3 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
            for (int i5 = 0; i5 != i3; i5++) {
                linkedHashMap.put(parcel.readSerializable(), CountryRule.CREATOR.createFromParcel(parcel));
            }
            int i6 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i6);
            for (int i21 = 0; i21 != i6; i21++) {
                linkedHashMap2.put(parcel.readSerializable(), UserSpecificRule.CREATOR.createFromParcel(parcel));
            }
            return new AddDeclarationFlowContract$InputData(gVarValueOf, arrayList, arrayList2, linkedHashMap, linkedHashMap2, (AnalyticsProduct) parcel.readParcelable(AddDeclarationFlowContract$InputData.class.getClassLoader()), parcel.readString(), parcel.readString(), (BackNavigationType) parcel.readParcelable(AddDeclarationFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddDeclarationFlowContract$InputData[i];
        }
    }

    public AddDeclarationFlowContract$InputData(g useCase, ArrayList suggestedCountries, List declaredTaxResidencies, Map countryRules, Map userSpecificRules, AnalyticsProduct analyticsProduct, String str, String stepId, BackNavigationType backNavigationType) {
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        Intrinsics.checkNotNullParameter(suggestedCountries, "suggestedCountries");
        Intrinsics.checkNotNullParameter(declaredTaxResidencies, "declaredTaxResidencies");
        Intrinsics.checkNotNullParameter(countryRules, "countryRules");
        Intrinsics.checkNotNullParameter(userSpecificRules, "userSpecificRules");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
        this.f90192a = useCase;
        this.f90193b = suggestedCountries;
        this.f90194c = declaredTaxResidencies;
        this.d = countryRules;
        this.e = userSpecificRules;
        this.f = analyticsProduct;
        this.f90195g = str;
        this.f90196h = stepId;
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
        if (!(obj2 instanceof AddDeclarationFlowContract$InputData)) {
            return false;
        }
        AddDeclarationFlowContract$InputData addDeclarationFlowContract$InputData = (AddDeclarationFlowContract$InputData) obj2;
        return this.f90192a == addDeclarationFlowContract$InputData.f90192a && this.f90193b.equals(addDeclarationFlowContract$InputData.f90193b) && Intrinsics.f(this.f90194c, addDeclarationFlowContract$InputData.f90194c) && this.d.equals(addDeclarationFlowContract$InputData.d) && this.e.equals(addDeclarationFlowContract$InputData.e) && Intrinsics.f(this.f, addDeclarationFlowContract$InputData.f) && Intrinsics.f(this.f90195g, addDeclarationFlowContract$InputData.f90195g) && Intrinsics.f(this.f90196h, addDeclarationFlowContract$InputData.f90196h) && this.i == addDeclarationFlowContract$InputData.i;
    }

    public final int hashCode() {
        int iA = l.a(p.a.e(p.a.e(p.a.d(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f90193b, this.f90192a.hashCode() * 31, 31), 31, this.f90194c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.f90195g;
        return this.i.hashCode() + p.a.c((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.f90196h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f90192a.name());
        Iterator itY = j6.a.y(this.f90193b, dest);
        while (itY.hasNext()) {
            dest.writeSerializable((Serializable) itY.next());
        }
        Iterator itV = p.a.v(this.f90194c, dest);
        while (itV.hasNext()) {
            ((DeclaredTaxResidency) itV.next()).writeToParcel(dest, i);
        }
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
        dest.writeParcelable(this.f, i);
        dest.writeString(this.f90195g);
        dest.writeString(this.f90196h);
        dest.writeParcelable(this.i, i);
    }
}
