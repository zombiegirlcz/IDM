package com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.notify;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/who_to_transfer/impl/onboarding_contact_sync/notify/OnboardingContactSyncNotifyScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OnboardingContactSyncNotifyScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<OnboardingContactSyncNotifyScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f80110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f80111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f80112c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OnboardingContactSyncNotifyScreenContract$InputData(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OnboardingContactSyncNotifyScreenContract$InputData[i];
        }
    }

    public OnboardingContactSyncNotifyScreenContract$InputData(Integer num, boolean z, boolean z3) {
        this.f80110a = num;
        this.f80111b = z;
        this.f80112c = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OnboardingContactSyncNotifyScreenContract$InputData)) {
            return false;
        }
        OnboardingContactSyncNotifyScreenContract$InputData onboardingContactSyncNotifyScreenContract$InputData = (OnboardingContactSyncNotifyScreenContract$InputData) obj2;
        return Intrinsics.f(this.f80110a, onboardingContactSyncNotifyScreenContract$InputData.f80110a) && this.f80111b == onboardingContactSyncNotifyScreenContract$InputData.f80111b && this.f80112c == onboardingContactSyncNotifyScreenContract$InputData.f80112c;
    }

    public final int hashCode() {
        Integer num = this.f80110a;
        return Boolean.hashCode(this.f80112c) + j6.a.c((num == null ? 0 : num.hashCode()) * 31, 31, this.f80111b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.f80110a;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeInt(this.f80111b ? 1 : 0);
        dest.writeInt(this.f80112c ? 1 : 0);
    }
}
