package uha;

import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import zhm.r0;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class p {

    @NotNull
    public static final o Companion = new o();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f280176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f280177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f280178c;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        d = new Lazy[]{yhm.j.c(kVar, new u9a.b(22)), yhm.j.c(kVar, new u9a.b(23)), null};
    }

    public /* synthetic */ p(int i, x xVar, Map map, boolean z) {
        if (5 != (i & 5)) {
            j1.f(n.f280175a.getDescriptor(), i, 5);
            throw null;
        }
        this.f280176a = xVar;
        if ((i & 2) == 0) {
            this.f280177b = r0.g();
        } else {
            this.f280177b = map;
        }
        this.f280178c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f280176a, pVar.f280176a) && Intrinsics.f(this.f280177b, pVar.f280177b) && this.f280178c == pVar.f280178c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f280178c) + p.a.e(this.f280176a.hashCode() * 31, 31, this.f280177b);
    }

    public p(x articleReference, Map substitutionData, boolean z) {
        Intrinsics.checkNotNullParameter(articleReference, "articleReference");
        Intrinsics.checkNotNullParameter(substitutionData, "substitutionData");
        this.f280176a = articleReference;
        this.f280177b = substitutionData;
        this.f280178c = z;
    }
}
