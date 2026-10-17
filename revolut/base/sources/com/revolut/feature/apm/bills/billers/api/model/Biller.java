package com.revolut.feature.apm.bills.billers.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/bills/billers/api/model/Biller;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "cm1/a", "Details", "feature_apm_bills_billers_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Biller implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Biller> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f61147c;
    public final cm1.a d;
    public final LocalDate e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f61148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f61149h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f61150j;
    public final Details k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/billers/api/model/Biller$Details;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_billers_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f61152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f61153c;
        public final boolean d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Details(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        public Details(String id10, String shortName, String str, String str2, boolean z) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(shortName, "shortName");
            this.f61151a = id10;
            this.f61152b = shortName;
            this.f61153c = str;
            this.d = z;
            this.e = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Details)) {
                return false;
            }
            Details details = (Details) obj2;
            return Intrinsics.f(this.f61151a, details.f61151a) && Intrinsics.f(this.f61152b, details.f61152b) && Intrinsics.f(this.f61153c, details.f61153c) && this.d == details.d && Intrinsics.f(this.e, details.e);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f61151a.hashCode() * 31, 31, this.f61152b);
            String str = this.f61153c;
            int iC2 = j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
            String str2 = this.e;
            return iC2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61151a);
            dest.writeString(this.f61152b);
            dest.writeString(this.f61153c);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeString(this.e);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            cm1.a aVarValueOf = parcel.readInt() == 0 ? null : cm1.a.valueOf(parcel.readString());
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            d dVar = (d) parcel.readSerializable();
            String string4 = parcel.readString();
            boolean z3 = false;
            boolean z4 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            return new Biller(string, string2, string3, aVarValueOf, localDate, dVar, string4, z4, z3, parcel.readInt() == 0 ? z : true, parcel.readInt() != 0 ? Details.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Biller[i];
        }
    }

    public Biller(String id10, String name, String str, cm1.a aVar, LocalDate localDate, d dVar, String str2, boolean z, boolean z3, boolean z4, Details details) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f61145a = id10;
        this.f61146b = name;
        this.f61147c = str;
        this.d = aVar;
        this.e = localDate;
        this.f = dVar;
        this.f61148g = str2;
        this.f61149h = z;
        this.i = z3;
        this.f61150j = z4;
        this.k = details;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Biller)) {
            return false;
        }
        Biller biller = (Biller) obj2;
        return Intrinsics.f(this.f61145a, biller.f61145a) && Intrinsics.f(this.f61146b, biller.f61146b) && Intrinsics.f(this.f61147c, biller.f61147c) && this.d == biller.d && Intrinsics.f(this.e, biller.e) && Intrinsics.f(this.f, biller.f) && Intrinsics.f(this.f61148g, biller.f61148g) && this.f61149h == biller.f61149h && this.i == biller.i && this.f61150j == biller.f61150j && Intrinsics.f(this.k, biller.k);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f61145a.hashCode() * 31, 31, this.f61146b);
        String str = this.f61147c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        cm1.a aVar = this.d;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        LocalDate localDate = this.e;
        int iHashCode3 = (iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        d dVar = this.f;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str2 = this.f61148g;
        int iC2 = j6.a.c(j6.a.c(j6.a.c((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f61149h), 31, this.i), 31, this.f61150j);
        Details details = this.k;
        return iC2 + (details != null ? details.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61145a);
        dest.writeString(this.f61146b);
        dest.writeString(this.f61147c);
        cm1.a aVar = this.d;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeString(this.f61148g);
        dest.writeInt(this.f61149h ? 1 : 0);
        dest.writeInt(this.i ? 1 : 0);
        dest.writeInt(this.f61150j ? 1 : 0);
        Details details = this.k;
        if (details == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            details.writeToParcel(dest, i);
        }
    }
}
