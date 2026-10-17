package z45;

import ht3.l0;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f319315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f319316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f319317c;

    public c(l0 prompt, d confirmation, e eVar) {
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        Intrinsics.checkNotNullParameter(confirmation, "confirmation");
        this.f319315a = prompt;
        this.f319316b = confirmation;
        this.f319317c = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f319315a, cVar.f319315a) && Intrinsics.f(this.f319316b, cVar.f319316b) && Intrinsics.f(this.f319317c, cVar.f319317c);
    }

    public final int hashCode() {
        int iHashCode = (this.f319316b.hashCode() + (this.f319315a.hashCode() * 31)) * 31;
        e eVar = this.f319317c;
        return iHashCode + (eVar == null ? 0 : eVar.hashCode());
    }
}
