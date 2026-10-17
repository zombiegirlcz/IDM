package com.revolut.feature.transport.models.fields;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/models/fields/TransportCheckoutTextField;", "Lcom/revolut/feature/transport/models/fields/TransportCheckoutField;", "", "toString", "()Ljava/lang/String;", "feature_transport_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransportCheckoutTextField extends TransportCheckoutField {

    @NotNull
    public static final Parcelable.Creator<TransportCheckoutTextField> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92622c;
    public final boolean d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f92623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Regex f92624h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransportCheckoutTextField(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransportCheckoutTextField[i];
        }
    }

    public TransportCheckoutTextField(String id10, String code, String label, String str, String str2, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f92620a = id10;
        this.f92621b = code;
        this.f92622c = label;
        this.d = z;
        this.e = str;
        this.f = str2;
        this.f92623g = str3;
        this.f92624h = str3 != null ? new Regex(str3) : null;
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
        Regex regex = this.f92624h;
        if (regex != null) {
            return regex.f(input);
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransportCheckoutTextField)) {
            return false;
        }
        TransportCheckoutTextField transportCheckoutTextField = (TransportCheckoutTextField) obj2;
        return Intrinsics.f(this.f92620a, transportCheckoutTextField.f92620a) && Intrinsics.f(this.f92621b, transportCheckoutTextField.f92621b) && Intrinsics.f(this.f92622c, transportCheckoutTextField.f92622c) && this.d == transportCheckoutTextField.d && Intrinsics.f(this.e, transportCheckoutTextField.e) && Intrinsics.f(this.f, transportCheckoutTextField.f) && Intrinsics.f(this.f92623g, transportCheckoutTextField.f92623g);
    }

    @Override // com.revolut.feature.transport.models.fields.TransportCheckoutField
    /* JADX INFO: renamed from: getDescription, reason: from getter */
    public final String getF() {
        return this.f;
    }

    @Override // com.revolut.feature.transport.models.fields.TransportCheckoutField
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF92620a() {
        return this.f92620a;
    }

    @Override // com.revolut.feature.transport.models.fields.TransportCheckoutField
    /* JADX INFO: renamed from: getLabel, reason: from getter */
    public final String getF92622c() {
        return this.f92622c;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(p.a.c(this.f92620a.hashCode() * 31, 31, this.f92621b), 31, this.f92622c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f92623g;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92620a);
        dest.writeString(this.f92621b);
        dest.writeString(this.f92622c);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f92623g);
    }
}
