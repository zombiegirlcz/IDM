package com.revolut.feature.credit.card.impl.ui.additional_cards.limit;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import h30.l;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import np4.e;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/credit/card/impl/ui/additional_cards/limit/AdditionalCardsChangeLimitScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "np4/e", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AdditionalCardsChangeLimitScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AdditionalCardsChangeLimitScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f69027c;
    public final d d;
    public final d e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f69028g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdditionalCardsChangeLimitScreenContract$InputData(parcel.readString(), parcel.readString(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (b) parcel.readSerializable(), e.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AdditionalCardsChangeLimitScreenContract$InputData[i];
        }
    }

    public AdditionalCardsChangeLimitScreenContract$InputData(String facilityId, String cardholderId, d dVar, d limitMin, d limitMax, b currency, e mode) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(cardholderId, "cardholderId");
        Intrinsics.checkNotNullParameter(limitMin, "limitMin");
        Intrinsics.checkNotNullParameter(limitMax, "limitMax");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f69025a = facilityId;
        this.f69026b = cardholderId;
        this.f69027c = dVar;
        this.d = limitMin;
        this.e = limitMax;
        this.f = currency;
        this.f69028g = mode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AdditionalCardsChangeLimitScreenContract$InputData)) {
            return false;
        }
        AdditionalCardsChangeLimitScreenContract$InputData additionalCardsChangeLimitScreenContract$InputData = (AdditionalCardsChangeLimitScreenContract$InputData) obj2;
        return Intrinsics.f(this.f69025a, additionalCardsChangeLimitScreenContract$InputData.f69025a) && Intrinsics.f(this.f69026b, additionalCardsChangeLimitScreenContract$InputData.f69026b) && Intrinsics.f(this.f69027c, additionalCardsChangeLimitScreenContract$InputData.f69027c) && Intrinsics.f(this.d, additionalCardsChangeLimitScreenContract$InputData.d) && Intrinsics.f(this.e, additionalCardsChangeLimitScreenContract$InputData.e) && Intrinsics.f(this.f, additionalCardsChangeLimitScreenContract$InputData.f) && this.f69028g == additionalCardsChangeLimitScreenContract$InputData.f69028g;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f69025a.hashCode() * 31, 31, this.f69026b);
        d dVar = this.f69027c;
        return this.f69028g.hashCode() + l.j(this.f, v7.c(v7.c((iC + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.d), 31, this.e), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69025a);
        dest.writeString(this.f69026b);
        dest.writeSerializable(this.f69027c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeString(this.f69028g.name());
    }
}
