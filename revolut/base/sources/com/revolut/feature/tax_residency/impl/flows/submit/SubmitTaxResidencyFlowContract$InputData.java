package com.revolut.feature.tax_residency.impl.flows.submit;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tax_residency/impl/flows/submit/SubmitTaxResidencyFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubmitTaxResidencyFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SubmitTaxResidencyFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f90061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f90062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f90063c;
    public final List d;
    public final List e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f90064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f90065h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVar = (b) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            int iC2 = 0;
            while (iC2 != i2) {
                iC2 = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC2, 1);
            }
            int i3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i3);
            int iC3 = 0;
            while (iC3 != i3) {
                iC3 = ch.qos.logback.core.util.a.c(parcel, arrayList3, iC3, 1);
            }
            int i5 = parcel.readInt();
            boolean z3 = true;
            ArrayList arrayList4 = new ArrayList(i5);
            int iE = 0;
            while (iE != i5) {
                iE = j6.a.e(SubmitTaxResidencyFlowContract$InputData.class, parcel, arrayList4, iE, 1);
            }
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            return new SubmitTaxResidencyFlowContract$InputData(bVar, arrayList, arrayList2, arrayList3, arrayList4, z3, parcel.readInt() != 0 ? z : false, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SubmitTaxResidencyFlowContract$InputData[i];
        }
    }

    public SubmitTaxResidencyFlowContract$InputData(b userCountry, List taxResidencies, List taxResidencyRules, List skippableTinCountries, List taxForms, boolean z, boolean z3, String str) {
        Intrinsics.checkNotNullParameter(userCountry, "userCountry");
        Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
        Intrinsics.checkNotNullParameter(taxResidencyRules, "taxResidencyRules");
        Intrinsics.checkNotNullParameter(skippableTinCountries, "skippableTinCountries");
        Intrinsics.checkNotNullParameter(taxForms, "taxForms");
        this.f90061a = userCountry;
        this.f90062b = taxResidencies;
        this.f90063c = taxResidencyRules;
        this.d = skippableTinCountries;
        this.e = taxForms;
        this.f = z;
        this.f90064g = z3;
        this.f90065h = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SubmitTaxResidencyFlowContract$InputData)) {
            return false;
        }
        SubmitTaxResidencyFlowContract$InputData submitTaxResidencyFlowContract$InputData = (SubmitTaxResidencyFlowContract$InputData) obj2;
        return Intrinsics.f(this.f90061a, submitTaxResidencyFlowContract$InputData.f90061a) && Intrinsics.f(this.f90062b, submitTaxResidencyFlowContract$InputData.f90062b) && Intrinsics.f(this.f90063c, submitTaxResidencyFlowContract$InputData.f90063c) && Intrinsics.f(this.d, submitTaxResidencyFlowContract$InputData.d) && Intrinsics.f(this.e, submitTaxResidencyFlowContract$InputData.e) && this.f == submitTaxResidencyFlowContract$InputData.f && this.f90064g == submitTaxResidencyFlowContract$InputData.f90064g && Intrinsics.f(this.f90065h, submitTaxResidencyFlowContract$InputData.f90065h);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(p.a.d(p.a.d(p.a.d(p.a.d(this.f90061a.f297794a.hashCode() * 31, 31, this.f90062b), 31, this.f90063c), 31, this.d), 31, this.e), 31, this.f), 31, this.f90064g);
        String str = this.f90065h;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f90061a);
        Iterator itV = p.a.v(this.f90062b, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        Iterator itV2 = p.a.v(this.f90063c, dest);
        while (itV2.hasNext()) {
            dest.writeSerializable((Serializable) itV2.next());
        }
        Iterator itV3 = p.a.v(this.d, dest);
        while (itV3.hasNext()) {
            dest.writeSerializable((Serializable) itV3.next());
        }
        Iterator itV4 = p.a.v(this.e, dest);
        while (itV4.hasNext()) {
            dest.writeParcelable((Parcelable) itV4.next(), i);
        }
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f90064g ? 1 : 0);
        dest.writeString(this.f90065h);
    }

    public SubmitTaxResidencyFlowContract$InputData(b bVar, List list, List list2, List list3, List list4, boolean z, String str, int i) {
        this(bVar, list, list2, list3, (i & 16) != 0 ? f0.f322471a : list4, z, (i & 64) == 0, str);
    }
}
