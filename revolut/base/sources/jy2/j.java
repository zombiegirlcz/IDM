package jy2;

import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public interface j extends e0m.d {
    efm.b B0(f0 f0Var);

    ufm.b J1(f0 f0Var);

    default efm.b V(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        return B0(card);
    }
}
