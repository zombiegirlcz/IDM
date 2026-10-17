package com.revolut.feature.shared.beneficiary.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/beneficiary/api/common/ReferenceField;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReferenceField implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ReferenceField> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f86039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f86040c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReferenceField(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReferenceField[i];
        }
    }

    public ReferenceField(String value, String optionType, String fieldType) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        Intrinsics.checkNotNullParameter(fieldType, "fieldType");
        this.f86038a = value;
        this.f86039b = optionType;
        this.f86040c = fieldType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ReferenceField)) {
            return false;
        }
        ReferenceField referenceField = (ReferenceField) obj2;
        return Intrinsics.f(this.f86038a, referenceField.f86038a) && Intrinsics.f(this.f86039b, referenceField.f86039b) && Intrinsics.f(this.f86040c, referenceField.f86040c);
    }

    public final int hashCode() {
        return this.f86040c.hashCode() + p.a.c(this.f86038a.hashCode() * 31, 31, this.f86039b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86038a);
        dest.writeString(this.f86039b);
        dest.writeString(this.f86040c);
    }
}
