package skm;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes13.dex */
public final class u0 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f264013a;

    public u0(boolean z) {
        this.f264013a = z;
    }

    @Override // skm.d1
    public final v1 b() {
        return null;
    }

    @Override // skm.d1
    public final boolean isActive() {
        return this.f264013a;
    }

    public final String toString() {
        return j6.a.u(new StringBuilder("Empty{"), this.f264013a ? "Active" : "New", CoreConstants.CURLY_RIGHT);
    }
}
