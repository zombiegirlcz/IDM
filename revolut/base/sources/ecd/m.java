package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f124613a;

    public /* synthetic */ m(int i, Boolean bool) {
        if (1 == (i & 1)) {
            this.f124613a = bool;
        } else {
            qlm.j1.f(k.f124598a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f124613a, ((m) obj2).f124613a);
    }

    public final int hashCode() {
        Boolean bool = this.f124613a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public m(Boolean bool) {
        this.f124613a = bool;
    }
}
