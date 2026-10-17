package com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract;

import android.os.Parcel;
import android.os.Parcelable;
import ehe.n;
import ip0.v7;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/contract/Field$Country", "", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Field$Country implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Field$Country> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f99723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f99724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f99725c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVar = (b) parcel.readSerializable();
            int iD = 0;
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            while (iD != i) {
                iD = v7.d(parcel, linkedHashSet, iD, 1);
            }
            return new Field$Country(linkedHashSet, bVar, z);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Field$Country[i];
        }
    }

    public Field$Country(Set availableCountries, b selectedCountry, boolean z) {
        Intrinsics.checkNotNullParameter(selectedCountry, "selectedCountry");
        Intrinsics.checkNotNullParameter(availableCountries, "availableCountries");
        this.f99723a = selectedCountry;
        this.f99724b = z;
        this.f99725c = availableCountries;
    }

    public static Field$Country a(Field$Country field$Country, b selectedCountry) {
        boolean z = field$Country.f99724b;
        Set availableCountries = field$Country.f99725c;
        field$Country.getClass();
        Intrinsics.checkNotNullParameter(selectedCountry, "selectedCountry");
        Intrinsics.checkNotNullParameter(availableCountries, "availableCountries");
        return new Field$Country(availableCountries, selectedCountry, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Field$Country)) {
            return false;
        }
        Field$Country field$Country = (Field$Country) obj2;
        return Intrinsics.f(this.f99723a, field$Country.f99723a) && this.f99724b == field$Country.f99724b && Intrinsics.f(this.f99725c, field$Country.f99725c);
    }

    public final int hashCode() {
        return this.f99725c.hashCode() + j6.a.c(this.f99723a.f297794a.hashCode() * 31, 31, this.f99724b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f99723a);
        dest.writeInt(this.f99724b ? 1 : 0);
        Iterator itV = n.v(this.f99725c, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
    }
}
