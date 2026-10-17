package com.revolut.feature.cards.models.revolutcard;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import b93.j;
import h30.l;
import h93.j0;
import h93.l0;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cards/models/revolutcard/TerminatedCard;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_cards_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TerminatedCard implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TerminatedCard> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f65549c;
    public final String d;
    public final LocalDate e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f65550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ReactivationEligibility f65551h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l0 f65552j;
    public final j0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f65553l;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TerminatedCard(parcel.readString(), parcel.readString(), (j) parcel.readSerializable(), parcel.readString(), (LocalDate) parcel.readSerializable(), parcel.readLong(), parcel.readString(), ReactivationEligibility.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() == 0 ? null : l0.valueOf(parcel.readString()), parcel.readInt() != 0 ? j0.valueOf(parcel.readString()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TerminatedCard[i];
        }
    }

    public TerminatedCard(String id10, String walletId, j design, String str, LocalDate expiryDate, long j2, String str2, ReactivationEligibility reactivation, boolean z, l0 l0Var, j0 j0Var, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(design, "design");
        Intrinsics.checkNotNullParameter(expiryDate, "expiryDate");
        Intrinsics.checkNotNullParameter(reactivation, "reactivation");
        this.f65547a = id10;
        this.f65548b = walletId;
        this.f65549c = design;
        this.d = str;
        this.e = expiryDate;
        this.f = j2;
        this.f65550g = str2;
        this.f65551h = reactivation;
        this.i = z;
        this.f65552j = l0Var;
        this.k = j0Var;
        this.f65553l = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TerminatedCard)) {
            return false;
        }
        TerminatedCard terminatedCard = (TerminatedCard) obj2;
        return Intrinsics.f(this.f65547a, terminatedCard.f65547a) && Intrinsics.f(this.f65548b, terminatedCard.f65548b) && Intrinsics.f(this.f65549c, terminatedCard.f65549c) && Intrinsics.f(this.d, terminatedCard.d) && Intrinsics.f(this.e, terminatedCard.e) && this.f == terminatedCard.f && Intrinsics.f(this.f65550g, terminatedCard.f65550g) && Intrinsics.f(this.f65551h, terminatedCard.f65551h) && this.i == terminatedCard.i && this.f65552j == terminatedCard.f65552j && this.k == terminatedCard.k && Intrinsics.f(this.f65553l, terminatedCard.f65553l);
    }

    public final int hashCode() {
        int iHashCode = (this.f65549c.hashCode() + p.a.c(this.f65547a.hashCode() * 31, 31, this.f65548b)) * 31;
        String str = this.d;
        int iC = d.c(y.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
        String str2 = this.f65550g;
        int iC2 = j6.a.c((this.f65551h.hashCode() + ((iC + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.i);
        l0 l0Var = this.f65552j;
        int iHashCode2 = (iC2 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        j0 j0Var = this.k;
        int iHashCode3 = (iHashCode2 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        String str3 = this.f65553l;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f65547a);
        dest.writeString(this.f65548b);
        dest.writeSerializable(this.f65549c);
        dest.writeString(this.d);
        dest.writeSerializable(this.e);
        dest.writeLong(this.f);
        dest.writeString(this.f65550g);
        this.f65551h.writeToParcel(dest, i);
        dest.writeInt(this.i ? 1 : 0);
        l0 l0Var = this.f65552j;
        if (l0Var == null) {
            dest.writeInt(0);
        } else {
            l.B(dest, 1, l0Var);
        }
        j0 j0Var = this.k;
        if (j0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(j0Var.name());
        }
        dest.writeString(this.f65553l);
    }
}
