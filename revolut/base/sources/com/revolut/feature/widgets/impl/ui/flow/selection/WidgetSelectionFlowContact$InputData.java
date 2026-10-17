package com.revolut.feature.widgets.impl.ui.flow.selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/widgets/impl/ui/flow/selection/WidgetSelectionFlowContact$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_widgets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WidgetSelectionFlowContact$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<WidgetSelectionFlowContact$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f96373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WidgetContext f96374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final esh.a f96375c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WidgetSelectionFlowContact$InputData((Class) parcel.readSerializable(), (WidgetContext) parcel.readParcelable(WidgetSelectionFlowContact$InputData.class.getClassLoader()), esh.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WidgetSelectionFlowContact$InputData[i];
        }
    }

    public WidgetSelectionFlowContact$InputData(Class dependenciesClazz, WidgetContext widgetContext, esh.a onSelectBehavior) {
        Intrinsics.checkNotNullParameter(dependenciesClazz, "dependenciesClazz");
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(onSelectBehavior, "onSelectBehavior");
        this.f96373a = dependenciesClazz;
        this.f96374b = widgetContext;
        this.f96375c = onSelectBehavior;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WidgetSelectionFlowContact$InputData)) {
            return false;
        }
        WidgetSelectionFlowContact$InputData widgetSelectionFlowContact$InputData = (WidgetSelectionFlowContact$InputData) obj2;
        return Intrinsics.f(this.f96373a, widgetSelectionFlowContact$InputData.f96373a) && Intrinsics.f(this.f96374b, widgetSelectionFlowContact$InputData.f96374b) && this.f96375c == widgetSelectionFlowContact$InputData.f96375c;
    }

    public final int hashCode() {
        return this.f96375c.hashCode() + ((this.f96374b.hashCode() + (this.f96373a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f96373a);
        dest.writeParcelable(this.f96374b, i);
        dest.writeString(this.f96375c.name());
    }
}
