package hs3;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class y implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ft3.j1 f154972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f154973c;

    public y(String str, ft3.j1 j1Var, Map map) {
        this.f154971a = str;
        this.f154972b = j1Var;
        this.f154973c = map;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f154971a, yVar.f154971a) && this.f154972b == yVar.f154972b && Intrinsics.f(this.f154973c, yVar.f154973c);
    }

    public final int hashCode() {
        String str = this.f154971a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ft3.j1 j1Var = this.f154972b;
        int iHashCode2 = (iHashCode + (j1Var == null ? 0 : j1Var.hashCode())) * 31;
        Map map = this.f154973c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }
}
