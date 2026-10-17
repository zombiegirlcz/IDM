package com.revolut.feature.apm.core.ui.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import c12.o0;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/core/ui/api/navigation/ApmTopupRequestNavigation$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApmTopupRequestNavigation$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ApmTopupRequestNavigation$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f62278b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApmTopupRequestNavigation$InputData(parcel.readString(), o0.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmTopupRequestNavigation$InputData[i];
        }
    }

    public ApmTopupRequestNavigation$InputData(String requestId, o0 startType) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(startType, "startType");
        this.f62277a = requestId;
        this.f62278b = startType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ApmTopupRequestNavigation$InputData)) {
            return false;
        }
        ApmTopupRequestNavigation$InputData apmTopupRequestNavigation$InputData = (ApmTopupRequestNavigation$InputData) obj2;
        return Intrinsics.f(this.f62277a, apmTopupRequestNavigation$InputData.f62277a) && this.f62278b == apmTopupRequestNavigation$InputData.f62278b;
    }

    public final int hashCode() {
        return this.f62278b.hashCode() + (this.f62277a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f62277a);
        dest.writeString(this.f62278b.name());
    }

    public /* synthetic */ ApmTopupRequestNavigation$InputData(String str) {
        this(str, o0.DEFAULT);
    }
}
