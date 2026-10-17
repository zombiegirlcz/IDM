package p35;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f232654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f232655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f232656c;
    public final Long d;
    public final String e;

    public l0(n0 type, m0 state, dj0.d dVar, Long l2, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f232654a = type;
        this.f232655b = state;
        this.f232656c = dVar;
        this.d = l2;
        this.e = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return this.f232654a == l0Var.f232654a && this.f232655b == l0Var.f232655b && Intrinsics.f(this.f232656c, l0Var.f232656c) && Intrinsics.f(this.d, l0Var.d) && Intrinsics.f(this.e, l0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f232655b.hashCode() + (this.f232654a.hashCode() * 31)) * 31;
        dj0.d dVar = this.f232656c;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.e;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }
}
