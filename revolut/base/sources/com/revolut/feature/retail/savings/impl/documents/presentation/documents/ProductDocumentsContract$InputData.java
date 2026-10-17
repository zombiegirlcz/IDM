package com.revolut.feature.retail.savings.impl.documents.presentation.documents;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/savings/impl/documents/presentation/documents/ProductDocumentsContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProductDocumentsContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ProductDocumentsContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f83336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f83337c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProductDocumentsContract$InputData(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProductDocumentsContract$InputData[i];
        }
    }

    public ProductDocumentsContract$InputData(String productId, String str, boolean z) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.f83335a = productId;
        this.f83336b = str;
        this.f83337c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ProductDocumentsContract$InputData)) {
            return false;
        }
        ProductDocumentsContract$InputData productDocumentsContract$InputData = (ProductDocumentsContract$InputData) obj2;
        return Intrinsics.f(this.f83335a, productDocumentsContract$InputData.f83335a) && Intrinsics.f(this.f83336b, productDocumentsContract$InputData.f83336b) && this.f83337c == productDocumentsContract$InputData.f83337c;
    }

    public final int hashCode() {
        int iHashCode = this.f83335a.hashCode() * 31;
        String str = this.f83336b;
        return Boolean.hashCode(this.f83337c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f83335a);
        dest.writeString(this.f83336b);
        dest.writeInt(this.f83337c ? 1 : 0);
    }

    public /* synthetic */ ProductDocumentsContract$InputData(String str, String str2, int i) {
        this(str, (i & 2) != 0 ? null : str2, true);
    }
}
