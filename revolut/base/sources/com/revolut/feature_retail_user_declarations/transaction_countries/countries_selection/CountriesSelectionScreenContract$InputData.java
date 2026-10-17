package com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_retail_user_declarations.transaction_countries.models.TransactionDestination;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_retail_user_declarations/transaction_countries/countries_selection/CountriesSelectionScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CountriesSelectionScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CountriesSelectionScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f97758c;
    public final boolean d;
    public final ArrayList e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f97759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f97760h;
    public final Set i;

    public static final class a implements Parcelable.Creator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            boolean z3 = parcel.readInt() != 0 ? i : 0;
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iC = 0;
            while (iC != i2) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, i);
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            int iC2 = 0;
            while (iC2 != i3) {
                iC2 = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC2, i);
            }
            b bVar = (b) parcel.readSerializable();
            boolean z4 = parcel.readInt() != 0 ? i : 0;
            int i5 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                linkedHashSet.add(TransactionDestination.CREATOR.createFromParcel(parcel));
            }
            return new CountriesSelectionScreenContract$InputData(string, string2, z, z3, arrayList, arrayList2, bVar, z4, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CountriesSelectionScreenContract$InputData[i];
        }
    }

    public CountriesSelectionScreenContract$InputData(String title, String subtitle, boolean z, boolean z3, ArrayList suggestedCountries, ArrayList allCountries, b currentCountry, boolean z4, Set preselectedTransactionDestinations) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(suggestedCountries, "suggestedCountries");
        Intrinsics.checkNotNullParameter(allCountries, "allCountries");
        Intrinsics.checkNotNullParameter(currentCountry, "currentCountry");
        Intrinsics.checkNotNullParameter(preselectedTransactionDestinations, "preselectedTransactionDestinations");
        this.f97756a = title;
        this.f97757b = subtitle;
        this.f97758c = z;
        this.d = z3;
        this.e = suggestedCountries;
        this.f = allCountries;
        this.f97759g = currentCountry;
        this.f97760h = z4;
        this.i = preselectedTransactionDestinations;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CountriesSelectionScreenContract$InputData)) {
            return false;
        }
        CountriesSelectionScreenContract$InputData countriesSelectionScreenContract$InputData = (CountriesSelectionScreenContract$InputData) obj2;
        return Intrinsics.f(this.f97756a, countriesSelectionScreenContract$InputData.f97756a) && Intrinsics.f(this.f97757b, countriesSelectionScreenContract$InputData.f97757b) && this.f97758c == countriesSelectionScreenContract$InputData.f97758c && this.d == countriesSelectionScreenContract$InputData.d && this.e.equals(countriesSelectionScreenContract$InputData.e) && this.f.equals(countriesSelectionScreenContract$InputData.f) && Intrinsics.f(this.f97759g, countriesSelectionScreenContract$InputData.f97759g) && this.f97760h == countriesSelectionScreenContract$InputData.f97760h && Intrinsics.f(this.i, countriesSelectionScreenContract$InputData.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + j6.a.c(p.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, j6.a.c(j6.a.c(p.a.c(this.f97756a.hashCode() * 31, 31, this.f97757b), 31, this.f97758c), 31, this.d), 31), 31), 31, this.f97759g.f297794a), 31, this.f97760h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97756a);
        dest.writeString(this.f97757b);
        dest.writeInt(this.f97758c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
        Iterator itY = j6.a.y(this.e, dest);
        while (itY.hasNext()) {
            dest.writeSerializable((Serializable) itY.next());
        }
        Iterator itY2 = j6.a.y(this.f, dest);
        while (itY2.hasNext()) {
            dest.writeSerializable((Serializable) itY2.next());
        }
        dest.writeSerializable(this.f97759g);
        dest.writeInt(this.f97760h ? 1 : 0);
        Iterator itV = n.v(this.i, dest);
        while (itV.hasNext()) {
            ((TransactionDestination) itV.next()).writeToParcel(dest, i);
        }
    }
}
