package com.revolut.feature.backgroundpicker.impl.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge;
import com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeCompleteCriteria;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/backgroundpicker/impl/model/UiAssetLockReason;", "Landroid/os/Parcelable;", "<init>", "()V", "Plan", "Challenge", "Lcom/revolut/feature/backgroundpicker/impl/model/UiAssetLockReason$Challenge;", "Lcom/revolut/feature/backgroundpicker/impl/model/UiAssetLockReason$Plan;", "feature_background_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class UiAssetLockReason implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backgroundpicker/impl/model/UiAssetLockReason$Challenge;", "Lcom/revolut/feature/backgroundpicker/impl/model/UiAssetLockReason;", "", "toString", "()Ljava/lang/String;", "feature_background_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Challenge extends UiAssetLockReason {

        @NotNull
        public static final Parcelable.Creator<Challenge> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChecklistChallenge f63802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ChecklistChallengeCompleteCriteria f63803b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Challenge((ChecklistChallenge) parcel.readParcelable(Challenge.class.getClassLoader()), (ChecklistChallengeCompleteCriteria) parcel.readParcelable(Challenge.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Challenge[i];
            }
        }

        public Challenge(ChecklistChallenge challenge, ChecklistChallengeCompleteCriteria completeCriteria) {
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            Intrinsics.checkNotNullParameter(completeCriteria, "completeCriteria");
            this.f63802a = challenge;
            this.f63803b = completeCriteria;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Challenge)) {
                return false;
            }
            Challenge challenge = (Challenge) obj2;
            return Intrinsics.f(this.f63802a, challenge.f63802a) && Intrinsics.f(this.f63803b, challenge.f63803b);
        }

        public final int hashCode() {
            return this.f63803b.hashCode() + (this.f63802a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f63802a, i);
            dest.writeParcelable(this.f63803b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backgroundpicker/impl/model/UiAssetLockReason$Plan;", "Lcom/revolut/feature/backgroundpicker/impl/model/UiAssetLockReason;", "", "toString", "()Ljava/lang/String;", "feature_background_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Plan extends UiAssetLockReason {

        @NotNull
        public static final Parcelable.Creator<Plan> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63804a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Plan(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Plan[i];
            }
        }

        public Plan(String themeId) {
            Intrinsics.checkNotNullParameter(themeId, "themeId");
            this.f63804a = themeId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Plan) && Intrinsics.f(this.f63804a, ((Plan) obj2).f63804a);
        }

        public final int hashCode() {
            return this.f63804a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63804a);
        }
    }

    private UiAssetLockReason() {
    }
}
