package fgf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135066a;

    public /* synthetic */ h(int i, String str) {
        if (1 == (i & 1)) {
            this.f135066a = str;
        } else {
            j1.f(f.f135065a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f135066a, ((h) obj2).f135066a);
    }

    public final int hashCode() {
        return this.f135066a.hashCode();
    }
}
