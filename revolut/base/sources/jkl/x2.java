package jkl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class x2 {

    @NotNull
    public static final w2 Companion = new w2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f175497a;

    public /* synthetic */ x2(int i, String str) {
        if (1 == (i & 1)) {
            this.f175497a = str;
        } else {
            qlm.j1.f(v2.f175464a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x2) && Intrinsics.f(this.f175497a, ((x2) obj2).f175497a);
    }

    public final int hashCode() {
        return this.f175497a.hashCode();
    }
}
