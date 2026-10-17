package com.revolut.feature.credit.card.api.models.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardDialogModel;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardDialogModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardDialogModel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f68842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f68843c;
    public final List d;
    public final CreditCardButtonsModel e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CreditCardSectionModel.CREATOR, parcel, arrayList, iA, 1);
            }
            return new CreditCardDialogModel(string, string2, string3, arrayList, parcel.readInt() == 0 ? null : CreditCardButtonsModel.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardDialogModel[i];
        }
    }

    public CreditCardDialogModel(String title, String str, String str2, List sections, CreditCardButtonsModel creditCardButtonsModel) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f68841a = title;
        this.f68842b = str;
        this.f68843c = str2;
        this.d = sections;
        this.e = creditCardButtonsModel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardDialogModel)) {
            return false;
        }
        CreditCardDialogModel creditCardDialogModel = (CreditCardDialogModel) obj2;
        return Intrinsics.f(this.f68841a, creditCardDialogModel.f68841a) && Intrinsics.f(this.f68842b, creditCardDialogModel.f68842b) && Intrinsics.f(this.f68843c, creditCardDialogModel.f68843c) && Intrinsics.f(this.d, creditCardDialogModel.d) && Intrinsics.f(this.e, creditCardDialogModel.e);
    }

    public final int hashCode() {
        int iHashCode = this.f68841a.hashCode() * 31;
        String str = this.f68842b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f68843c;
        int iD = p.a.d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        CreditCardButtonsModel creditCardButtonsModel = this.e;
        return iD + (creditCardButtonsModel != null ? creditCardButtonsModel.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68841a);
        dest.writeString(this.f68842b);
        dest.writeString(this.f68843c);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            ((CreditCardSectionModel) itV.next()).writeToParcel(dest, i);
        }
        CreditCardButtonsModel creditCardButtonsModel = this.e;
        if (creditCardButtonsModel == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            creditCardButtonsModel.writeToParcel(dest, i);
        }
    }
}
