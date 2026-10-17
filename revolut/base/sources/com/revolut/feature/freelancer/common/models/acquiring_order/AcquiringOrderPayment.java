package com.revolut.feature.freelancer.common.models.acquiring_order;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPayment$Id;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPayment$SepaDirectDebit;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentFee;
import ip0.v7;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lr6.a;
import org.jetbrains.annotations.NotNull;
import pr6.d;
import pr6.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/acquiring_order/AcquiringOrderPayment;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AcquiringOrderPayment implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f73356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f73357c;
    public final LocalDateTime d;
    public final LocalDateTime e;
    public final a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f73358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f73359h;
    public final dj0.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f73360j;
    public final j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AcquiringOrderCard f73361l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AcquiringPayment$SepaDirectDebit f73362m;

    @NotNull
    public static final Parcelable.Creator<AcquiringOrderPayment> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String str = AcquiringPayment$Id.CREATOR.createFromParcel(parcel).f73363a;
            d dVarValueOf = d.valueOf(parcel.readString());
            String str2 = AcquiringOrder$Id.CREATOR.createFromParcel(parcel).f73342a;
            LocalDateTime localDateTime = (LocalDateTime) parcel.readSerializable();
            LocalDateTime localDateTime2 = (LocalDateTime) parcel.readSerializable();
            a aVarValueOf = a.valueOf(parcel.readString());
            dj0.d dVar = (dj0.d) parcel.readSerializable();
            int iA = 0;
            boolean z = parcel.readInt() != 0;
            dj0.d dVar2 = (dj0.d) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(AcquiringPaymentFee.CREATOR, parcel, arrayList, iA, 1);
            }
            return new AcquiringOrderPayment(str, dVarValueOf, str2, localDateTime, localDateTime2, aVarValueOf, dVar, z, dVar2, arrayList, j.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : AcquiringOrderCard.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AcquiringPayment$SepaDirectDebit.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AcquiringOrderPayment[i];
        }
    }

    public AcquiringOrderPayment(String id10, d paymentType, String orderId, LocalDateTime startedAt, LocalDateTime updatedAt, a state, dj0.d amount, boolean z, dj0.d dVar, ArrayList fees, j paymentMethod, AcquiringOrderCard acquiringOrderCard, AcquiringPayment$SepaDirectDebit acquiringPayment$SepaDirectDebit) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(startedAt, "startedAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        this.f73355a = id10;
        this.f73356b = paymentType;
        this.f73357c = orderId;
        this.d = startedAt;
        this.e = updatedAt;
        this.f = state;
        this.f73358g = amount;
        this.f73359h = z;
        this.i = dVar;
        this.f73360j = fees;
        this.k = paymentMethod;
        this.f73361l = acquiringOrderCard;
        this.f73362m = acquiringPayment$SepaDirectDebit;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AcquiringOrderPayment)) {
            return false;
        }
        AcquiringOrderPayment acquiringOrderPayment = (AcquiringOrderPayment) obj2;
        return Intrinsics.f(this.f73355a, acquiringOrderPayment.f73355a) && this.f73356b == acquiringOrderPayment.f73356b && Intrinsics.f(this.f73357c, acquiringOrderPayment.f73357c) && Intrinsics.f(this.d, acquiringOrderPayment.d) && Intrinsics.f(this.e, acquiringOrderPayment.e) && this.f == acquiringOrderPayment.f && Intrinsics.f(this.f73358g, acquiringOrderPayment.f73358g) && this.f73359h == acquiringOrderPayment.f73359h && Intrinsics.f(this.i, acquiringOrderPayment.i) && this.f73360j.equals(acquiringOrderPayment.f73360j) && this.k == acquiringOrderPayment.k && Intrinsics.f(this.f73361l, acquiringOrderPayment.f73361l) && Intrinsics.f(this.f73362m, acquiringOrderPayment.f73362m);
    }

    public final int hashCode() {
        int iC = j6.a.c(v7.c((this.f.hashCode() + v7.i(this.e, v7.i(this.d, p.a.c((this.f73356b.hashCode() + (this.f73355a.hashCode() * 31)) * 31, 31, this.f73357c), 31), 31)) * 31, 31, this.f73358g), 31, this.f73359h);
        dj0.d dVar = this.i;
        int iHashCode = (this.k.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f73360j, (iC + (dVar == null ? 0 : dVar.hashCode())) * 31, 31)) * 31;
        AcquiringOrderCard acquiringOrderCard = this.f73361l;
        int iHashCode2 = (iHashCode + (acquiringOrderCard == null ? 0 : acquiringOrderCard.hashCode())) * 31;
        AcquiringPayment$SepaDirectDebit acquiringPayment$SepaDirectDebit = this.f73362m;
        return iHashCode2 + (acquiringPayment$SepaDirectDebit != null ? acquiringPayment$SepaDirectDebit.f73364a.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73355a);
        dest.writeString(this.f73356b.name());
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73357c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeString(this.f.name());
        dest.writeSerializable(this.f73358g);
        dest.writeInt(this.f73359h ? 1 : 0);
        dest.writeSerializable(this.i);
        Iterator itY = j6.a.y(this.f73360j, dest);
        while (itY.hasNext()) {
            ((AcquiringPaymentFee) itY.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.k.name());
        AcquiringOrderCard acquiringOrderCard = this.f73361l;
        if (acquiringOrderCard == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            acquiringOrderCard.writeToParcel(dest, i);
        }
        AcquiringPayment$SepaDirectDebit acquiringPayment$SepaDirectDebit = this.f73362m;
        if (acquiringPayment$SepaDirectDebit == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            acquiringPayment$SepaDirectDebit.writeToParcel(dest, i);
        }
    }
}
