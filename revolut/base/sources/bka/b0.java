package bka;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class b0 implements n0 {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f16298a;

    public /* synthetic */ b0(int i, x xVar) {
        if (1 == (i & 1)) {
            this.f16298a = xVar;
        } else {
            j1.f(t.f16338a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && Intrinsics.f(this.f16298a, ((b0) obj2).f16298a);
    }

    public final int hashCode() {
        return this.f16298a.hashCode();
    }

    public b0(x content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f16298a = content;
    }
}
