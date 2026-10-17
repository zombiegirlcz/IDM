package hl7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class t0 {

    @NotNull
    public static final s0 Companion = new s0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f153309b = {yhm.j.c(yhm.k.PUBLICATION, new q0(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f153310a;

    public /* synthetic */ t0(int i, List list) {
        if (1 == (i & 1)) {
            this.f153310a = list;
        } else {
            qlm.j1.f(r0.f153282a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t0) && Intrinsics.f(this.f153310a, ((t0) obj2).f153310a);
    }

    public final int hashCode() {
        return this.f153310a.hashCode();
    }
}
