package com.revolut.crypto.challenge.impl.model;

import android.os.Parcel;
import android.os.Parcelable;
import f11.c;
import ip0.v7;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/crypto/challenge/impl/model/PlanReward;", "Landroid/os/Parcelable;", "Eligible", "Maintain", "Active", "Lcom/revolut/crypto/challenge/impl/model/PlanReward$Active;", "Lcom/revolut/crypto/challenge/impl/model/PlanReward$Eligible;", "Lcom/revolut/crypto/challenge/impl/model/PlanReward$Maintain;", "feature_crypto_challenge_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PlanReward extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/crypto/challenge/impl/model/PlanReward$Active;", "Lcom/revolut/crypto/challenge/impl/model/PlanReward;", "", "toString", "()Ljava/lang/String;", "feature_crypto_challenge_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Active implements PlanReward {

        @NotNull
        public static final Parcelable.Creator<Active> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f60114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDateTime f60115b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Active(c.valueOf(parcel.readString()), (LocalDateTime) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Active[i];
            }
        }

        public Active(c tier, LocalDateTime endDate) {
            Intrinsics.checkNotNullParameter(tier, "tier");
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            this.f60114a = tier;
            this.f60115b = endDate;
        }

        @Override // com.revolut.crypto.challenge.impl.model.PlanReward
        /* JADX INFO: renamed from: L7, reason: from getter */
        public final c getF60118a() {
            return this.f60114a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Active)) {
                return false;
            }
            Active active = (Active) obj2;
            return this.f60114a == active.f60114a && Intrinsics.f(this.f60115b, active.f60115b);
        }

        public final int hashCode() {
            return this.f60115b.hashCode() + (this.f60114a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f60114a.name());
            dest.writeSerializable(this.f60115b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/crypto/challenge/impl/model/PlanReward$Eligible;", "Lcom/revolut/crypto/challenge/impl/model/PlanReward;", "", "toString", "()Ljava/lang/String;", "feature_crypto_challenge_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Eligible implements PlanReward {

        @NotNull
        public static final Parcelable.Creator<Eligible> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f60116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Challenge f60117b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Eligible(c.valueOf(parcel.readString()), Challenge.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Eligible[i];
            }
        }

        public Eligible(c tier, Challenge challenge) {
            Intrinsics.checkNotNullParameter(tier, "tier");
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            this.f60116a = tier;
            this.f60117b = challenge;
        }

        @Override // com.revolut.crypto.challenge.impl.model.PlanReward
        /* JADX INFO: renamed from: L7, reason: from getter */
        public final c getF60118a() {
            return this.f60116a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Eligible)) {
                return false;
            }
            Eligible eligible = (Eligible) obj2;
            return this.f60116a == eligible.f60116a && Intrinsics.f(this.f60117b, eligible.f60117b);
        }

        public final int hashCode() {
            return this.f60117b.hashCode() + (this.f60116a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f60116a.name());
            this.f60117b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/crypto/challenge/impl/model/PlanReward$Maintain;", "Lcom/revolut/crypto/challenge/impl/model/PlanReward;", "", "toString", "()Ljava/lang/String;", "feature_crypto_challenge_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Maintain implements PlanReward {

        @NotNull
        public static final Parcelable.Creator<Maintain> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f60118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDateTime f60119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Challenge f60120c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Maintain(c.valueOf(parcel.readString()), (LocalDateTime) parcel.readSerializable(), Challenge.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Maintain[i];
            }
        }

        public Maintain(c tier, LocalDateTime endDate, Challenge challenge) {
            Intrinsics.checkNotNullParameter(tier, "tier");
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            this.f60118a = tier;
            this.f60119b = endDate;
            this.f60120c = challenge;
        }

        @Override // com.revolut.crypto.challenge.impl.model.PlanReward
        /* JADX INFO: renamed from: L7, reason: from getter */
        public final c getF60118a() {
            return this.f60118a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Maintain)) {
                return false;
            }
            Maintain maintain = (Maintain) obj2;
            return this.f60118a == maintain.f60118a && Intrinsics.f(this.f60119b, maintain.f60119b) && Intrinsics.f(this.f60120c, maintain.f60120c);
        }

        public final int hashCode() {
            return this.f60120c.hashCode() + v7.i(this.f60119b, this.f60118a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f60118a.name());
            dest.writeSerializable(this.f60119b);
            this.f60120c.writeToParcel(dest, i);
        }
    }

    /* JADX INFO: renamed from: L7 */
    c getF60118a();
}
