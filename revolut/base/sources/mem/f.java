package mem;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class f implements xem.c {
    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // xem.c
    public final void d5(Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // xem.c
    public final Object n8() {
        return new char[2048];
    }
}
