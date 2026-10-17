package com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.tax_residency.impl.v2.models.CountryRule;
import com.revolut.feature.tax_residency.impl.v2.models.UserSpecificRule;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tax_residency/impl/v2/ui/tax_residency_flow/TaxResidencyFlowContract$State", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxResidencyFlowContract$State implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TaxResidencyFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f90292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f90293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f90294c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            int iE = 0;
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
            while (iE != i6) {
                iE = j6.a.e(TaxResidencyFlowContract$State.class, parcel, arrayList, iE, 1);
            }
            return new TaxResidencyFlowContract$State(linkedHashMap, linkedHashMap2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxResidencyFlowContract$State[i];
        }
    }

    public TaxResidencyFlowContract$State(Map countryRules, Map userSpecificRules, List steps) {
        Intrinsics.checkNotNullParameter(countryRules, "countryRules");
        Intrinsics.checkNotNullParameter(userSpecificRules, "userSpecificRules");
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.f90292a = countryRules;
        this.f90293b = userSpecificRules;
        this.f90294c = steps;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxResidencyFlowContract$State)) {
            return false;
        }
        TaxResidencyFlowContract$State taxResidencyFlowContract$State = (TaxResidencyFlowContract$State) obj2;
        return Intrinsics.f(this.f90292a, taxResidencyFlowContract$State.f90292a) && Intrinsics.f(this.f90293b, taxResidencyFlowContract$State.f90293b) && Intrinsics.f(this.f90294c, taxResidencyFlowContract$State.f90294c);
    }

    public final int hashCode() {
        return this.f90294c.hashCode() + p.a.e(this.f90292a.hashCode() * 31, 31, this.f90293b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itZ = j6.a.z(this.f90292a, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeSerializable((Serializable) entry.getKey());
            ((CountryRule) entry.getValue()).writeToParcel(dest, i);
        }
        Iterator itZ2 = j6.a.z(this.f90293b, dest);
        while (itZ2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itZ2.next();
            dest.writeSerializable((Serializable) entry2.getKey());
            ((UserSpecificRule) entry2.getValue()).writeToParcel(dest, i);
        }
        Iterator itV = p.a.v(this.f90294c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
