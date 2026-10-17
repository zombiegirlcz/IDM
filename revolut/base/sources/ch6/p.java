package ch6;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements o {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dj0.d f24139a;

    public static final class a {
        private a() {
        }
    }

    static {
        xi0.b.Companion.getClass();
        f24139a = new dj0.d(50000L, xi0.b.f306273h);
    }

    public final n a(dj0.d dVar, e7l.f config) {
        Intrinsics.checkNotNullParameter(config, "config");
        dj0.d dVar2 = config.N0;
        if (dVar == null) {
            dVar = dVar2 == null ? f24139a : dVar2;
        } else {
            xi0.b bVar = dVar.f115083b;
            if (dVar2 != null) {
                xi0.b bVar2 = dVar2.f115083b;
                if (Intrinsics.f(bVar2, bVar)) {
                    dVar = new dj0.d(Math.max(dVar.f115082a, dVar2.f115082a), bVar2);
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException(j6.a.s("Topup currency(", bVar.f306286a, ") is different from default limit currency(", bVar2.f306286a, ")"));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    dVar = null;
                }
            }
        }
        if (dVar == null) {
            return null;
        }
        return new n(dVar, (dj0.d) kotlin.ranges.f.d(pyd.c.U(dVar, 4L), config.O0));
    }
}
