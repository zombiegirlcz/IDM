package okc;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();
    public static final Lazy[] d = {yhm.j.c(yhm.k.PUBLICATION, new ok7.b(1)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f225983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f225984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f225985c;

    public /* synthetic */ r(int i, List list, Boolean bool, l lVar) {
        if (7 != (i & 7)) {
            j1.f(p.f225982a.getDescriptor(), i, 7);
            throw null;
        }
        this.f225983a = list;
        this.f225984b = bool;
        this.f225985c = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f225983a, rVar.f225983a) && Intrinsics.f(this.f225984b, rVar.f225984b) && Intrinsics.f(this.f225985c, rVar.f225985c);
    }

    public final int hashCode() {
        int iHashCode = this.f225983a.hashCode() * 31;
        Boolean bool = this.f225984b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        l lVar = this.f225985c;
        return iHashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }
}
