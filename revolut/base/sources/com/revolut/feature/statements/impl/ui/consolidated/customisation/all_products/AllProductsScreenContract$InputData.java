package com.revolut.feature.statements.impl.ui.consolidated.customisation.all_products;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.statements.api.models.ProductSelection;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/statements/impl/ui/consolidated/customisation/all_products/AllProductsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AllProductsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AllProductsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f88306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f88307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProductSelection f88308c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(AllProductsScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            int i2 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i2);
            while (iA != i2) {
                iA = o.a(parcel, linkedHashSet, iA, 1);
            }
            return new AllProductsScreenContract$InputData(arrayList, linkedHashSet, (ProductSelection) parcel.readParcelable(AllProductsScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AllProductsScreenContract$InputData[i];
        }
    }

    public AllProductsScreenContract$InputData(List products, Set expandedProducts, ProductSelection productSelection) {
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(expandedProducts, "expandedProducts");
        Intrinsics.checkNotNullParameter(productSelection, "productSelection");
        this.f88306a = products;
        this.f88307b = expandedProducts;
        this.f88308c = productSelection;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AllProductsScreenContract$InputData)) {
            return false;
        }
        AllProductsScreenContract$InputData allProductsScreenContract$InputData = (AllProductsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f88306a, allProductsScreenContract$InputData.f88306a) && Intrinsics.f(this.f88307b, allProductsScreenContract$InputData.f88307b) && Intrinsics.f(this.f88308c, allProductsScreenContract$InputData.f88308c);
    }

    public final int hashCode() {
        return this.f88308c.hashCode() + p.a.f(this.f88306a.hashCode() * 31, 31, this.f88307b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f88306a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        Iterator itV2 = n.v(this.f88307b, dest);
        while (itV2.hasNext()) {
            dest.writeString((String) itV2.next());
        }
        dest.writeParcelable(this.f88308c, i);
    }
}
