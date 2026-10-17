package qo6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f248060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f248061b;

    public /* synthetic */ i(int i, String str, jo3.a aVar) {
        if (3 != (i & 3)) {
            j1.f(g.f248059a.getDescriptor(), i, 3);
            throw null;
        }
        this.f248060a = str;
        this.f248061b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f248060a, iVar.f248060a) && Intrinsics.f(this.f248061b, iVar.f248061b);
    }

    public final int hashCode() {
        int iHashCode = this.f248060a.hashCode() * 31;
        jo3.a aVar = this.f248061b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
