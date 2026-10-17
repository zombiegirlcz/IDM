package r76;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f252031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f252032b;

    public /* synthetic */ f(int i, String str, jo3.a aVar) {
        if (3 != (i & 3)) {
            j1.f(d.f252030a.getDescriptor(), i, 3);
            throw null;
        }
        this.f252031a = str;
        this.f252032b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f252031a, fVar.f252031a) && Intrinsics.f(this.f252032b, fVar.f252032b);
    }

    public final int hashCode() {
        return this.f252032b.hashCode() + (this.f252031a.hashCode() * 31);
    }
}
