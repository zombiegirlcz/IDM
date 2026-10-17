package kl7;

import java.util.List;
import kkf.z5;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class v {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f185393c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f185394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f185395b;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f185393c = new Lazy[]{yhm.j.c(kVar, new z5(21)), yhm.j.c(kVar, new z5(22))};
    }

    public /* synthetic */ v(int i, u uVar, List list) {
        if (1 != (i & 1)) {
            qlm.j1.f(s.f185385a.getDescriptor(), i, 1);
            throw null;
        }
        this.f185394a = uVar;
        if ((i & 2) == 0) {
            this.f185395b = null;
        } else {
            this.f185395b = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f185394a == vVar.f185394a && Intrinsics.f(this.f185395b, vVar.f185395b);
    }

    public final int hashCode() {
        int iHashCode = this.f185394a.hashCode() * 31;
        List list = this.f185395b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
