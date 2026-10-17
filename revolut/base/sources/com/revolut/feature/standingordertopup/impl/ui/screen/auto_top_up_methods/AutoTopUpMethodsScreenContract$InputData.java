package com.revolut.feature.standingordertopup.impl.ui.screen.auto_top_up_methods;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import io3.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/standingordertopup/impl/ui/screen/auto_top_up_methods/AutoTopUpMethodsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_standing_order_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AutoTopUpMethodsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AutoTopUpMethodsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f88198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f88199b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AutoTopUpMethodsScreenContract$InputData((b) parcel.readSerializable(), l.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AutoTopUpMethodsScreenContract$InputData[i];
        }
    }

    public AutoTopUpMethodsScreenContract$InputData(b currency, l pocketType) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        this.f88198a = currency;
        this.f88199b = pocketType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AutoTopUpMethodsScreenContract$InputData)) {
            return false;
        }
        AutoTopUpMethodsScreenContract$InputData autoTopUpMethodsScreenContract$InputData = (AutoTopUpMethodsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f88198a, autoTopUpMethodsScreenContract$InputData.f88198a) && this.f88199b == autoTopUpMethodsScreenContract$InputData.f88199b;
    }

    public final int hashCode() {
        return this.f88199b.hashCode() + (this.f88198a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f88198a);
        dest.writeString(this.f88199b.name());
    }
}
