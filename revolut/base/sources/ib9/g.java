package ib9;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();
    public static final Lazy[] d = {null, null, j.c(k.PUBLICATION, new i83.b(8))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f160135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f160136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f160137c;

    public /* synthetic */ g(int i, d dVar, d dVar2, List list) {
        if (7 != (i & 7)) {
            j1.f(e.f160134a.getDescriptor(), i, 7);
            throw null;
        }
        this.f160135a = dVar;
        this.f160136b = dVar2;
        this.f160137c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f160135a, gVar.f160135a) && Intrinsics.f(this.f160136b, gVar.f160136b) && Intrinsics.f(this.f160137c, gVar.f160137c);
    }

    public final int hashCode() {
        d dVar = this.f160135a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        d dVar2 = this.f160136b;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        List list = this.f160137c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public g(d dVar, d dVar2, List list) {
        this.f160135a = dVar;
        this.f160136b = dVar2;
        this.f160137c = list;
    }
}
