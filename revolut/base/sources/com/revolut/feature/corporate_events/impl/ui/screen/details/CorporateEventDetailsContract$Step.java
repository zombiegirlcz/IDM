package com.revolut.feature.corporate_events.impl.ui.screen.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.retail.corporate_events.common.delegates.widget.mappers.content.EventContentMapper$EventInfoDialogContent;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/corporate_events/impl/ui/screen/details/CorporateEventDetailsContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "EventInfoDialog", "Lcom/revolut/feature/corporate_events/impl/ui/screen/details/CorporateEventDetailsContract$Step$EventInfoDialog;", "feature_corporate_events_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CorporateEventDetailsContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/corporate_events/impl/ui/screen/details/CorporateEventDetailsContract$Step$EventInfoDialog;", "Lcom/revolut/feature/corporate_events/impl/ui/screen/details/CorporateEventDetailsContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_corporate_events_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EventInfoDialog extends CorporateEventDetailsContract$Step {

        @NotNull
        public static final Parcelable.Creator<EventInfoDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EventContentMapper$EventInfoDialogContent f66123a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EventInfoDialog((EventContentMapper$EventInfoDialogContent) parcel.readParcelable(EventInfoDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EventInfoDialog[i];
            }
        }

        public EventInfoDialog(EventContentMapper$EventInfoDialogContent content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.f66123a = content;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EventInfoDialog) && Intrinsics.f(this.f66123a, ((EventInfoDialog) obj2).f66123a);
        }

        public final int hashCode() {
            return this.f66123a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66123a, i);
        }
    }

    private CorporateEventDetailsContract$Step() {
    }
}
