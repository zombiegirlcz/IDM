package com.revolut.feature.payments.splitbill.models.splitbilllink;

import android.os.Parcel;
import android.os.Parcelable;
import b2a.a;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/payments/splitbill/models/splitbilllink/SplitBillLink;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_payments_splitbill_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SplitBillLink implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f79940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f79941c;
    public final long d;
    public final long e;
    public final a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f79942g;

    @NotNull
    public static final Parcelable.Creator<SplitBillLink> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SplitBillLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), a.valueOf(parcel.readString()), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SplitBillLink[i];
        }
    }

    public SplitBillLink(String id10, String link, String transactionId, long j2, long j3, a state, d dVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f79939a = id10;
        this.f79940b = link;
        this.f79941c = transactionId;
        this.d = j2;
        this.e = j3;
        this.f = state;
        this.f79942g = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SplitBillLink)) {
            return false;
        }
        SplitBillLink splitBillLink = (SplitBillLink) obj2;
        return Intrinsics.f(this.f79939a, splitBillLink.f79939a) && Intrinsics.f(this.f79940b, splitBillLink.f79940b) && Intrinsics.f(this.f79941c, splitBillLink.f79941c) && this.d == splitBillLink.d && this.e == splitBillLink.e && this.f == splitBillLink.f && Intrinsics.f(this.f79942g, splitBillLink.f79942g);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + a0.d.c(a0.d.c(p.a.c(p.a.c(this.f79939a.hashCode() * 31, 31, this.f79940b), 31, this.f79941c), 31, this.d), 31, this.e)) * 31;
        d dVar = this.f79942g;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f79939a);
        dest.writeString(this.f79940b);
        dest.writeString(this.f79941c);
        dest.writeLong(this.d);
        dest.writeLong(this.e);
        dest.writeString(this.f.name());
        dest.writeSerializable(this.f79942g);
    }
}
