package j29;

import j1f.q0;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class d0 {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f170748c = {null, yhm.j.c(yhm.k.PUBLICATION, new q0(6))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f170749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f170750b;

    public /* synthetic */ d0(int i, t tVar, List list) {
        if (3 != (i & 3)) {
            j1.f(p.f170764a.getDescriptor(), i, 3);
            throw null;
        }
        this.f170749a = tVar;
        this.f170750b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f170749a, d0Var.f170749a) && Intrinsics.f(this.f170750b, d0Var.f170750b);
    }

    public final int hashCode() {
        return this.f170750b.hashCode() + (this.f170749a.hashCode() * 31);
    }
}
