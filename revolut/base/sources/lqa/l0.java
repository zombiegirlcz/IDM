package lqa;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class l0 {

    @NotNull
    public static final k0 Companion = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f199263a;

    public /* synthetic */ l0(int i, String str) {
        if (1 == (i & 1)) {
            this.f199263a = str;
        } else {
            j1.f(j0.f199259a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l0) && Intrinsics.f(this.f199263a, ((l0) obj2).f199263a);
    }

    public final int hashCode() {
        return this.f199263a.hashCode();
    }
}
