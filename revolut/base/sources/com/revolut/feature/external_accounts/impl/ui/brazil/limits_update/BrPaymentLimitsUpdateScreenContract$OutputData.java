package com.revolut.feature.external_accounts.impl.ui.brazil.limits_update;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/brazil/limits_update/BrPaymentLimitsUpdateScreenContract$OutputData", "Laii/r;", "Landroid/os/Parcelable;", "<init>", "()V", "LimitUpdated", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/limits_update/BrPaymentLimitsUpdateScreenContract$OutputData$LimitUpdated;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BrPaymentLimitsUpdateScreenContract$OutputData implements r, Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/limits_update/BrPaymentLimitsUpdateScreenContract$OutputData$LimitUpdated;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/limits_update/BrPaymentLimitsUpdateScreenContract$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LimitUpdated extends BrPaymentLimitsUpdateScreenContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<LimitUpdated> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f72621a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LimitUpdated((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LimitUpdated[i];
            }
        }

        public LimitUpdated(d dVar) {
            this.f72621a = dVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LimitUpdated) && Intrinsics.f(this.f72621a, ((LimitUpdated) obj2).f72621a);
        }

        public final int hashCode() {
            d dVar = this.f72621a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f72621a);
        }
    }

    private BrPaymentLimitsUpdateScreenContract$OutputData() {
    }
}
