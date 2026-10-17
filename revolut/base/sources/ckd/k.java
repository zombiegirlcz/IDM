package ckd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24810a;

    public /* synthetic */ k(int i, String str) {
        if (1 == (i & 1)) {
            this.f24810a = str;
        } else {
            j1.f(i.f24809a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f24810a, ((k) obj2).f24810a);
    }

    public final int hashCode() {
        return this.f24810a.hashCode();
    }
}
