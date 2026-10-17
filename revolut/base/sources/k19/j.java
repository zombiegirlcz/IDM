package k19;

import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class j {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f180156c = {null, yhm.j.c(yhm.k.PUBLICATION, new k16.d(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f180158b;

    public /* synthetic */ j(Map map, String str, int i) {
        if (1 != (i & 1)) {
            j1.f(d.f180150a.getDescriptor(), i, 1);
            throw null;
        }
        this.f180157a = str;
        if ((i & 2) == 0) {
            this.f180158b = null;
        } else {
            this.f180158b = map;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f180157a, jVar.f180157a) && Intrinsics.f(this.f180158b, jVar.f180158b);
    }

    public final int hashCode() {
        int iHashCode = this.f180157a.hashCode() * 31;
        Map map = this.f180158b;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }
}
