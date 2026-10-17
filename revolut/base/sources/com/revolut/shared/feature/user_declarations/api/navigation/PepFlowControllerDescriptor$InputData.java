package com.revolut.shared.feature.user_declarations.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/shared/feature/user_declarations/api/navigation/PepFlowControllerDescriptor$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_user_declarations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PepFlowControllerDescriptor$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PepFlowControllerDescriptor$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PepFlowControllerDescriptor$UseCase f105064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f105065c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PepFlowControllerDescriptor$InputData(parcel.readString(), (PepFlowControllerDescriptor$UseCase) parcel.readParcelable(PepFlowControllerDescriptor$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PepFlowControllerDescriptor$InputData[i];
        }
    }

    public PepFlowControllerDescriptor$InputData(String stepId, PepFlowControllerDescriptor$UseCase useCase, boolean z) {
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        this.f105063a = stepId;
        this.f105064b = useCase;
        this.f105065c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PepFlowControllerDescriptor$InputData)) {
            return false;
        }
        PepFlowControllerDescriptor$InputData pepFlowControllerDescriptor$InputData = (PepFlowControllerDescriptor$InputData) obj2;
        return Intrinsics.f(this.f105063a, pepFlowControllerDescriptor$InputData.f105063a) && Intrinsics.f(this.f105064b, pepFlowControllerDescriptor$InputData.f105064b) && this.f105065c == pepFlowControllerDescriptor$InputData.f105065c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f105065c) + ((this.f105064b.hashCode() + (this.f105063a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f105063a);
        dest.writeParcelable(this.f105064b, i);
        dest.writeInt(this.f105065c ? 1 : 0);
    }
}
