package f23;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f131353a;

    public c(a aVar) {
        this.f131353a = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f131353a, ((c) obj2).f131353a);
    }

    public final int hashCode() {
        a aVar = this.f131353a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }
}
