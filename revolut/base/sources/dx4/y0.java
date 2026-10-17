package dx4;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class y0 {
    private y0() {
    }

    public static a1 a(String rawIconName) {
        Intrinsics.checkNotNullParameter(rawIconName, "rawIconName");
        a1 a1VarB = b(rawIconName);
        if (a1VarB != null) {
            return a1VarB;
        }
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "ContentDrawableIcon.kt", p.a.p("Can't support ", rawIconName, " for ContentDrawableIcon"), null, h0Var);
        return null;
    }

    public static a1 b(String rawIconName) {
        Object next;
        Intrinsics.checkNotNullParameter(rawIconName, "rawIconName");
        Iterator<E> it8 = a1.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(rawIconName, ((a1) next) + "_24")) {
                break;
            }
        }
        return (a1) next;
    }
}
