package tol;

import jki.i;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends jki.g implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f86.a f273248p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f273249q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p stateMapper, f86.a deviceLockProtectionChecker) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(deviceLockProtectionChecker, "deviceLockProtectionChecker");
        this.f273248p = deviceLockProtectionChecker;
        this.f273249q = c.f273244a;
    }

    @Override // jki.g
    public final i r2() {
        return this.f273249q;
    }
}
