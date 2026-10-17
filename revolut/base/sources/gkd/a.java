package gkd;

import fkd.f;
import fkd.f0;
import fkd.r;
import fkd.r0;
import fkd.w0;
import fkd.x;
import g2e.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a f144374a = new a();

    private a() {
    }

    public static b a(w0 tile) {
        Intrinsics.checkNotNullParameter(tile, "tile");
        if (tile instanceof r) {
            return new t((r) tile);
        }
        if (tile instanceof r0) {
            return new f61.a((r0) tile);
        }
        if (tile instanceof f0) {
            return new fkg.a((f0) tile);
        }
        if (tile instanceof f) {
            return new f4h.a((f) tile);
        }
        if (tile instanceof x) {
            throw new IllegalStateException("SlotFincrimeNpsTodoTile is handled via FincrimeNpsCoordinator, not deeplinks");
        }
        throw new NoWhenBranchMatchedException();
    }
}
