package h0k;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes11.dex */
@g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f148426c = {j.c(k.PUBLICATION, new gx2.a(14)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f148427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f148428b;

    public /* synthetic */ f(int i, List list, int i2) {
        if (3 != (i & 3)) {
            j1.f(d.f148425a.getDescriptor(), i, 3);
            throw null;
        }
        this.f148427a = list;
        this.f148428b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f148427a, fVar.f148427a) && this.f148428b == fVar.f148428b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f148428b) + (this.f148427a.hashCode() * 31);
    }
}
