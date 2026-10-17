package q0l;

import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends jki.g implements c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f241304p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f241305q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a promptType, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(promptType, "promptType");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f241304p = promptType;
        this.f241305q = new b(promptType);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f241305q;
    }
}
