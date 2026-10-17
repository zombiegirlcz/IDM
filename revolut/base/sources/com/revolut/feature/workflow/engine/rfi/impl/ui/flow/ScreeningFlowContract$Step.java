package com.revolut.feature.workflow.engine.rfi.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/workflow/engine/rfi/impl/ui/flow/ScreeningFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Questionnaire", "Lcom/revolut/feature/workflow/engine/rfi/impl/ui/flow/ScreeningFlowContract$Step$Questionnaire;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ScreeningFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/rfi/impl/ui/flow/ScreeningFlowContract$Step$Questionnaire;", "Lcom/revolut/feature/workflow/engine/rfi/impl/ui/flow/ScreeningFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Questionnaire extends ScreeningFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Questionnaire> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Question f96555a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Questionnaire((Question) parcel.readParcelable(Questionnaire.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Questionnaire[i];
            }
        }

        public Questionnaire(Question question) {
            Intrinsics.checkNotNullParameter(question, "question");
            this.f96555a = question;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Questionnaire) && Intrinsics.f(this.f96555a, ((Questionnaire) obj2).f96555a);
        }

        public final int hashCode() {
            return this.f96555a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96555a, i);
        }
    }

    private ScreeningFlowContract$Step() {
    }
}
