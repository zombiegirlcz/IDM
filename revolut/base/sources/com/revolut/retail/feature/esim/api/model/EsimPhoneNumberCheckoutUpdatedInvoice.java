package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r6.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimPhoneNumberCheckoutUpdatedInvoice;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimPhoneNumberCheckoutUpdatedInvoice implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimPhoneNumberCheckoutUpdatedInvoice> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimPhoneNumberCheckoutFee f100325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f100326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f100327c;
    public final EsimPhoneNumberCheckoutFee d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            EsimPhoneNumberCheckoutFee esimPhoneNumberCheckoutFeeCreateFromParcel = EsimPhoneNumberCheckoutFee.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(EsimPhoneNumberCheckoutPhoneNumberFee.CREATOR, parcel, arrayList, iA, 1);
            }
            return new EsimPhoneNumberCheckoutUpdatedInvoice(esimPhoneNumberCheckoutFeeCreateFromParcel, arrayList, (Instant) parcel.readSerializable(), EsimPhoneNumberCheckoutFee.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimPhoneNumberCheckoutUpdatedInvoice[i];
        }
    }

    public EsimPhoneNumberCheckoutUpdatedInvoice(EsimPhoneNumberCheckoutFee subscriptionFee, ArrayList phoneNumbers, Instant dueDate, EsimPhoneNumberCheckoutFee dueAmount) {
        Intrinsics.checkNotNullParameter(subscriptionFee, "subscriptionFee");
        Intrinsics.checkNotNullParameter(phoneNumbers, "phoneNumbers");
        Intrinsics.checkNotNullParameter(dueDate, "dueDate");
        Intrinsics.checkNotNullParameter(dueAmount, "dueAmount");
        this.f100325a = subscriptionFee;
        this.f100326b = phoneNumbers;
        this.f100327c = dueDate;
        this.d = dueAmount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimPhoneNumberCheckoutUpdatedInvoice)) {
            return false;
        }
        EsimPhoneNumberCheckoutUpdatedInvoice esimPhoneNumberCheckoutUpdatedInvoice = (EsimPhoneNumberCheckoutUpdatedInvoice) obj2;
        return Intrinsics.f(this.f100325a, esimPhoneNumberCheckoutUpdatedInvoice.f100325a) && this.f100326b.equals(esimPhoneNumberCheckoutUpdatedInvoice.f100326b) && Intrinsics.f(this.f100327c, esimPhoneNumberCheckoutUpdatedInvoice.f100327c) && Intrinsics.f(this.d, esimPhoneNumberCheckoutUpdatedInvoice.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + b.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f100326b, this.f100325a.hashCode() * 31, 31), 31, this.f100327c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f100325a.writeToParcel(dest, i);
        Iterator itY = j6.a.y(this.f100326b, dest);
        while (itY.hasNext()) {
            ((EsimPhoneNumberCheckoutPhoneNumberFee) itY.next()).writeToParcel(dest, i);
        }
        dest.writeSerializable(this.f100327c);
        this.d.writeToParcel(dest, i);
    }
}
