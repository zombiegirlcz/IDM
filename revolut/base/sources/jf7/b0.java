package jf7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class b0 implements l1 {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173659a;

    public /* synthetic */ b0(int i, String str) {
        if (1 == (i & 1)) {
            this.f173659a = str;
        } else {
            qlm.j1.f(z.f173727a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && Intrinsics.f(this.f173659a, ((b0) obj2).f173659a);
    }

    public final int hashCode() {
        return this.f173659a.hashCode();
    }
}
