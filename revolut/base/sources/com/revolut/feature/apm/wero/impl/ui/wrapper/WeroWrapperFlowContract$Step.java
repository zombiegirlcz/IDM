package com.revolut.feature.apm.wero.impl.ui.wrapper;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.wero.api.navigation.WeroNavigation$InputData;
import com.revolut.feature.apm.wero.impl.ui.p2m.WeroP2MFlowContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/apm/wero/impl/ui/wrapper/WeroWrapperFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Wero", "WeroP2M", "Lcom/revolut/feature/apm/wero/impl/ui/wrapper/WeroWrapperFlowContract$Step$Wero;", "Lcom/revolut/feature/apm/wero/impl/ui/wrapper/WeroWrapperFlowContract$Step$WeroP2M;", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WeroWrapperFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/ui/wrapper/WeroWrapperFlowContract$Step$Wero;", "Lcom/revolut/feature/apm/wero/impl/ui/wrapper/WeroWrapperFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Wero implements WeroWrapperFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Wero> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeroNavigation$InputData f63109a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Wero((WeroNavigation$InputData) parcel.readParcelable(Wero.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Wero[i];
            }
        }

        public Wero(WeroNavigation$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f63109a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Wero) && Intrinsics.f(this.f63109a, ((Wero) obj2).f63109a);
        }

        public final int hashCode() {
            return this.f63109a.f63018a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f63109a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/ui/wrapper/WeroWrapperFlowContract$Step$WeroP2M;", "Lcom/revolut/feature/apm/wero/impl/ui/wrapper/WeroWrapperFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WeroP2M implements WeroWrapperFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<WeroP2M> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeroP2MFlowContract$InputData f63110a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WeroP2M(WeroP2MFlowContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WeroP2M[i];
            }
        }

        public WeroP2M(WeroP2MFlowContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f63110a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof WeroP2M) && Intrinsics.f(this.f63110a, ((WeroP2M) obj2).f63110a);
        }

        public final int hashCode() {
            return this.f63110a.f63070a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f63110a.writeToParcel(dest, i);
        }
    }
}
