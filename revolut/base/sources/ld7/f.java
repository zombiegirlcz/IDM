package ld7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f194043a;

    public /* synthetic */ f(int i, c cVar) {
        if (1 == (i & 1)) {
            this.f194043a = cVar;
        } else {
            j1.f(d.f194042a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f194043a, ((f) obj2).f194043a);
    }

    public final int hashCode() {
        return this.f194043a.hashCode();
    }

    public f(c content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f194043a = content;
    }
}
