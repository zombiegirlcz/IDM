package jye;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1f.a f179415a;

    public a(e1f.a limits) {
        Intrinsics.checkNotNullParameter(limits, "limits");
        this.f179415a = limits;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f179415a.equals(((a) obj2).f179415a);
    }

    public final int hashCode() {
        return this.f179415a.hashCode();
    }
}
