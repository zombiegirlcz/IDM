package com.revolut.feature.travel.flights.models.domain.booking;

import android.os.Parcel;
import android.os.Parcelable;
import ehe.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/booking/BookingPreviewParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BookingPreviewParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BookingPreviewParams> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PrimaryContact f93450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f93451c;
    public final Set d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            PrimaryContact primaryContactCreateFromParcel = PrimaryContact.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(TravellerDetails.CREATOR, parcel, arrayList, iA2, 1);
            }
            int i2 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i2);
            while (iA != i2) {
                iA = o.a(parcel, linkedHashSet, iA, 1);
            }
            return new BookingPreviewParams(string, primaryContactCreateFromParcel, arrayList, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BookingPreviewParams[i];
        }
    }

    public BookingPreviewParams(String itineraryOfferId, PrimaryContact primaryContact, List travellers, Set selectedExtraProductTokens) {
        Intrinsics.checkNotNullParameter(itineraryOfferId, "itineraryOfferId");
        Intrinsics.checkNotNullParameter(primaryContact, "primaryContact");
        Intrinsics.checkNotNullParameter(travellers, "travellers");
        Intrinsics.checkNotNullParameter(selectedExtraProductTokens, "selectedExtraProductTokens");
        this.f93449a = itineraryOfferId;
        this.f93450b = primaryContact;
        this.f93451c = travellers;
        this.d = selectedExtraProductTokens;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BookingPreviewParams)) {
            return false;
        }
        BookingPreviewParams bookingPreviewParams = (BookingPreviewParams) obj2;
        return Intrinsics.f(this.f93449a, bookingPreviewParams.f93449a) && Intrinsics.f(this.f93450b, bookingPreviewParams.f93450b) && Intrinsics.f(this.f93451c, bookingPreviewParams.f93451c) && Intrinsics.f(this.d, bookingPreviewParams.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d((this.f93450b.hashCode() + (this.f93449a.hashCode() * 31)) * 31, 31, this.f93451c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93449a);
        this.f93450b.writeToParcel(dest, i);
        Iterator itV = p.a.v(this.f93451c, dest);
        while (itV.hasNext()) {
            ((TravellerDetails) itV.next()).writeToParcel(dest, i);
        }
        Iterator itV2 = n.v(this.d, dest);
        while (itV2.hasNext()) {
            dest.writeString((String) itV2.next());
        }
    }
}
