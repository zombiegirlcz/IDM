package fgf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135064a;

    public /* synthetic */ d(int i, String str) {
        if (1 == (i & 1)) {
            this.f135064a = str;
        } else {
            j1.f(b.f135063a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f135064a, ((d) obj2).f135064a);
    }

    public final int hashCode() {
        return this.f135064a.hashCode();
    }
}
