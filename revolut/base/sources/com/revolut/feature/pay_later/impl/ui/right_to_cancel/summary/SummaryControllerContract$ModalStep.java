package com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.pay_later.impl.models.right_to_cancel.RightToCancelSummaryContent;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/pay_later/impl/ui/right_to_cancel/summary/SummaryControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Info", "Lcom/revolut/feature/pay_later/impl/ui/right_to_cancel/summary/SummaryControllerContract$ModalStep$Info;", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SummaryControllerContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_later/impl/ui/right_to_cancel/summary/SummaryControllerContract$ModalStep$Info;", "Lcom/revolut/feature/pay_later/impl/ui/right_to_cancel/summary/SummaryControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Info extends SummaryControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Info> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RightToCancelSummaryContent.Info f78929a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Info(RightToCancelSummaryContent.Info.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Info[i];
            }
        }

        public Info(RightToCancelSummaryContent.Info info) {
            Intrinsics.checkNotNullParameter(info, "info");
            this.f78929a = info;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Info) && Intrinsics.f(this.f78929a, ((Info) obj2).f78929a);
        }

        public final int hashCode() {
            return this.f78929a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f78929a.writeToParcel(dest, i);
        }
    }

    private SummaryControllerContract$ModalStep() {
    }
}
