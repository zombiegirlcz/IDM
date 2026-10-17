package nif;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class h1 {

    @NotNull
    public static final g1 Companion = new g1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f215840b = {yhm.j.c(yhm.k.PUBLICATION, new nhl.s(14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f215841a;

    public /* synthetic */ h1(int i, List list) {
        if (1 == (i & 1)) {
            this.f215841a = list;
        } else {
            qlm.j1.f(f1.f215789a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final List a() {
        return this.f215841a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h1) && Intrinsics.f(this.f215841a, ((h1) obj2).f215841a);
    }

    public final int hashCode() {
        return this.f215841a.hashCode();
    }

    public h1(List ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        this.f215841a = ids;
    }
}
