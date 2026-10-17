package ylm;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class w implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f314818a;

    public w(s connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f314818a = connection;
    }

    @Override // ylm.z
    public final s a() {
        return this.f314818a;
    }

    @Override // ylm.z, zlm.d
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // ylm.z
    public final y d() {
        throw new IllegalStateException("already connected");
    }

    @Override // ylm.z
    public final y f() {
        throw new IllegalStateException("already connected");
    }

    @Override // ylm.z
    public final z g() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // ylm.z
    public final boolean isReady() {
        return true;
    }
}
