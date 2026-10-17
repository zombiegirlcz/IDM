package com.revolut.feature.shared_separate_favourites.converter.ui.flow.add_asset;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/shared_separate_favourites/converter/ui/flow/add_asset/SharedAddAssetFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "", "Lcom/revolut/feature/shared_separate_favourites/converter/ui/flow/add_asset/SharedAddAssetFlowContract$Step;", "ASSET_TYPE_CHOOSER", "ASSET_CHOOSER", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SharedAddAssetFlowContract$Step implements FlowStep {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SharedAddAssetFlowContract$Step[] $VALUES;
    public static final SharedAddAssetFlowContract$Step ASSET_CHOOSER;
    public static final SharedAddAssetFlowContract$Step ASSET_TYPE_CHOOSER;

    @NotNull
    public static final Parcelable.Creator<SharedAddAssetFlowContract$Step> CREATOR;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return SharedAddAssetFlowContract$Step.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SharedAddAssetFlowContract$Step[i];
        }
    }

    static {
        SharedAddAssetFlowContract$Step sharedAddAssetFlowContract$Step = new SharedAddAssetFlowContract$Step("ASSET_TYPE_CHOOSER", 0);
        ASSET_TYPE_CHOOSER = sharedAddAssetFlowContract$Step;
        SharedAddAssetFlowContract$Step sharedAddAssetFlowContract$Step2 = new SharedAddAssetFlowContract$Step("ASSET_CHOOSER", 1);
        ASSET_CHOOSER = sharedAddAssetFlowContract$Step2;
        SharedAddAssetFlowContract$Step[] sharedAddAssetFlowContract$StepArr = {sharedAddAssetFlowContract$Step, sharedAddAssetFlowContract$Step2};
        $VALUES = sharedAddAssetFlowContract$StepArr;
        $ENTRIES = s.n(sharedAddAssetFlowContract$StepArr);
        CREATOR = new a();
    }

    public static SharedAddAssetFlowContract$Step valueOf(String str) {
        return (SharedAddAssetFlowContract$Step) Enum.valueOf(SharedAddAssetFlowContract$Step.class, str);
    }

    public static SharedAddAssetFlowContract$Step[] values() {
        return (SharedAddAssetFlowContract$Step[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
