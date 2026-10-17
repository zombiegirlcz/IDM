package com.revolut.feature.credit.card.models.creditcard;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yw4.c;
import yw4.d;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/card/models/creditcard/CreditCardCancellation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "yw4/d", "yw4/c", "feature_credit_card_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardCancellation implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardCancellation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f69813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f69814b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardCancellation(parcel.readInt() == 0 ? null : d.valueOf(parcel.readString()), parcel.readInt() != 0 ? c.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardCancellation[i];
        }
    }

    public CreditCardCancellation(d dVar, c cVar) {
        this.f69813a = dVar;
        this.f69814b = cVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardCancellation)) {
            return false;
        }
        CreditCardCancellation creditCardCancellation = (CreditCardCancellation) obj2;
        return this.f69813a == creditCardCancellation.f69813a && this.f69814b == creditCardCancellation.f69814b;
    }

    public final int hashCode() {
        d dVar = this.f69813a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        c cVar = this.f69814b;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        d dVar = this.f69813a;
        if (dVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(dVar.name());
        }
        c cVar = this.f69814b;
        if (cVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cVar.name());
        }
    }
}
