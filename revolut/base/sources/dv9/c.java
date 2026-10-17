package dv9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {
    private c() {
    }

    public static d a(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        d dVar = d.SENDING;
        if (Intrinsics.f(id10, dVar.getId())) {
            return dVar;
        }
        d dVar2 = d.SENT;
        if (Intrinsics.f(id10, dVar2.getId())) {
            return dVar2;
        }
        d dVar3 = d.ERROR;
        if (Intrinsics.f(id10, dVar3.getId())) {
            return dVar3;
        }
        throw new IllegalArgumentException(p.a.p("id ", id10, " can't be parsed"));
    }
}
