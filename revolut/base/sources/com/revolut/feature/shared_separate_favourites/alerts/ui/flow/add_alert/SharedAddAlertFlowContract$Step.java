package com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert;

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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/revolut/feature/shared_separate_favourites/alerts/ui/flow/add_alert/SharedAddAlertFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "", "Lcom/revolut/feature/shared_separate_favourites/alerts/ui/flow/add_alert/SharedAddAlertFlowContract$Step;", "FROM_ASSET_TYPE_CHOOSER", "FROM_ASSET_CHOOSER", "CREATE_ALERT", "EDIT_ALERT", "NOTIFICATIONS_PERMISSION", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SharedAddAlertFlowContract$Step implements FlowStep {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SharedAddAlertFlowContract$Step[] $VALUES;
    public static final SharedAddAlertFlowContract$Step CREATE_ALERT;

    @NotNull
    public static final Parcelable.Creator<SharedAddAlertFlowContract$Step> CREATOR;
    public static final SharedAddAlertFlowContract$Step EDIT_ALERT;
    public static final SharedAddAlertFlowContract$Step FROM_ASSET_CHOOSER;
    public static final SharedAddAlertFlowContract$Step FROM_ASSET_TYPE_CHOOSER;
    public static final SharedAddAlertFlowContract$Step NOTIFICATIONS_PERMISSION;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return SharedAddAlertFlowContract$Step.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SharedAddAlertFlowContract$Step[i];
        }
    }

    static {
        SharedAddAlertFlowContract$Step sharedAddAlertFlowContract$Step = new SharedAddAlertFlowContract$Step("FROM_ASSET_TYPE_CHOOSER", 0);
        FROM_ASSET_TYPE_CHOOSER = sharedAddAlertFlowContract$Step;
        SharedAddAlertFlowContract$Step sharedAddAlertFlowContract$Step2 = new SharedAddAlertFlowContract$Step("FROM_ASSET_CHOOSER", 1);
        FROM_ASSET_CHOOSER = sharedAddAlertFlowContract$Step2;
        SharedAddAlertFlowContract$Step sharedAddAlertFlowContract$Step3 = new SharedAddAlertFlowContract$Step("CREATE_ALERT", 2);
        CREATE_ALERT = sharedAddAlertFlowContract$Step3;
        SharedAddAlertFlowContract$Step sharedAddAlertFlowContract$Step4 = new SharedAddAlertFlowContract$Step("EDIT_ALERT", 3);
        EDIT_ALERT = sharedAddAlertFlowContract$Step4;
        SharedAddAlertFlowContract$Step sharedAddAlertFlowContract$Step5 = new SharedAddAlertFlowContract$Step("NOTIFICATIONS_PERMISSION", 4);
        NOTIFICATIONS_PERMISSION = sharedAddAlertFlowContract$Step5;
        SharedAddAlertFlowContract$Step[] sharedAddAlertFlowContract$StepArr = {sharedAddAlertFlowContract$Step, sharedAddAlertFlowContract$Step2, sharedAddAlertFlowContract$Step3, sharedAddAlertFlowContract$Step4, sharedAddAlertFlowContract$Step5};
        $VALUES = sharedAddAlertFlowContract$StepArr;
        $ENTRIES = s.n(sharedAddAlertFlowContract$StepArr);
        CREATOR = new a();
    }

    public static SharedAddAlertFlowContract$Step valueOf(String str) {
        return (SharedAddAlertFlowContract$Step) Enum.valueOf(SharedAddAlertFlowContract$Step.class, str);
    }

    public static SharedAddAlertFlowContract$Step[] values() {
        return (SharedAddAlertFlowContract$Step[]) $VALUES.clone();
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
