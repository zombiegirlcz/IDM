package lf7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class j implements k {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194662a;

    public /* synthetic */ j(int i, String str) {
        if (1 == (i & 1)) {
            this.f194662a = str;
        } else {
            j1.f(h.f194661a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f194662a, ((j) obj2).f194662a);
    }

    public final int hashCode() {
        return this.f194662a.hashCode();
    }
}
