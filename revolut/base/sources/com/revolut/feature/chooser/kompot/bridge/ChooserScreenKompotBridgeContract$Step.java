package com.revolut.feature.chooser.kompot.bridge;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.FeatureFlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/chooser/kompot/bridge/ChooserScreenKompotBridgeContract$Step", "Lcom/revolut/kompot/FeatureFlowStep;", "<init>", "()V", "Picker", "Lcom/revolut/feature/chooser/kompot/bridge/ChooserScreenKompotBridgeContract$Step$Picker;", "feature_chooser_kompot_bridge_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ChooserScreenKompotBridgeContract$Step implements FeatureFlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/chooser/kompot/bridge/ChooserScreenKompotBridgeContract$Step$Picker;", "Lcom/revolut/feature/chooser/kompot/bridge/ChooserScreenKompotBridgeContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_chooser_kompot_bridge_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Picker extends ChooserScreenKompotBridgeContract$Step {

        @NotNull
        public static final Parcelable.Creator<Picker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChooserScreenKompotBridgeContract$InputData f65927a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Picker(ChooserScreenKompotBridgeContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Picker[i];
            }
        }

        public Picker(ChooserScreenKompotBridgeContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f65927a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Picker) && Intrinsics.f(this.f65927a, ((Picker) obj2).f65927a);
        }

        public final int hashCode() {
            return this.f65927a.f65925a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f65927a.writeToParcel(dest, i);
        }
    }

    private ChooserScreenKompotBridgeContract$Step() {
    }
}
