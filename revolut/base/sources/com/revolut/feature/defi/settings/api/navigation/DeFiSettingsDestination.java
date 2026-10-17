package com.revolut.feature.defi.settings.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.StackDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/defi/settings/api/navigation/DeFiSettingsDestination;", "Lcom/revolut/kompot/common/StackDestination;", "", "toString", "()Ljava/lang/String;", "feature_defi_settings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeFiSettingsDestination implements StackDestination {

    @NotNull
    public static final Parcelable.Creator<DeFiSettingsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71853a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeFiSettingsDestination(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiSettingsDestination[i];
        }
    }

    public DeFiSettingsDestination(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f71853a = accountId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof DeFiSettingsDestination) && Intrinsics.f(this.f71853a, ((DeFiSettingsDestination) obj2).f71853a);
    }

    public final int hashCode() {
        return this.f71853a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71853a);
    }
}
