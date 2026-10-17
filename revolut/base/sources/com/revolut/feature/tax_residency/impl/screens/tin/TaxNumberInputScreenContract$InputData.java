package com.revolut.feature.tax_residency.impl.screens.tin;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zme.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tax_residency/impl/screens/tin/TaxNumberInputScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxNumberInputScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TaxNumberInputScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f90122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f90123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f90124c;
    public final ResourceImage d;
    public final boolean e;
    public final AnalyticsProduct f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f90125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f90126h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f90127j;
    public final List k;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Class cls;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            wi0.b bVar = (wi0.b) parcel.readSerializable();
            l lVar = (l) parcel.readSerializable();
            boolean z4 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            ResourceImage resourceImage = (ResourceImage) parcel.readParcelable(TaxNumberInputScreenContract$InputData.class.getClassLoader());
            if (parcel.readInt() != 0) {
                cls = TaxNumberInputScreenContract$InputData.class;
                z3 = true;
            } else {
                cls = TaxNumberInputScreenContract$InputData.class;
                z3 = z;
            }
            AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(cls.getClassLoader());
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new TaxNumberInputScreenContract$InputData(bVar, lVar, z4, resourceImage, z3, analyticsProduct, z, parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxNumberInputScreenContract$InputData[i];
        }
    }

    public TaxNumberInputScreenContract$InputData(wi0.b userCountry, l taxResidencyRule, boolean z, ResourceImage resourceImage, boolean z3, AnalyticsProduct analyticsProduct, boolean z4, String str, String tinValue, String str2, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(userCountry, "userCountry");
        Intrinsics.checkNotNullParameter(taxResidencyRule, "taxResidencyRule");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        Intrinsics.checkNotNullParameter(tinValue, "tinValue");
        this.f90122a = userCountry;
        this.f90123b = taxResidencyRule;
        this.f90124c = z;
        this.d = resourceImage;
        this.e = z3;
        this.f = analyticsProduct;
        this.f90125g = z4;
        this.f90126h = str;
        this.i = tinValue;
        this.f90127j = str2;
        this.k = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxNumberInputScreenContract$InputData)) {
            return false;
        }
        TaxNumberInputScreenContract$InputData taxNumberInputScreenContract$InputData = (TaxNumberInputScreenContract$InputData) obj2;
        return Intrinsics.f(this.f90122a, taxNumberInputScreenContract$InputData.f90122a) && Intrinsics.f(this.f90123b, taxNumberInputScreenContract$InputData.f90123b) && this.f90124c == taxNumberInputScreenContract$InputData.f90124c && Intrinsics.f(this.d, taxNumberInputScreenContract$InputData.d) && this.e == taxNumberInputScreenContract$InputData.e && Intrinsics.f(this.f, taxNumberInputScreenContract$InputData.f) && this.f90125g == taxNumberInputScreenContract$InputData.f90125g && Intrinsics.f(this.f90126h, taxNumberInputScreenContract$InputData.f90126h) && Intrinsics.f(this.i, taxNumberInputScreenContract$InputData.i) && Intrinsics.f(this.f90127j, taxNumberInputScreenContract$InputData.f90127j) && Intrinsics.f(this.k, taxNumberInputScreenContract$InputData.k);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f90123b.hashCode() + (this.f90122a.f297794a.hashCode() * 31)) * 31, 31, this.f90124c);
        ResourceImage resourceImage = this.d;
        int iC2 = j6.a.c(h30.l.a(j6.a.c((iC + (resourceImage == null ? 0 : resourceImage.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.f90125g);
        String str = this.f90126h;
        int iC3 = p.a.c((iC2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.i);
        String str2 = this.f90127j;
        int iHashCode = (iC3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.k;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f90122a);
        dest.writeSerializable(this.f90123b);
        dest.writeInt(this.f90124c ? 1 : 0);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeParcelable(this.f, i);
        dest.writeInt(this.f90125g ? 1 : 0);
        dest.writeString(this.f90126h);
        dest.writeString(this.i);
        dest.writeString(this.f90127j);
        dest.writeStringList(this.k);
    }

    public /* synthetic */ TaxNumberInputScreenContract$InputData(wi0.b bVar, l lVar, boolean z, ResourceImage resourceImage, boolean z3, AnalyticsProduct analyticsProduct, boolean z4, String str) {
        this(bVar, lVar, z, resourceImage, z3, analyticsProduct, z4, null, str, null, null);
    }
}
