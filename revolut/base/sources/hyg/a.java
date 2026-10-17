package hyg;

import aw0.bb;
import aw0.cb;
import hw0.k;
import ip0.jm0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ue0.e;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private a() {
    }

    public static cb a(jm0 jm0Var) {
        cb cbVarD;
        Intrinsics.checkNotNullParameter(jm0Var, "<this>");
        List list = jm0Var.f164881c;
        if (e.n(list)) {
            list = null;
        }
        if (list != null) {
            if (((k) d0.b0(list)).f156007b > ((k) d0.m0(list)).f156007b) {
                cb.Companion.getClass();
                cbVarD = bb.b();
            } else {
                cb.Companion.getClass();
                cbVarD = bb.d();
            }
            if (cbVarD != null) {
                return cbVarD;
            }
        }
        cb.Companion.getClass();
        return bb.c();
    }
}
