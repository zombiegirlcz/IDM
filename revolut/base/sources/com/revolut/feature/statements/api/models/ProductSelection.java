package com.revolut.feature.statements.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import ehe.n;
import j6.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import zhm.a1;
import zhm.d0;
import zhm.h0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001'B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J\u0014\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\u000e\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0004J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u001b\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006HÆ\u0003J5\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006HÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u0012J\u0013\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0012HÖ\u0001J\t\u0010!\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0012R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR#\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006("}, d2 = {"Lcom/revolut/feature/statements/api/models/ProductSelection;", "Landroid/os/Parcelable;", "selectedProducts", "", "", "selectedElements", "", "<init>", "(Ljava/util/Set;Ljava/util/Map;)V", "getSelectedProducts", "()Ljava/util/Set;", "getSelectedElements", "()Ljava/util/Map;", "getAllSelectedProducts", "isProductElementSelected", "", "productElementId", "getSelectionCount", "", "areAllSelected", "products", "", "Lcom/revolut/feature/statements/api/models/Product;", "isProductSelected", "product", "component1", "component2", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProductSelection implements Parcelable {

    @NotNull
    private final Map<String, Set<String>> selectedElements;

    @NotNull
    private final Set<String> selectedProducts;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<ProductSelection> CREATOR = new Creator();

    @NotNull
    private static final ProductSelection EMPTY = new ProductSelection(h0.f322473a, r0.g());

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/statements/api/models/ProductSelection$Companion;", "", "<init>", "()V", "EMPTY", "Lcom/revolut/feature/statements/api/models/ProductSelection;", "getEMPTY", "()Lcom/revolut/feature/statements/api/models/ProductSelection;", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ProductSelection getEMPTY() {
            return ProductSelection.EMPTY;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProductSelection> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductSelection createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iA = 0;
            while (iA != i) {
                iA = o.a(parcel, linkedHashSet, iA, 1);
            }
            int i2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                String string = parcel.readString();
                int i5 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i5);
                int iA2 = 0;
                while (iA2 != i5) {
                    iA2 = o.a(parcel, linkedHashSet2, iA2, 1);
                }
                linkedHashMap.put(string, linkedHashSet2);
            }
            return new ProductSelection(linkedHashSet, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductSelection[] newArray(int i) {
            return new ProductSelection[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductSelection(@NotNull Set<String> selectedProducts, @NotNull Map<String, ? extends Set<String>> selectedElements) {
        Intrinsics.checkNotNullParameter(selectedProducts, "selectedProducts");
        Intrinsics.checkNotNullParameter(selectedElements, "selectedElements");
        this.selectedProducts = selectedProducts;
        this.selectedElements = selectedElements;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductSelection copy$default(ProductSelection productSelection, Set set, Map map, int i, Object obj2) {
        if ((i & 1) != 0) {
            set = productSelection.selectedProducts;
        }
        if ((i & 2) != 0) {
            map = productSelection.selectedElements;
        }
        return productSelection.copy(set, map);
    }

    public final boolean areAllSelected(@NotNull List<Product> products) {
        Intrinsics.checkNotNullParameter(products, "products");
        for (Product product : products) {
            if (!product.getElements().isEmpty()) {
                for (ProductElement productElement : product.getElements()) {
                    Set<String> set = this.selectedElements.get(product.getType());
                    if (set == null || !set.contains(productElement.getId())) {
                        return false;
                    }
                }
            } else if (!this.selectedProducts.contains(product.getType())) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final Set<String> component1() {
        return this.selectedProducts;
    }

    @NotNull
    public final Map<String, Set<String>> component2() {
        return this.selectedElements;
    }

    @NotNull
    public final ProductSelection copy(@NotNull Set<String> selectedProducts, @NotNull Map<String, ? extends Set<String>> selectedElements) {
        Intrinsics.checkNotNullParameter(selectedProducts, "selectedProducts");
        Intrinsics.checkNotNullParameter(selectedElements, "selectedElements");
        return new ProductSelection(selectedProducts, selectedElements);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductSelection)) {
            return false;
        }
        ProductSelection productSelection = (ProductSelection) other;
        return Intrinsics.f(this.selectedProducts, productSelection.selectedProducts) && Intrinsics.f(this.selectedElements, productSelection.selectedElements);
    }

    @NotNull
    public final Set<String> getAllSelectedProducts() {
        Set<String> set = this.selectedProducts;
        Set<Map.Entry<String, Set<String>>> setEntrySet = this.selectedElements.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : setEntrySet) {
            if (!((Collection) ((Map.Entry) obj2).getValue()).isEmpty()) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add((String) ((Map.Entry) it8.next()).getKey());
        }
        return a1.l(set, d0.i1(arrayList2));
    }

    @NotNull
    public final Map<String, Set<String>> getSelectedElements() {
        return this.selectedElements;
    }

    @NotNull
    public final Set<String> getSelectedProducts() {
        return this.selectedProducts;
    }

    public final int getSelectionCount() {
        return w.u(this.selectedElements.values()).size() + this.selectedProducts.size();
    }

    public int hashCode() {
        return this.selectedElements.hashCode() + (this.selectedProducts.hashCode() * 31);
    }

    public final boolean isProductElementSelected(@NotNull String productElementId) {
        Intrinsics.checkNotNullParameter(productElementId, "productElementId");
        return w.u(this.selectedElements.values()).contains(productElementId);
    }

    public final boolean isProductSelected(@NotNull String product) {
        Intrinsics.checkNotNullParameter(product, "product");
        if (this.selectedProducts.contains(product)) {
            return true;
        }
        Set<String> set = this.selectedElements.get(product);
        return (set == null || set.isEmpty()) ? false : true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.selectedProducts, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
        Iterator itZ = a.z(this.selectedElements, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeString((String) entry.getKey());
            Iterator itV2 = n.v((Set) entry.getValue(), dest);
            while (itV2.hasNext()) {
                dest.writeString((String) itV2.next());
            }
        }
    }
}
