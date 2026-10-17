package e3h;

import efm.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public interface i {
    ihm.f B1();

    ihm.f C();

    default r E0() {
        r rVarEmpty = r.empty();
        Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
        return rVarEmpty;
    }

    default r F() {
        r rVarEmpty = r.empty();
        Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
        return rVarEmpty;
    }

    r I();

    r U1();

    ihm.f Z0();

    r h1();
}
