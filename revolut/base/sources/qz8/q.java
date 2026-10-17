package qz8;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class q {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f250399b = {yhm.j.c(yhm.k.PUBLICATION, new f(7))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zz8.c f250400a;

    public /* synthetic */ q(int i, zz8.c cVar) {
        if (1 == (i & 1)) {
            this.f250400a = cVar;
        } else {
            j1.f(o.f250398a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f250400a, ((q) obj2).f250400a);
    }

    public final int hashCode() {
        return this.f250400a.hashCode();
    }
}
