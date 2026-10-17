package fth;

import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends jki.g implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f138025p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f138025p = c.f138022a;
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f138025p;
    }
}
