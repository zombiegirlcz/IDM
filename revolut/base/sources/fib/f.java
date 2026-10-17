package fib;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135371a;

    public /* synthetic */ f(int i, String str) {
        if (1 == (i & 1)) {
            this.f135371a = str;
        } else {
            j1.f(d.f135370a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f135371a, ((f) obj2).f135371a);
    }

    public final int hashCode() {
        return this.f135371a.hashCode();
    }

    public f(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f135371a = token;
    }
}
