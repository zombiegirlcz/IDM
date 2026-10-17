package com.revolut.feature.cards.models.revolutcard;

import android.os.Parcel;
import android.os.Parcelable;
import h93.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cards/models/revolutcard/ReactivationEligibility;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_cards_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReactivationEligibility implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ReactivationEligibility> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f65542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f65543b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReactivationEligibility(parcel.readInt() != 0, n0.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReactivationEligibility[i];
        }
    }

    public ReactivationEligibility(boolean z, n0 reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f65542a = z;
        this.f65543b = reason;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ReactivationEligibility)) {
            return false;
        }
        ReactivationEligibility reactivationEligibility = (ReactivationEligibility) obj2;
        return this.f65542a == reactivationEligibility.f65542a && this.f65543b == reactivationEligibility.f65543b;
    }

    public final int hashCode() {
        return this.f65543b.hashCode() + (Boolean.hashCode(this.f65542a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f65542a ? 1 : 0);
        dest.writeString(this.f65543b.name());
    }
}
