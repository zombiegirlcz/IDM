package com.revolut.feature.profile.impl.ui.documents_redesigned.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.profile.api.DocumentsPage;
import com.revolut.feature.profile.impl.ui.documents_redesigned.flow.DocumentsFlowContract$Step;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/profile/impl/ui/documents_redesigned/flow/DocumentsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentsFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DocumentsFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentsFlowContract$Step f81419a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DocumentsFlowContract$InputData((DocumentsFlowContract$Step) parcel.readParcelable(DocumentsFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocumentsFlowContract$InputData[i];
        }
    }

    public DocumentsFlowContract$InputData(DocumentsFlowContract$Step initialStep) {
        Intrinsics.checkNotNullParameter(initialStep, "initialStep");
        this.f81419a = initialStep;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof DocumentsFlowContract$InputData) && Intrinsics.f(this.f81419a, ((DocumentsFlowContract$InputData) obj2).f81419a);
    }

    public final int hashCode() {
        return this.f81419a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f81419a, i);
    }

    public DocumentsFlowContract$InputData() {
        this(new DocumentsFlowContract$Step.DocumentSelector(DocumentsPage.DocumentList.f81297a));
    }
}
