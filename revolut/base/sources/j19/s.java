package j19;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class s implements c {

    @NotNull
    public static final o Companion = new o();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new j18.j(6))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f170247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f170248c;

    public /* synthetic */ s(int i, int i2, String str, List list) {
        if (7 != (i & 7)) {
            qlm.j1.f(n.f170229a.getDescriptor(), i, 7);
            throw null;
        }
        this.f170246a = str;
        this.f170247b = i2;
        this.f170248c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f170246a, sVar.f170246a) && this.f170247b == sVar.f170247b && Intrinsics.f(this.f170248c, sVar.f170248c);
    }

    public final int hashCode() {
        return this.f170248c.hashCode() + j6.a.b(this.f170247b, this.f170246a.hashCode() * 31, 31);
    }
}
