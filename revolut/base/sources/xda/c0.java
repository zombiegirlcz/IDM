package xda;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class c0 {

    @NotNull
    public static final b0 Companion = new b0();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f304312c;
    public final List d;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{null, null, yhm.j.c(kVar, new x5a.d(29)), yhm.j.c(kVar, new z(0))};
    }

    public /* synthetic */ c0(int i, String str, String str2, List list, List list2) {
        if (15 != (i & 15)) {
            j1.f(a0.f304302a.getDescriptor(), i, 15);
            throw null;
        }
        this.f304310a = str;
        this.f304311b = str2;
        this.f304312c = list;
        this.d = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f304310a, c0Var.f304310a) && Intrinsics.f(this.f304311b, c0Var.f304311b) && Intrinsics.f(this.f304312c, c0Var.f304312c) && Intrinsics.f(this.d, c0Var.d);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(this.f304310a.hashCode() * 31, 31, this.f304311b), 31, this.f304312c);
        List list = this.d;
        return iD + (list == null ? 0 : list.hashCode());
    }
}
