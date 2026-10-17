package com.revolut.feature.trading_asset_quotes.api.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading_asset_quotes/api/domain/models/FiatExchangeOrderQuote;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trading_asset_quotes_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FiatExchangeOrderQuote implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FiatExchangeOrderQuote> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f91686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Amount f91687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f91688c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            int iE2 = 0;
            while (iE2 != i) {
                iE2 = j6.a.e(FiatExchangeOrderQuote.class, parcel, arrayList, iE2, 1);
            }
            Amount amount = (Amount) parcel.readParcelable(FiatExchangeOrderQuote.class.getClassLoader());
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iE != i2) {
                iE = j6.a.e(FiatExchangeOrderQuote.class, parcel, arrayList2, iE, 1);
            }
            return new FiatExchangeOrderQuote(arrayList, amount, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FiatExchangeOrderQuote[i];
        }
    }

    public FiatExchangeOrderQuote(List quotes, Amount amount, List marginQuotes) {
        Intrinsics.checkNotNullParameter(quotes, "quotes");
        Intrinsics.checkNotNullParameter(marginQuotes, "marginQuotes");
        this.f91686a = quotes;
        this.f91687b = amount;
        this.f91688c = marginQuotes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FiatExchangeOrderQuote)) {
            return false;
        }
        FiatExchangeOrderQuote fiatExchangeOrderQuote = (FiatExchangeOrderQuote) obj2;
        return Intrinsics.f(this.f91686a, fiatExchangeOrderQuote.f91686a) && Intrinsics.f(this.f91687b, fiatExchangeOrderQuote.f91687b) && Intrinsics.f(this.f91688c, fiatExchangeOrderQuote.f91688c);
    }

    public final int hashCode() {
        int iHashCode = this.f91686a.hashCode() * 31;
        Amount amount = this.f91687b;
        return this.f91688c.hashCode() + ((iHashCode + (amount == null ? 0 : amount.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f91686a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeParcelable(this.f91687b, i);
        Iterator itV2 = p.a.v(this.f91688c, dest);
        while (itV2.hasNext()) {
            dest.writeParcelable((Parcelable) itV2.next(), i);
        }
    }
}
