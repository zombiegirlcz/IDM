package px;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes16.dex */
public abstract class b {
    public static final gx.c a(Context context) {
        phm.a aVar = (phm.a) kii.e.l(context, "<this>", context, gx.c.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return (gx.c) aVar2.b();
        }
        throw new IllegalStateException(a0.d.q("Api ", gx.c.class, " is not found"));
    }

    public static final k81.a b(Context context) {
        phm.a aVar = (phm.a) kii.e.l(context, "<this>", context, k81.a.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return (k81.a) aVar2.b();
        }
        throw new IllegalStateException(a0.d.q("Api ", k81.a.class, " is not found"));
    }

    public static final nv.a c(Context context) {
        phm.a aVar = (phm.a) kii.e.l(context, "<this>", context, nv.a.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return (nv.a) aVar2.b();
        }
        throw new IllegalStateException(a0.d.q("Api ", nv.a.class, " is not found"));
    }

    public static final g d(Context context) {
        phm.a aVar = (phm.a) kii.e.l(context, "<this>", context, g.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return (g) aVar2.b();
        }
        throw new IllegalStateException(a0.d.q("Api ", g.class, " is not found"));
    }

    public static final u00.d e(Context context) {
        phm.a aVar = (phm.a) kii.e.l(context, "<this>", context, u00.d.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return (u00.d) aVar2.b();
        }
        throw new IllegalStateException(a0.d.q("Api ", u00.d.class, " is not found"));
    }

    public static final l70.e f(Context context) {
        l70.e eVar;
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            eVar = (l70.e) ue0.e.i(ue0.e.j(context), l70.e.class);
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            eVar = null;
        }
        return eVar == null ? (l70.e) l70.c.Companion.c() : eVar;
    }
}
