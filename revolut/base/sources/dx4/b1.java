package dx4;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b1 f120552a = new b1();

    private b1() {
    }

    public static c1 a(int i, String rawIconName) {
        Intrinsics.checkNotNullParameter(rawIconName, "rawIconName");
        a1.Companion.getClass();
        a1 a1VarB = y0.b(rawIconName);
        if (a1VarB != null) {
            return a1VarB;
        }
        k0.Companion.getClass();
        Intrinsics.checkNotNullParameter(rawIconName, "rawIconName");
        k0 k0Var = new k0(i + 1);
        if (!rawIconName.equals("BULLET_NUMBER_24")) {
            k0Var = null;
        }
        if (k0Var != null) {
            return k0Var;
        }
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "ContentIcon.kt", p.a.p("Can't support ", rawIconName, " for ContentIcon"), null, h0Var);
        return k5.f120654a;
    }
}
