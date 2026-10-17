package com.revolut.shared.feature.workflow.engine.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$DocumentSelection$SkipDocumentSubmission", "", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MobileScreenParams$DocumentSelection$SkipDocumentSubmission implements MobileScreenParams {

    @NotNull
    public static final Parcelable.Creator<MobileScreenParams$DocumentSelection$SkipDocumentSubmission> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f105424a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MobileScreenParams$DocumentSelection$SkipDocumentSubmission((b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MobileScreenParams$DocumentSelection$SkipDocumentSubmission[i];
        }
    }

    public MobileScreenParams$DocumentSelection$SkipDocumentSubmission(b selectedCitizenship) {
        Intrinsics.checkNotNullParameter(selectedCitizenship, "selectedCitizenship");
        this.f105424a = selectedCitizenship;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof MobileScreenParams$DocumentSelection$SkipDocumentSubmission) && Intrinsics.f(this.f105424a, ((MobileScreenParams$DocumentSelection$SkipDocumentSubmission) obj2).f105424a);
    }

    public final int hashCode() {
        return this.f105424a.f297794a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f105424a);
    }
}
