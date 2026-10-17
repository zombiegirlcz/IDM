package com.revolut.feature.card_order_new.impl.kompot.interactor;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_order_new/impl/kompot/interactor/CountryPickerScreenInteractor$Params", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CountryPickerScreenInteractor$Params implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CountryPickerScreenInteractor$Params> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f65089a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new CountryPickerScreenInteractor$Params(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CountryPickerScreenInteractor$Params[i];
        }
    }

    public CountryPickerScreenInteractor$Params(List allowedCardDeliveryCountries) {
        Intrinsics.checkNotNullParameter(allowedCardDeliveryCountries, "allowedCardDeliveryCountries");
        this.f65089a = allowedCardDeliveryCountries;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CountryPickerScreenInteractor$Params) && Intrinsics.f(this.f65089a, ((CountryPickerScreenInteractor$Params) obj2).f65089a);
    }

    public final int hashCode() {
        return this.f65089a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f65089a, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
    }

    public CountryPickerScreenInteractor$Params() {
        this(f0.f322471a);
    }
}
