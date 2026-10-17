package com.revolut.feature.product.onboarding.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/product/onboarding/domain/models/CitizenshipValue;", "Lcom/revolut/feature/product/onboarding/domain/models/DeclarationValue;", "", "toString", "()Ljava/lang/String;", "feature_product_onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CitizenshipValue implements DeclarationValue {

    @NotNull
    public static final Parcelable.Creator<CitizenshipValue> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f81214a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CitizenshipValue(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CitizenshipValue[i];
        }
    }

    public CitizenshipValue(List countries) {
        Intrinsics.checkNotNullParameter(countries, "countries");
        this.f81214a = countries;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CitizenshipValue) && Intrinsics.f(this.f81214a, ((CitizenshipValue) obj2).f81214a);
    }

    public final int hashCode() {
        return this.f81214a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeStringList(this.f81214a);
    }
}
