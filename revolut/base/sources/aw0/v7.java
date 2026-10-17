package aw0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class v7 implements y7 {

    @NotNull
    public static final u7 Companion = new u7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ola.c f10573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f10574b;

    public v7(List stories, ola.c product) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(stories, "stories");
        t7 actions = t7.f10544a;
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f10573a = product;
        this.f10574b = stories;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v7)) {
            return false;
        }
        v7 v7Var = (v7) obj2;
        if (!this.f10573a.equals(v7Var.f10573a) || !Intrinsics.f(this.f10574b, v7Var.f10574b)) {
            return false;
        }
        Object obj3 = t7.f10544a;
        return obj3.equals(obj3);
    }

    public final int hashCode() {
        return (t7.f10544a.hashCode() + p.a.d(this.f10573a.hashCode() * 31, 31, this.f10574b)) * 31;
    }

    @Override // aw0.y7
    public final t7 o() {
        return t7.f10544a;
    }
}
