package sdl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f261977a;

    public /* synthetic */ k(int i, i iVar) {
        if (1 == (i & 1)) {
            this.f261977a = iVar;
        } else {
            qlm.j1.f(f.f261965a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f261977a, ((k) obj2).f261977a);
    }

    public final int hashCode() {
        return this.f261977a.hashCode();
    }

    public k(i buyBlockSettings) {
        Intrinsics.checkNotNullParameter(buyBlockSettings, "buyBlockSettings");
        this.f261977a = buyBlockSettings;
    }
}
