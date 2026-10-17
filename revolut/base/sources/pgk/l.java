package pgk;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class l {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static xfa.b a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String str = (String) deeplink.d.get("source");
        if (str == null) {
            return null;
        }
        for (xfa.b bVar : xfa.b.values()) {
            if (a0.z(bVar.a(), str, true)) {
                return bVar;
            }
        }
        return null;
    }
}
