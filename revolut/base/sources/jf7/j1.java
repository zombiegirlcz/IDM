package jf7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class j1 implements l1 {

    @NotNull
    public static final f1 Companion = new f1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f173684c = {null, yhm.j.c(yhm.k.PUBLICATION, new ja3.b(19))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f173686b;

    public /* synthetic */ j1(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(e1.f173670a.getDescriptor(), i, 3);
            throw null;
        }
        this.f173685a = str;
        this.f173686b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj2;
        return Intrinsics.f(this.f173685a, j1Var.f173685a) && Intrinsics.f(this.f173686b, j1Var.f173686b);
    }

    public final int hashCode() {
        return this.f173686b.hashCode() + (this.f173685a.hashCode() * 31);
    }
}
