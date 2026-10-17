package ip0;

import com.revolut.core.ui_kit.models.Clause;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class h3 {

    @NotNull
    public static final g3 Companion = new g3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i3 f164499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f164500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f164501c;

    public h3(i3 i3Var, Clause clause, Map map) {
        this.f164499a = i3Var;
        this.f164500b = clause;
        this.f164501c = map;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h3)) {
            return false;
        }
        h3 h3Var = (h3) obj2;
        return this.f164499a.equals(h3Var.f164499a) && this.f164500b.equals(h3Var.f164500b) && Intrinsics.f(this.f164501c, h3Var.f164501c);
    }

    public final int hashCode() {
        return p.a.e(p.a.b(this.f164499a.hashCode() * 31, 31, this.f164500b), 31, this.f164501c);
    }
}
