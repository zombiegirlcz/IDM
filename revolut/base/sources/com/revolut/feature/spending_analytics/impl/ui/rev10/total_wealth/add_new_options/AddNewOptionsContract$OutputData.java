package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_new_options;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_new_options/AddNewOptionsContract$OutputData", "Laii/r;", "Landroid/os/Parcelable;", "<init>", "()V", "RevolutAccount", "LinkExternalAccount", "Property", "OtherAssets", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_new_options/AddNewOptionsContract$OutputData$LinkExternalAccount;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_new_options/AddNewOptionsContract$OutputData$OtherAssets;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_new_options/AddNewOptionsContract$OutputData$Property;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_new_options/AddNewOptionsContract$OutputData$RevolutAccount;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AddNewOptionsContract$OutputData implements r, Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_new_options/AddNewOptionsContract$OutputData$LinkExternalAccount;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_new_options/AddNewOptionsContract$OutputData;", "<init>", "()V", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LinkExternalAccount extends AddNewOptionsContract$OutputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LinkExternalAccount f87932a = new LinkExternalAccount();

        @NotNull
        public static final Parcelable.Creator<LinkExternalAccount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LinkExternalAccount.f87932a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkExternalAccount[i];
            }
        }

        private LinkExternalAccount() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_new_options/AddNewOptionsContract$OutputData$OtherAssets;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_new_options/AddNewOptionsContract$OutputData;", "<init>", "()V", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OtherAssets extends AddNewOptionsContract$OutputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OtherAssets f87933a = new OtherAssets();

        @NotNull
        public static final Parcelable.Creator<OtherAssets> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OtherAssets.f87933a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OtherAssets[i];
            }
        }

        private OtherAssets() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_new_options/AddNewOptionsContract$OutputData$Property;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_new_options/AddNewOptionsContract$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Property extends AddNewOptionsContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<Property> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CustomAssetCategoryDefinition f87934a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Property((CustomAssetCategoryDefinition) parcel.readParcelable(Property.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Property[i];
            }
        }

        public Property(CustomAssetCategoryDefinition categoryDefinition) {
            Intrinsics.checkNotNullParameter(categoryDefinition, "categoryDefinition");
            this.f87934a = categoryDefinition;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Property) && Intrinsics.f(this.f87934a, ((Property) obj2).f87934a);
        }

        public final int hashCode() {
            return this.f87934a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87934a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_new_options/AddNewOptionsContract$OutputData$RevolutAccount;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_new_options/AddNewOptionsContract$OutputData;", "<init>", "()V", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevolutAccount extends AddNewOptionsContract$OutputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RevolutAccount f87935a = new RevolutAccount();

        @NotNull
        public static final Parcelable.Creator<RevolutAccount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevolutAccount.f87935a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevolutAccount[i];
            }
        }

        private RevolutAccount() {
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

    private AddNewOptionsContract$OutputData() {
    }
}
