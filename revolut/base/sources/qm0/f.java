package qm0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f247745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f247746b;

    public /* synthetic */ f(int i, int i2, String str) {
        if (3 != (i & 3)) {
            j1.f(d.f247744a.getDescriptor(), i, 3);
            throw null;
        }
        this.f247745a = i2;
        this.f247746b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f247745a == fVar.f247745a && Intrinsics.f(this.f247746b, fVar.f247746b);
    }

    public final int hashCode() {
        return this.f247746b.hashCode() + (Integer.hashCode(this.f247745a) * 31);
    }
}
