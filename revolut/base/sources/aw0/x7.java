package aw0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class x7 implements y7 {

    @NotNull
    public static final w7 Companion = new w7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l6 f10607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f10608b;

    public x7(l6 product, List stories) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(stories, "stories");
        t7 actions = t7.f10544a;
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f10607a = product;
        this.f10608b = stories;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x7)) {
            return false;
        }
        x7 x7Var = (x7) obj2;
        if (!Intrinsics.f(this.f10607a, x7Var.f10607a) || !Intrinsics.f(this.f10608b, x7Var.f10608b)) {
            return false;
        }
        Object obj3 = t7.f10544a;
        return obj3.equals(obj3);
    }

    public final int hashCode() {
        return t7.f10544a.hashCode() + p.a.d(this.f10607a.hashCode() * 31, 31, this.f10608b);
    }

    @Override // aw0.y7
    public final t7 o() {
        return t7.f10544a;
    }
}
