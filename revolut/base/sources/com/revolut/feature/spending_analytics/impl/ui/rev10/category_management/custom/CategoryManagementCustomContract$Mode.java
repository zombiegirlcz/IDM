package com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.transactions.CategoryColor;
import com.revolut.domain.models.transactions.CategoryImage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/category_management/custom/CategoryManagementCustomContract$Mode", "Landroid/os/Parcelable;", "Edit", "AddNew", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/category_management/custom/CategoryManagementCustomContract$Mode$AddNew;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/category_management/custom/CategoryManagementCustomContract$Mode$Edit;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CategoryManagementCustomContract$Mode extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/category_management/custom/CategoryManagementCustomContract$Mode$AddNew;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/category_management/custom/CategoryManagementCustomContract$Mode;", "<init>", "()V", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddNew implements CategoryManagementCustomContract$Mode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddNew f87645a = new AddNew();

        @NotNull
        public static final Parcelable.Creator<AddNew> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddNew.f87645a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddNew[i];
            }
        }

        private AddNew() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/category_management/custom/CategoryManagementCustomContract$Mode$Edit;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/category_management/custom/CategoryManagementCustomContract$Mode;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Edit implements CategoryManagementCustomContract$Mode {

        @NotNull
        public static final Parcelable.Creator<Edit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f87647b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CategoryImage f87648c;
        public final CategoryColor d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                return new Edit(CategoryColor.valueOf(parcel.readString()), CategoryImage.valueOf(parcel.readString()), string, string2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Edit[i];
            }
        }

        public Edit(CategoryColor color, CategoryImage icon, String customCategoryId, String name) {
            Intrinsics.checkNotNullParameter(customCategoryId, "customCategoryId");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(color, "color");
            this.f87646a = customCategoryId;
            this.f87647b = name;
            this.f87648c = icon;
            this.d = color;
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
            return Intrinsics.f(this.f87646a, edit.f87646a) && Intrinsics.f(this.f87647b, edit.f87647b) && this.f87648c == edit.f87648c && this.d == edit.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f87648c.hashCode() + p.a.c(this.f87646a.hashCode() * 31, 31, this.f87647b)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87646a);
            dest.writeString(this.f87647b);
            dest.writeString(this.f87648c.name());
            dest.writeString(this.d.name());
        }
    }
}
