package com.revolut.feature.statements.impl.ui.documents_hub;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.statements.api.navigation.DocumentsHubProduct;
import com.revolut.feature.statements.api.navigation.DocumentsHubType;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/statements/impl/ui/documents_hub/DocumentsHubScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ProductSelector", "Lcom/revolut/feature/statements/impl/ui/documents_hub/DocumentsHubScreenContract$ModalStep$ProductSelector;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DocumentsHubScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/impl/ui/documents_hub/DocumentsHubScreenContract$ModalStep$ProductSelector;", "Lcom/revolut/feature/statements/impl/ui/documents_hub/DocumentsHubScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductSelector implements DocumentsHubScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ProductSelector> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f88360b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProductSelector(((DocumentsHubType) parcel.readParcelable(ProductSelector.class.getClassLoader())).f88260a, ((DocumentsHubProduct) parcel.readParcelable(ProductSelector.class.getClassLoader())).f88259a);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductSelector[i];
            }
        }

        public ProductSelector(String type, String selectedProduct) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(selectedProduct, "selectedProduct");
            this.f88359a = type;
            this.f88360b = selectedProduct;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ProductSelector)) {
                return false;
            }
            ProductSelector productSelector = (ProductSelector) obj2;
            String str = productSelector.f88359a;
            DocumentsHubType.Companion companion = DocumentsHubType.INSTANCE;
            if (!Intrinsics.f(this.f88359a, str)) {
                return false;
            }
            String str2 = productSelector.f88360b;
            DocumentsHubProduct.Companion companion2 = DocumentsHubProduct.INSTANCE;
            return Intrinsics.f(this.f88360b, str2);
        }

        public final int hashCode() {
            DocumentsHubType.Companion companion = DocumentsHubType.INSTANCE;
            int iHashCode = this.f88359a.hashCode() * 31;
            DocumentsHubProduct.Companion companion2 = DocumentsHubProduct.INSTANCE;
            return this.f88360b.hashCode() + iHashCode;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(new DocumentsHubType(this.f88359a), i);
            dest.writeParcelable(new DocumentsHubProduct(this.f88360b), i);
        }
    }
}
