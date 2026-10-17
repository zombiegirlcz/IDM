package bka;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class r implements n0 {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f16333a;

    public /* synthetic */ r(int i, p pVar) {
        if (1 == (i & 1)) {
            this.f16333a = pVar;
        } else {
            j1.f(l.f16324a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f16333a, ((r) obj2).f16333a);
    }

    public final int hashCode() {
        return this.f16333a.hashCode();
    }

    public r(p content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f16333a = content;
    }
}
