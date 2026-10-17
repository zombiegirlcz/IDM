package ex2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f130342a;

    public e(a aVar) {
        this.f130342a = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f130342a, ((e) obj2).f130342a);
    }

    public final int hashCode() {
        a aVar = this.f130342a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }
}
