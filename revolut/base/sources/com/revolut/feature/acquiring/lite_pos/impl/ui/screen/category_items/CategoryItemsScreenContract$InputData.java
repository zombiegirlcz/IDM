package com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category_items;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/acquiring/lite_pos/impl/ui/screen/category_items/CategoryItemsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CategoryItemsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CategoryItemsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CatalogueCategory f60791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f60792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f60793c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CategoryItemsScreenContract$InputData((CatalogueCategory) parcel.readParcelable(CategoryItemsScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CategoryItemsScreenContract$InputData[i];
        }
    }

    public CategoryItemsScreenContract$InputData(CatalogueCategory category, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(category, "category");
        this.f60791a = category;
        this.f60792b = z;
        this.f60793c = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CategoryItemsScreenContract$InputData)) {
            return false;
        }
        CategoryItemsScreenContract$InputData categoryItemsScreenContract$InputData = (CategoryItemsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f60791a, categoryItemsScreenContract$InputData.f60791a) && this.f60792b == categoryItemsScreenContract$InputData.f60792b && this.f60793c == categoryItemsScreenContract$InputData.f60793c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f60793c) + j6.a.c(this.f60791a.hashCode() * 31, 31, this.f60792b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f60791a, i);
        dest.writeInt(this.f60792b ? 1 : 0);
        dest.writeInt(this.f60793c ? 1 : 0);
    }
}
