package com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qtc.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/security_hub/impl/ui/wealth_protection_limit_change/WealthProtectionLimitChangeScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WealthProtectionLimitChangeScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<WealthProtectionLimitChangeScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f85775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WealthProtectionFeatureState.Visible f85776b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WealthProtectionLimitChangeScreenContract$InputData(k.valueOf(parcel.readString()), (WealthProtectionFeatureState.Visible) parcel.readParcelable(WealthProtectionLimitChangeScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WealthProtectionLimitChangeScreenContract$InputData[i];
        }
    }

    public WealthProtectionLimitChangeScreenContract$InputData(k feature, WealthProtectionFeatureState.Visible state) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f85775a = feature;
        this.f85776b = state;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WealthProtectionLimitChangeScreenContract$InputData)) {
            return false;
        }
        WealthProtectionLimitChangeScreenContract$InputData wealthProtectionLimitChangeScreenContract$InputData = (WealthProtectionLimitChangeScreenContract$InputData) obj2;
        return this.f85775a == wealthProtectionLimitChangeScreenContract$InputData.f85775a && Intrinsics.f(this.f85776b, wealthProtectionLimitChangeScreenContract$InputData.f85776b);
    }

    public final int hashCode() {
        return this.f85776b.hashCode() + (this.f85775a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85775a.name());
        dest.writeParcelable(this.f85776b, i);
    }
}
