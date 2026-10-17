package ecd;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class s0 {

    @NotNull
    public static final r0 Companion = new r0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f124661c = {null, yhm.j.c(yhm.k.PUBLICATION, new ebl.a(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f124662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f124663b;

    public /* synthetic */ s0(int i, v0 v0Var, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(q0.f124650a.getDescriptor(), i, 3);
            throw null;
        }
        this.f124662a = v0Var;
        this.f124663b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.f124662a, s0Var.f124662a) && Intrinsics.f(this.f124663b, s0Var.f124663b);
    }

    public final int hashCode() {
        return this.f124663b.hashCode() + (this.f124662a.hashCode() * 31);
    }

    public s0(v0 disclaimer, ArrayList items) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f124662a = disclaimer;
        this.f124663b = items;
    }
}
