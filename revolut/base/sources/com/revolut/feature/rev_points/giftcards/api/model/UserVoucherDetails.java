package com.revolut.feature.rev_points.giftcards.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import tvb.e;
import tvb.f;
import tvb.g;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/api/model/UserVoucherDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_giftcards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserVoucherDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UserVoucherDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f83625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f83626c;
    public final Long d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final VoucherProductTermsAndConditions f83627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f83628h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f83629j;
    public final d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final tvb.d f83630l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final UserVoucherDetailsRedemption f83631m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f83632n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f83633p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f83634q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f83635r;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserVoucherDetails(parcel.readString(), e.valueOf(parcel.readString()), parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), VoucherProductTermsAndConditions.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), tvb.d.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : UserVoucherDetailsRedemption.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : g.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : f.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UserVoucherDetails[i];
        }
    }

    public UserVoucherDetails(String id10, e source, long j2, Long l2, String name, String cardImageUrl, VoucherProductTermsAndConditions termsAndConditions, String description, String instructions, d amount, d dVar, tvb.d state, UserVoucherDetailsRedemption userVoucherDetailsRedemption, String str, String str2, g gVar, f fVar, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(cardImageUrl, "cardImageUrl");
        Intrinsics.checkNotNullParameter(termsAndConditions, "termsAndConditions");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f83624a = id10;
        this.f83625b = source;
        this.f83626c = j2;
        this.d = l2;
        this.e = name;
        this.f = cardImageUrl;
        this.f83627g = termsAndConditions;
        this.f83628h = description;
        this.i = instructions;
        this.f83629j = amount;
        this.k = dVar;
        this.f83630l = state;
        this.f83631m = userVoucherDetailsRedemption;
        this.f83632n = str;
        this.o = str2;
        this.f83633p = gVar;
        this.f83634q = fVar;
        this.f83635r = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UserVoucherDetails)) {
            return false;
        }
        UserVoucherDetails userVoucherDetails = (UserVoucherDetails) obj2;
        return Intrinsics.f(this.f83624a, userVoucherDetails.f83624a) && this.f83625b == userVoucherDetails.f83625b && this.f83626c == userVoucherDetails.f83626c && Intrinsics.f(this.d, userVoucherDetails.d) && Intrinsics.f(this.e, userVoucherDetails.e) && Intrinsics.f(this.f, userVoucherDetails.f) && Intrinsics.f(this.f83627g, userVoucherDetails.f83627g) && Intrinsics.f(this.f83628h, userVoucherDetails.f83628h) && Intrinsics.f(this.i, userVoucherDetails.i) && Intrinsics.f(this.f83629j, userVoucherDetails.f83629j) && Intrinsics.f(this.k, userVoucherDetails.k) && this.f83630l == userVoucherDetails.f83630l && Intrinsics.f(this.f83631m, userVoucherDetails.f83631m) && Intrinsics.f(this.f83632n, userVoucherDetails.f83632n) && Intrinsics.f(this.o, userVoucherDetails.o) && this.f83633p == userVoucherDetails.f83633p && this.f83634q == userVoucherDetails.f83634q && Intrinsics.f(this.f83635r, userVoucherDetails.f83635r);
    }

    public final int hashCode() {
        int iC = a0.d.c((this.f83625b.hashCode() + (this.f83624a.hashCode() * 31)) * 31, 31, this.f83626c);
        Long l2 = this.d;
        int iC2 = v7.c(p.a.c(p.a.c((this.f83627g.hashCode() + p.a.c(p.a.c((iC + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.e), 31, this.f)) * 31, 31, this.f83628h), 31, this.i), 31, this.f83629j);
        d dVar = this.k;
        int iHashCode = (this.f83630l.hashCode() + ((iC2 + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31;
        UserVoucherDetailsRedemption userVoucherDetailsRedemption = this.f83631m;
        int iHashCode2 = (iHashCode + (userVoucherDetailsRedemption == null ? 0 : userVoucherDetailsRedemption.hashCode())) * 31;
        String str = this.f83632n;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.o;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        g gVar = this.f83633p;
        int iHashCode5 = (iHashCode4 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        f fVar = this.f83634q;
        int iHashCode6 = (iHashCode5 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str3 = this.f83635r;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f83624a);
        dest.writeString(this.f83625b.name());
        dest.writeLong(this.f83626c);
        Long l2 = this.d;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        dest.writeString(this.e);
        dest.writeString(this.f);
        this.f83627g.writeToParcel(dest, i);
        dest.writeString(this.f83628h);
        dest.writeString(this.i);
        dest.writeSerializable(this.f83629j);
        dest.writeSerializable(this.k);
        dest.writeString(this.f83630l.name());
        UserVoucherDetailsRedemption userVoucherDetailsRedemption = this.f83631m;
        if (userVoucherDetailsRedemption == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            userVoucherDetailsRedemption.writeToParcel(dest, i);
        }
        dest.writeString(this.f83632n);
        dest.writeString(this.o);
        g gVar = this.f83633p;
        if (gVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(gVar.name());
        }
        f fVar = this.f83634q;
        if (fVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(fVar.name());
        }
        dest.writeString(this.f83635r);
    }
}
