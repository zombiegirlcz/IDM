package com.revolut.feature.transport.models.fields;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transport/models/fields/TransportCheckoutDropdownField;", "Lcom/revolut/feature/transport/models/fields/TransportCheckoutField;", "", "toString", "()Ljava/lang/String;", "Option", "feature_transport_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransportCheckoutDropdownField extends TransportCheckoutField {

    @NotNull
    public static final Parcelable.Creator<TransportCheckoutDropdownField> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92616c;
    public final boolean d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f92617g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/models/fields/TransportCheckoutDropdownField$Option;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_transport_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Option implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Option> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f92619b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Option(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Option[i];
            }
        }

        public Option(String value, String label) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(label, "label");
            this.f92618a = value;
            this.f92619b = label;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Option)) {
                return false;
            }
            Option option = (Option) obj2;
            return Intrinsics.f(this.f92618a, option.f92618a) && Intrinsics.f(this.f92619b, option.f92619b);
        }

        public final int hashCode() {
            return this.f92619b.hashCode() + (this.f92618a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92618a);
            dest.writeString(this.f92619b);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int iA = 0;
            boolean z = parcel.readInt() != 0;
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Option.CREATOR, parcel, arrayList, iA, 1);
            }
            return new TransportCheckoutDropdownField(string, string2, arrayList, string3, string4, string5, z);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransportCheckoutDropdownField[i];
        }
    }

    public TransportCheckoutDropdownField(String id10, String code, List options, String label, String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f92614a = id10;
        this.f92615b = code;
        this.f92616c = label;
        this.d = z;
        this.e = str;
        this.f = str2;
        this.f92617g = options;
    }

    @Override // com.revolut.feature.transport.models.fields.TransportCheckoutField
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getE() {
        return this.e;
    }

    @Override // com.revolut.feature.transport.models.fields.TransportCheckoutField
    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getD() {
        return this.d;
    }

    @Override // com.revolut.feature.transport.models.fields.TransportCheckoutField
    public final boolean c(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        List list = this.f92617g;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (Intrinsics.f(((Option) it8.next()).f92618a, input)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransportCheckoutDropdownField)) {
            return false;
        }
        TransportCheckoutDropdownField transportCheckoutDropdownField = (TransportCheckoutDropdownField) obj2;
        return Intrinsics.f(this.f92614a, transportCheckoutDropdownField.f92614a) && Intrinsics.f(this.f92615b, transportCheckoutDropdownField.f92615b) && Intrinsics.f(this.f92616c, transportCheckoutDropdownField.f92616c) && this.d == transportCheckoutDropdownField.d && Intrinsics.f(this.e, transportCheckoutDropdownField.e) && Intrinsics.f(this.f, transportCheckoutDropdownField.f) && Intrinsics.f(this.f92617g, transportCheckoutDropdownField.f92617g);
    }

    @Override // com.revolut.feature.transport.models.fields.TransportCheckoutField
    /* JADX INFO: renamed from: getDescription, reason: from getter */
    public final String getF() {
        return this.f;
    }

    @Override // com.revolut.feature.transport.models.fields.TransportCheckoutField
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF92614a() {
        return this.f92614a;
    }

    @Override // com.revolut.feature.transport.models.fields.TransportCheckoutField
    /* JADX INFO: renamed from: getLabel, reason: from getter */
    public final String getF92616c() {
        return this.f92616c;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(p.a.c(this.f92614a.hashCode() * 31, 31, this.f92615b), 31, this.f92616c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return this.f92617g.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92614a);
        dest.writeString(this.f92615b);
        dest.writeString(this.f92616c);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeString(this.e);
        dest.writeString(this.f);
        Iterator itV = p.a.v(this.f92617g, dest);
        while (itV.hasNext()) {
            ((Option) itV.next()).writeToParcel(dest, i);
        }
    }
}
