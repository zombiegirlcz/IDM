package com.revolut.feature.widgets.impl.ui.flow.customisation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/feature/widgets/impl/ui/flow/customisation/WidgetCustomisationFlowContact$EmptyStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "feature_widgets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WidgetCustomisationFlowContact$EmptyStep implements FlowStep {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WidgetCustomisationFlowContact$EmptyStep f96369a = new WidgetCustomisationFlowContact$EmptyStep();

    @NotNull
    public static final Parcelable.Creator<WidgetCustomisationFlowContact$EmptyStep> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return WidgetCustomisationFlowContact$EmptyStep.f96369a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WidgetCustomisationFlowContact$EmptyStep[i];
        }
    }

    private WidgetCustomisationFlowContact$EmptyStep() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
