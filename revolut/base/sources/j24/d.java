package j24;

import kotlin.jvm.internal.Intrinsics;
import tb4.t;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f170692a;

    public d(t productsFactoriesApi) {
        Intrinsics.checkNotNullParameter(productsFactoriesApi, "productsFactoriesApi");
        this.f170692a = productsFactoriesApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x009e A[EDGE_INSN: B:48:0x009e->B:36:0x009e BREAK  A[LOOP:0: B:18:0x005c->B:52:0x005c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final sv3.b a(ks3.b r7, ks3.c r8, ft3.j1 r9, java.util.List r10) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j24.d.a(ks3.b, ks3.c, ft3.j1, java.util.List):sv3.b");
    }

    public final oz3.b b(it3.d status) {
        Intrinsics.checkNotNullParameter(status, "status");
        ks3.b bVar = status.f168325c;
        ks3.c cVar = status.d;
        sv3.b bVarA = a(bVar, cVar, status.f168328j, status.f);
        oz3.b bVar2 = bVarA instanceof oz3.b ? (oz3.b) bVarA : null;
        if (bVar2 != null) {
            return bVar2;
        }
        throw new IllegalStateException("Plugin factory for " + status.f168325c + " with state " + cVar + " is not migrated to kompot navigation yet");
    }
}
