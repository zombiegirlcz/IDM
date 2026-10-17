package com.revolut.feature.learn.shared.api.navigation;

import aii.e;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u09.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/revolut/feature/learn/shared/api/navigation/LearnKompotFeatureConfig$Lesson$Destination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Laii/e;", "Laii/q;", "", "toString", "()Ljava/lang/String;", "feature_learn_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LearnKompotFeatureConfig$Lesson$Destination implements KompotDestination, e {

    @NotNull
    public static final Parcelable.Creator<LearnKompotFeatureConfig$Lesson$Destination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f77972b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LearnKompotFeatureConfig$Lesson$Destination(parcel.readString(), v.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LearnKompotFeatureConfig$Lesson$Destination[i];
        }
    }

    public LearnKompotFeatureConfig$Lesson$Destination(String lessonId, v domain) {
        Intrinsics.checkNotNullParameter(lessonId, "lessonId");
        Intrinsics.checkNotNullParameter(domain, "domain");
        this.f77971a = lessonId;
        this.f77972b = domain;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LearnKompotFeatureConfig$Lesson$Destination)) {
            return false;
        }
        LearnKompotFeatureConfig$Lesson$Destination learnKompotFeatureConfig$Lesson$Destination = (LearnKompotFeatureConfig$Lesson$Destination) obj2;
        return Intrinsics.f(this.f77971a, learnKompotFeatureConfig$Lesson$Destination.f77971a) && this.f77972b == learnKompotFeatureConfig$Lesson$Destination.f77972b;
    }

    public final int hashCode() {
        return this.f77972b.hashCode() + (this.f77971a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77971a);
        dest.writeString(this.f77972b.name());
    }
}
