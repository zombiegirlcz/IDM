package com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/acquiring/lite_pos/impl/ui/screen/catalogue/CatalogueScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ShowCategoryItems", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/catalogue/CatalogueScreenContract$ModalStep$ShowCategoryItems;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CatalogueScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/catalogue/CatalogueScreenContract$ModalStep$ShowCategoryItems;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/catalogue/CatalogueScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowCategoryItems implements CatalogueScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ShowCategoryItems> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CatalogueCategory f60773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f60774b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowCategoryItems((CatalogueCategory) parcel.readParcelable(ShowCategoryItems.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowCategoryItems[i];
            }
        }

        public ShowCategoryItems(CatalogueCategory category, boolean z) {
            Intrinsics.checkNotNullParameter(category, "category");
            this.f60773a = category;
            this.f60774b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ShowCategoryItems)) {
                return false;
            }
            ShowCategoryItems showCategoryItems = (ShowCategoryItems) obj2;
            return Intrinsics.f(this.f60773a, showCategoryItems.f60773a) && this.f60774b == showCategoryItems.f60774b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f60774b) + (this.f60773a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f60773a, i);
            dest.writeInt(this.f60774b ? 1 : 0);
        }
    }
}
