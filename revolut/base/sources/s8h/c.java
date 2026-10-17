package s8h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    private c() {
    }

    public static d a(String str) {
        if (str == null) {
            return null;
        }
        for (d dVar : d.values()) {
            if (Intrinsics.f(dVar.a(), str)) {
                return dVar;
            }
        }
        return null;
    }
}
