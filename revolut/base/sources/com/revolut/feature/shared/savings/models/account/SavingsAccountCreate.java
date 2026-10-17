package com.revolut.feature.shared.savings.models.account;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shared/savings/models/account/SavingsAccountCreate;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Challenge", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SavingsAccountCreate implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SavingsAccountCreate> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Challenge f86464b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/account/SavingsAccountCreate$Challenge;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Challenge implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Challenge> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f86466b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f86467c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Challenge(parcel.readString(), parcel.readLong(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Challenge[i];
            }
        }

        public Challenge(String challengeId, long j2, String str) {
            Intrinsics.checkNotNullParameter(challengeId, "challengeId");
            this.f86465a = challengeId;
            this.f86466b = j2;
            this.f86467c = str;
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
            return Intrinsics.f(this.f86465a, challenge.f86465a) && this.f86466b == challenge.f86466b && Intrinsics.f(this.f86467c, challenge.f86467c);
        }

        public final int hashCode() {
            int iC = d.c(this.f86465a.hashCode() * 31, 31, this.f86466b);
            String str = this.f86467c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86465a);
            dest.writeLong(this.f86466b);
            dest.writeString(this.f86467c);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SavingsAccountCreate(parcel.readString(), parcel.readInt() == 0 ? null : Challenge.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SavingsAccountCreate[i];
        }
    }

    public SavingsAccountCreate(String productId, Challenge challenge) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.f86463a = productId;
        this.f86464b = challenge;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SavingsAccountCreate)) {
            return false;
        }
        SavingsAccountCreate savingsAccountCreate = (SavingsAccountCreate) obj2;
        return Intrinsics.f(this.f86463a, savingsAccountCreate.f86463a) && Intrinsics.f(this.f86464b, savingsAccountCreate.f86464b);
    }

    public final int hashCode() {
        int iHashCode = this.f86463a.hashCode() * 31;
        Challenge challenge = this.f86464b;
        return iHashCode + (challenge == null ? 0 : challenge.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86463a);
        Challenge challenge = this.f86464b;
        if (challenge == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            challenge.writeToParcel(dest, i);
        }
    }
}
