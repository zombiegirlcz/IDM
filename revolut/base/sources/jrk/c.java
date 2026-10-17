package jrk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f178042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f178043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f178044c;

    public /* synthetic */ c(int i, jo3.a aVar, jo3.a aVar2, Double d) {
        if (7 != (i & 7)) {
            j1.f(a.f178038a.getDescriptor(), i, 7);
            throw null;
        }
        this.f178042a = aVar;
        this.f178043b = aVar2;
        this.f178044c = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f178042a, cVar.f178042a) && Intrinsics.f(this.f178043b, cVar.f178043b) && Intrinsics.f(this.f178044c, cVar.f178044c);
    }

    public final int hashCode() {
        jo3.a aVar = this.f178042a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        jo3.a aVar2 = this.f178043b;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Double d = this.f178044c;
        return iHashCode2 + (d != null ? d.hashCode() : 0);
    }
}
