package jrk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class j0 {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f178062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f178063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f178064c;

    public /* synthetic */ j0(int i, String str, jo3.a aVar, Long l2) {
        if (1 != (i & 1)) {
            j1.f(h0.f178057a.getDescriptor(), i, 1);
            throw null;
        }
        this.f178062a = str;
        if ((i & 2) == 0) {
            this.f178063b = null;
        } else {
            this.f178063b = aVar;
        }
        if ((i & 4) == 0) {
            this.f178064c = null;
        } else {
            this.f178064c = l2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f178062a, j0Var.f178062a) && Intrinsics.f(this.f178063b, j0Var.f178063b) && Intrinsics.f(this.f178064c, j0Var.f178064c);
    }

    public final int hashCode() {
        int iHashCode = this.f178062a.hashCode() * 31;
        jo3.a aVar = this.f178063b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Long l2 = this.f178064c;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }
}
