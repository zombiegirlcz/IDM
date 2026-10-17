package zr5;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class j {

    @NotNull
    public static final c Companion = new c();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new zr4.b(6))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f324593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f324594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f324595c;

    public /* synthetic */ j(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            j1.f(b.f324585a.getDescriptor(), i, 7);
            throw null;
        }
        this.f324593a = str;
        this.f324594b = str2;
        this.f324595c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f324593a, jVar.f324593a) && Intrinsics.f(this.f324594b, jVar.f324594b) && Intrinsics.f(this.f324595c, jVar.f324595c);
    }

    public final int hashCode() {
        return this.f324595c.hashCode() + p.a.c(this.f324593a.hashCode() * 31, 31, this.f324594b);
    }
}
