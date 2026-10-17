package pq3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {
    private a() {
    }

    public static b a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        b bVar = new b(deeplink);
        if (bVar.f238676b.matches()) {
            return bVar;
        }
        return null;
    }
}
