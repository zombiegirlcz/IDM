package com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/more_for_family/MoreForFamilyScreenContract$KidsAccountAvailability", "Landroid/os/Parcelable;", "<init>", "()V", "NotAvailable", "CreationAvailable", "ActiveAccounts", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/more_for_family/MoreForFamilyScreenContract$KidsAccountAvailability$ActiveAccounts;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/more_for_family/MoreForFamilyScreenContract$KidsAccountAvailability$CreationAvailable;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/more_for_family/MoreForFamilyScreenContract$KidsAccountAvailability$NotAvailable;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MoreForFamilyScreenContract$KidsAccountAvailability implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/more_for_family/MoreForFamilyScreenContract$KidsAccountAvailability$ActiveAccounts;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/more_for_family/MoreForFamilyScreenContract$KidsAccountAvailability;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ActiveAccounts extends MoreForFamilyScreenContract$KidsAccountAvailability {

        @NotNull
        public static final Parcelable.Creator<ActiveAccounts> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f103431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f103432b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ActiveAccounts(parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActiveAccounts[i];
            }
        }

        public ActiveAccounts(int i, String firstJuniorId) {
            Intrinsics.checkNotNullParameter(firstJuniorId, "firstJuniorId");
            this.f103431a = i;
            this.f103432b = firstJuniorId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ActiveAccounts)) {
                return false;
            }
            ActiveAccounts activeAccounts = (ActiveAccounts) obj2;
            return this.f103431a == activeAccounts.f103431a && Intrinsics.f(this.f103432b, activeAccounts.f103432b);
        }

        public final int hashCode() {
            return this.f103432b.hashCode() + (Integer.hashCode(this.f103431a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f103431a);
            dest.writeString(this.f103432b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/more_for_family/MoreForFamilyScreenContract$KidsAccountAvailability$CreationAvailable;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/more_for_family/MoreForFamilyScreenContract$KidsAccountAvailability;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreationAvailable extends MoreForFamilyScreenContract$KidsAccountAvailability {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CreationAvailable f103433a = new CreationAvailable();

        @NotNull
        public static final Parcelable.Creator<CreationAvailable> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreationAvailable.f103433a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreationAvailable[i];
            }
        }

        private CreationAvailable() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/more_for_family/MoreForFamilyScreenContract$KidsAccountAvailability$NotAvailable;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/more_for_family/MoreForFamilyScreenContract$KidsAccountAvailability;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NotAvailable extends MoreForFamilyScreenContract$KidsAccountAvailability {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotAvailable f103434a = new NotAvailable();

        @NotNull
        public static final Parcelable.Creator<NotAvailable> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NotAvailable.f103434a;
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

    private MoreForFamilyScreenContract$KidsAccountAvailability() {
    }
}
