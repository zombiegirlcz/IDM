package com.revolut.feature.trading_orders.api.ui.pocket_picker;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trading_orders.common.models.SourcePocket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/trading_orders/api/ui/pocket_picker/SourcePocketPickerContract$OutputData", "Laii/r;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SourcePocketPickerContract$OutputData implements r, Parcelable {

    @NotNull
    public static final Parcelable.Creator<SourcePocketPickerContract$OutputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f91764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SourcePocket f91765b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SourcePocketPickerContract$OutputData((b) parcel.readSerializable(), (SourcePocket) parcel.readParcelable(SourcePocketPickerContract$OutputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SourcePocketPickerContract$OutputData[i];
        }
    }

    public SourcePocketPickerContract$OutputData(b bVar, SourcePocket pocket) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f91764a = bVar;
        this.f91765b = pocket;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SourcePocketPickerContract$OutputData)) {
            return false;
        }
        SourcePocketPickerContract$OutputData sourcePocketPickerContract$OutputData = (SourcePocketPickerContract$OutputData) obj2;
        return Intrinsics.f(this.f91764a, sourcePocketPickerContract$OutputData.f91764a) && Intrinsics.f(this.f91765b, sourcePocketPickerContract$OutputData.f91765b);
    }

    public final int hashCode() {
        b bVar = this.f91764a;
        return this.f91765b.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f91764a);
        dest.writeParcelable(this.f91765b, i);
    }
}
