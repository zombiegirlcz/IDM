package rl0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f254906a;

    public a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f254906a = value;
        c cVar = d.Companion;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f254906a, ((a) obj2).f254906a);
    }

    public final int hashCode() {
        return this.f254906a.hashCode();
    }
}
