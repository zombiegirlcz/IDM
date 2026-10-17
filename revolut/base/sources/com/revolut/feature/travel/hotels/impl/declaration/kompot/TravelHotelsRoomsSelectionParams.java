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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/declaration/kompot/TravelHotelsRoomsSelectionParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsRoomsSelectionParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsRoomsSelectionParams> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f93665c;
    public final LocalDate d;
    public final List e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            LocalDate localDate2 = (LocalDate) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(TravelHotelsRoomsSelectionParams.class, parcel, arrayList2, iE, 1);
                }
                arrayList = arrayList2;
            }
            return new TravelHotelsRoomsSelectionParams(string, string2, localDate, localDate2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsRoomsSelectionParams[i];
        }
    }

    public TravelHotelsRoomsSelectionParams(String draftId, String propertyId, LocalDate localDate, LocalDate localDate2, List list) {
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        Intrinsics.checkNotNullParameter(propertyId, "propertyId");
        this.f93663a = draftId;
        this.f93664b = propertyId;
        this.f93665c = localDate;
        this.d = localDate2;
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsRoomsSelectionParams)) {
            return false;
        }
        TravelHotelsRoomsSelectionParams travelHotelsRoomsSelectionParams = (TravelHotelsRoomsSelectionParams) obj2;
        return Intrinsics.f(this.f93663a, travelHotelsRoomsSelectionParams.f93663a) && Intrinsics.f(this.f93664b, travelHotelsRoomsSelectionParams.f93664b) && Intrinsics.f(this.f93665c, travelHotelsRoomsSelectionParams.f93665c) && Intrinsics.f(this.d, travelHotelsRoomsSelectionParams.d) && Intrinsics.f(this.e, travelHotelsRoomsSelectionParams.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f93663a.hashCode() * 31, 31, this.f93664b);
        LocalDate localDate = this.f93665c;
        int iHashCode = (iC + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.d;
        int iHashCode2 = (iHashCode + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        List list = this.e;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93663a);
        dest.writeString(this.f93664b);
        dest.writeSerializable(this.f93665c);
        dest.writeSerializable(this.d);
        List list = this.e;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            dest.writeParcelable((Parcelable) itQ.next(), i);
        }
    }

    public /* synthetic */ TravelHotelsRoomsSelectionParams(String str, String str2) {
        this(str, str2, null, null, null);
    }
}
