package q72;

import kotlin.jvm.internal.Intrinsics;
import tof.f7;
import tof.h7;
import tof.i7;
import tof.ka;
import tof.l;
import tof.n;
import tof.q7;
import tof.s5;
import tof.u9;
import whf.b;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f242737a;

    public a(b transactionsContentProvider) {
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        this.f242737a = transactionsContentProvider;
    }

    public static q7 a() {
        i7.c cVar = i7.Companion;
        i7[] i7VarArr = {new f7(l.MBWAY), new h7(n.MBWAY), new ka(s5.MULTIBANCO)};
        cVar.getClass();
        return i7.c.a(i7.c.b(i7VarArr), new u9(false));
    }
}
