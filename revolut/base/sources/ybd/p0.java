package ybd;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class p0 {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f312262c = {null, yhm.j.c(yhm.k.PUBLICATION, new y7k.h(14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f312263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f312264b;

    public /* synthetic */ p0(int i, x xVar, List list) {
        if (3 != (i & 3)) {
            j1.f(i.f312239a.getDescriptor(), i, 3);
            throw null;
        }
        this.f312263a = xVar;
        this.f312264b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.f312263a, p0Var.f312263a) && Intrinsics.f(this.f312264b, p0Var.f312264b);
    }

    public final int hashCode() {
        x xVar = this.f312263a;
        return this.f312264b.hashCode() + ((xVar == null ? 0 : xVar.hashCode()) * 31);
    }

    public p0(x xVar, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f312263a = xVar;
        this.f312264b = items;
    }
}
