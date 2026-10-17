package com.revolut.feature.workflow.engine.rfi.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Dialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/workflow/engine/rfi/impl/ui/flow/ScreeningFlowContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "DescriptionDialog", "Lcom/revolut/feature/workflow/engine/rfi/impl/ui/flow/ScreeningFlowContract$ModalStep$DescriptionDialog;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ScreeningFlowContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/rfi/impl/ui/flow/ScreeningFlowContract$ModalStep$DescriptionDialog;", "Lcom/revolut/feature/workflow/engine/rfi/impl/ui/flow/ScreeningFlowContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DescriptionDialog extends ScreeningFlowContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<DescriptionDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Dialog f96552a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DescriptionDialog((Dialog) parcel.readParcelable(DescriptionDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DescriptionDialog[i];
            }
        }

        public DescriptionDialog(Dialog dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            this.f96552a = dialog;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DescriptionDialog) && Intrinsics.f(this.f96552a, ((DescriptionDialog) obj2).f96552a);
        }

        public final int hashCode() {
            return this.f96552a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96552a, i);
        }
    }

    private ScreeningFlowContract$ModalStep() {
    }
}
