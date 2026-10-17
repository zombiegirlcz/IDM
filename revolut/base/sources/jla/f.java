package jla;

import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f175660b = {yhm.j.c(yhm.k.PUBLICATION, new jj9.b(16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f175661a;

    public /* synthetic */ f(int i, Map map) {
        if (1 == (i & 1)) {
            this.f175661a = map;
        } else {
            j1.f(d.f175659a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f175661a, ((f) obj2).f175661a);
    }

    public final int hashCode() {
        return this.f175661a.hashCode();
    }

    public f(Map products) {
        Intrinsics.checkNotNullParameter(products, "products");
        this.f175661a = products;
    }
}
