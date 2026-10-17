package vjl;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f289805c = {yhm.j.c(yhm.k.PUBLICATION, new ve7.i(18)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f289806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f289807b;

    public /* synthetic */ f(int i, e eVar, String str) {
        if (3 != (i & 3)) {
            j1.f(c.f289804a.getDescriptor(), i, 3);
            throw null;
        }
        this.f289806a = eVar;
        this.f289807b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f289806a == fVar.f289806a && Intrinsics.f(this.f289807b, fVar.f289807b);
    }

    public final int hashCode() {
        return this.f289807b.hashCode() + (this.f289806a.hashCode() * 31);
    }

    public f(e name, String displayName) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.f289806a = name;
        this.f289807b = displayName;
    }
}
