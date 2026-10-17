package i58;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f158788p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f158788p = new a(null);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f158788p;
    }
}
