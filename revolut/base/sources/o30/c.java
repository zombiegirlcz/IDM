package o30;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v20.n;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f221671c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x30.b f221672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f221673b;

    static {
        x30.b.Companion.getClass();
        f221671c = new c(x30.b.f302602h, null);
    }

    public c(x30.b snapshot, n nVar) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.f221672a = snapshot;
        this.f221673b = nVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f221672a, cVar.f221672a) && Intrinsics.f(this.f221673b, cVar.f221673b);
    }

    public final int hashCode() {
        int iHashCode = this.f221672a.hashCode() * 31;
        n nVar = this.f221673b;
        return iHashCode + (nVar == null ? 0 : nVar.hashCode());
    }
}
