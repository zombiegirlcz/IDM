package com.revolut.feature.product.lifecycle.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/product/lifecycle/flow/ProductLifecycleFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_product_lifecycle_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProductLifecycleFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ProductLifecycleFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f81204c;
    public final AnalyticsProduct d;
    public final String e;
    public final b f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProductLifecycleFlowContract$InputData(parcel.readString(), parcel.readString(), parcel.readString(), (AnalyticsProduct) parcel.readParcelable(ProductLifecycleFlowContract$InputData.class.getClassLoader()), parcel.readString(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProductLifecycleFlowContract$InputData[i];
        }
    }

    public ProductLifecycleFlowContract$InputData(String product, String accountType, String str, AnalyticsProduct analyticsProduct, String str2, b bVar) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f81202a = product;
        this.f81203b = accountType;
        this.f81204c = str;
        this.d = analyticsProduct;
        this.e = str2;
        this.f = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ProductLifecycleFlowContract$InputData)) {
            return false;
        }
        ProductLifecycleFlowContract$InputData productLifecycleFlowContract$InputData = (ProductLifecycleFlowContract$InputData) obj2;
        return Intrinsics.f(this.f81202a, productLifecycleFlowContract$InputData.f81202a) && Intrinsics.f(this.f81203b, productLifecycleFlowContract$InputData.f81203b) && Intrinsics.f(this.f81204c, productLifecycleFlowContract$InputData.f81204c) && Intrinsics.f(this.d, productLifecycleFlowContract$InputData.d) && Intrinsics.f(this.e, productLifecycleFlowContract$InputData.e) && Intrinsics.f(this.f, productLifecycleFlowContract$InputData.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f81202a.hashCode() * 31, 31, this.f81203b);
        String str = this.f81204c;
        int iA = l.a((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        b bVar = this.f;
        return iHashCode + (bVar != null ? bVar.f297794a.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81202a);
        dest.writeString(this.f81203b);
        dest.writeString(this.f81204c);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e);
        dest.writeSerializable(this.f);
    }
}
