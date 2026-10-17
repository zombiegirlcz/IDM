package com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.frequency;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import dp8.d;
import java.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior_tasks/impl/ui/challenges_kompot/edit/screens/frequency/ChallengeEditFrequencyScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_junior_tasks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChallengeEditFrequencyScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ChallengeEditFrequencyScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ZonedDateTime f77376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f77377b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChallengeEditFrequencyScreenContract$InputData((ZonedDateTime) parcel.readSerializable(), d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChallengeEditFrequencyScreenContract$InputData[i];
        }
    }

    public ChallengeEditFrequencyScreenContract$InputData(ZonedDateTime startDate, d frequency) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        this.f77376a = startDate;
        this.f77377b = frequency;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChallengeEditFrequencyScreenContract$InputData)) {
            return false;
        }
        ChallengeEditFrequencyScreenContract$InputData challengeEditFrequencyScreenContract$InputData = (ChallengeEditFrequencyScreenContract$InputData) obj2;
        return Intrinsics.f(this.f77376a, challengeEditFrequencyScreenContract$InputData.f77376a) && this.f77377b == challengeEditFrequencyScreenContract$InputData.f77377b;
    }

    public final int hashCode() {
        return this.f77377b.hashCode() + (this.f77376a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f77376a);
        dest.writeString(this.f77377b.name());
    }
}
