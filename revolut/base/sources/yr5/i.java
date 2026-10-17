package yr5;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yna.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new j1(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f316136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f316137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f316138c;

    public /* synthetic */ i(int i, String str, String str2, u uVar) {
        if (3 != (i & 3)) {
            qlm.j1.f(g.f316135a.getDescriptor(), i, 3);
            throw null;
        }
        this.f316136a = str;
        this.f316137b = str2;
        if ((i & 4) == 0) {
            this.f316138c = u.ONE_YEAR;
        } else {
            this.f316138c = uVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f316136a, iVar.f316136a) && Intrinsics.f(this.f316137b, iVar.f316137b) && this.f316138c == iVar.f316138c;
    }

    public final int hashCode() {
        return this.f316138c.hashCode() + p.a.c(this.f316136a.hashCode() * 31, 31, this.f316137b);
    }
}
