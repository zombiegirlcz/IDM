package usf;

import com.revolut.core.ui_kit.delegates.t;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    public static final a3 a(t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        Object obj2 = tVar.f54722b.f51596l;
        a3 a3Var = obj2 instanceof a3 ? (a3) obj2 : null;
        if (Intrinsics.f(a3Var != null ? a3Var.f272611s : null, "purpose_declaration_required")) {
            return a3Var;
        }
        return null;
    }
}
