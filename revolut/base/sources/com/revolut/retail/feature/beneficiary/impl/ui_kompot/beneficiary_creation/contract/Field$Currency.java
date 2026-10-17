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
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/contract/Field$Currency", "", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Field$Currency implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Field$Currency> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f99726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f99727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f99728c;

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
            return new Field$Currency(bVar, z, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Field$Currency[i];
        }
    }

    public Field$Currency(b selectedCurrency, boolean z, Set availableCurrencies) {
        Intrinsics.checkNotNullParameter(selectedCurrency, "selectedCurrency");
        Intrinsics.checkNotNullParameter(availableCurrencies, "availableCurrencies");
        this.f99726a = selectedCurrency;
        this.f99727b = z;
        this.f99728c = availableCurrencies;
    }

    public static Field$Currency a(Field$Currency field$Currency, b selectedCurrency, Set availableCurrencies, int i) {
        boolean z = field$Currency.f99727b;
        if ((i & 4) != 0) {
            availableCurrencies = field$Currency.f99728c;
        }
        field$Currency.getClass();
        Intrinsics.checkNotNullParameter(selectedCurrency, "selectedCurrency");
        Intrinsics.checkNotNullParameter(availableCurrencies, "availableCurrencies");
        return new Field$Currency(selectedCurrency, z, availableCurrencies);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Field$Currency)) {
            return false;
        }
        Field$Currency field$Currency = (Field$Currency) obj2;
        return Intrinsics.f(this.f99726a, field$Currency.f99726a) && this.f99727b == field$Currency.f99727b && Intrinsics.f(this.f99728c, field$Currency.f99728c);
    }

    public final int hashCode() {
        return this.f99728c.hashCode() + j6.a.c(this.f99726a.hashCode() * 31, 31, this.f99727b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f99726a);
        dest.writeInt(this.f99727b ? 1 : 0);
        Iterator itV = n.v(this.f99728c, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
    }
}
