package com.revolut.feature.rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/rev_points/models/ChallengeId;", "Landroid/os/Parcelable;", "<init>", "()V", "UniqueId", "Campaign", "Lcom/revolut/feature/rev_points/models/ChallengeId$Campaign;", "Lcom/revolut/feature/rev_points/models/ChallengeId$UniqueId;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ChallengeId implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/models/ChallengeId$Campaign;", "Lcom/revolut/feature/rev_points/models/ChallengeId;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Campaign extends ChallengeId {

        @NotNull
        public static final Parcelable.Creator<Campaign> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83940a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Campaign(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Campaign[i];
            }
        }

        public Campaign(String campaignId) {
            Intrinsics.checkNotNullParameter(campaignId, "campaignId");
            this.f83940a = campaignId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Campaign) && Intrinsics.f(this.f83940a, ((Campaign) obj2).f83940a);
        }

        public final int hashCode() {
            return this.f83940a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83940a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/models/ChallengeId$UniqueId;", "Lcom/revolut/feature/rev_points/models/ChallengeId;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UniqueId extends ChallengeId {

        @NotNull
        public static final Parcelable.Creator<UniqueId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83941a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UniqueId(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UniqueId[i];
            }
        }

        public UniqueId(String challengeId) {
            Intrinsics.checkNotNullParameter(challengeId, "challengeId");
            this.f83941a = challengeId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UniqueId) && Intrinsics.f(this.f83941a, ((UniqueId) obj2).f83941a);
        }

        public final int hashCode() {
            return this.f83941a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83941a);
        }
    }

    private ChallengeId() {
    }
}
