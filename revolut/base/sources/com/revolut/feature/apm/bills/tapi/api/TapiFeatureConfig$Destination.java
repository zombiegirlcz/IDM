package com.revolut.feature.apm.bills.tapi.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.core.api.model.search.tapi.BillSearchTapiResult;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"com/revolut/feature/apm/bills/tapi/api/TapiFeatureConfig$Destination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Landroid/os/Parcelable;", "<init>", "()V", "TapiTransfer", "Lcom/revolut/feature/apm/bills/tapi/api/TapiFeatureConfig$Destination$TapiTransfer;", "feature_apm_bills_tapi_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TapiFeatureConfig$Destination implements KompotDestination, Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/tapi/api/TapiFeatureConfig$Destination$TapiTransfer;", "Lcom/revolut/feature/apm/bills/tapi/api/TapiFeatureConfig$Destination;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_tapi_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TapiTransfer extends TapiFeatureConfig$Destination {

        @NotNull
        public static final Parcelable.Creator<TapiTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BillSearchTapiResult f61532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f61533b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TapiTransfer((BillSearchTapiResult) parcel.readParcelable(TapiTransfer.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TapiTransfer[i];
            }
        }

        public TapiTransfer(BillSearchTapiResult bill, boolean z) {
            Intrinsics.checkNotNullParameter(bill, "bill");
            this.f61532a = bill;
            this.f61533b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TapiTransfer)) {
                return false;
            }
            TapiTransfer tapiTransfer = (TapiTransfer) obj2;
            return Intrinsics.f(this.f61532a, tapiTransfer.f61532a) && this.f61533b == tapiTransfer.f61533b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f61533b) + (this.f61532a.hashCode() * 31);
        }

        @Override // aii.d0
        /* JADX INFO: renamed from: n1, reason: from getter */
        public final boolean getF61533b() {
            return this.f61533b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f61532a, i);
            dest.writeInt(this.f61533b ? 1 : 0);
        }
    }

    private TapiFeatureConfig$Destination() {
    }
}
