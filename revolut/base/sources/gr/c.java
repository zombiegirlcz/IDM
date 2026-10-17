package gr;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145776a;

    public /* synthetic */ c(int i, String str) {
        if (1 == (i & 1)) {
            this.f145776a = str;
        } else {
            j1.f(a.f145775a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f145776a, ((c) obj2).f145776a);
    }

    public final int hashCode() {
        return this.f145776a.hashCode();
    }
}
