package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/PhoneInputItem;", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "", "toString", "()Ljava/lang/String;", "Country", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PhoneInputItem implements InputItem {

    @NotNull
    public static final Parcelable.Creator<PhoneInputItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63571c;
    public final String d;
    public final String e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f63572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wi0.b f63573h;
    public final List i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/PhoneInputItem$Country;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Country implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Country> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f63574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f63575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f63576c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Country(((fj0.b) parcel.readSerializable()).f135518a, parcel.readString(), (wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Country[i];
            }
        }

        public Country(int i, String str, wi0.b code) {
            Intrinsics.checkNotNullParameter(code, "code");
            this.f63574a = code;
            this.f63575b = i;
            this.f63576c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Country)) {
                return false;
            }
            Country country = (Country) obj2;
            return Intrinsics.f(this.f63574a, country.f63574a) && this.f63575b == country.f63575b && Intrinsics.f(this.f63576c, country.f63576c);
        }

        public final int hashCode() {
            int iB = j6.a.b(this.f63575b, this.f63574a.f297794a.hashCode() * 31, 31);
            String str = this.f63576c;
            return iB + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f63574a);
            dest.writeSerializable(new fj0.b(this.f63575b));
            dest.writeString(this.f63576c);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int iA = 0;
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i2 = ((fj0.b) parcel.readSerializable()).f135518a;
            String string5 = parcel.readString();
            wi0.b bVar = (wi0.b) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                while (iA != i3) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Country.CREATOR, parcel, arrayList2, iA, i);
                }
                arrayList = arrayList2;
            }
            return new PhoneInputItem(string, z, string2, string3, string4, i2, string5, bVar, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PhoneInputItem[i];
        }
    }

    public PhoneInputItem(String id10, boolean z, String str, String str2, String str3, int i, String str4, wi0.b country, List list) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(country, "country");
        this.f63569a = id10;
        this.f63570b = z;
        this.f63571c = str;
        this.d = str2;
        this.e = str3;
        this.f = i;
        this.f63572g = str4;
        this.f63573h = country;
        this.i = list;
    }

    public static PhoneInputItem d(PhoneInputItem phoneInputItem, int i, String str, wi0.b bVar, int i2) {
        String id10 = phoneInputItem.f63569a;
        boolean z = phoneInputItem.f63570b;
        String str2 = phoneInputItem.f63571c;
        String str3 = phoneInputItem.d;
        String str4 = phoneInputItem.e;
        if ((i2 & 32) != 0) {
            i = phoneInputItem.f;
        }
        int i3 = i;
        if ((i2 & 64) != 0) {
            str = phoneInputItem.f63572g;
        }
        String str5 = str;
        if ((i2 & 128) != 0) {
            bVar = phoneInputItem.f63573h;
        }
        wi0.b country = bVar;
        List list = phoneInputItem.i;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(country, "country");
        return new PhoneInputItem(id10, z, str2, str3, str4, i3, str5, country, list);
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63569a() {
        return this.f63569a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF63570b() {
        return this.f63570b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PhoneInputItem)) {
            return false;
        }
        PhoneInputItem phoneInputItem = (PhoneInputItem) obj2;
        return Intrinsics.f(this.f63569a, phoneInputItem.f63569a) && this.f63570b == phoneInputItem.f63570b && Intrinsics.f(this.f63571c, phoneInputItem.f63571c) && Intrinsics.f(this.d, phoneInputItem.d) && Intrinsics.f(this.e, phoneInputItem.e) && this.f == phoneInputItem.f && Intrinsics.f(this.f63572g, phoneInputItem.f63572g) && Intrinsics.f(this.f63573h, phoneInputItem.f63573h) && Intrinsics.f(this.i, phoneInputItem.i);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63569a;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f63569a.hashCode() * 31, 31, this.f63570b);
        String str = this.f63571c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iB = j6.a.b(this.f, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.f63572g;
        int iC2 = p.a.c((iB + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f63573h.f297794a);
        List list = this.i;
        return iC2 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63569a);
        dest.writeInt(this.f63570b ? 1 : 0);
        dest.writeString(this.f63571c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeSerializable(new fj0.b(this.f));
        dest.writeString(this.f63572g);
        dest.writeSerializable(this.f63573h);
        List list = this.i;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            ((Country) itQ.next()).writeToParcel(dest, i);
        }
    }
}
