package com.revolut.feature.card_payment_method.api.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import ehe.n;
import i93.d;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_payment_method/api/declaration/SelectedPaymentMethodResultContract$SelectedCardBindingStrategy", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_card_payment_method_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelectedPaymentMethodResultContract$SelectedCardBindingStrategy implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SelectedPaymentMethodResultContract$SelectedCardBindingStrategy> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f65251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f65252b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVarValueOf = d.valueOf(parcel.readString());
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iA = 0;
            while (iA != i) {
                iA = o.a(parcel, linkedHashSet, iA, 1);
            }
            return new SelectedPaymentMethodResultContract$SelectedCardBindingStrategy(dVarValueOf, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SelectedPaymentMethodResultContract$SelectedCardBindingStrategy[i];
        }
    }

    public SelectedPaymentMethodResultContract$SelectedCardBindingStrategy(d strategy, Set pocketIds) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(pocketIds, "pocketIds");
        this.f65251a = strategy;
        this.f65252b = pocketIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SelectedPaymentMethodResultContract$SelectedCardBindingStrategy)) {
            return false;
        }
        SelectedPaymentMethodResultContract$SelectedCardBindingStrategy selectedPaymentMethodResultContract$SelectedCardBindingStrategy = (SelectedPaymentMethodResultContract$SelectedCardBindingStrategy) obj2;
        return this.f65251a == selectedPaymentMethodResultContract$SelectedCardBindingStrategy.f65251a && Intrinsics.f(this.f65252b, selectedPaymentMethodResultContract$SelectedCardBindingStrategy.f65252b);
    }

    public final int hashCode() {
        return this.f65252b.hashCode() + (this.f65251a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f65251a.name());
        Iterator itV = n.v(this.f65252b, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
    }
}
