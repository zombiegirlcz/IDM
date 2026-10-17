package hl7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class q6 {

    @NotNull
    public static final p6 Companion = new p6();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f153268c = {null, yhm.j.c(yhm.k.PUBLICATION, new q0(11))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f153270b;

    public /* synthetic */ q6(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(o6.f153244a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153269a = str;
        this.f153270b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q6)) {
            return false;
        }
        q6 q6Var = (q6) obj2;
        return Intrinsics.f(this.f153269a, q6Var.f153269a) && Intrinsics.f(this.f153270b, q6Var.f153270b);
    }

    public final int hashCode() {
        return this.f153270b.hashCode() + (this.f153269a.hashCode() * 31);
    }
}
