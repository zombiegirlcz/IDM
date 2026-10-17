package com.revolut.feature.spending_analytics.impl.ui.rev10.travel.remove.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/travel/remove/flow/TravelRemoveWidgetFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ModalRemoveWidget", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/travel/remove/flow/TravelRemoveWidgetFlowContract$Step$ModalRemoveWidget;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelRemoveWidgetFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/travel/remove/flow/TravelRemoveWidgetFlowContract$Step$ModalRemoveWidget;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/travel/remove/flow/TravelRemoveWidgetFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ModalRemoveWidget implements TravelRemoveWidgetFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ModalRemoveWidget> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WidgetContext f88051b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ModalRemoveWidget((WidgetContext) parcel.readParcelable(ModalRemoveWidget.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ModalRemoveWidget[i];
            }
        }

        public ModalRemoveWidget(WidgetContext widgetContext, String widgetListId) {
            Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
            Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
            this.f88050a = widgetListId;
            this.f88051b = widgetContext;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ModalRemoveWidget)) {
                return false;
            }
            ModalRemoveWidget modalRemoveWidget = (ModalRemoveWidget) obj2;
            return Intrinsics.f(this.f88050a, modalRemoveWidget.f88050a) && Intrinsics.f(this.f88051b, modalRemoveWidget.f88051b);
        }

        public final int hashCode() {
            return this.f88051b.hashCode() + (this.f88050a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88050a);
            dest.writeParcelable(this.f88051b, i);
        }
    }
}
