package com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.upgrade_to_invite;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import hha.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zm3.l;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/upgrade_to_invite/UpgradeToInviteFamilyMemberScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UpgradeToInviteFamilyMemberScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<UpgradeToInviteFamilyMemberScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f103451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f103452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f103453c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UpgradeToInviteFamilyMemberScreenContract$InputData((l) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UpgradeToInviteFamilyMemberScreenContract$InputData[i];
        }
    }

    public UpgradeToInviteFamilyMemberScreenContract$InputData(l invitee, d pricingPlan, boolean z) {
        Intrinsics.checkNotNullParameter(invitee, "invitee");
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        this.f103451a = invitee;
        this.f103452b = pricingPlan;
        this.f103453c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UpgradeToInviteFamilyMemberScreenContract$InputData)) {
            return false;
        }
        UpgradeToInviteFamilyMemberScreenContract$InputData upgradeToInviteFamilyMemberScreenContract$InputData = (UpgradeToInviteFamilyMemberScreenContract$InputData) obj2;
        return Intrinsics.f(this.f103451a, upgradeToInviteFamilyMemberScreenContract$InputData.f103451a) && Intrinsics.f(this.f103452b, upgradeToInviteFamilyMemberScreenContract$InputData.f103452b) && this.f103453c == upgradeToInviteFamilyMemberScreenContract$InputData.f103453c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f103453c) + ((this.f103452b.hashCode() + (this.f103451a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f103451a);
        dest.writeSerializable(this.f103452b);
        dest.writeInt(this.f103453c ? 1 : 0);
    }
}
