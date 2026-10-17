package zh5;

import aii.e;
import kotlin.jvm.internal.Intrinsics;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f322237a;

    public a(b bVar) {
        this.f322237a = bVar;
    }

    public final b b() {
        return this.f322237a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f322237a, ((a) obj2).f322237a);
    }

    public final int hashCode() {
        b bVar = this.f322237a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }
}
