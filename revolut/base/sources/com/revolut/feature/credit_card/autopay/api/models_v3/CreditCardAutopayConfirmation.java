package com.revolut.feature.credit_card.autopay.api.models_v3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayConfirmation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_autopay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardAutopayConfirmation implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardAutopayConfirmation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.credit_card.autopay.api.models_v3.a f70696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f70698c;
    public final ArrayList d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            com.revolut.feature.credit_card.autopay.api.models_v3.a aVarValueOf = parcel.readInt() == 0 ? null : com.revolut.feature.credit_card.autopay.api.models_v3.a.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CreditCardAutopayConfirmationItem.CREATOR, parcel, arrayList, iA, 1);
            }
            return new CreditCardAutopayConfirmation(aVarValueOf, string, string2, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardAutopayConfirmation[i];
        }
    }

    public CreditCardAutopayConfirmation(com.revolut.feature.credit_card.autopay.api.models_v3.a aVar, String title, String str, ArrayList items, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f70696a = aVar;
        this.f70697b = title;
        this.f70698c = str;
        this.d = items;
        this.e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardAutopayConfirmation)) {
            return false;
        }
        CreditCardAutopayConfirmation creditCardAutopayConfirmation = (CreditCardAutopayConfirmation) obj2;
        return this.f70696a == creditCardAutopayConfirmation.f70696a && Intrinsics.f(this.f70697b, creditCardAutopayConfirmation.f70697b) && Intrinsics.f(this.f70698c, creditCardAutopayConfirmation.f70698c) && this.d.equals(creditCardAutopayConfirmation.d) && Intrinsics.f(this.e, creditCardAutopayConfirmation.e);
    }

    public final int hashCode() {
        com.revolut.feature.credit_card.autopay.api.models_v3.a aVar = this.f70696a;
        int iC = p.a.c((aVar == null ? 0 : aVar.hashCode()) * 31, 31, this.f70697b);
        String str = this.f70698c;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (iC + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.e;
        return iB + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        com.revolut.feature.credit_card.autopay.api.models_v3.a aVar = this.f70696a;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeString(this.f70697b);
        dest.writeString(this.f70698c);
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            ((CreditCardAutopayConfirmationItem) itY.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.e);
    }
}
