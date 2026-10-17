package com.revolut.feature.apm.core.ui.api.navigation;

import a10.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/core/ui/api/navigation/ApmPendingNavigation$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApmPendingNavigation$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ApmPendingNavigation$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f62257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f62258c;
    public final long d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApmPendingNavigation$InputData(parcel.readString(), (Clause) parcel.readParcelable(ApmPendingNavigation$InputData.class.getClassLoader()), (Image) parcel.readParcelable(ApmPendingNavigation$InputData.class.getClassLoader()), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmPendingNavigation$InputData[i];
        }
    }

    public ApmPendingNavigation$InputData(String jobId, Clause title, Image logo, long j2) {
        Intrinsics.checkNotNullParameter(jobId, "jobId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(logo, "logo");
        this.f62256a = jobId;
        this.f62257b = title;
        this.f62258c = logo;
        this.d = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ApmPendingNavigation$InputData)) {
            return false;
        }
        ApmPendingNavigation$InputData apmPendingNavigation$InputData = (ApmPendingNavigation$InputData) obj2;
        return Intrinsics.f(this.f62256a, apmPendingNavigation$InputData.f62256a) && Intrinsics.f(this.f62257b, apmPendingNavigation$InputData.f62257b) && Intrinsics.f(this.f62258c, apmPendingNavigation$InputData.f62258c) && this.d == apmPendingNavigation$InputData.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + b.c(this.f62258c, p.a.a(this.f62256a.hashCode() * 31, 31, this.f62257b), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f62256a);
        dest.writeParcelable(this.f62257b, i);
        dest.writeParcelable(this.f62258c, i);
        dest.writeLong(this.d);
    }
}
