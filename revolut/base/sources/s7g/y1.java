package s7g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class y1 {

    @NotNull
    public static final x1 Companion = new x1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260817a;

    public /* synthetic */ y1(int i, String str) {
        if (1 == (i & 1)) {
            this.f260817a = str;
        } else {
            qlm.j1.f(w1.f260811a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y1) && Intrinsics.f(this.f260817a, ((y1) obj2).f260817a);
    }

    public final int hashCode() {
        return this.f260817a.hashCode();
    }

    public y1(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f260817a = token;
    }
}
