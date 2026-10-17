package u80;

import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface t {

    @NotNull
    public static final s Companion = s.f278072a;

    static /* synthetic */ CharSequence a(t tVar, BigDecimal bigDecimal, xi0.b bVar, boolean z, boolean z3, int i) {
        if ((i & 16) != 0) {
            z3 = true;
        }
        return tVar.b(bigDecimal, bVar, z, false, z3);
    }

    CharSequence b(BigDecimal bigDecimal, xi0.b bVar, boolean z, boolean z3, boolean z4);

    BigDecimal c(BigDecimal bigDecimal);

    BigDecimal d(String str);

    CharSequence e(BigDecimal bigDecimal, xi0.b bVar, boolean z);

    CharSequence f(BigDecimal bigDecimal, xi0.b bVar, boolean z);

    xi0.b g(xi0.b bVar);
}
