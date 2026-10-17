package com.revolut.trading.orders.ui.screens.pocket_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trading_orders.common.models.SourcePocket;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/trading/orders/ui/screens/pocket_picker/SourcePocketPickerScreenContract$RetainedState", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SourcePocketPickerScreenContract$RetainedState implements States$PersistentDomain {

    @NotNull
    public static final Parcelable.Creator<SourcePocketPickerScreenContract$RetainedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f107050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f107051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SourcePocket f107052c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SourcePocketPickerScreenContract$RetainedState((xi0.b) parcel.readSerializable(), (xi0.b) parcel.readSerializable(), (SourcePocket) parcel.readParcelable(SourcePocketPickerScreenContract$RetainedState.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SourcePocketPickerScreenContract$RetainedState[i];
        }
    }

    public SourcePocketPickerScreenContract$RetainedState(xi0.b bVar, xi0.b bVar2, SourcePocket sourcePocket, boolean z) {
        this.f107050a = bVar;
        this.f107051b = bVar2;
        this.f107052c = sourcePocket;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SourcePocketPickerScreenContract$RetainedState)) {
            return false;
        }
        SourcePocketPickerScreenContract$RetainedState sourcePocketPickerScreenContract$RetainedState = (SourcePocketPickerScreenContract$RetainedState) obj2;
        return Intrinsics.f(this.f107050a, sourcePocketPickerScreenContract$RetainedState.f107050a) && Intrinsics.f(this.f107051b, sourcePocketPickerScreenContract$RetainedState.f107051b) && Intrinsics.f(this.f107052c, sourcePocketPickerScreenContract$RetainedState.f107052c) && this.d == sourcePocketPickerScreenContract$RetainedState.d;
    }

    public final int hashCode() {
        xi0.b bVar = this.f107050a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        xi0.b bVar2 = this.f107051b;
        int iHashCode2 = (iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        SourcePocket sourcePocket = this.f107052c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (sourcePocket != null ? sourcePocket.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f107050a);
        dest.writeSerializable(this.f107051b);
        dest.writeParcelable(this.f107052c, i);
        dest.writeInt(this.d ? 1 : 0);
    }
}
