package snh;

import com.revolut.feature.wealth.ui.impl.transfer_picker.WealthTransferPickerControllerContract$State;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iih.b f264621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WealthTransferPickerControllerContract$State f264622b;

    public f(iih.b transferType, WealthTransferPickerControllerContract$State state) {
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f264621a = transferType;
        this.f264622b = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f264621a == fVar.f264621a && Intrinsics.f(this.f264622b, fVar.f264622b);
    }

    public final int hashCode() {
        return this.f264622b.hashCode() + (this.f264621a.hashCode() * 31);
    }
}
