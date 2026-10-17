package oti;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class h1 {

    @NotNull
    public static final g1 Companion = new g1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f229642b = {yhm.j.c(yhm.k.PUBLICATION, new oqj.d(17))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f229643a;

    public /* synthetic */ h1(int i, List list) {
        if (1 == (i & 1)) {
            this.f229643a = list;
        } else {
            qlm.j1.f(f1.f229634a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h1) && Intrinsics.f(this.f229643a, ((h1) obj2).f229643a);
    }

    public final int hashCode() {
        return this.f229643a.hashCode();
    }
}
