package q0h;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xzg.t;
import xzg.u;
import xzg.v;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a extends d {

    @NotNull
    public static final C1329a Companion = new C1329a();

    /* JADX INFO: renamed from: q0h.a$a, reason: collision with other inner class name */
    public static final class C1329a {
        private C1329a() {
        }

        public static a a(v asset) {
            Intrinsics.checkNotNullParameter(asset, "asset");
            if (asset instanceof t) {
                return new b(((t) asset).f310031b);
            }
            if (asset instanceof u) {
                return new c(((u) asset).f310034b);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    private a() {
    }
}
