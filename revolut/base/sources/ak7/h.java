package ak7;

import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f5733p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f5733p = new d(0);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f5733p;
    }
}
