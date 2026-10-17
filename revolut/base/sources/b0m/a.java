package b0m;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a {
    private a() {
    }

    public static b a(String str) {
        if (str == null) {
            return null;
        }
        for (b bVar : b.values()) {
            if (Intrinsics.f(bVar.getValue(), str)) {
                return bVar;
            }
        }
        return null;
    }
}
