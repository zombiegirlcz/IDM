package com.revolut.crypto.challenge.impl.model;

import android.os.Parcel;
import android.os.Parcelable;
import f11.d;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/crypto/challenge/impl/model/Challenge;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_challenge_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Challenge implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Challenge> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f60105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDateTime f60106b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Challenge(d.valueOf(parcel.readString()), (LocalDateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Challenge[i];
        }
    }

    public Challenge(d type, LocalDateTime endDate) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        this.f60105a = type;
        this.f60106b = endDate;
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
        return this.f60105a == challenge.f60105a && Intrinsics.f(this.f60106b, challenge.f60106b);
    }

    public final int hashCode() {
        return this.f60106b.hashCode() + (this.f60105a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60105a.name());
        dest.writeSerializable(this.f60106b);
    }
}
