package com.revolut.feature.freelancer.common.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lr6.i0;
import lr6.j0;
import lr6.k0;
import lr6.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/FreelancerOrderTransaction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerOrderTransaction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreelancerOrderTransaction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f73313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f73314c;
    public final k0 d;
    public final i0 e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lr6.a f73315g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f73316h;
    public final d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final FreelancerTaxAllocation f73317j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerOrderTransaction(parcel.readString(), j0.valueOf(parcel.readString()), l0.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : k0.valueOf(parcel.readString()), i0.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : lr6.a.valueOf(parcel.readString()), (d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() != 0 ? FreelancerTaxAllocation.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerOrderTransaction[i];
        }
    }

    public FreelancerOrderTransaction(String id10, j0 state, l0 type, k0 k0Var, i0 paymentMethod, String str, lr6.a aVar, d dVar, d dVar2, FreelancerTaxAllocation freelancerTaxAllocation) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        this.f73312a = id10;
        this.f73313b = state;
        this.f73314c = type;
        this.d = k0Var;
        this.e = paymentMethod;
        this.f = str;
        this.f73315g = aVar;
        this.f73316h = dVar;
        this.i = dVar2;
        this.f73317j = freelancerTaxAllocation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerOrderTransaction)) {
            return false;
        }
        FreelancerOrderTransaction freelancerOrderTransaction = (FreelancerOrderTransaction) obj2;
        return Intrinsics.f(this.f73312a, freelancerOrderTransaction.f73312a) && this.f73313b == freelancerOrderTransaction.f73313b && this.f73314c == freelancerOrderTransaction.f73314c && this.d == freelancerOrderTransaction.d && this.e == freelancerOrderTransaction.e && Intrinsics.f(this.f, freelancerOrderTransaction.f) && this.f73315g == freelancerOrderTransaction.f73315g && Intrinsics.f(this.f73316h, freelancerOrderTransaction.f73316h) && Intrinsics.f(this.i, freelancerOrderTransaction.i) && Intrinsics.f(this.f73317j, freelancerOrderTransaction.f73317j);
    }

    public final int hashCode() {
        int iHashCode = (this.f73314c.hashCode() + ((this.f73313b.hashCode() + (this.f73312a.hashCode() * 31)) * 31)) * 31;
        k0 k0Var = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (k0Var == null ? 0 : k0Var.hashCode())) * 31)) * 31;
        String str = this.f;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        lr6.a aVar = this.f73315g;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        d dVar = this.f73316h;
        int iHashCode5 = (iHashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.i;
        int iHashCode6 = (iHashCode5 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        FreelancerTaxAllocation freelancerTaxAllocation = this.f73317j;
        return iHashCode6 + (freelancerTaxAllocation != null ? freelancerTaxAllocation.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73312a);
        dest.writeString(this.f73313b.name());
        dest.writeString(this.f73314c.name());
        k0 k0Var = this.d;
        if (k0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(k0Var.name());
        }
        dest.writeString(this.e.name());
        dest.writeString(this.f);
        lr6.a aVar = this.f73315g;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeSerializable(this.f73316h);
        dest.writeSerializable(this.i);
        FreelancerTaxAllocation freelancerTaxAllocation = this.f73317j;
        if (freelancerTaxAllocation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            freelancerTaxAllocation.writeToParcel(dest, i);
        }
    }
}
