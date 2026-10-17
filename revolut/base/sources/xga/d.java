package xga;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f305645a;

    public /* synthetic */ d(int i, String str) {
        if (1 == (i & 1)) {
            this.f305645a = str;
        } else {
            j1.f(b.f305641a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f305645a, ((d) obj2).f305645a);
    }

    public final int hashCode() {
        return this.f305645a.hashCode();
    }
}
