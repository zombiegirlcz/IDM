package snh;

import com.revolut.feature.wealth.ui.impl.transfer_picker.WealthTransferPickerControllerContract$State;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iih.b f264619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WealthTransferPickerControllerContract$State f264620b;

    public e(iih.b transferType, WealthTransferPickerControllerContract$State state) {
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f264619a = transferType;
        this.f264620b = state;
    }

    public static e a(e eVar, WealthTransferPickerControllerContract$State.CashHoldingChooser state) {
        iih.b transferType = eVar.f264619a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        Intrinsics.checkNotNullParameter(state, "state");
        return new e(transferType, state);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f264619a == eVar.f264619a && Intrinsics.f(this.f264620b, eVar.f264620b);
    }

    public final int hashCode() {
        return this.f264620b.hashCode() + (this.f264619a.hashCode() * 31);
    }
}
