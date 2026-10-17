package hfc;

import com.revolut.feature.acquiring.card_reader.order.api.model.VatSelection;
import ifc.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements a {
    public static h a(VatSelection vatSelection) {
        Intrinsics.checkNotNullParameter(vatSelection, "vatSelection");
        boolean z = !Intrinsics.f(vatSelection, VatSelection.NotRegistered.f60584a);
        VatSelection.Registered registered = vatSelection instanceof VatSelection.Registered ? (VatSelection.Registered) vatSelection : null;
        return new h(z, registered != null ? registered.f60586a : null);
    }
}
