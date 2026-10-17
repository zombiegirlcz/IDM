package com.revolut.crypto.challenge.impl.ui.screen.progress;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.crypto.challenge.impl.model.ChallengeStatusDetails;
import com.revolut.crypto.challenge.impl.model.PlanReward;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/crypto/challenge/impl/ui/screen/progress/CryptoChallengeProgressContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ConfirmClaim", "Conditions", "Lcom/revolut/crypto/challenge/impl/ui/screen/progress/CryptoChallengeProgressContract$ModalStep$Conditions;", "Lcom/revolut/crypto/challenge/impl/ui/screen/progress/CryptoChallengeProgressContract$ModalStep$ConfirmClaim;", "feature_crypto_challenge_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoChallengeProgressContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/crypto/challenge/impl/ui/screen/progress/CryptoChallengeProgressContract$ModalStep$Conditions;", "Lcom/revolut/crypto/challenge/impl/ui/screen/progress/CryptoChallengeProgressContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_challenge_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Conditions implements CryptoChallengeProgressContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Conditions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChallengeStatusDetails f60121a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Conditions(ChallengeStatusDetails.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Conditions[i];
            }
        }

        public Conditions(ChallengeStatusDetails details) {
            Intrinsics.checkNotNullParameter(details, "details");
            this.f60121a = details;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Conditions) && Intrinsics.f(this.f60121a, ((Conditions) obj2).f60121a);
        }

        public final int hashCode() {
            return this.f60121a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f60121a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/crypto/challenge/impl/ui/screen/progress/CryptoChallengeProgressContract$ModalStep$ConfirmClaim;", "Lcom/revolut/crypto/challenge/impl/ui/screen/progress/CryptoChallengeProgressContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_challenge_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmClaim implements CryptoChallengeProgressContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ConfirmClaim> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlanReward.Eligible f60122a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConfirmClaim(PlanReward.Eligible.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmClaim[i];
            }
        }

        public ConfirmClaim(PlanReward.Eligible reward) {
            Intrinsics.checkNotNullParameter(reward, "reward");
            this.f60122a = reward;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ConfirmClaim) && Intrinsics.f(this.f60122a, ((ConfirmClaim) obj2).f60122a);
        }

        public final int hashCode() {
            return this.f60122a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f60122a.writeToParcel(dest, i);
        }
    }
}
