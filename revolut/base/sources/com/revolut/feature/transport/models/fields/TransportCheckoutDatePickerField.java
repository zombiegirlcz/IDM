package com.revolut.feature.transport.models.fields;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/models/fields/TransportCheckoutDatePickerField;", "Lcom/revolut/feature/transport/models/fields/TransportCheckoutField;", "", "toString", "()Ljava/lang/String;", "feature_transport_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransportCheckoutDatePickerField extends TransportCheckoutField {

    @NotNull
    public static final Parcelable.Creator<TransportCheckoutDatePickerField> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92610c;
    public final boolean d;
    public final String e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransportCheckoutDatePickerField(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransportCheckoutDatePickerField[i];
        }
    }

    public TransportCheckoutDatePickerField(String id10, String code, String label, String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f92608a = id10;
        this.f92609b = code;
        this.f92610c = label;
        this.d = z;
        this.e = str;
        this.f = str2;
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
        if (!(obj2 instanceof TransportCheckoutDatePickerField)) {
            return false;
        }
        TransportCheckoutDatePickerField transportCheckoutDatePickerField = (TransportCheckoutDatePickerField) obj2;
        return Intrinsics.f(this.f92608a, transportCheckoutDatePickerField.f92608a) && Intrinsics.f(this.f92609b, transportCheckoutDatePickerField.f92609b) && Intrinsics.f(this.f92610c, transportCheckoutDatePickerField.f92610c) && this.d == transportCheckoutDatePickerField.d && Intrinsics.f(this.e, transportCheckoutDatePickerField.e) && Intrinsics.f(this.f, transportCheckoutDatePickerField.f);
    }

    @Override // com.revolut.feature.transport.models.fields.TransportCheckoutField
    /* JADX INFO: renamed from: getDescription, reason: from getter */
    public final String getF() {
        return this.f;
    }

    @Override // com.revolut.feature.transport.models.fields.TransportCheckoutField
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF92611a() {
        return this.f92608a;
    }

    @Override // com.revolut.feature.transport.models.fields.TransportCheckoutField
    /* JADX INFO: renamed from: getLabel, reason: from getter */
    public final String getF92613c() {
        return this.f92610c;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(p.a.c(this.f92608a.hashCode() * 31, 31, this.f92609b), 31, this.f92610c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92608a);
        dest.writeString(this.f92609b);
        dest.writeString(this.f92610c);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeString(this.e);
        dest.writeString(this.f);
    }
}
