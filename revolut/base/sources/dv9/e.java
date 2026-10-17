package dv9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e {
    private e() {
    }

    public static f a(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        f fVar = f.ACTIVE;
        if (Intrinsics.f(id10, fVar.getId())) {
            return fVar;
        }
        f fVar2 = f.DELETED;
        if (Intrinsics.f(id10, fVar2.getId())) {
            return fVar2;
        }
        return null;
    }
}
