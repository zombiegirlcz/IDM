package gla;

import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f144590b = {yhm.j.c(yhm.k.PUBLICATION, new gaa.b(29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f144591a;

    public /* synthetic */ i(int i, Map map) {
        if (1 == (i & 1)) {
            this.f144591a = map;
        } else {
            j1.f(g.f144589a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f144591a, ((i) obj2).f144591a);
    }

    public final int hashCode() {
        return this.f144591a.hashCode();
    }

    public i(Map products) {
        Intrinsics.checkNotNullParameter(products, "products");
        this.f144591a = products;
    }
}
