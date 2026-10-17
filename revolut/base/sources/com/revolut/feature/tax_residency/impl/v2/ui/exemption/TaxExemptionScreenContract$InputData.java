package com.revolut.feature.tax_residency.impl.v2.ui.exemption;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.tax_residency.api.BackNavigationType;
import com.revolut.feature.tax_residency.impl.v2.models.ExemptionReason;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rpe.f;
import wi0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tax_residency/impl/v2/ui/exemption/TaxExemptionScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxExemptionScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TaxExemptionScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f90248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f90250c;
    public final f d;
    public final BackNavigationType e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVar = (b) parcel.readSerializable();
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(ExemptionReason.CREATOR, parcel, arrayList, iA, 1);
            }
            return new TaxExemptionScreenContract$InputData(bVar, string, arrayList, f.valueOf(parcel.readString()), (BackNavigationType) parcel.readParcelable(TaxExemptionScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxExemptionScreenContract$InputData[i];
        }
    }

    public TaxExemptionScreenContract$InputData(b countryCode, String tinName, ArrayList exemptionReasons, f useCase, BackNavigationType backNavigationType) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(tinName, "tinName");
        Intrinsics.checkNotNullParameter(exemptionReasons, "exemptionReasons");
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
        this.f90248a = countryCode;
        this.f90249b = tinName;
        this.f90250c = exemptionReasons;
        this.d = useCase;
        this.e = backNavigationType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxExemptionScreenContract$InputData)) {
            return false;
        }
        TaxExemptionScreenContract$InputData taxExemptionScreenContract$InputData = (TaxExemptionScreenContract$InputData) obj2;
        return Intrinsics.f(this.f90248a, taxExemptionScreenContract$InputData.f90248a) && Intrinsics.f(this.f90249b, taxExemptionScreenContract$InputData.f90249b) && this.f90250c.equals(taxExemptionScreenContract$InputData.f90250c) && this.d == taxExemptionScreenContract$InputData.d && this.e == taxExemptionScreenContract$InputData.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f90250c, p.a.c(this.f90248a.f297794a.hashCode() * 31, 31, this.f90249b), 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f90248a);
        dest.writeString(this.f90249b);
        Iterator itY = j6.a.y(this.f90250c, dest);
        while (itY.hasNext()) {
            ((ExemptionReason) itY.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.d.name());
        dest.writeParcelable(this.e, i);
    }
}
