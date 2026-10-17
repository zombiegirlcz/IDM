package y8b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements j0b.c {
    @Override // j0b.c
    public final j0b.d a() {
        return new d();
    }

    @Override // j0b.c
    public final j0b.a b() {
        return new b();
    }

    @Override // j0b.c
    public final yji.d c(j0b.b delegatesProvider, j0b.a controllerModelExtension) {
        Intrinsics.checkNotNullParameter(delegatesProvider, "delegatesProvider");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        return new a();
    }

    @Override // j0b.c
    public final j0b.b d() {
        return new c();
    }
}
