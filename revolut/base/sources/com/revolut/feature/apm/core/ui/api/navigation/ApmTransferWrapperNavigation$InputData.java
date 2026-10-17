package com.revolut.feature.apm.core.ui.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.moneyrequest.MoneyRequestChannel;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/apm/core/ui/api/navigation/ApmTransferWrapperNavigation$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "AcceptMoneyRequest", "Lcom/revolut/feature/apm/core/ui/api/navigation/ApmTransferWrapperNavigation$InputData$AcceptMoneyRequest;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ApmTransferWrapperNavigation$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/navigation/ApmTransferWrapperNavigation$InputData$AcceptMoneyRequest;", "Lcom/revolut/feature/apm/core/ui/api/navigation/ApmTransferWrapperNavigation$InputData;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AcceptMoneyRequest implements ApmTransferWrapperNavigation$InputData {

        @NotNull
        public static final Parcelable.Creator<AcceptMoneyRequest> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MoneyRequest f62302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MoneyRequestChannel.APM f62303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f62304c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AcceptMoneyRequest((MoneyRequest) parcel.readParcelable(AcceptMoneyRequest.class.getClassLoader()), (MoneyRequestChannel.APM) parcel.readParcelable(AcceptMoneyRequest.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AcceptMoneyRequest[i];
            }
        }

        public AcceptMoneyRequest(MoneyRequest moneyRequest, MoneyRequestChannel.APM channel, boolean z) {
            Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
            Intrinsics.checkNotNullParameter(channel, "channel");
            this.f62302a = moneyRequest;
            this.f62303b = channel;
            this.f62304c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AcceptMoneyRequest)) {
                return false;
            }
            AcceptMoneyRequest acceptMoneyRequest = (AcceptMoneyRequest) obj2;
            return Intrinsics.f(this.f62302a, acceptMoneyRequest.f62302a) && Intrinsics.f(this.f62303b, acceptMoneyRequest.f62303b) && this.f62304c == acceptMoneyRequest.f62304c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f62304c) + ((this.f62303b.hashCode() + (this.f62302a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62302a, i);
            dest.writeParcelable(this.f62303b, i);
            dest.writeInt(this.f62304c ? 1 : 0);
        }
    }
}
