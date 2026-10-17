package com.revolut.feature.donations.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lk0.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00062\u00020\u00012\u00020\u0002:\u0001\u0007J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/feature/donations/impl/domain/model/CharityTransactionsParams;", "Llk0/f;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CharityTransactionsParams extends f implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f71990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f71992c;
    public final Long d;

    @NotNull
    public static final Parcelable.Creator<CharityTransactionsParams> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CharityTransactionsParams(parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CharityTransactionsParams[i];
        }
    }

    public CharityTransactionsParams(String str, int i, Long l2, Long l3) {
        this.f71990a = i;
        this.f71991b = str;
        this.f71992c = l2;
        this.d = l3;
    }

    @Override // lk0.f
    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF71990a() {
        return this.f71990a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CharityTransactionsParams)) {
            return false;
        }
        CharityTransactionsParams charityTransactionsParams = (CharityTransactionsParams) obj2;
        return this.f71990a == charityTransactionsParams.f71990a && Intrinsics.f(this.f71991b, charityTransactionsParams.f71991b) && Intrinsics.f(this.f71992c, charityTransactionsParams.f71992c) && Intrinsics.f(this.d, charityTransactionsParams.d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f71990a) * 31;
        String str = this.f71991b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.f71992c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.d;
        return iHashCode3 + (l3 != null ? l3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f71990a);
        dest.writeString(this.f71991b);
        Long l2 = this.f71992c;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l2);
        }
        Long l3 = this.d;
        if (l3 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l3);
        }
    }

    public /* synthetic */ CharityTransactionsParams(String str, int i) {
        this(str, (i & 1) != 0 ? 50 : 3, null, null);
    }
}
