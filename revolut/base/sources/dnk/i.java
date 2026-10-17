package dnk;

import ggk.g1;
import ggk.z0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    @NotNull
    private static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c90.c f116361a;

    public i(c90.c uiResources) {
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        this.f116361a = uiResources;
    }

    public static int a(g1 g1Var, float f) {
        Object obj2;
        int i;
        int i2 = g1Var.f143721g.f143705c != null ? 1 : 0;
        vim.f it8 = kotlin.ranges.f.l(5, 2).iterator();
        while (true) {
            obj2 = null;
            if (!it8.f289625c) {
                break;
            }
            Object next = it8.next();
            int iIntValue = ((Number) next).intValue() - i2;
            if (iIntValue < 0) {
                iIntValue = 0;
            }
            List listV0 = d0.V0(g1Var.f143721g.f143704b, iIntValue);
            if ((listV0 instanceof Collection) && listV0.isEmpty()) {
                i = 0;
            } else {
                Iterator it9 = listV0.iterator();
                i = 0;
                while (it9.hasNext()) {
                    if (((z0) it9.next()).f143809c != null && (i = i + 1) < 0) {
                        v.r();
                        throw null;
                    }
                }
            }
            if ((i * 30) + (r6 * 90) <= 45 + f) {
                obj2 = next;
                break;
            }
        }
        Integer num = (Integer) obj2;
        if (num != null) {
            return num.intValue();
        }
        return 2;
    }
}
