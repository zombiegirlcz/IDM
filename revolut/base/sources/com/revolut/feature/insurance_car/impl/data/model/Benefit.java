package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nr7.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/Benefit;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Details", "KeyParam", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Benefit implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Benefit> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f75173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75174c;
    public final String d;
    public final Details e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f75175g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/Benefit$Details;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f75176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f75177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f75178c;
        public final ArrayList d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(KeyParam.CREATOR, parcel, arrayList, iA, 1);
                }
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iE != i2) {
                    iE = j6.a.e(Details.class, parcel, arrayList2, iE, 1);
                }
                return new Details(arrayList, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        public Details(ArrayList keyParams, List covered, List notCovered, ArrayList documents) {
            Intrinsics.checkNotNullParameter(keyParams, "keyParams");
            Intrinsics.checkNotNullParameter(covered, "covered");
            Intrinsics.checkNotNullParameter(notCovered, "notCovered");
            Intrinsics.checkNotNullParameter(documents, "documents");
            this.f75176a = keyParams;
            this.f75177b = covered;
            this.f75178c = notCovered;
            this.d = documents;
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
            return this.f75176a.equals(details.f75176a) && Intrinsics.f(this.f75177b, details.f75177b) && Intrinsics.f(this.f75178c, details.f75178c) && this.d.equals(details.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.d(p.a.d(this.f75176a.hashCode() * 31, 31, this.f75177b), 31, this.f75178c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f75176a, dest);
            while (itY.hasNext()) {
                ((KeyParam) itY.next()).writeToParcel(dest, i);
            }
            dest.writeStringList(this.f75177b);
            dest.writeStringList(this.f75178c);
            Iterator itY2 = j6.a.y(this.d, dest);
            while (itY2.hasNext()) {
                dest.writeParcelable((Parcelable) itY2.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/Benefit$KeyParam;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class KeyParam implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<KeyParam> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f75179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f75180b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f75181c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new KeyParam(parcel.readString(), parcel.readString(), b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new KeyParam[i];
            }
        }

        public KeyParam(String name, String value, b iconKey) {
            Intrinsics.checkNotNullParameter(iconKey, "iconKey");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f75179a = iconKey;
            this.f75180b = name;
            this.f75181c = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof KeyParam)) {
                return false;
            }
            KeyParam keyParam = (KeyParam) obj2;
            return this.f75179a == keyParam.f75179a && Intrinsics.f(this.f75180b, keyParam.f75180b) && Intrinsics.f(this.f75181c, keyParam.f75181c);
        }

        public final int hashCode() {
            return this.f75181c.hashCode() + p.a.c(this.f75179a.hashCode() * 31, 31, this.f75180b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75179a.name());
            dest.writeString(this.f75180b);
            dest.writeString(this.f75181c);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Benefit(parcel.readString(), b.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Details.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Benefit[i];
        }
    }

    public Benefit(String ref2, b iconKey, String name, String description, Details details, String str, boolean z) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(iconKey, "iconKey");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f75172a = ref2;
        this.f75173b = iconKey;
        this.f75174c = name;
        this.d = description;
        this.e = details;
        this.f = str;
        this.f75175g = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Benefit)) {
            return false;
        }
        Benefit benefit = (Benefit) obj2;
        return Intrinsics.f(this.f75172a, benefit.f75172a) && this.f75173b == benefit.f75173b && Intrinsics.f(this.f75174c, benefit.f75174c) && Intrinsics.f(this.d, benefit.d) && Intrinsics.f(this.e, benefit.e) && Intrinsics.f(this.f, benefit.f) && this.f75175g == benefit.f75175g;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c((this.f75173b.hashCode() + (this.f75172a.hashCode() * 31)) * 31, 31, this.f75174c), 31, this.d);
        Details details = this.e;
        int iHashCode = (iC + (details == null ? 0 : details.hashCode())) * 31;
        String str = this.f;
        return Boolean.hashCode(this.f75175g) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75172a);
        dest.writeString(this.f75173b.name());
        dest.writeString(this.f75174c);
        dest.writeString(this.d);
        Details details = this.e;
        if (details == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            details.writeToParcel(dest, i);
        }
        dest.writeString(this.f);
        dest.writeInt(this.f75175g ? 1 : 0);
    }
}
