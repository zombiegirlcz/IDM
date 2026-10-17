package yg3;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yfe.b2;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] d = {null, j.c(k.PUBLICATION, new b2(11)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f313502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f313503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f313504c;

    public /* synthetic */ c(int i, i iVar, List list, f fVar) {
        if (7 != (i & 7)) {
            j1.f(a.f313501a.getDescriptor(), i, 7);
            throw null;
        }
        this.f313502a = iVar;
        this.f313503b = list;
        this.f313504c = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f313502a, cVar.f313502a) && Intrinsics.f(this.f313503b, cVar.f313503b) && Intrinsics.f(this.f313504c, cVar.f313504c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f313502a.f313508a.hashCode() * 31, 31, this.f313503b);
        f fVar = this.f313504c;
        return iD + (fVar == null ? 0 : fVar.f313506a.hashCode());
    }
}
