package f1a;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f131195b;

    public /* synthetic */ c(int i, dj0.d dVar, String str) {
        if (3 != (i & 3)) {
            j1.f(a.f131193a.getDescriptor(), i, 3);
            throw null;
        }
        this.f131194a = str;
        this.f131195b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f131194a, cVar.f131194a) && Intrinsics.f(this.f131195b, cVar.f131195b);
    }

    public final int hashCode() {
        int iHashCode = this.f131194a.hashCode() * 31;
        dj0.d dVar = this.f131195b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public c(dj0.d dVar, String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f131194a = transactionId;
        this.f131195b = dVar;
    }
}
