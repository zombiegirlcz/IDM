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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/api/model/UserVoucher;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_giftcards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserVoucher implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UserVoucher> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f83620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f83621c;
    public final Long d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f83622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f83623h;
    public final tvb.d i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserVoucher(parcel.readString(), e.valueOf(parcel.readString()), parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), tvb.d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UserVoucher[i];
        }
    }

    public UserVoucher(String id10, e source, long j2, Long l2, String name, String logoImageUrl, d amount, d dVar, tvb.d state) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logoImageUrl, "logoImageUrl");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f83619a = id10;
        this.f83620b = source;
        this.f83621c = j2;
        this.d = l2;
        this.e = name;
        this.f = logoImageUrl;
        this.f83622g = amount;
        this.f83623h = dVar;
        this.i = state;
    }

    public static UserVoucher a(UserVoucher userVoucher, tvb.d state) {
        String id10 = userVoucher.f83619a;
        e source = userVoucher.f83620b;
        long j2 = userVoucher.f83621c;
        Long l2 = userVoucher.d;
        String name = userVoucher.e;
        String logoImageUrl = userVoucher.f;
        d amount = userVoucher.f83622g;
        d dVar = userVoucher.f83623h;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logoImageUrl, "logoImageUrl");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(state, "state");
        return new UserVoucher(id10, source, j2, l2, name, logoImageUrl, amount, dVar, state);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UserVoucher)) {
            return false;
        }
        UserVoucher userVoucher = (UserVoucher) obj2;
        return Intrinsics.f(this.f83619a, userVoucher.f83619a) && this.f83620b == userVoucher.f83620b && this.f83621c == userVoucher.f83621c && Intrinsics.f(this.d, userVoucher.d) && Intrinsics.f(this.e, userVoucher.e) && Intrinsics.f(this.f, userVoucher.f) && Intrinsics.f(this.f83622g, userVoucher.f83622g) && Intrinsics.f(this.f83623h, userVoucher.f83623h) && this.i == userVoucher.i;
    }

    public final int hashCode() {
        int iC = a0.d.c((this.f83620b.hashCode() + (this.f83619a.hashCode() * 31)) * 31, 31, this.f83621c);
        Long l2 = this.d;
        int iC2 = v7.c(p.a.c(p.a.c((iC + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.f83622g);
        d dVar = this.f83623h;
        return this.i.hashCode() + ((iC2 + (dVar != null ? dVar.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f83619a);
        dest.writeString(this.f83620b.name());
        dest.writeLong(this.f83621c);
        Long l2 = this.d;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeSerializable(this.f83622g);
        dest.writeSerializable(this.f83623h);
        dest.writeString(this.i.name());
    }
}
