package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e1 implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hel.b f318497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Links f318498b;

    public e1(Links links, hel.b context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(links, "links");
        this.f318497a = context;
        this.f318498b = links;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj2;
        return this.f318497a == e1Var.f318497a && Intrinsics.f(this.f318498b, e1Var.f318498b);
    }

    public final int hashCode() {
        return this.f318498b.hashCode() + (this.f318497a.hashCode() * 31);
    }
}
