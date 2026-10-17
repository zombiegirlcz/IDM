package com.revolut.shared.feature.workflow.engine.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.DocumentGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$DocumentSelection$Success", "", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MobileScreenParams$DocumentSelection$Success implements MobileScreenParams {

    @NotNull
    public static final Parcelable.Creator<MobileScreenParams$DocumentSelection$Success> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f105425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DocumentGroup f105426b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MobileScreenParams$DocumentSelection$Success((b) parcel.readSerializable(), DocumentGroup.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MobileScreenParams$DocumentSelection$Success[i];
        }
    }

    public MobileScreenParams$DocumentSelection$Success(b selectedCitizenship, DocumentGroup selectedDocGroup) {
        Intrinsics.checkNotNullParameter(selectedCitizenship, "selectedCitizenship");
        Intrinsics.checkNotNullParameter(selectedDocGroup, "selectedDocGroup");
        this.f105425a = selectedCitizenship;
        this.f105426b = selectedDocGroup;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MobileScreenParams$DocumentSelection$Success)) {
            return false;
        }
        MobileScreenParams$DocumentSelection$Success mobileScreenParams$DocumentSelection$Success = (MobileScreenParams$DocumentSelection$Success) obj2;
        return Intrinsics.f(this.f105425a, mobileScreenParams$DocumentSelection$Success.f105425a) && Intrinsics.f(this.f105426b, mobileScreenParams$DocumentSelection$Success.f105426b);
    }

    public final int hashCode() {
        return this.f105426b.hashCode() + (this.f105425a.f297794a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f105425a);
        this.f105426b.writeToParcel(dest, i);
    }
}
