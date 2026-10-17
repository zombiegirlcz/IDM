package t6c;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class o {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f268306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f268307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f268308c;

    public o(List options, n nVar, boolean z) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f268306a = options;
        this.f268307b = nVar;
        this.f268308c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f268306a, oVar.f268306a) && Intrinsics.f(this.f268307b, oVar.f268307b) && this.f268308c == oVar.f268308c;
    }

    public final int hashCode() {
        int iHashCode = this.f268306a.hashCode() * 31;
        n nVar = this.f268307b;
        return Boolean.hashCode(this.f268308c) + ((iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31);
    }
}
