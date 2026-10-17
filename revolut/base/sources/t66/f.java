package t66;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes3.dex */
@g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f268258c = {null, j.c(k.PUBLICATION, new szl.a(19))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f268259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f268260b;

    public /* synthetic */ f(int i, List list, boolean z) {
        if (3 != (i & 3)) {
            j1.f(d.f268257a.getDescriptor(), i, 3);
            throw null;
        }
        this.f268259a = z;
        this.f268260b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f268259a == fVar.f268259a && Intrinsics.f(this.f268260b, fVar.f268260b);
    }

    public final int hashCode() {
        return this.f268260b.hashCode() + (Boolean.hashCode(this.f268259a) * 31);
    }
}
