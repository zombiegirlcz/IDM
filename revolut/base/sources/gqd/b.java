package gqd;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f145675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f145676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a3 f145677c;

    public b(dj0.d value, a3 destinationExecutionTransaction, boolean z) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(destinationExecutionTransaction, "destinationExecutionTransaction");
        this.f145675a = z;
        this.f145676b = value;
        this.f145677c = destinationExecutionTransaction;
    }

    @Override // gqd.c
    public final boolean a() {
        return this.f145675a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f145675a == bVar.f145675a && Intrinsics.f(this.f145676b, bVar.f145676b) && Intrinsics.f(this.f145677c, bVar.f145677c);
    }

    @Override // gqd.c
    public final dj0.d getValue() {
        return this.f145676b;
    }

    public final int hashCode() {
        return this.f145677c.hashCode() + v7.c(Boolean.hashCode(this.f145675a) * 31, 31, this.f145676b);
    }
}
