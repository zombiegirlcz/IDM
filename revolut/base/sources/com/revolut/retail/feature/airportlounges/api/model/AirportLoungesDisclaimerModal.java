package com.revolut.retail.feature.airportlounges.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.hyper_text.model.ParameterisedHyperText;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/api/model/AirportLoungesDisclaimerModal;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AirportLoungesDisclaimerModal implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AirportLoungesDisclaimerModal> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParameterisedHyperText f98919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f98920c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            ParameterisedHyperText parameterisedHyperText = (ParameterisedHyperText) parcel.readParcelable(AirportLoungesDisclaimerModal.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(AirportLoungesDisclaimerItem.CREATOR, parcel, arrayList, iA, 1);
            }
            return new AirportLoungesDisclaimerModal(string, parameterisedHyperText, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AirportLoungesDisclaimerModal[i];
        }
    }

    public AirportLoungesDisclaimerModal(String title, ParameterisedHyperText description, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f98918a = title;
        this.f98919b = description;
        this.f98920c = items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AirportLoungesDisclaimerModal)) {
            return false;
        }
        AirportLoungesDisclaimerModal airportLoungesDisclaimerModal = (AirportLoungesDisclaimerModal) obj2;
        return Intrinsics.f(this.f98918a, airportLoungesDisclaimerModal.f98918a) && Intrinsics.f(this.f98919b, airportLoungesDisclaimerModal.f98919b) && this.f98920c.equals(airportLoungesDisclaimerModal.f98920c);
    }

    public final int hashCode() {
        return this.f98920c.hashCode() + ((this.f98919b.f74758a.hashCode() + (this.f98918a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98918a);
        dest.writeParcelable(this.f98919b, i);
        Iterator itY = j6.a.y(this.f98920c, dest);
        while (itY.hasNext()) {
            ((AirportLoungesDisclaimerItem) itY.next()).writeToParcel(dest, i);
        }
    }
}
