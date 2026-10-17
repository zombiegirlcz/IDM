package com.revolut.feature.workflow.engine.rfi.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/workflow/engine/rfi/impl/ui/flow/ScreeningFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ScreeningFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ScreeningFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f96551b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(ScreeningFlowContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new ScreeningFlowContract$InputData(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ScreeningFlowContract$InputData[i];
        }
    }

    public ScreeningFlowContract$InputData(String stepId, List questions) {
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        Intrinsics.checkNotNullParameter(questions, "questions");
        this.f96550a = stepId;
        this.f96551b = questions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ScreeningFlowContract$InputData)) {
            return false;
        }
        ScreeningFlowContract$InputData screeningFlowContract$InputData = (ScreeningFlowContract$InputData) obj2;
        return Intrinsics.f(this.f96550a, screeningFlowContract$InputData.f96550a) && Intrinsics.f(this.f96551b, screeningFlowContract$InputData.f96551b);
    }

    public final int hashCode() {
        return this.f96551b.hashCode() + (this.f96550a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f96550a);
        Iterator itV = p.a.v(this.f96551b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
