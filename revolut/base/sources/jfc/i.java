package jfc;

import com.revolut.feature.acquiring.card_reader.order.api.model.VatSelection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class i {
    public static final String a(VatSelection vatSelection) {
        if (Intrinsics.f(vatSelection, VatSelection.NotRegistered.f60584a)) {
            return "NotRegistered";
        }
        if (Intrinsics.f(vatSelection, VatSelection.Optional.f60585a)) {
            return "Optional";
        }
        if (vatSelection instanceof VatSelection.Registered) {
            return p.a.p("Registered(vatNumber=", ((VatSelection.Registered) vatSelection).f60586a, ")");
        }
        throw new NoWhenBranchMatchedException();
    }
}
