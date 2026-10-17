package v80;

import kotlin.jvm.internal.Intrinsics;
import u80.d;
import u80.p;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f286701a = new b();

    private b() {
    }

    public static w80.b b(qd0.b languageProvider, boolean z, boolean z3, int i) {
        boolean z4 = (i & 2) != 0;
        boolean z6 = (i & 4) == 0;
        boolean z11 = (i & 8) != 0 ? false : z;
        boolean z12 = (i & 16) != 0 ? true : z3;
        boolean z29 = (i & 32) == 0;
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        return new w80.b(f286701a.a(languageProvider, z4, z6, z11, z12, z29));
    }

    public final w80.a a(qd0.b languageProvider, boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        d dVar = (z3 ? this : null) != null ? new d(((s80.b) languageProvider).b()) : null;
        a aVar = new a(0);
        p pVar = p.f278066a;
        return new w80.a(z, dVar, z4, z6, z11, languageProvider, aVar);
    }
}
