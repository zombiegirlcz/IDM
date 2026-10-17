package com.revolut.feature.statements.impl.ui.documents_hub.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.statements.impl.ui.documents_hub.DocumentsHubScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/statements/impl/ui/documents_hub/flow/DocumentsHubFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Screen", "Lcom/revolut/feature/statements/impl/ui/documents_hub/flow/DocumentsHubFlowContract$Step$Screen;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DocumentsHubFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/impl/ui/documents_hub/flow/DocumentsHubFlowContract$Step$Screen;", "Lcom/revolut/feature/statements/impl/ui/documents_hub/flow/DocumentsHubFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Screen extends DocumentsHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Screen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DocumentsHubScreenContract$InputData f88369a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Screen(DocumentsHubScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Screen[i];
            }
        }

        public Screen(DocumentsHubScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f88369a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Screen) && Intrinsics.f(this.f88369a, ((Screen) obj2).f88369a);
        }

        public final int hashCode() {
            return this.f88369a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f88369a.writeToParcel(dest, i);
        }
    }

    private DocumentsHubFlowContract$Step() {
    }
}
