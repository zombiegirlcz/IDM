package com.revolut.feature.card_screen.common.cards.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_screen/common/cards/models/CardsStateSnapshot$SubscriptionsContent", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardsStateSnapshot$SubscriptionsContent implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CardsStateSnapshot$SubscriptionsContent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f65370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f65371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f65372c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(CardsStateSnapshot$SubscriptionsContent.class, parcel, arrayList, iE, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i2 = parcel.readInt();
                arrayList2 = new ArrayList(i2);
                int iE2 = 0;
                while (iE2 != i2) {
                    iE2 = j6.a.e(CardsStateSnapshot$SubscriptionsContent.class, parcel, arrayList2, iE2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList3 = new ArrayList(i3);
                int iE3 = 0;
                while (iE3 != i3) {
                    iE3 = j6.a.e(CardsStateSnapshot$SubscriptionsContent.class, parcel, arrayList3, iE3, 1);
                }
            }
            return new CardsStateSnapshot$SubscriptionsContent(arrayList, arrayList2, arrayList3, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardsStateSnapshot$SubscriptionsContent[i];
        }
    }

    public CardsStateSnapshot$SubscriptionsContent(List list, List list2, List list3, boolean z) {
        this.f65370a = list;
        this.f65371b = list2;
        this.f65372c = list3;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardsStateSnapshot$SubscriptionsContent)) {
            return false;
        }
        CardsStateSnapshot$SubscriptionsContent cardsStateSnapshot$SubscriptionsContent = (CardsStateSnapshot$SubscriptionsContent) obj2;
        return Intrinsics.f(this.f65370a, cardsStateSnapshot$SubscriptionsContent.f65370a) && Intrinsics.f(this.f65371b, cardsStateSnapshot$SubscriptionsContent.f65371b) && Intrinsics.f(this.f65372c, cardsStateSnapshot$SubscriptionsContent.f65372c) && this.d == cardsStateSnapshot$SubscriptionsContent.d;
    }

    public final int hashCode() {
        List list = this.f65370a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f65371b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f65372c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List list = this.f65370a;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeParcelable((Parcelable) itQ.next(), i);
            }
        }
        List list2 = this.f65371b;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ2 = v0.a.q(dest, 1, list2);
            while (itQ2.hasNext()) {
                dest.writeParcelable((Parcelable) itQ2.next(), i);
            }
        }
        List list3 = this.f65372c;
        if (list3 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ3 = v0.a.q(dest, 1, list3);
            while (itQ3.hasNext()) {
                dest.writeParcelable((Parcelable) itQ3.next(), i);
            }
        }
        dest.writeInt(this.d ? 1 : 0);
    }
}
