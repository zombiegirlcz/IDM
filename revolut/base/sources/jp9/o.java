package jp9;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f177245c = {yhm.j.c(yhm.k.PUBLICATION, new l(0)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f177246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f177247b;

    public /* synthetic */ o(int i, List list, boolean z) {
        if (3 != (i & 3)) {
            j1.f(m.f177244a.getDescriptor(), i, 3);
            throw null;
        }
        this.f177246a = list;
        this.f177247b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f177246a, oVar.f177246a) && this.f177247b == oVar.f177247b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f177247b) + (this.f177246a.hashCode() * 31);
    }
}
