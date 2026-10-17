package oti;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class w1 {

    @NotNull
    public static final v1 Companion = new v1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229700a;

    public /* synthetic */ w1(int i, String str) {
        if (1 == (i & 1)) {
            this.f229700a = str;
        } else {
            qlm.j1.f(u1.f229694a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w1) && Intrinsics.f(this.f229700a, ((w1) obj2).f229700a);
    }

    public final int hashCode() {
        return this.f229700a.hashCode();
    }
}
