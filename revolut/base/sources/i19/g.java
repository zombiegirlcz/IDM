package i19;

import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class g {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f157596b = {j.c(k.PUBLICATION, new hzl.a(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f157597a;

    public /* synthetic */ g(int i, f fVar) {
        if (1 == (i & 1)) {
            this.f157597a = fVar;
        } else {
            j1.f(d.f157595a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f157597a == ((g) obj2).f157597a;
    }

    public final int hashCode() {
        return this.f157597a.hashCode();
    }
}
