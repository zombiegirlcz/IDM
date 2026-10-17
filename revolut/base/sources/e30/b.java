package e30;

import efm.r;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r20.b f122164a;

    public b(r20.b webSocketApiV2) {
        Intrinsics.checkNotNullParameter(webSocketApiV2, "webSocketApiV2");
        this.f122164a = webSocketApiV2;
    }

    public final r a(boolean z) {
        z10.e eVar = (z10.e) this.f122164a;
        return rd0.e.c(z ? eVar.i : eVar.f318715j, g.f186406a);
    }
}
