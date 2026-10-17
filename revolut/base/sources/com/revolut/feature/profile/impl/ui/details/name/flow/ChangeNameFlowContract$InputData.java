package com.revolut.feature.profile.impl.ui.details.name.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/profile/impl/ui/details/name/flow/ChangeNameFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChangeNameFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ChangeNameFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChangeNameFlowContract$ChangeNameMode f81403a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChangeNameFlowContract$InputData((ChangeNameFlowContract$ChangeNameMode) parcel.readParcelable(ChangeNameFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChangeNameFlowContract$InputData[i];
        }
    }

    public ChangeNameFlowContract$InputData(ChangeNameFlowContract$ChangeNameMode changeNameMode) {
        Intrinsics.checkNotNullParameter(changeNameMode, "changeNameMode");
        this.f81403a = changeNameMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ChangeNameFlowContract$InputData) && Intrinsics.f(this.f81403a, ((ChangeNameFlowContract$InputData) obj2).f81403a);
    }

    public final int hashCode() {
        return this.f81403a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f81403a, i);
    }
}
