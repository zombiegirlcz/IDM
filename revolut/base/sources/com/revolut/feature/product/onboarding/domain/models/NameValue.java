package com.revolut.feature.product.onboarding.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/product/onboarding/domain/models/NameValue;", "Lcom/revolut/feature/product/onboarding/domain/models/DeclarationValue;", "", "toString", "()Ljava/lang/String;", "feature_product_onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NameValue implements DeclarationValue {

    @NotNull
    public static final Parcelable.Creator<NameValue> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81218b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NameValue(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NameValue[i];
        }
    }

    public NameValue(String firstName, String str) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        this.f81217a = firstName;
        this.f81218b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NameValue)) {
            return false;
        }
        NameValue nameValue = (NameValue) obj2;
        return Intrinsics.f(this.f81217a, nameValue.f81217a) && Intrinsics.f(this.f81218b, nameValue.f81218b);
    }

    public final int hashCode() {
        int iHashCode = this.f81217a.hashCode() * 31;
        String str = this.f81218b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81217a);
        dest.writeString(this.f81218b);
    }
}
