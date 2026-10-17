package com.revolut.feature.profile.impl.ui.documents_redesigned.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.profile.api.DocumentsPage;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/profile/impl/ui/documents_redesigned/flow/DocumentsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "DocumentSelector", "Lcom/revolut/feature/profile/impl/ui/documents_redesigned/flow/DocumentsFlowContract$Step$DocumentSelector;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DocumentsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/documents_redesigned/flow/DocumentsFlowContract$Step$DocumentSelector;", "Lcom/revolut/feature/profile/impl/ui/documents_redesigned/flow/DocumentsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentSelector extends DocumentsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DocumentSelector> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DocumentsPage f81420a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentSelector((DocumentsPage) parcel.readParcelable(DocumentSelector.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentSelector[i];
            }
        }

        public DocumentSelector(DocumentsPage page) {
            Intrinsics.checkNotNullParameter(page, "page");
            this.f81420a = page;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DocumentSelector) && Intrinsics.f(this.f81420a, ((DocumentSelector) obj2).f81420a);
        }

        public final int hashCode() {
            return this.f81420a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f81420a, i);
        }
    }

    private DocumentsFlowContract$Step() {
    }
}
