package com.revolut.feature.tax_residency.impl.flows.missing;

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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tax_residency/impl/flows/missing/TaxMissingRationaleFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxMissingRationaleFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TaxMissingRationaleFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f90038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f90039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f90040c;
    public final boolean d;
    public final List e;
    public final List f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            wi0.b bVar = (wi0.b) parcel.readSerializable();
            wi0.b bVar2 = (wi0.b) parcel.readSerializable();
            String string = parcel.readString();
            int iC = 0;
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iC2 = 0;
            while (iC2 != i2) {
                iC2 = ch.qos.logback.core.util.a.c(parcel, arrayList, iC2, i);
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            while (iC != i3) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC, i);
            }
            return new TaxMissingRationaleFlowContract$InputData(bVar, bVar2, string, z, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxMissingRationaleFlowContract$InputData[i];
        }
    }

    public TaxMissingRationaleFlowContract$InputData(wi0.b userCountryCode, wi0.b taxCountryCode, String documentAcronym, boolean z, List existedTaxResidencies, List rules) {
        Intrinsics.checkNotNullParameter(userCountryCode, "userCountryCode");
        Intrinsics.checkNotNullParameter(taxCountryCode, "taxCountryCode");
        Intrinsics.checkNotNullParameter(documentAcronym, "documentAcronym");
        Intrinsics.checkNotNullParameter(existedTaxResidencies, "existedTaxResidencies");
        Intrinsics.checkNotNullParameter(rules, "rules");
        this.f90038a = userCountryCode;
        this.f90039b = taxCountryCode;
        this.f90040c = documentAcronym;
        this.d = z;
        this.e = existedTaxResidencies;
        this.f = rules;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxMissingRationaleFlowContract$InputData)) {
            return false;
        }
        TaxMissingRationaleFlowContract$InputData taxMissingRationaleFlowContract$InputData = (TaxMissingRationaleFlowContract$InputData) obj2;
        return Intrinsics.f(this.f90038a, taxMissingRationaleFlowContract$InputData.f90038a) && Intrinsics.f(this.f90039b, taxMissingRationaleFlowContract$InputData.f90039b) && Intrinsics.f(this.f90040c, taxMissingRationaleFlowContract$InputData.f90040c) && this.d == taxMissingRationaleFlowContract$InputData.d && Intrinsics.f(this.e, taxMissingRationaleFlowContract$InputData.e) && Intrinsics.f(this.f, taxMissingRationaleFlowContract$InputData.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.d(j6.a.c(p.a.c(p.a.c(this.f90038a.f297794a.hashCode() * 31, 31, this.f90039b.f297794a), 31, this.f90040c), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f90038a);
        dest.writeSerializable(this.f90039b);
        dest.writeString(this.f90040c);
        dest.writeInt(this.d ? 1 : 0);
        Iterator itV = p.a.v(this.e, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        Iterator itV2 = p.a.v(this.f, dest);
        while (itV2.hasNext()) {
            dest.writeSerializable((Serializable) itV2.next());
        }
    }
}
