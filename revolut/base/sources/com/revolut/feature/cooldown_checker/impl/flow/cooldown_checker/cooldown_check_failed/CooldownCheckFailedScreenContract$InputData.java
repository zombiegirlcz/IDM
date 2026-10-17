package com.revolut.feature.cooldown_checker.impl.flow.cooldown_checker.cooldown_check_failed;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.cooldown_checker.api.UserActivity;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/cooldown_checker/impl/flow/cooldown_checker/cooldown_check_failed/CooldownCheckFailedScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_cooldown_checker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CooldownCheckFailedScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CooldownCheckFailedScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserActivity f66104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f66105b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CooldownCheckFailedScreenContract$InputData((UserActivity) parcel.readParcelable(CooldownCheckFailedScreenContract$InputData.class.getClassLoader()), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CooldownCheckFailedScreenContract$InputData[i];
        }
    }

    public CooldownCheckFailedScreenContract$InputData(UserActivity userActivity, long j2) {
        Intrinsics.checkNotNullParameter(userActivity, "userActivity");
        this.f66104a = userActivity;
        this.f66105b = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CooldownCheckFailedScreenContract$InputData)) {
            return false;
        }
        CooldownCheckFailedScreenContract$InputData cooldownCheckFailedScreenContract$InputData = (CooldownCheckFailedScreenContract$InputData) obj2;
        return this.f66104a == cooldownCheckFailedScreenContract$InputData.f66104a && this.f66105b == cooldownCheckFailedScreenContract$InputData.f66105b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f66105b) + (this.f66104a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f66104a, i);
        dest.writeLong(this.f66105b);
    }
}
