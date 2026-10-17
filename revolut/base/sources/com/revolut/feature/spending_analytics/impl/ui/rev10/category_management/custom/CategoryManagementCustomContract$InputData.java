package com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.core.model.domain.wallet.WalletId;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.a3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/category_management/custom/CategoryManagementCustomContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CategoryManagementCustomContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CategoryManagementCustomContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f87643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CategoryManagementCustomContract$Mode f87644c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CategoryManagementCustomContract$InputData(((WalletId) parcel.readParcelable(CategoryManagementCustomContract$InputData.class.getClassLoader())).f66106a, (a3) parcel.readSerializable(), (CategoryManagementCustomContract$Mode) parcel.readParcelable(CategoryManagementCustomContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CategoryManagementCustomContract$InputData[i];
        }
    }

    public CategoryManagementCustomContract$InputData(String walletId, a3 a3Var, CategoryManagementCustomContract$Mode mode) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f87642a = walletId;
        this.f87643b = a3Var;
        this.f87644c = mode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CategoryManagementCustomContract$InputData)) {
            return false;
        }
        CategoryManagementCustomContract$InputData categoryManagementCustomContract$InputData = (CategoryManagementCustomContract$InputData) obj2;
        return Intrinsics.f(this.f87642a, categoryManagementCustomContract$InputData.f87642a) && Intrinsics.f(this.f87643b, categoryManagementCustomContract$InputData.f87643b) && Intrinsics.f(this.f87644c, categoryManagementCustomContract$InputData.f87644c);
    }

    public final int hashCode() {
        int iHashCode = this.f87642a.hashCode() * 31;
        a3 a3Var = this.f87643b;
        return this.f87644c.hashCode() + ((iHashCode + (a3Var == null ? 0 : a3Var.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(new WalletId(this.f87642a), i);
        dest.writeSerializable(this.f87643b);
        dest.writeParcelable(this.f87644c, i);
    }
}
