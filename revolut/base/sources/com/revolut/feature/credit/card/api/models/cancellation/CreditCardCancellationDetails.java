package com.revolut.feature.credit.card.api.models.cancellation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardCellModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/cancellation/CreditCardCancellationDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardCancellationDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardCancellationDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f68708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f68709c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CreditCardCellModel.CREATOR, parcel, arrayList, iA, 1);
            }
            return new CreditCardCancellationDetails(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardCancellationDetails[i];
        }
    }

    public CreditCardCancellationDetails(String title, String description, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f68707a = title;
        this.f68708b = description;
        this.f68709c = items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardCancellationDetails)) {
            return false;
        }
        CreditCardCancellationDetails creditCardCancellationDetails = (CreditCardCancellationDetails) obj2;
        return Intrinsics.f(this.f68707a, creditCardCancellationDetails.f68707a) && Intrinsics.f(this.f68708b, creditCardCancellationDetails.f68708b) && this.f68709c.equals(creditCardCancellationDetails.f68709c);
    }

    public final int hashCode() {
        return this.f68709c.hashCode() + p.a.c(this.f68707a.hashCode() * 31, 31, this.f68708b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68707a);
        dest.writeString(this.f68708b);
        Iterator itY = j6.a.y(this.f68709c, dest);
        while (itY.hasNext()) {
            ((CreditCardCellModel) itY.next()).writeToParcel(dest, i);
        }
    }
}
