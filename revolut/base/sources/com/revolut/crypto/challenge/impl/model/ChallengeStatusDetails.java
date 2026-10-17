package com.revolut.crypto.challenge.impl.model;

import android.os.Parcel;
import android.os.Parcelable;
import ip0.v7;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/crypto/challenge/impl/model/ChallengeStatusDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_challenge_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChallengeStatusDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ChallengeStatusDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f60108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDateTime f60109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ChallengeProgress f60110c;
    public final ArrayList d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            LocalDateTime localDateTime = (LocalDateTime) parcel.readSerializable();
            LocalDateTime localDateTime2 = (LocalDateTime) parcel.readSerializable();
            ChallengeProgress challengeProgressCreateFromParcel = ChallengeProgress.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(ChallengeTier.CREATOR, parcel, arrayList, iA, 1);
            }
            return new ChallengeStatusDetails(localDateTime, localDateTime2, challengeProgressCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChallengeStatusDetails[i];
        }
    }

    public ChallengeStatusDetails(LocalDateTime startDate, LocalDateTime endDate, ChallengeProgress progress, ArrayList tiers) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(tiers, "tiers");
        this.f60108a = startDate;
        this.f60109b = endDate;
        this.f60110c = progress;
        this.d = tiers;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChallengeStatusDetails)) {
            return false;
        }
        ChallengeStatusDetails challengeStatusDetails = (ChallengeStatusDetails) obj2;
        return Intrinsics.f(this.f60108a, challengeStatusDetails.f60108a) && Intrinsics.f(this.f60109b, challengeStatusDetails.f60109b) && Intrinsics.f(this.f60110c, challengeStatusDetails.f60110c) && this.d.equals(challengeStatusDetails.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(v7.i(this.f60109b, this.f60108a.hashCode() * 31, 31), 31, this.f60110c.f60107a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f60108a);
        dest.writeSerializable(this.f60109b);
        this.f60110c.writeToParcel(dest, i);
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            ((ChallengeTier) itY.next()).writeToParcel(dest, i);
        }
    }
}
