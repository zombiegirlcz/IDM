package com.revolut.retail.feature.esim.impl.ui.screens.country_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/country_picker/EsimCountryPickerScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "SelectCountry", "DisplayCountries", "SelectRegion", "SelectDestination", "Lcom/revolut/retail/feature/esim/impl/ui/screens/country_picker/EsimCountryPickerScreenContract$InputData$DisplayCountries;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/country_picker/EsimCountryPickerScreenContract$InputData$SelectCountry;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/country_picker/EsimCountryPickerScreenContract$InputData$SelectDestination;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/country_picker/EsimCountryPickerScreenContract$InputData$SelectRegion;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class EsimCountryPickerScreenContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/country_picker/EsimCountryPickerScreenContract$InputData$DisplayCountries;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/country_picker/EsimCountryPickerScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DisplayCountries extends EsimCountryPickerScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<DisplayCountries> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f100949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f100950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f100951c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new DisplayCountries((Clause) parcel.readParcelable(DisplayCountries.class.getClassLoader()), (Clause) parcel.readParcelable(DisplayCountries.class.getClassLoader()), arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DisplayCountries[i];
            }
        }

        public DisplayCountries(Clause title, Clause clause, List allCountries) {
            Intrinsics.checkNotNullParameter(allCountries, "allCountries");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f100949a = allCountries;
            this.f100950b = title;
            this.f100951c = clause;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DisplayCountries)) {
                return false;
            }
            DisplayCountries displayCountries = (DisplayCountries) obj2;
            return Intrinsics.f(this.f100949a, displayCountries.f100949a) && Intrinsics.f(this.f100950b, displayCountries.f100950b) && Intrinsics.f(this.f100951c, displayCountries.f100951c);
        }

        public final int hashCode() {
            int iA = p.a.a(this.f100949a.hashCode() * 31, 31, this.f100950b);
            Clause clause = this.f100951c;
            return iA + (clause == null ? 0 : clause.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f100949a, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            dest.writeParcelable(this.f100950b, i);
            dest.writeParcelable(this.f100951c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/country_picker/EsimCountryPickerScreenContract$InputData$SelectCountry;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/country_picker/EsimCountryPickerScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectCountry extends EsimCountryPickerScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<SelectCountry> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f100952a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(SelectCountry.class, parcel, arrayList, iE, 1);
                }
                return new SelectCountry(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectCountry[i];
            }
        }

        public SelectCountry(List allCountries) {
            Intrinsics.checkNotNullParameter(allCountries, "allCountries");
            this.f100952a = allCountries;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SelectCountry) && Intrinsics.f(this.f100952a, ((SelectCountry) obj2).f100952a);
        }

        public final int hashCode() {
            return this.f100952a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f100952a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/country_picker/EsimCountryPickerScreenContract$InputData$SelectDestination;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/country_picker/EsimCountryPickerScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectDestination extends EsimCountryPickerScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<SelectDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f100953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f100954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f100955c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                int iE2 = 0;
                while (iE2 != i) {
                    iE2 = j6.a.e(SelectDestination.class, parcel, arrayList, iE2, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iE3 = 0;
                while (iE3 != i2) {
                    iE3 = j6.a.e(SelectDestination.class, parcel, arrayList2, iE3, 1);
                }
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                while (iE != i3) {
                    iE = j6.a.e(SelectDestination.class, parcel, arrayList3, iE, 1);
                }
                return new SelectDestination(arrayList, arrayList2, arrayList3);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectDestination[i];
            }
        }

        public SelectDestination(List allCountries, List allRegions, List allGlobal) {
            Intrinsics.checkNotNullParameter(allCountries, "allCountries");
            Intrinsics.checkNotNullParameter(allRegions, "allRegions");
            Intrinsics.checkNotNullParameter(allGlobal, "allGlobal");
            this.f100953a = allCountries;
            this.f100954b = allRegions;
            this.f100955c = allGlobal;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SelectDestination)) {
                return false;
            }
            SelectDestination selectDestination = (SelectDestination) obj2;
            return Intrinsics.f(this.f100953a, selectDestination.f100953a) && Intrinsics.f(this.f100954b, selectDestination.f100954b) && Intrinsics.f(this.f100955c, selectDestination.f100955c);
        }

        public final int hashCode() {
            return this.f100955c.hashCode() + p.a.d(this.f100953a.hashCode() * 31, 31, this.f100954b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f100953a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            Iterator itV2 = p.a.v(this.f100954b, dest);
            while (itV2.hasNext()) {
                dest.writeParcelable((Parcelable) itV2.next(), i);
            }
            Iterator itV3 = p.a.v(this.f100955c, dest);
            while (itV3.hasNext()) {
                dest.writeParcelable((Parcelable) itV3.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/country_picker/EsimCountryPickerScreenContract$InputData$SelectRegion;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/country_picker/EsimCountryPickerScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectRegion extends EsimCountryPickerScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<SelectRegion> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f100956a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(SelectRegion.class, parcel, arrayList, iE, 1);
                }
                return new SelectRegion(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectRegion[i];
            }
        }

        public SelectRegion(List allRegions) {
            Intrinsics.checkNotNullParameter(allRegions, "allRegions");
            this.f100956a = allRegions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SelectRegion) && Intrinsics.f(this.f100956a, ((SelectRegion) obj2).f100956a);
        }

        public final int hashCode() {
            return this.f100956a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f100956a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    private EsimCountryPickerScreenContract$InputData() {
    }
}
