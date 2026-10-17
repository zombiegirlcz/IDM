package jl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final KSerializer[] f175524b = {new qlm.e(d.f175527a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f175525a;

    public c(int i, List list) {
        if ((i & 1) == 0) {
            this.f175525a = zhm.f0.f322471a;
        } else {
            this.f175525a = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f175525a, ((c) obj2).f175525a);
    }

    public final int hashCode() {
        return this.f175525a.hashCode();
    }

    public final String toString() {
        return "BiometricTokenStorageTaskInput(tokenItems=" + this.f175525a + ")";
    }
}
