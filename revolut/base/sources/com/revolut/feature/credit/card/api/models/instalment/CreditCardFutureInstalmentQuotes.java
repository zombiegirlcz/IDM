package com.revolut.feature.credit.card.api.models.instalment;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/instalment/CreditCardFutureInstalmentQuotes;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardFutureInstalmentQuotes implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardFutureInstalmentQuotes> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f68773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f68774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f68775c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CreditCardFutureInstalmentQuote.CREATOR, parcel, arrayList, iA, 1);
            }
            return new CreditCardFutureInstalmentQuotes(arrayList, (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardFutureInstalmentQuotes[i];
        }
    }

    public CreditCardFutureInstalmentQuotes(List repaidInstalments, LocalDate nextMaturingDate, LocalDate previousLastMaturingDate) {
        Intrinsics.checkNotNullParameter(repaidInstalments, "repaidInstalments");
        Intrinsics.checkNotNullParameter(nextMaturingDate, "nextMaturingDate");
        Intrinsics.checkNotNullParameter(previousLastMaturingDate, "previousLastMaturingDate");
        this.f68773a = repaidInstalments;
        this.f68774b = nextMaturingDate;
        this.f68775c = previousLastMaturingDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardFutureInstalmentQuotes)) {
            return false;
        }
        CreditCardFutureInstalmentQuotes creditCardFutureInstalmentQuotes = (CreditCardFutureInstalmentQuotes) obj2;
        return Intrinsics.f(this.f68773a, creditCardFutureInstalmentQuotes.f68773a) && Intrinsics.f(this.f68774b, creditCardFutureInstalmentQuotes.f68774b) && Intrinsics.f(this.f68775c, creditCardFutureInstalmentQuotes.f68775c);
    }

    public final int hashCode() {
        return this.f68775c.hashCode() + y.a(this.f68773a.hashCode() * 31, 31, this.f68774b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f68773a, dest);
        while (itV.hasNext()) {
            ((CreditCardFutureInstalmentQuote) itV.next()).writeToParcel(dest, i);
        }
        dest.writeSerializable(this.f68774b);
        dest.writeSerializable(this.f68775c);
    }
}
