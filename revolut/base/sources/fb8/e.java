package fb8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p98.a f133505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eb8.k f133506c;

    public /* synthetic */ e(int i, String str, p98.a aVar, eb8.k kVar) {
        if (3 != (i & 3)) {
            j1.f(c.f133503a.getDescriptor(), i, 3);
            throw null;
        }
        this.f133504a = str;
        this.f133505b = aVar;
        if ((i & 4) == 0) {
            this.f133506c = null;
        } else {
            this.f133506c = kVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f133504a, eVar.f133504a) && this.f133505b == eVar.f133505b && Intrinsics.f(this.f133506c, eVar.f133506c);
    }

    public final int hashCode() {
        int iHashCode = (this.f133505b.hashCode() + (this.f133504a.hashCode() * 31)) * 31;
        eb8.k kVar = this.f133506c;
        return iHashCode + (kVar == null ? 0 : kVar.hashCode());
    }
}
