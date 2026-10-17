package lzi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f200975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f200976b;

    public c() {
        this(0, 3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f200975a == cVar.f200975a && this.f200976b == cVar.f200976b;
    }

    public final int hashCode() {
        return this.f200976b.hashCode() + (Integer.hashCode(this.f200975a) * 31);
    }

    public c(int i, b behaviour) {
        Intrinsics.checkNotNullParameter(behaviour, "behaviour");
        this.f200975a = i;
        this.f200976b = behaviour;
    }

    public /* synthetic */ c(int i, int i2) {
        this((i2 & 1) != 0 ? 1 : i, b.EXACT);
    }
}
