package qha;

import hha.h0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f246583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f246584b;

    public e(h0 h0Var, Long l2) {
        this.f246583a = h0Var;
        this.f246584b = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f246583a == eVar.f246583a && Intrinsics.f(this.f246584b, eVar.f246584b);
    }

    public final int hashCode() {
        h0 h0Var = this.f246583a;
        int iHashCode = (h0Var == null ? 0 : h0Var.hashCode()) * 31;
        Long l2 = this.f246584b;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }
}
