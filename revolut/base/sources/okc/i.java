package okc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f225973a;

    public /* synthetic */ i(int i, String str) {
        if (1 == (i & 1)) {
            this.f225973a = str;
        } else {
            j1.f(g.f225972a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f225973a, ((i) obj2).f225973a);
    }

    public final int hashCode() {
        return this.f225973a.hashCode();
    }
}
