package i19;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f157592c = {null, j.c(k.PUBLICATION, new hzl.a(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f157593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f157594b;

    public /* synthetic */ c(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(a.f157591a.getDescriptor(), i, 3);
            throw null;
        }
        this.f157593a = str;
        this.f157594b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f157593a, cVar.f157593a) && Intrinsics.f(this.f157594b, cVar.f157594b);
    }

    public final int hashCode() {
        return this.f157594b.hashCode() + (this.f157593a.hashCode() * 31);
    }
}
