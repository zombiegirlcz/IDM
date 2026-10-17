package com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/more_for_family/MoreForFamilyScreenContract$AvailableOptions", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MoreForFamilyScreenContract$AvailableOptions implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MoreForFamilyScreenContract$AvailableOptions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f103419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MoreForFamilyScreenContract$JointSavingsAvailability f103420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MoreForFamilyScreenContract$KidsAccountAvailability f103421c;
    public final MoreForFamilyScreenContract$KidsSavingsAvailability d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MoreForFamilyScreenContract$AvailableOptions(parcel.readInt() != 0, (MoreForFamilyScreenContract$JointSavingsAvailability) parcel.readParcelable(MoreForFamilyScreenContract$AvailableOptions.class.getClassLoader()), (MoreForFamilyScreenContract$KidsAccountAvailability) parcel.readParcelable(MoreForFamilyScreenContract$AvailableOptions.class.getClassLoader()), (MoreForFamilyScreenContract$KidsSavingsAvailability) parcel.readParcelable(MoreForFamilyScreenContract$AvailableOptions.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoreForFamilyScreenContract$AvailableOptions[i];
        }
    }

    public MoreForFamilyScreenContract$AvailableOptions(boolean z, MoreForFamilyScreenContract$JointSavingsAvailability jointSavings, MoreForFamilyScreenContract$KidsAccountAvailability kidsAccountAvailability, MoreForFamilyScreenContract$KidsSavingsAvailability kidsSavingsAvailability) {
        Intrinsics.checkNotNullParameter(jointSavings, "jointSavings");
        Intrinsics.checkNotNullParameter(kidsAccountAvailability, "kidsAccountAvailability");
        Intrinsics.checkNotNullParameter(kidsSavingsAvailability, "kidsSavingsAvailability");
        this.f103419a = z;
        this.f103420b = jointSavings;
        this.f103421c = kidsAccountAvailability;
        this.d = kidsSavingsAvailability;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MoreForFamilyScreenContract$AvailableOptions)) {
            return false;
        }
        MoreForFamilyScreenContract$AvailableOptions moreForFamilyScreenContract$AvailableOptions = (MoreForFamilyScreenContract$AvailableOptions) obj2;
        return this.f103419a == moreForFamilyScreenContract$AvailableOptions.f103419a && Intrinsics.f(this.f103420b, moreForFamilyScreenContract$AvailableOptions.f103420b) && Intrinsics.f(this.f103421c, moreForFamilyScreenContract$AvailableOptions.f103421c) && Intrinsics.f(this.d, moreForFamilyScreenContract$AvailableOptions.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f103421c.hashCode() + ((this.f103420b.hashCode() + (Boolean.hashCode(this.f103419a) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f103419a ? 1 : 0);
        dest.writeParcelable(this.f103420b, i);
        dest.writeParcelable(this.f103421c, i);
        dest.writeParcelable(this.d, i);
    }
}
