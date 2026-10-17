package jp9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class j implements k {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177242a;

    public /* synthetic */ j(int i, String str) {
        if (1 == (i & 1)) {
            this.f177242a = str;
        } else {
            j1.f(h.f177241a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f177242a, ((j) obj2).f177242a);
    }

    public final int hashCode() {
        return this.f177242a.hashCode();
    }
}
