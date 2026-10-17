package com.revolut.feature.credit.card.api.models.limit_history;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/limit_history/CreditCardLimitHistoryItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardLimitHistoryItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardLimitHistoryItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f68813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f68814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f68815c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardLimitHistoryItem((d) parcel.readSerializable(), (d) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardLimitHistoryItem[i];
        }
    }

    public CreditCardLimitHistoryItem(d amount, d dVar, LocalDate date) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(date, "date");
        this.f68813a = amount;
        this.f68814b = date;
        this.f68815c = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardLimitHistoryItem)) {
            return false;
        }
        CreditCardLimitHistoryItem creditCardLimitHistoryItem = (CreditCardLimitHistoryItem) obj2;
        return Intrinsics.f(this.f68813a, creditCardLimitHistoryItem.f68813a) && Intrinsics.f(this.f68814b, creditCardLimitHistoryItem.f68814b) && Intrinsics.f(this.f68815c, creditCardLimitHistoryItem.f68815c);
    }

    public final int hashCode() {
        int iA = y.a(this.f68813a.hashCode() * 31, 31, this.f68814b);
        d dVar = this.f68815c;
        return iA + (dVar == null ? 0 : dVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f68813a);
        dest.writeSerializable(this.f68814b);
        dest.writeSerializable(this.f68815c);
    }
}
