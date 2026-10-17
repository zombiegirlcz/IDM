package com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.kompot.common.IOData$Input;
import e93.n;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pi3.h;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/CardPersonalisationControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardPersonalisationControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CardPersonalisationControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f65159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f65160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f65161c;
    public final c93.b d;
    public final h e;
    public final AccountId f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f65162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AnalyticsProduct f65163h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            n nVar = (n) parcel.readSerializable();
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            return new CardPersonalisationControllerContract$InputData(nVar, z3, parcel.readInt() == 0 ? z : true, (c93.b) parcel.readSerializable(), (h) parcel.readSerializable(), (AccountId) parcel.readParcelable(CardPersonalisationControllerContract$InputData.class.getClassLoader()), parcel.readString(), (AnalyticsProduct) parcel.readParcelable(CardPersonalisationControllerContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardPersonalisationControllerContract$InputData[i];
        }
    }

    public CardPersonalisationControllerContract$InputData(n customisation, boolean z, boolean z3, c93.b card, h hVar, AccountId accountId, String str, AnalyticsProduct automaticEventProduct) {
        Intrinsics.checkNotNullParameter(customisation, "customisation");
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        this.f65159a = customisation;
        this.f65160b = z;
        this.f65161c = z3;
        this.d = card;
        this.e = hVar;
        this.f = accountId;
        this.f65162g = str;
        this.f65163h = automaticEventProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardPersonalisationControllerContract$InputData)) {
            return false;
        }
        CardPersonalisationControllerContract$InputData cardPersonalisationControllerContract$InputData = (CardPersonalisationControllerContract$InputData) obj2;
        return Intrinsics.f(this.f65159a, cardPersonalisationControllerContract$InputData.f65159a) && this.f65160b == cardPersonalisationControllerContract$InputData.f65160b && this.f65161c == cardPersonalisationControllerContract$InputData.f65161c && Intrinsics.f(this.d, cardPersonalisationControllerContract$InputData.d) && Intrinsics.f(this.e, cardPersonalisationControllerContract$InputData.e) && Intrinsics.f(this.f, cardPersonalisationControllerContract$InputData.f) && Intrinsics.f(this.f65162g, cardPersonalisationControllerContract$InputData.f65162g) && Intrinsics.f(this.f65163h, cardPersonalisationControllerContract$InputData.f65163h);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + j6.a.c(j6.a.c(this.f65159a.hashCode() * 31, 31, this.f65160b), 31, this.f65161c)) * 31;
        h hVar = this.e;
        int iB = l.b(this.f, (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31, 31);
        String str = this.f65162g;
        return this.f65163h.hashCode() + ((iB + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f65159a);
        dest.writeInt(this.f65160b ? 1 : 0);
        dest.writeInt(this.f65161c ? 1 : 0);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeParcelable(this.f, i);
        dest.writeString(this.f65162g);
        dest.writeParcelable(this.f65163h, i);
    }
}
