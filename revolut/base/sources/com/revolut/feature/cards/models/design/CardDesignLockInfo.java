package com.revolut.feature.cards.models.design;

import android.os.Parcel;
import android.os.Parcelable;
import b93.b;
import com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge;
import com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeCompleteCriteria;
import com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeState;
import dj0.d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/cards/models/design/CardDesignLockInfo;", "Landroid/os/Parcelable;", "AssetUnderManagement", "Challenge", "RevPoints", "Lcom/revolut/feature/cards/models/design/CardDesignLockInfo$AssetUnderManagement;", "Lcom/revolut/feature/cards/models/design/CardDesignLockInfo$Challenge;", "Lcom/revolut/feature/cards/models/design/CardDesignLockInfo$RevPoints;", "feature_cards_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CardDesignLockInfo implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cards/models/design/CardDesignLockInfo$AssetUnderManagement;", "Lcom/revolut/feature/cards/models/design/CardDesignLockInfo;", "", "toString", "()Ljava/lang/String;", "feature_cards_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AssetUnderManagement extends CardDesignLockInfo {

        @NotNull
        public static final Parcelable.Creator<AssetUnderManagement> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f65529a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AssetUnderManagement((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AssetUnderManagement[i];
            }
        }

        public AssetUnderManagement(b cardCode) {
            Intrinsics.checkNotNullParameter(cardCode, "cardCode");
            this.f65529a = cardCode;
        }

        @Override // com.revolut.feature.cards.models.design.CardDesignLockInfo
        public final boolean a() {
            return false;
        }

        @Override // com.revolut.feature.cards.models.design.CardDesignLockInfo
        /* JADX INFO: renamed from: b, reason: from getter */
        public final b getF65533a() {
            return this.f65529a;
        }

        @Override // com.revolut.feature.cards.models.design.CardDesignLockInfo
        public final boolean c() {
            return false;
        }

        @Override // com.revolut.feature.cards.models.design.CardDesignLockInfo
        public final boolean d() {
            return false;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AssetUnderManagement) && Intrinsics.f(this.f65529a, ((AssetUnderManagement) obj2).f65529a);
        }

        public final int hashCode() {
            return this.f65529a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f65529a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cards/models/design/CardDesignLockInfo$Challenge;", "Lcom/revolut/feature/cards/models/design/CardDesignLockInfo;", "", "toString", "()Ljava/lang/String;", "feature_cards_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Challenge extends CardDesignLockInfo {

        @NotNull
        public static final Parcelable.Creator<Challenge> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f65530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ChecklistChallenge f65531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ChecklistChallengeCompleteCriteria f65532c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Challenge((b) parcel.readSerializable(), (ChecklistChallenge) parcel.readParcelable(Challenge.class.getClassLoader()), (ChecklistChallengeCompleteCriteria) parcel.readParcelable(Challenge.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Challenge[i];
            }
        }

        public Challenge(b cardCode, ChecklistChallenge challenge, ChecklistChallengeCompleteCriteria completeCriteria) {
            Intrinsics.checkNotNullParameter(cardCode, "cardCode");
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            Intrinsics.checkNotNullParameter(completeCriteria, "completeCriteria");
            this.f65530a = cardCode;
            this.f65531b = challenge;
            this.f65532c = completeCriteria;
        }

        @Override // com.revolut.feature.cards.models.design.CardDesignLockInfo
        public final boolean a() {
            ChecklistChallengeState checklistChallengeState = this.f65531b.f65777c;
            if ((checklistChallengeState instanceof ChecklistChallengeState.Purchased) || (checklistChallengeState instanceof ChecklistChallengeState.Completed)) {
                return true;
            }
            if ((checklistChallengeState instanceof ChecklistChallengeState.Active) || (checklistChallengeState instanceof ChecklistChallengeState.OptIn) || Intrinsics.f(checklistChallengeState, ChecklistChallengeState.Unknown.INSTANCE)) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // com.revolut.feature.cards.models.design.CardDesignLockInfo
        /* JADX INFO: renamed from: b, reason: from getter */
        public final b getF65533a() {
            return this.f65530a;
        }

        @Override // com.revolut.feature.cards.models.design.CardDesignLockInfo
        public final boolean c() {
            return !a() && (this.f65532c instanceof ChecklistChallengeCompleteCriteria.Checklist);
        }

        @Override // com.revolut.feature.cards.models.design.CardDesignLockInfo
        public final boolean d() {
            return !a() && (this.f65532c instanceof ChecklistChallengeCompleteCriteria.RevPoints);
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
            return Intrinsics.f(this.f65530a, challenge.f65530a) && Intrinsics.f(this.f65531b, challenge.f65531b) && Intrinsics.f(this.f65532c, challenge.f65532c);
        }

        public final int hashCode() {
            return this.f65532c.hashCode() + ((this.f65531b.hashCode() + (this.f65530a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f65530a);
            dest.writeParcelable(this.f65531b, i);
            dest.writeParcelable(this.f65532c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cards/models/design/CardDesignLockInfo$RevPoints;", "Lcom/revolut/feature/cards/models/design/CardDesignLockInfo;", "", "toString", "()Ljava/lang/String;", "feature_cards_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevPoints extends CardDesignLockInfo {

        @NotNull
        public static final Parcelable.Creator<RevPoints> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f65533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f65534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f65535c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevPoints((b) parcel.readSerializable(), parcel.readString(), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPoints[i];
            }
        }

        public RevPoints(b cardCode, String productId, d price) {
            Intrinsics.checkNotNullParameter(cardCode, "cardCode");
            Intrinsics.checkNotNullParameter(productId, "productId");
            Intrinsics.checkNotNullParameter(price, "price");
            this.f65533a = cardCode;
            this.f65534b = productId;
            this.f65535c = price;
        }

        @Override // com.revolut.feature.cards.models.design.CardDesignLockInfo
        public final boolean a() {
            return false;
        }

        @Override // com.revolut.feature.cards.models.design.CardDesignLockInfo
        /* JADX INFO: renamed from: b, reason: from getter */
        public final b getF65533a() {
            return this.f65533a;
        }

        @Override // com.revolut.feature.cards.models.design.CardDesignLockInfo
        public final boolean c() {
            return false;
        }

        @Override // com.revolut.feature.cards.models.design.CardDesignLockInfo
        public final boolean d() {
            return true;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RevPoints)) {
                return false;
            }
            RevPoints revPoints = (RevPoints) obj2;
            return Intrinsics.f(this.f65533a, revPoints.f65533a) && Intrinsics.f(this.f65534b, revPoints.f65534b) && Intrinsics.f(this.f65535c, revPoints.f65535c);
        }

        public final int hashCode() {
            return this.f65535c.hashCode() + p.a.c(this.f65533a.hashCode() * 31, 31, this.f65534b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f65533a);
            dest.writeString(this.f65534b);
            dest.writeSerializable(this.f65535c);
        }
    }

    public abstract boolean a();

    /* JADX INFO: renamed from: b */
    public abstract b getF65533a();

    public abstract boolean c();

    public abstract boolean d();
}
