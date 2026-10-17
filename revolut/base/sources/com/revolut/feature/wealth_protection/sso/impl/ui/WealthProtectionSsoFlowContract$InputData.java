package com.revolut.feature.wealth_protection.sso.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth_protection.sso.api.WealthProtectionSsoDestination;
import com.revolut.feature.wealth_protection.sso.api.WealthProtectionSsoFlowType;
import com.revolut.feature.wealth_protection.sso.api.error.WealthProtectionSsoError;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth_protection/sso/impl/ui/WealthProtectionSsoFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_protection_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WealthProtectionSsoFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<WealthProtectionSsoFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthProtectionSsoError f96316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WealthProtectionSsoFlowType f96317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WealthProtectionSsoDestination.EndStatusDialogInfo f96318c;
    public final NaviCommand d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WealthProtectionSsoFlowContract$InputData((WealthProtectionSsoError) parcel.readSerializable(), (WealthProtectionSsoFlowType) parcel.readParcelable(WealthProtectionSsoFlowContract$InputData.class.getClassLoader()), (WealthProtectionSsoDestination.EndStatusDialogInfo) parcel.readParcelable(WealthProtectionSsoFlowContract$InputData.class.getClassLoader()), (NaviCommand) parcel.readParcelable(WealthProtectionSsoFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WealthProtectionSsoFlowContract$InputData[i];
        }
    }

    public WealthProtectionSsoFlowContract$InputData(WealthProtectionSsoError error, WealthProtectionSsoFlowType flowType, WealthProtectionSsoDestination.EndStatusDialogInfo endDialogInfo, NaviCommand endDestination) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(endDialogInfo, "endDialogInfo");
        Intrinsics.checkNotNullParameter(endDestination, "endDestination");
        this.f96316a = error;
        this.f96317b = flowType;
        this.f96318c = endDialogInfo;
        this.d = endDestination;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WealthProtectionSsoFlowContract$InputData)) {
            return false;
        }
        WealthProtectionSsoFlowContract$InputData wealthProtectionSsoFlowContract$InputData = (WealthProtectionSsoFlowContract$InputData) obj2;
        return Intrinsics.f(this.f96316a, wealthProtectionSsoFlowContract$InputData.f96316a) && Intrinsics.f(this.f96317b, wealthProtectionSsoFlowContract$InputData.f96317b) && Intrinsics.f(this.f96318c, wealthProtectionSsoFlowContract$InputData.f96318c) && Intrinsics.f(this.d, wealthProtectionSsoFlowContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f96318c.hashCode() + ((this.f96317b.hashCode() + (this.f96316a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f96316a);
        dest.writeParcelable(this.f96317b, i);
        dest.writeParcelable(this.f96318c, i);
        dest.writeParcelable(this.d, i);
    }
}
