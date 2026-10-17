package xeb;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304570a;

    public /* synthetic */ d(int i, String str) {
        if (1 == (i & 1)) {
            this.f304570a = str;
        } else {
            j1.f(b.f304569a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f304570a, ((d) obj2).f304570a);
    }

    public final int hashCode() {
        return this.f304570a.hashCode();
    }
}
