package com.revolut.feature.revolutpay.shipping.api.domain.models.deliverymethod;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/revolutpay/shipping/api/domain/models/deliverymethod/DeliveryMethods;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "DeliveryMethod", "a", "feature_revolut_pay_shipping_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeliveryMethods implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f84734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f84735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f84736c;
    public final long d;
    public final long e;

    @NotNull
    public static final Parcelable.Creator<DeliveryMethods> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/revolutpay/shipping/api/domain/models/deliverymethod/DeliveryMethods$DeliveryMethod;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_revolut_pay_shipping_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeliveryMethod implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84738b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f84739c;
        public final String d;

        @NotNull
        public static final Parcelable.Creator<DeliveryMethod> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeliveryMethod((d) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeliveryMethod[i];
            }
        }

        public DeliveryMethod(d amount, String id10, String label, String str) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.f84737a = id10;
            this.f84738b = label;
            this.f84739c = amount;
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DeliveryMethod)) {
                return false;
            }
            DeliveryMethod deliveryMethod = (DeliveryMethod) obj2;
            return Intrinsics.f(this.f84737a, deliveryMethod.f84737a) && Intrinsics.f(this.f84738b, deliveryMethod.f84738b) && Intrinsics.f(this.f84739c, deliveryMethod.f84739c) && Intrinsics.f(this.d, deliveryMethod.d);
        }

        public final int hashCode() {
            int iC = v7.c(a.c(this.f84737a.hashCode() * 31, 31, this.f84738b), 31, this.f84739c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84737a);
            dest.writeString(this.f84738b);
            dest.writeSerializable(this.f84739c);
            dest.writeString(this.d);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int iA = 0;
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(DeliveryMethod.CREATOR, parcel, arrayList, iA, 1);
            }
            return new DeliveryMethods(z, arrayList, parcel.readLong(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeliveryMethods[i];
        }
    }

    public DeliveryMethods(boolean z, ArrayList deliveryMethodList, long j2, long j3, long j5) {
        Intrinsics.checkNotNullParameter(deliveryMethodList, "deliveryMethodList");
        this.f84734a = z;
        this.f84735b = deliveryMethodList;
        this.f84736c = j2;
        this.d = j3;
        this.e = j5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeliveryMethods)) {
            return false;
        }
        DeliveryMethods deliveryMethods = (DeliveryMethods) obj2;
        return this.f84734a == deliveryMethods.f84734a && this.f84735b.equals(deliveryMethods.f84735b) && this.f84736c == deliveryMethods.f84736c && this.d == deliveryMethods.d && this.e == deliveryMethods.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + a0.d.c(a0.d.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f84735b, Boolean.hashCode(this.f84734a) * 31, 31), 31, this.f84736c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f84734a ? 1 : 0);
        Iterator itY = j6.a.y(this.f84735b, dest);
        while (itY.hasNext()) {
            ((DeliveryMethod) itY.next()).writeToParcel(dest, i);
        }
        dest.writeLong(this.f84736c);
        dest.writeLong(this.d);
        dest.writeLong(this.e);
    }
}
