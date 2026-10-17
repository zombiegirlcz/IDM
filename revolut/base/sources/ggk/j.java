package ggk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class j implements qf1.d {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f143733b;

    public /* synthetic */ j(int i, String str, jo3.a aVar) {
        if (3 != (i & 3)) {
            qlm.j1.f(h.f143725a.getDescriptor(), i, 3);
            throw null;
        }
        this.f143732a = str;
        this.f143733b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f143732a, jVar.f143732a) && Intrinsics.f(this.f143733b, jVar.f143733b);
    }

    public final int hashCode() {
        int iHashCode = this.f143732a.hashCode() * 31;
        jo3.a aVar = this.f143733b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public j(jo3.a aVar, String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        this.f143732a = itemId;
        this.f143733b = aVar;
    }
}
