package t97;

import kotlin.jvm.internal.Intrinsics;
import vc.o;

/* JADX INFO: loaded from: classes21.dex */
public final class c {
    public static p97.a a(p97.b id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        if (id10 instanceof d) {
            return o.G((d) id10);
        }
        throw new IllegalStateException(("Unknown id: " + id10).toString());
    }
}
