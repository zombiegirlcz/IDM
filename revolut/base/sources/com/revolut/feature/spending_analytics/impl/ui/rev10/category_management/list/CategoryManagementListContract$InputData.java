package com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.core.model.domain.wallet.WalletId;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/category_management/list/CategoryManagementListContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CategoryManagementListContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CategoryManagementListContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CategoryManagementListContract$Mode f87656b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CategoryManagementListContract$InputData(((WalletId) parcel.readParcelable(CategoryManagementListContract$InputData.class.getClassLoader())).f66106a, (CategoryManagementListContract$Mode) parcel.readParcelable(CategoryManagementListContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CategoryManagementListContract$InputData[i];
        }
    }

    public CategoryManagementListContract$InputData(String walletId, CategoryManagementListContract$Mode mode) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f87655a = walletId;
        this.f87656b = mode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CategoryManagementListContract$InputData)) {
            return false;
        }
        CategoryManagementListContract$InputData categoryManagementListContract$InputData = (CategoryManagementListContract$InputData) obj2;
        return Intrinsics.f(this.f87655a, categoryManagementListContract$InputData.f87655a) && Intrinsics.f(this.f87656b, categoryManagementListContract$InputData.f87656b);
    }

    public final int hashCode() {
        return this.f87656b.hashCode() + (this.f87655a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(new WalletId(this.f87655a), i);
        dest.writeParcelable(this.f87656b, i);
    }
}
