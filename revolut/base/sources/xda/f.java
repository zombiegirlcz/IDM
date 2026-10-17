package xda;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304320b;

    public /* synthetic */ f(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(d.f304313a.getDescriptor(), i, 3);
            throw null;
        }
        this.f304319a = str;
        this.f304320b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f304319a, fVar.f304319a) && Intrinsics.f(this.f304320b, fVar.f304320b);
    }

    public final int hashCode() {
        return this.f304320b.hashCode() + (this.f304319a.hashCode() * 31);
    }
}
