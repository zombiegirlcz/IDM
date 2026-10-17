package lxg;

import dj0.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements lxg.a {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static d a(d dVar) {
        long jAbs = Math.abs(dVar.f115082a);
        return new d(jAbs < 100000 ? 1L : jAbs < 100000000 ? 1000L : 1000000L, dVar.f115083b);
    }
}
