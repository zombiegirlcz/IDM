package com.revolut.feature.transfer_reasons.models.additional_info;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import stf.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transfer_reasons/models/additional_info/AdditionalInfoEntry;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AdditionalInfoEntry implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<AdditionalInfoEntry> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f92404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdditionalInfoValue f92405c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdditionalInfoEntry(parcel.readString(), b.valueOf(parcel.readString()), (AdditionalInfoValue) parcel.readParcelable(AdditionalInfoEntry.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AdditionalInfoEntry[i];
        }
    }

    public AdditionalInfoEntry(String id10, b valueType, AdditionalInfoValue value) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f92403a = id10;
        this.f92404b = valueType;
        this.f92405c = value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AdditionalInfoEntry)) {
            return false;
        }
        AdditionalInfoEntry additionalInfoEntry = (AdditionalInfoEntry) obj2;
        return Intrinsics.f(this.f92403a, additionalInfoEntry.f92403a) && this.f92404b == additionalInfoEntry.f92404b && Intrinsics.f(this.f92405c, additionalInfoEntry.f92405c);
    }

    public final int hashCode() {
        return this.f92405c.hashCode() + ((this.f92404b.hashCode() + (this.f92403a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92403a);
        dest.writeString(this.f92404b.name());
        dest.writeParcelable(this.f92405c, i);
    }
}
