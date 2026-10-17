package gch;

import k4l.c0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f142473a;

    public a(c0 period) {
        Intrinsics.checkNotNullParameter(period, "period");
        this.f142473a = period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f142473a == ((a) obj2).f142473a;
    }

    public final int hashCode() {
        return this.f142473a.hashCode();
    }
}
