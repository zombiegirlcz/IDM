package com.revolut.feature.tax_residency.impl.screens.tin;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/tax_residency/impl/screens/tin/TaxNumberInputScreenContract$DomainDataItem", "Landroid/os/Parcelable;", "UserName", "Tin", "Postcode", "TaxRegime", "Lcom/revolut/feature/tax_residency/impl/screens/tin/TaxNumberInputScreenContract$DomainDataItem$Postcode;", "Lcom/revolut/feature/tax_residency/impl/screens/tin/TaxNumberInputScreenContract$DomainDataItem$TaxRegime;", "Lcom/revolut/feature/tax_residency/impl/screens/tin/TaxNumberInputScreenContract$DomainDataItem$Tin;", "Lcom/revolut/feature/tax_residency/impl/screens/tin/TaxNumberInputScreenContract$DomainDataItem$UserName;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TaxNumberInputScreenContract$DomainDataItem implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/screens/tin/TaxNumberInputScreenContract$DomainDataItem$Postcode;", "Lcom/revolut/feature/tax_residency/impl/screens/tin/TaxNumberInputScreenContract$DomainDataItem;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Postcode extends TaxNumberInputScreenContract$DomainDataItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f90111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f90112c;

        @NotNull
        public static final Parcelable.Creator<Postcode> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Postcode(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Postcode[i];
            }
        }

        public Postcode(String value, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f90110a = value;
            this.f90111b = z;
            this.f90112c = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Postcode)) {
                return false;
            }
            Postcode postcode = (Postcode) obj2;
            return Intrinsics.f(this.f90110a, postcode.f90110a) && this.f90111b == postcode.f90111b && this.f90112c == postcode.f90112c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f90112c) + j6.a.c(this.f90110a.hashCode() * 31, 31, this.f90111b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90110a);
            dest.writeInt(this.f90111b ? 1 : 0);
            dest.writeInt(this.f90112c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/screens/tin/TaxNumberInputScreenContract$DomainDataItem$TaxRegime;", "Lcom/revolut/feature/tax_residency/impl/screens/tin/TaxNumberInputScreenContract$DomainDataItem;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxRegime extends TaxNumberInputScreenContract$DomainDataItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f90113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f90114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f90115c;
        public final boolean d;

        @NotNull
        public static final Parcelable.Creator<TaxRegime> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxRegime(parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxRegime[i];
            }
        }

        public TaxRegime(String selected, List regimes, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(regimes, "regimes");
            Intrinsics.checkNotNullParameter(selected, "selected");
            this.f90113a = regimes;
            this.f90114b = selected;
            this.f90115c = z;
            this.d = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TaxRegime)) {
                return false;
            }
            TaxRegime taxRegime = (TaxRegime) obj2;
            return Intrinsics.f(this.f90113a, taxRegime.f90113a) && Intrinsics.f(this.f90114b, taxRegime.f90114b) && this.f90115c == taxRegime.f90115c && this.d == taxRegime.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + j6.a.c(p.a.c(this.f90113a.hashCode() * 31, 31, this.f90114b), 31, this.f90115c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeStringList(this.f90113a);
            dest.writeString(this.f90114b);
            dest.writeInt(this.f90115c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/screens/tin/TaxNumberInputScreenContract$DomainDataItem$Tin;", "Lcom/revolut/feature/tax_residency/impl/screens/tin/TaxNumberInputScreenContract$DomainDataItem;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Tin extends TaxNumberInputScreenContract$DomainDataItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f90117b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f90118c;
        public final boolean d;
        public final boolean e;

        @NotNull
        public static final Parcelable.Creator<Tin> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                boolean z4 = false;
                boolean z6 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = true;
                    z6 = z;
                }
                if (parcel.readInt() == 0) {
                    z3 = z;
                }
                return new Tin(string, string2, z4, z6, z3);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Tin[i];
            }
        }

        public Tin(String formattedValue, String extractedValue, boolean z, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
            Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
            this.f90116a = formattedValue;
            this.f90117b = extractedValue;
            this.f90118c = z;
            this.d = z3;
            this.e = z4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Tin)) {
                return false;
            }
            Tin tin = (Tin) obj2;
            return Intrinsics.f(this.f90116a, tin.f90116a) && Intrinsics.f(this.f90117b, tin.f90117b) && this.f90118c == tin.f90118c && this.d == tin.d && this.e == tin.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(p.a.c(this.f90116a.hashCode() * 31, 31, this.f90117b), 31, this.f90118c), 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90116a);
            dest.writeString(this.f90117b);
            dest.writeInt(this.f90118c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeInt(this.e ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/screens/tin/TaxNumberInputScreenContract$DomainDataItem$UserName;", "Lcom/revolut/feature/tax_residency/impl/screens/tin/TaxNumberInputScreenContract$DomainDataItem;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UserName extends TaxNumberInputScreenContract$DomainDataItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f90120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f90121c;

        @NotNull
        public static final Parcelable.Creator<UserName> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UserName(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UserName[i];
            }
        }

        public UserName(String value, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f90119a = value;
            this.f90120b = z;
            this.f90121c = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UserName)) {
                return false;
            }
            UserName userName = (UserName) obj2;
            return Intrinsics.f(this.f90119a, userName.f90119a) && this.f90120b == userName.f90120b && this.f90121c == userName.f90121c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f90121c) + j6.a.c(this.f90119a.hashCode() * 31, 31, this.f90120b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90119a);
            dest.writeInt(this.f90120b ? 1 : 0);
            dest.writeInt(this.f90121c ? 1 : 0);
        }
    }
}
