package doc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hoc.e f116496a;

    public e0(hoc.e eVar) {
        this.f116496a = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e0) && Intrinsics.f(this.f116496a, ((e0) obj2).f116496a);
    }

    public final int hashCode() {
        hoc.e eVar = this.f116496a;
        if (eVar == null) {
            return 0;
        }
        return eVar.hashCode();
    }
}
