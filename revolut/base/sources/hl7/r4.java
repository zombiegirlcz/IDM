package hl7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class r4 {

    @NotNull
    public static final q4 Companion = new q4();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f153287c = {null, yhm.j.c(yhm.k.PUBLICATION, new q0(8))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f153289b;

    public /* synthetic */ r4(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(p4.f153253a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153288a = str;
        this.f153289b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r4)) {
            return false;
        }
        r4 r4Var = (r4) obj2;
        return Intrinsics.f(this.f153288a, r4Var.f153288a) && Intrinsics.f(this.f153289b, r4Var.f153289b);
    }

    public final int hashCode() {
        return this.f153289b.hashCode() + (this.f153288a.hashCode() * 31);
    }
}
