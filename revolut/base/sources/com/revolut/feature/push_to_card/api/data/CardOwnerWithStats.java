package com.revolut.feature.push_to_card.api.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/push_to_card/api/data/CardOwnerWithStats;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_push_to_card_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardOwnerWithStats implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CardOwnerWithStats> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardOwner f81495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f81496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f81497c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardOwnerWithStats(CardOwner.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardOwnerWithStats[i];
        }
    }

    public CardOwnerWithStats(CardOwner cardOwner, int i, long j2) {
        Intrinsics.checkNotNullParameter(cardOwner, "cardOwner");
        this.f81495a = cardOwner;
        this.f81496b = i;
        this.f81497c = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardOwnerWithStats)) {
            return false;
        }
        CardOwnerWithStats cardOwnerWithStats = (CardOwnerWithStats) obj2;
        return Intrinsics.f(this.f81495a, cardOwnerWithStats.f81495a) && this.f81496b == cardOwnerWithStats.f81496b && this.f81497c == cardOwnerWithStats.f81497c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f81497c) + j6.a.b(this.f81496b, this.f81495a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f81495a.writeToParcel(dest, i);
        dest.writeInt(this.f81496b);
        dest.writeLong(this.f81497c);
    }
}
