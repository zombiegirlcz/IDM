package vlm;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import nkm.t;
import nkm.y;
import zhm.d0;

/* JADX INFO: loaded from: classes14.dex */
public final class c extends uc0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KClass f290503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f290504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uc0.b f290505c;

    public c(KClass key, Object value, uc0.b next) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(next, "next");
        this.f290503a = key;
        this.f290504b = value;
        this.f290505c = next;
    }

    @Override // uc0.b
    public final Object h(KClass key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return key.equals(this.f290503a) ? nim.a.o(key).cast(this.f290504b) : this.f290505c.h(key);
    }

    public final String toString() {
        return d0.k0(d0.I0(y.J(t.g(this, new vjk.b(19)))), null, "{", "}", 0, new vjk.b(20), 25);
    }

    @Override // uc0.b
    public final uc0.b u(KClass key, Object obj2) {
        Intrinsics.checkNotNullParameter(key, "key");
        KClass kClass = this.f290503a;
        boolean zF = Intrinsics.f(key, kClass);
        uc0.b cVar = this.f290505c;
        if (!zF) {
            uc0.b bVarU = cVar.u(key, null);
            cVar = bVarU == cVar ? this : new c(kClass, this.f290504b, bVarU);
        }
        return obj2 != null ? new c(key, obj2, cVar) : cVar;
    }
}
