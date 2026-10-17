package qre;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f248727b = {yhm.j.c(yhm.k.PUBLICATION, new qni.a(15))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f248728a;

    public /* synthetic */ k(int i, List list) {
        if (1 == (i & 1)) {
            this.f248728a = list;
        } else {
            j1.f(i.f248726a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f248728a, ((k) obj2).f248728a);
    }

    public final int hashCode() {
        return this.f248728a.hashCode();
    }
}
