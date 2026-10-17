package com.revolut.feature.transport.models.fields;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/models/fields/TransportDetailsFieldValue;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_transport_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransportDetailsFieldValue implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransportDetailsFieldValue> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92629b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransportDetailsFieldValue(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransportDetailsFieldValue[i];
        }
    }

    public TransportDetailsFieldValue(String value, String str) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f92628a = value;
        this.f92629b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransportDetailsFieldValue)) {
            return false;
        }
        TransportDetailsFieldValue transportDetailsFieldValue = (TransportDetailsFieldValue) obj2;
        return Intrinsics.f(this.f92628a, transportDetailsFieldValue.f92628a) && Intrinsics.f(this.f92629b, transportDetailsFieldValue.f92629b);
    }

    public final int hashCode() {
        int iHashCode = this.f92628a.hashCode() * 31;
        String str = this.f92629b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92628a);
        dest.writeString(this.f92629b);
    }
}
