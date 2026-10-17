package com.revolut.feature.wealth.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/SelectedCurrencyInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelectedCurrencyInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SelectedCurrencyInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f95228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f95229b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVar = (b) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new SelectedCurrencyInfo(arrayList, bVar);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SelectedCurrencyInfo[i];
        }
    }

    public SelectedCurrencyInfo(List availableCurrencies, b selectedCurrency) {
        Intrinsics.checkNotNullParameter(selectedCurrency, "selectedCurrency");
        Intrinsics.checkNotNullParameter(availableCurrencies, "availableCurrencies");
        this.f95228a = selectedCurrency;
        this.f95229b = availableCurrencies;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SelectedCurrencyInfo)) {
            return false;
        }
        SelectedCurrencyInfo selectedCurrencyInfo = (SelectedCurrencyInfo) obj2;
        return Intrinsics.f(this.f95228a, selectedCurrencyInfo.f95228a) && Intrinsics.f(this.f95229b, selectedCurrencyInfo.f95229b);
    }

    public final int hashCode() {
        return this.f95229b.hashCode() + (this.f95228a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f95228a);
        Iterator itV = p.a.v(this.f95229b, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
    }
}
