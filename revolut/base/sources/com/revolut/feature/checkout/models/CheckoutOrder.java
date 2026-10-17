package com.revolut.feature.checkout.models;

import android.os.Parcel;
import android.os.Parcelable;
import c93.j;
import h93.j0;
import h93.l0;
import h93.r;
import java.io.Serializable;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pi3.d;
import pi3.e;
import pi3.f;
import pi3.g;
import pi3.s;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00062\u00020\u00012\u00020\u0002:\u0001\u0007J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/feature/checkout/models/CheckoutOrder;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_checkout_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CheckoutOrder implements Serializable, Parcelable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final CheckoutOrder f65846g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f65847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f65848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f65849c;
    public final d d;
    public final e e;
    public final PreorderPreconditions f;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<CheckoutOrder> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.checkout.models.CheckoutOrder$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CheckoutOrder(s.valueOf(parcel.readString()), f.valueOf(parcel.readString()), g.valueOf(parcel.readString()), (d) parcel.readSerializable(), (e) parcel.readSerializable(), parcel.readInt() == 0 ? null : PreorderPreconditions.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CheckoutOrder[i];
        }
    }

    static {
        s sVar = s.CARD;
        f fVar = f.PROCESSED;
        j.Companion.getClass();
        j jVar = j.f22287c;
        b93.b.Companion.getClass();
        f65846g = new CheckoutOrder(sVar, fVar, g.PAYMENT_REQUIRED, new d("", "", b93.b.f13538b, e93.b.UNKNOWN, (String) null, jVar, (d93.b) null, jVar, false, jVar, (Instant) null, (r) null, (j0) null, (l0) null, (dj0.d) null, 51200), null, null);
    }

    public CheckoutOrder(s type, f state, g status, d dVar, e eVar, PreorderPreconditions preorderPreconditions) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f65847a = type;
        this.f65848b = state;
        this.f65849c = status;
        this.d = dVar;
        this.e = eVar;
        this.f = preorderPreconditions;
    }

    public static CheckoutOrder a(CheckoutOrder checkoutOrder, g gVar, d dVar, int i) {
        s type = checkoutOrder.f65847a;
        f state = checkoutOrder.f65848b;
        if ((i & 4) != 0) {
            gVar = checkoutOrder.f65849c;
        }
        g status = gVar;
        if ((i & 8) != 0) {
            dVar = checkoutOrder.d;
        }
        e eVar = checkoutOrder.e;
        PreorderPreconditions preorderPreconditions = checkoutOrder.f;
        checkoutOrder.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(status, "status");
        return new CheckoutOrder(type, state, status, dVar, eVar, preorderPreconditions);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g getF65849c() {
        return this.f65849c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CheckoutOrder)) {
            return false;
        }
        CheckoutOrder checkoutOrder = (CheckoutOrder) obj2;
        return this.f65847a == checkoutOrder.f65847a && this.f65848b == checkoutOrder.f65848b && this.f65849c == checkoutOrder.f65849c && Intrinsics.f(this.d, checkoutOrder.d) && Intrinsics.f(this.e, checkoutOrder.e) && Intrinsics.f(this.f, checkoutOrder.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f65849c.hashCode() + ((this.f65848b.hashCode() + (this.f65847a.hashCode() * 31)) * 31)) * 31;
        d dVar = this.d;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        e eVar = this.e;
        int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        PreorderPreconditions preorderPreconditions = this.f;
        return iHashCode3 + (preorderPreconditions != null ? preorderPreconditions.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f65847a.name());
        dest.writeString(this.f65848b.name());
        dest.writeString(this.f65849c.name());
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        PreorderPreconditions preorderPreconditions = this.f;
        if (preorderPreconditions == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            preorderPreconditions.writeToParcel(dest, i);
        }
    }
}
