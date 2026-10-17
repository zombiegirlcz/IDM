package p43;

import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends jki.g implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f232810p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f232810p = c.f232806a;
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f232810p;
    }
}
