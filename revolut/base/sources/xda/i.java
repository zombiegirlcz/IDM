package xda;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();
    public static final Lazy[] e = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new x5a.d(24))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f304330c;
    public final List d;

    public /* synthetic */ i(int i, String str, String str2, f fVar, List list) {
        if (15 != (i & 15)) {
            j1.f(g.f304323a.getDescriptor(), i, 15);
            throw null;
        }
        this.f304328a = str;
        this.f304329b = str2;
        this.f304330c = fVar;
        this.d = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f304328a, iVar.f304328a) && Intrinsics.f(this.f304329b, iVar.f304329b) && Intrinsics.f(this.f304330c, iVar.f304330c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f304328a.hashCode() * 31, 31, this.f304329b);
        f fVar = this.f304330c;
        int iHashCode = (iC + (fVar == null ? 0 : fVar.hashCode())) * 31;
        List list = this.d;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }
}
