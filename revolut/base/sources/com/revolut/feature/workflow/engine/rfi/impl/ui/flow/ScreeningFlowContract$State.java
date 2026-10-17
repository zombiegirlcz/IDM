package com.revolut.feature.workflow.engine.rfi.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/workflow/engine/rfi/impl/ui/flow/ScreeningFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ScreeningFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<ScreeningFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Question f96553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f96554b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Question question = (Question) j6.a.f(parcel, "parcel", ScreeningFlowContract$State.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(ScreeningFlowContract$State.class, parcel, arrayList, iE, 1);
            }
            return new ScreeningFlowContract$State(question, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ScreeningFlowContract$State[i];
        }
    }

    public ScreeningFlowContract$State(Question currentQuestion, List answers) {
        Intrinsics.checkNotNullParameter(currentQuestion, "currentQuestion");
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.f96553a = currentQuestion;
        this.f96554b = answers;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ScreeningFlowContract$State)) {
            return false;
        }
        ScreeningFlowContract$State screeningFlowContract$State = (ScreeningFlowContract$State) obj2;
        return Intrinsics.f(this.f96553a, screeningFlowContract$State.f96553a) && Intrinsics.f(this.f96554b, screeningFlowContract$State.f96554b);
    }

    public final int hashCode() {
        return this.f96554b.hashCode() + (this.f96553a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f96553a, i);
        Iterator itV = p.a.v(this.f96554b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
