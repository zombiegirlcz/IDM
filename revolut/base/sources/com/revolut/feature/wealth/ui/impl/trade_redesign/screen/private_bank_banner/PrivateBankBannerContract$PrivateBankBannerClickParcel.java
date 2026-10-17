package com.revolut.feature.wealth.ui.impl.trade_redesign.screen.private_bank_banner;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/ui/impl/trade_redesign/screen/private_bank_banner/PrivateBankBannerContract$PrivateBankBannerClickParcel", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PrivateBankBannerContract$PrivateBankBannerClickParcel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PrivateBankBannerContract$PrivateBankBannerClickParcel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f96043a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iE = 0;
            while (iE != i) {
                iE = d.e(PrivateBankBannerContract$PrivateBankBannerClickParcel.class, parcel, linkedHashSet, iE, 1);
            }
            return new PrivateBankBannerContract$PrivateBankBannerClickParcel(linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PrivateBankBannerContract$PrivateBankBannerClickParcel[i];
        }
    }

    public PrivateBankBannerContract$PrivateBankBannerClickParcel(Set availablePrivateBankProducts) {
        Intrinsics.checkNotNullParameter(availablePrivateBankProducts, "availablePrivateBankProducts");
        this.f96043a = availablePrivateBankProducts;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PrivateBankBannerContract$PrivateBankBannerClickParcel) && Intrinsics.f(this.f96043a, ((PrivateBankBannerContract$PrivateBankBannerClickParcel) obj2).f96043a);
    }

    public final int hashCode() {
        return this.f96043a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f96043a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
