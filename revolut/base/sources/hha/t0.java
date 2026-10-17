package hha;

import java.io.Serializable;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class t0 implements Serializable {

    @NotNull
    public static final s0 Companion = new s0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f152340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f152341b;

    public t0(dj0.d value, String typeStr) {
        Object next;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(typeStr, "typeStr");
        Iterator<E> it8 = u0.b().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (((u0) next).c(typeStr)) {
                    break;
                }
            }
        }
        u0 type = (u0) next;
        type = type == null ? u0.UNKNOWN : type;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f152340a = value;
        this.f152341b = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return Intrinsics.f(this.f152340a, t0Var.f152340a) && this.f152341b == t0Var.f152341b;
    }

    public final int hashCode() {
        return this.f152341b.hashCode() + (this.f152340a.hashCode() * 31);
    }
}
