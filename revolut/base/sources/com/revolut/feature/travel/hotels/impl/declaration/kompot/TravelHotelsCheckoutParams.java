package com.revolut.feature.travel.hotels.impl.declaration.kompot;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/declaration/kompot/TravelHotelsCheckoutParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsCheckoutParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsCheckoutParams> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f93652c;
    public final LocalDate d;
    public final List e;
    public final List f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            LocalDate localDate2 = (LocalDate) parcel.readSerializable();
            int iE = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iE2 = 0;
                while (iE2 != i) {
                    iE2 = j6.a.e(TravelHotelsCheckoutParams.class, parcel, arrayList, iE2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i2 = parcel.readInt();
                arrayList2 = new ArrayList(i2);
                while (iE != i2) {
                    iE = j6.a.e(TravelHotelsCheckoutParams.class, parcel, arrayList2, iE, 1);
                }
            }
            return new TravelHotelsCheckoutParams(string, string2, localDate, localDate2, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsCheckoutParams[i];
        }
    }

    public TravelHotelsCheckoutParams(String draftId, String propertyId, LocalDate localDate, LocalDate localDate2, List list, List list2) {
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        Intrinsics.checkNotNullParameter(propertyId, "propertyId");
        this.f93650a = draftId;
        this.f93651b = propertyId;
        this.f93652c = localDate;
        this.d = localDate2;
        this.e = list;
        this.f = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsCheckoutParams)) {
            return false;
        }
        TravelHotelsCheckoutParams travelHotelsCheckoutParams = (TravelHotelsCheckoutParams) obj2;
        return Intrinsics.f(this.f93650a, travelHotelsCheckoutParams.f93650a) && Intrinsics.f(this.f93651b, travelHotelsCheckoutParams.f93651b) && Intrinsics.f(this.f93652c, travelHotelsCheckoutParams.f93652c) && Intrinsics.f(this.d, travelHotelsCheckoutParams.d) && Intrinsics.f(this.e, travelHotelsCheckoutParams.e) && Intrinsics.f(this.f, travelHotelsCheckoutParams.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f93650a.hashCode() * 31, 31, this.f93651b);
        LocalDate localDate = this.f93652c;
        int iHashCode = (iC + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.d;
        int iHashCode2 = (iHashCode + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        List list = this.e;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93650a);
        dest.writeString(this.f93651b);
        dest.writeSerializable(this.f93652c);
        dest.writeSerializable(this.d);
        List list = this.e;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeParcelable((Parcelable) itQ.next(), i);
            }
        }
        List list2 = this.f;
        if (list2 == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ2 = v0.a.q(dest, 1, list2);
        while (itQ2.hasNext()) {
            dest.writeParcelable((Parcelable) itQ2.next(), i);
        }
    }

    public /* synthetic */ TravelHotelsCheckoutParams(String str, String str2) {
        this(str, str2, null, null, null, null);
    }
}
