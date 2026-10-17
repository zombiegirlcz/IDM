package gqc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145628b;

    public /* synthetic */ f(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(d.f145622a.getDescriptor(), i, 3);
            throw null;
        }
        this.f145627a = str;
        this.f145628b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f145627a, fVar.f145627a) && Intrinsics.f(this.f145628b, fVar.f145628b);
    }

    public final int hashCode() {
        return this.f145628b.hashCode() + (this.f145627a.hashCode() * 31);
    }
}
