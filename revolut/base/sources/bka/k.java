package bka;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class k implements n0, f1 {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f16321a;

    public /* synthetic */ k(int i, g gVar) {
        if (1 == (i & 1)) {
            this.f16321a = gVar;
        } else {
            j1.f(c.f16302a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f16321a, ((k) obj2).f16321a);
    }

    public final int hashCode() {
        return this.f16321a.f16311a.hashCode();
    }

    public k(g content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f16321a = content;
    }
}
