package com.revolut.feature.credit.card.api.models.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tl4.e;
import tl4.f;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardModelTextStyle;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardModelTextStyle implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardModelTextStyle> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f68856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f68857b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardModelTextStyle(parcel.readInt() == 0 ? null : f.valueOf(parcel.readString()), parcel.readInt() != 0 ? e.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardModelTextStyle[i];
        }
    }

    public CreditCardModelTextStyle(f fVar, e eVar) {
        this.f68856a = fVar;
        this.f68857b = eVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardModelTextStyle)) {
            return false;
        }
        CreditCardModelTextStyle creditCardModelTextStyle = (CreditCardModelTextStyle) obj2;
        return this.f68856a == creditCardModelTextStyle.f68856a && this.f68857b == creditCardModelTextStyle.f68857b;
    }

    public final int hashCode() {
        f fVar = this.f68856a;
        int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        e eVar = this.f68857b;
        return iHashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        f fVar = this.f68856a;
        if (fVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(fVar.name());
        }
        e eVar = this.f68857b;
        if (eVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(eVar.name());
        }
    }
}
