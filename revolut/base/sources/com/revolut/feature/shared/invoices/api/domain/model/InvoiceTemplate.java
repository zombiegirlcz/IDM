package com.revolut.feature.shared.invoices.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/shared/invoices/api/domain/model/InvoiceTemplate;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "CustomField", "a", "feature_shared_invoices_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvoiceTemplate implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f86398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f86399c;
    public final String d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f86400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f86401h;
    public final u9d.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f86402j;
    public final String k;

    @NotNull
    public static final Parcelable.Creator<InvoiceTemplate> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/shared/invoices/api/domain/model/InvoiceTemplate$CustomField;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_shared_invoices_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CustomField implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86404b;

        @NotNull
        public static final Parcelable.Creator<CustomField> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomField(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CustomField[i];
            }
        }

        public CustomField(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f86403a = name;
            this.f86404b = value;
        }

        public static CustomField a(CustomField customField, String name, String value, int i) {
            if ((i & 1) != 0) {
                name = customField.f86403a;
            }
            if ((i & 2) != 0) {
                value = customField.f86404b;
            }
            customField.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            return new CustomField(name, value);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CustomField)) {
                return false;
            }
            CustomField customField = (CustomField) obj2;
            return Intrinsics.f(this.f86403a, customField.f86403a) && Intrinsics.f(this.f86404b, customField.f86404b);
        }

        public final int hashCode() {
            return this.f86404b.hashCode() + (this.f86403a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86403a);
            dest.writeString(this.f86404b);
        }
    }

    public static final class b implements Parcelable.Creator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
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
            boolean z3 = parcel.readInt() != 0 ? i : 0;
            boolean z4 = parcel.readInt() != 0 ? i : 0;
            boolean z6 = parcel.readInt() != 0 ? i : 0;
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CustomField.CREATOR, parcel, arrayList, iA, i);
            }
            return new InvoiceTemplate(string, z, string2, string3, z3, z4, z6, arrayList, u9d.b.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvoiceTemplate[i];
        }
    }

    public InvoiceTemplate(String id10, boolean z, String templateName, String invoiceTitle, boolean z3, boolean z4, boolean z6, ArrayList customFields, u9d.b language, String str, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(templateName, "templateName");
        Intrinsics.checkNotNullParameter(invoiceTitle, "invoiceTitle");
        Intrinsics.checkNotNullParameter(customFields, "customFields");
        Intrinsics.checkNotNullParameter(language, "language");
        this.f86397a = id10;
        this.f86398b = z;
        this.f86399c = templateName;
        this.d = invoiceTitle;
        this.e = z3;
        this.f = z4;
        this.f86400g = z6;
        this.f86401h = customFields;
        this.i = language;
        this.f86402j = str;
        this.k = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvoiceTemplate)) {
            return false;
        }
        InvoiceTemplate invoiceTemplate = (InvoiceTemplate) obj2;
        return Intrinsics.f(this.f86397a, invoiceTemplate.f86397a) && this.f86398b == invoiceTemplate.f86398b && Intrinsics.f(this.f86399c, invoiceTemplate.f86399c) && Intrinsics.f(this.d, invoiceTemplate.d) && this.e == invoiceTemplate.e && this.f == invoiceTemplate.f && this.f86400g == invoiceTemplate.f86400g && this.f86401h.equals(invoiceTemplate.f86401h) && this.i == invoiceTemplate.i && Intrinsics.f(this.f86402j, invoiceTemplate.f86402j) && Intrinsics.f(this.k, invoiceTemplate.k);
    }

    public final int hashCode() {
        int iHashCode = (this.i.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f86401h, j6.a.c(j6.a.c(j6.a.c(p.a.c(p.a.c(j6.a.c(this.f86397a.hashCode() * 31, 31, this.f86398b), 31, this.f86399c), 31, this.d), 31, this.e), 31, this.f), 31, this.f86400g), 31)) * 31;
        String str = this.f86402j;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86397a);
        dest.writeInt(this.f86398b ? 1 : 0);
        dest.writeString(this.f86399c);
        dest.writeString(this.d);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f86400g ? 1 : 0);
        Iterator itY = j6.a.y(this.f86401h, dest);
        while (itY.hasNext()) {
            ((CustomField) itY.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.i.name());
        dest.writeString(this.f86402j);
        dest.writeString(this.k);
    }
}
