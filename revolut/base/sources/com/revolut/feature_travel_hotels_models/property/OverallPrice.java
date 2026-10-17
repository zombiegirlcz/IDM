package com.revolut.feature_travel_hotels_models.property;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/OverallPrice;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OverallPrice implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OverallPrice> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f98057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f98058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f98059c;
    public final ArrayList d;
    public final d e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            d dVar2 = (d) parcel.readSerializable();
            d dVar3 = (d) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(PriceFee.CREATOR, parcel, arrayList, iA, 1);
            }
            return new OverallPrice(dVar, dVar2, dVar3, arrayList, (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OverallPrice[i];
        }
    }

    public OverallPrice(d basePrice, d inclusivePrice, d dVar, ArrayList fees, d dVar2) {
        Intrinsics.checkNotNullParameter(basePrice, "basePrice");
        Intrinsics.checkNotNullParameter(inclusivePrice, "inclusivePrice");
        Intrinsics.checkNotNullParameter(fees, "fees");
        this.f98057a = basePrice;
        this.f98058b = inclusivePrice;
        this.f98059c = dVar;
        this.d = fees;
        this.e = dVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OverallPrice)) {
            return false;
        }
        OverallPrice overallPrice = (OverallPrice) obj2;
        return Intrinsics.f(this.f98057a, overallPrice.f98057a) && Intrinsics.f(this.f98058b, overallPrice.f98058b) && Intrinsics.f(this.f98059c, overallPrice.f98059c) && this.d.equals(overallPrice.d) && Intrinsics.f(this.e, overallPrice.e);
    }

    public final int hashCode() {
        int iC = v7.c(this.f98057a.hashCode() * 31, 31, this.f98058b);
        d dVar = this.f98059c;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (iC + (dVar == null ? 0 : dVar.hashCode())) * 31, 31);
        d dVar2 = this.e;
        return iB + (dVar2 != null ? dVar2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f98057a);
        dest.writeSerializable(this.f98058b);
        dest.writeSerializable(this.f98059c);
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            ((PriceFee) itY.next()).writeToParcel(dest, i);
        }
        dest.writeSerializable(this.e);
    }
}
