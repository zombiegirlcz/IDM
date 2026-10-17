package n4d;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class h0 {

    @NotNull
    public static final g0 Companion = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f212360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ogd.d f212361b;

    public h0(List list, ogd.d dVar) {
        this.f212360a = list;
        this.f212361b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f212360a, h0Var.f212360a) && this.f212361b == h0Var.f212361b;
    }

    public final int hashCode() {
        return this.f212361b.hashCode() + (this.f212360a.hashCode() * 961);
    }
}
