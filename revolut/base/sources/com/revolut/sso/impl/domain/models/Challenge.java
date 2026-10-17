package com.revolut.sso.impl.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import gkl.k;
import jkl.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/sso/impl/domain/models/Challenge;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "gkl/k", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Challenge implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f106098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f106099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f106100c;
    public final String d;
    public final String e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ChallengeDetails f106101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Operation f106102h;

    @NotNull
    public static final Parcelable.Creator<Challenge> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Challenge(i.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : k.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (ChallengeDetails) parcel.readParcelable(Challenge.class.getClassLoader()), parcel.readInt() != 0 ? Operation.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Challenge[i];
        }
    }

    public Challenge(i method, k kVar, String str, String str2, String str3, Long l2, ChallengeDetails challengeDetails, Operation operation) {
        Intrinsics.checkNotNullParameter(method, "method");
        this.f106098a = method;
        this.f106099b = kVar;
        this.f106100c = str;
        this.d = str2;
        this.e = str3;
        this.f = l2;
        this.f106101g = challengeDetails;
        this.f106102h = operation;
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
        return this.f106098a == challenge.f106098a && this.f106099b == challenge.f106099b && Intrinsics.f(this.f106100c, challenge.f106100c) && Intrinsics.f(this.d, challenge.d) && Intrinsics.f(this.e, challenge.e) && Intrinsics.f(this.f, challenge.f) && Intrinsics.f(this.f106101g, challenge.f106101g) && Intrinsics.f(this.f106102h, challenge.f106102h);
    }

    public final int hashCode() {
        int iHashCode = this.f106098a.hashCode() * 31;
        k kVar = this.f106099b;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        String str = this.f106100c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        ChallengeDetails challengeDetails = this.f106101g;
        int iHashCode7 = (iHashCode6 + (challengeDetails == null ? 0 : challengeDetails.hashCode())) * 31;
        Operation operation = this.f106102h;
        return iHashCode7 + (operation != null ? operation.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f106098a.name());
        k kVar = this.f106099b;
        if (kVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(kVar.name());
        }
        dest.writeString(this.f106100c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        Long l2 = this.f;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l2);
        }
        dest.writeParcelable(this.f106101g, i);
        Operation operation = this.f106102h;
        if (operation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            operation.writeToParcel(dest, i);
        }
    }

    public /* synthetic */ Challenge(i iVar) {
        this(iVar, null, null, null, null, null, null, null);
    }
}
