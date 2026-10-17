package com.revolut.feature.payments.splitbill.models.splitbilllink;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/payments/splitbill/models/splitbilllink/SplitBillLinkDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_payments_splitbill_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SplitBillLinkDetails implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f79944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f79945c;
    public final Long d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f79946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f79947h;
    public final d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f79948j;

    @NotNull
    public static final Parcelable.Creator<SplitBillLinkDetails> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SplitBillLinkDetails(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SplitBillLinkDetails[i];
        }
    }

    public SplitBillLinkDetails(String id10, String username, long j2, Long l2, String title, String str, String category, d dVar, d totalAmount, d dVar2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        this.f79943a = id10;
        this.f79944b = username;
        this.f79945c = j2;
        this.d = l2;
        this.e = title;
        this.f = str;
        this.f79946g = category;
        this.f79947h = dVar;
        this.i = totalAmount;
        this.f79948j = dVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SplitBillLinkDetails)) {
            return false;
        }
        SplitBillLinkDetails splitBillLinkDetails = (SplitBillLinkDetails) obj2;
        return Intrinsics.f(this.f79943a, splitBillLinkDetails.f79943a) && Intrinsics.f(this.f79944b, splitBillLinkDetails.f79944b) && this.f79945c == splitBillLinkDetails.f79945c && Intrinsics.f(this.d, splitBillLinkDetails.d) && Intrinsics.f(this.e, splitBillLinkDetails.e) && Intrinsics.f(this.f, splitBillLinkDetails.f) && Intrinsics.f(this.f79946g, splitBillLinkDetails.f79946g) && Intrinsics.f(this.f79947h, splitBillLinkDetails.f79947h) && Intrinsics.f(this.i, splitBillLinkDetails.i) && Intrinsics.f(this.f79948j, splitBillLinkDetails.f79948j);
    }

    public final int hashCode() {
        int iC = a0.d.c(a.c(this.f79943a.hashCode() * 31, 31, this.f79944b), 31, this.f79945c);
        Long l2 = this.d;
        int iC2 = a.c((iC + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.e);
        String str = this.f;
        int iC3 = a.c((iC2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f79946g);
        d dVar = this.f79947h;
        int iC4 = v7.c((iC3 + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.i);
        d dVar2 = this.f79948j;
        return iC4 + (dVar2 != null ? dVar2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f79943a);
        dest.writeString(this.f79944b);
        dest.writeLong(this.f79945c);
        Long l2 = this.d;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l2);
        }
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f79946g);
        dest.writeSerializable(this.f79947h);
        dest.writeSerializable(this.i);
        dest.writeSerializable(this.f79948j);
    }
}
