package com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/screens/details/ChallengesOverviewDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_junior_tasks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChallengesOverviewDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ChallengesOverviewDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77402b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChallengesOverviewDetailsScreenContract$InputData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChallengesOverviewDetailsScreenContract$InputData[i];
        }
    }

    public ChallengesOverviewDetailsScreenContract$InputData(String juniorId, String taskId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        this.f77401a = juniorId;
        this.f77402b = taskId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChallengesOverviewDetailsScreenContract$InputData)) {
            return false;
        }
        ChallengesOverviewDetailsScreenContract$InputData challengesOverviewDetailsScreenContract$InputData = (ChallengesOverviewDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f77401a, challengesOverviewDetailsScreenContract$InputData.f77401a) && Intrinsics.f(this.f77402b, challengesOverviewDetailsScreenContract$InputData.f77402b);
    }

    public final int hashCode() {
        return this.f77402b.hashCode() + (this.f77401a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77401a);
        dest.writeString(this.f77402b);
    }
}
