package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsValueReminderActionConfirmation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsValueReminderActionConfirmation implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsValueReminderActionConfirmation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f82451c;
    public final List d;
    public final CobrandedCardsValueReminderActionConfirmationAction e;
    public final CobrandedCardsValueReminderActionConfirmationAction f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int iA = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iA2 = 0;
                while (iA2 != i) {
                    iA2 = org.bouncycastle.jcajce.provider.digest.a.a(CobrandedCardsValueReminderActionConfirmationItem.CREATOR, parcel, arrayList, iA2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i2 = parcel.readInt();
                arrayList2 = new ArrayList(i2);
                while (iA != i2) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(CobrandedCardsValueReminderActionConfirmationSection.CREATOR, parcel, arrayList2, iA, 1);
                }
            }
            return new CobrandedCardsValueReminderActionConfirmation(string, string2, arrayList, arrayList2, parcel.readInt() == 0 ? null : CobrandedCardsValueReminderActionConfirmationAction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CobrandedCardsValueReminderActionConfirmationAction.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsValueReminderActionConfirmation[i];
        }
    }

    public CobrandedCardsValueReminderActionConfirmation(String title, String str, ArrayList arrayList, ArrayList arrayList2, CobrandedCardsValueReminderActionConfirmationAction cobrandedCardsValueReminderActionConfirmationAction, CobrandedCardsValueReminderActionConfirmationAction cobrandedCardsValueReminderActionConfirmationAction2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f82449a = title;
        this.f82450b = str;
        this.f82451c = arrayList;
        this.d = arrayList2;
        this.e = cobrandedCardsValueReminderActionConfirmationAction;
        this.f = cobrandedCardsValueReminderActionConfirmationAction2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsValueReminderActionConfirmation)) {
            return false;
        }
        CobrandedCardsValueReminderActionConfirmation cobrandedCardsValueReminderActionConfirmation = (CobrandedCardsValueReminderActionConfirmation) obj2;
        return Intrinsics.f(this.f82449a, cobrandedCardsValueReminderActionConfirmation.f82449a) && Intrinsics.f(this.f82450b, cobrandedCardsValueReminderActionConfirmation.f82450b) && Intrinsics.f(this.f82451c, cobrandedCardsValueReminderActionConfirmation.f82451c) && Intrinsics.f(this.d, cobrandedCardsValueReminderActionConfirmation.d) && Intrinsics.f(this.e, cobrandedCardsValueReminderActionConfirmation.e) && Intrinsics.f(this.f, cobrandedCardsValueReminderActionConfirmation.f);
    }

    public final int hashCode() {
        int iHashCode = this.f82449a.hashCode() * 31;
        String str = this.f82450b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f82451c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        CobrandedCardsValueReminderActionConfirmationAction cobrandedCardsValueReminderActionConfirmationAction = this.e;
        int iHashCode5 = (iHashCode4 + (cobrandedCardsValueReminderActionConfirmationAction == null ? 0 : cobrandedCardsValueReminderActionConfirmationAction.hashCode())) * 31;
        CobrandedCardsValueReminderActionConfirmationAction cobrandedCardsValueReminderActionConfirmationAction2 = this.f;
        return iHashCode5 + (cobrandedCardsValueReminderActionConfirmationAction2 != null ? cobrandedCardsValueReminderActionConfirmationAction2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82449a);
        dest.writeString(this.f82450b);
        List list = this.f82451c;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((CobrandedCardsValueReminderActionConfirmationItem) itQ.next()).writeToParcel(dest, i);
            }
        }
        List list2 = this.d;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ2 = v0.a.q(dest, 1, list2);
            while (itQ2.hasNext()) {
                ((CobrandedCardsValueReminderActionConfirmationSection) itQ2.next()).writeToParcel(dest, i);
            }
        }
        CobrandedCardsValueReminderActionConfirmationAction cobrandedCardsValueReminderActionConfirmationAction = this.e;
        if (cobrandedCardsValueReminderActionConfirmationAction == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsValueReminderActionConfirmationAction.writeToParcel(dest, i);
        }
        CobrandedCardsValueReminderActionConfirmationAction cobrandedCardsValueReminderActionConfirmationAction2 = this.f;
        if (cobrandedCardsValueReminderActionConfirmationAction2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsValueReminderActionConfirmationAction2.writeToParcel(dest, i);
        }
    }
}
