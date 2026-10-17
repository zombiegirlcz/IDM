package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_edit_asset/AddEditAssetContract$InputData$Mode", "Landroid/os/Parcelable;", "<init>", "()V", "Create", "Edit", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_edit_asset/AddEditAssetContract$InputData$Mode$Create;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_edit_asset/AddEditAssetContract$InputData$Mode$Edit;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AddEditAssetContract$InputData$Mode implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_edit_asset/AddEditAssetContract$InputData$Mode$Create;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_edit_asset/AddEditAssetContract$InputData$Mode;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Create extends AddEditAssetContract$InputData$Mode {

        @NotNull
        public static final Parcelable.Creator<Create> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f87907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CustomAssetCategoryDefinition f87908b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Create((xi0.b) parcel.readSerializable(), (CustomAssetCategoryDefinition) parcel.readParcelable(Create.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Create[i];
            }
        }

        public Create(xi0.b currency, CustomAssetCategoryDefinition categoryDefinition) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(categoryDefinition, "categoryDefinition");
            this.f87907a = currency;
            this.f87908b = categoryDefinition;
        }

        @Override // com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.AddEditAssetContract$InputData$Mode
        public final boolean a() {
            return this.f87908b.f99226c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Create)) {
                return false;
            }
            Create create = (Create) obj2;
            return Intrinsics.f(this.f87907a, create.f87907a) && Intrinsics.f(this.f87908b, create.f87908b);
        }

        public final int hashCode() {
            return this.f87908b.hashCode() + (this.f87907a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f87907a);
            dest.writeParcelable(this.f87908b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_edit_asset/AddEditAssetContract$InputData$Mode$Edit;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_edit_asset/AddEditAssetContract$InputData$Mode;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Edit extends AddEditAssetContract$InputData$Mode {

        @NotNull
        public static final Parcelable.Creator<Edit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f87909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CustomAsset f87910b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CustomAssetCategoryDefinition f87911c;
        public final Boolean d;
        public final boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                xi0.b bVar = (xi0.b) parcel.readSerializable();
                CustomAsset customAsset = (CustomAsset) parcel.readParcelable(Edit.class.getClassLoader());
                CustomAssetCategoryDefinition customAssetCategoryDefinition = (CustomAssetCategoryDefinition) parcel.readParcelable(Edit.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Edit(bVar, customAsset, customAssetCategoryDefinition, boolValueOf, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Edit[i];
            }
        }

        public Edit(xi0.b currency, CustomAsset asset, CustomAssetCategoryDefinition categoryDefinition, Boolean bool, boolean z) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(asset, "asset");
            Intrinsics.checkNotNullParameter(categoryDefinition, "categoryDefinition");
            this.f87909a = currency;
            this.f87910b = asset;
            this.f87911c = categoryDefinition;
            this.d = bool;
            this.e = z;
        }

        @Override // com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.AddEditAssetContract$InputData$Mode
        public final boolean a() {
            return this.f87911c.f99226c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Edit)) {
                return false;
            }
            Edit edit = (Edit) obj2;
            return Intrinsics.f(this.f87909a, edit.f87909a) && Intrinsics.f(this.f87910b, edit.f87910b) && Intrinsics.f(this.f87911c, edit.f87911c) && Intrinsics.f(this.d, edit.d) && this.e == edit.e;
        }

        public final int hashCode() {
            int iHashCode = (this.f87911c.hashCode() + ((this.f87910b.hashCode() + (this.f87909a.hashCode() * 31)) * 31)) * 31;
            Boolean bool = this.d;
            return Boolean.hashCode(this.e) + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f87909a);
            dest.writeParcelable(this.f87910b, i);
            dest.writeParcelable(this.f87911c, i);
            Boolean bool = this.d;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool);
            }
            dest.writeInt(this.e ? 1 : 0);
        }
    }

    private AddEditAssetContract$InputData$Mode() {
    }

    public abstract boolean a();
}
