package gla;

import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class q {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f144598b = {yhm.j.c(yhm.k.PUBLICATION, new k(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f144599a;

    public /* synthetic */ q(int i, Map map) {
        if (1 == (i & 1)) {
            this.f144599a = map;
        } else {
            j1.f(o.f144597a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f144599a, ((q) obj2).f144599a);
    }

    public final int hashCode() {
        return this.f144599a.hashCode();
    }
}
