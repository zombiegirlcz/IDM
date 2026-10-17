package jrk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f178058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f178059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f178060c;

    public /* synthetic */ i(int i, jo3.a aVar, jo3.a aVar2, Double d) {
        if (7 != (i & 7)) {
            j1.f(g.f178053a.getDescriptor(), i, 7);
            throw null;
        }
        this.f178058a = aVar;
        this.f178059b = aVar2;
        this.f178060c = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f178058a, iVar.f178058a) && Intrinsics.f(this.f178059b, iVar.f178059b) && Intrinsics.f(this.f178060c, iVar.f178060c);
    }

    public final int hashCode() {
        jo3.a aVar = this.f178058a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        jo3.a aVar2 = this.f178059b;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Double d = this.f178060c;
        return iHashCode2 + (d != null ? d.hashCode() : 0);
    }
}
