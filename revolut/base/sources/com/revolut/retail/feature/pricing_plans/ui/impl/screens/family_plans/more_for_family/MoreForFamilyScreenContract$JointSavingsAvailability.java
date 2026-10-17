package com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/more_for_family/MoreForFamilyScreenContract$JointSavingsAvailability", "Landroid/os/Parcelable;", "<init>", "()V", "NotAvailable", "HasActiveAccounts", "CreationAvailable", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/more_for_family/MoreForFamilyScreenContract$JointSavingsAvailability$CreationAvailable;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/more_for_family/MoreForFamilyScreenContract$JointSavingsAvailability$HasActiveAccounts;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/more_for_family/MoreForFamilyScreenContract$JointSavingsAvailability$NotAvailable;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MoreForFamilyScreenContract$JointSavingsAvailability implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/more_for_family/MoreForFamilyScreenContract$JointSavingsAvailability$CreationAvailable;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/more_for_family/MoreForFamilyScreenContract$JointSavingsAvailability;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreationAvailable extends MoreForFamilyScreenContract$JointSavingsAvailability {

        @NotNull
        public static final Parcelable.Creator<CreationAvailable> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f103427a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreationAvailable((Clause) parcel.readParcelable(CreationAvailable.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreationAvailable[i];
            }
        }

        public CreationAvailable(Clause interestRate) {
            Intrinsics.checkNotNullParameter(interestRate, "interestRate");
            this.f103427a = interestRate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CreationAvailable) && Intrinsics.f(this.f103427a, ((CreationAvailable) obj2).f103427a);
        }

        public final int hashCode() {
            return this.f103427a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f103427a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/more_for_family/MoreForFamilyScreenContract$JointSavingsAvailability$HasActiveAccounts;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/more_for_family/MoreForFamilyScreenContract$JointSavingsAvailability;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HasActiveAccounts extends MoreForFamilyScreenContract$JointSavingsAvailability {

        @NotNull
        public static final Parcelable.Creator<HasActiveAccounts> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f103428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f103429b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HasActiveAccounts(parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HasActiveAccounts[i];
            }
        }

        public HasActiveAccounts(int i, String firstAccountPocketId) {
            Intrinsics.checkNotNullParameter(firstAccountPocketId, "firstAccountPocketId");
            this.f103428a = i;
            this.f103429b = firstAccountPocketId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof HasActiveAccounts)) {
                return false;
            }
            HasActiveAccounts hasActiveAccounts = (HasActiveAccounts) obj2;
            return this.f103428a == hasActiveAccounts.f103428a && Intrinsics.f(this.f103429b, hasActiveAccounts.f103429b);
        }

        public final int hashCode() {
            return this.f103429b.hashCode() + (Integer.hashCode(this.f103428a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f103428a);
            dest.writeString(this.f103429b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/more_for_family/MoreForFamilyScreenContract$JointSavingsAvailability$NotAvailable;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/more_for_family/MoreForFamilyScreenContract$JointSavingsAvailability;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NotAvailable extends MoreForFamilyScreenContract$JointSavingsAvailability {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotAvailable f103430a = new NotAvailable();

        @NotNull
        public static final Parcelable.Creator<NotAvailable> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NotAvailable.f103430a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotAvailable[i];
            }
        }

        private NotAvailable() {
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

    private MoreForFamilyScreenContract$JointSavingsAvailability() {
    }
}
