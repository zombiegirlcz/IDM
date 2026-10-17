package egb;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class s implements g0 {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f125616c = {null, yhm.j.c(yhm.k.PUBLICATION, new ebl.a(26))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f125617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f125618b;

    public /* synthetic */ s(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(k.f125600a.getDescriptor(), i, 3);
            throw null;
        }
        this.f125617a = str;
        this.f125618b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f125617a, sVar.f125617a) && Intrinsics.f(this.f125618b, sVar.f125618b);
    }

    public final int hashCode() {
        return this.f125618b.hashCode() + (this.f125617a.hashCode() * 31);
    }
}
