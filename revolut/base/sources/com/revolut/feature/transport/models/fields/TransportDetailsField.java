package com.revolut.feature.transport.models.fields;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/models/fields/TransportDetailsField;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_transport_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransportDetailsField implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransportDetailsField> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransportDetailsFieldValue f92627c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransportDetailsField(parcel.readString(), parcel.readString(), TransportDetailsFieldValue.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransportDetailsField[i];
        }
    }

    public TransportDetailsField(String code, String label, TransportDetailsFieldValue value) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f92625a = code;
        this.f92626b = label;
        this.f92627c = value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransportDetailsField)) {
            return false;
        }
        TransportDetailsField transportDetailsField = (TransportDetailsField) obj2;
        return Intrinsics.f(this.f92625a, transportDetailsField.f92625a) && Intrinsics.f(this.f92626b, transportDetailsField.f92626b) && Intrinsics.f(this.f92627c, transportDetailsField.f92627c);
    }

    public final int hashCode() {
        return this.f92627c.hashCode() + p.a.c(this.f92625a.hashCode() * 31, 31, this.f92626b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92625a);
        dest.writeString(this.f92626b);
        this.f92627c.writeToParcel(dest, i);
    }
}
