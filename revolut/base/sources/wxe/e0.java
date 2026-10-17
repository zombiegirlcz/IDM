package wxe;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f300902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f300903b;

    public e0(d0 toolbarModel, List items) {
        Intrinsics.checkNotNullParameter(toolbarModel, "toolbarModel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f300902a = toolbarModel;
        this.f300903b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f300903b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f300902a, e0Var.f300902a) && Intrinsics.f(this.f300903b, e0Var.f300903b);
    }

    public final int hashCode() {
        return this.f300903b.hashCode() + (this.f300902a.hashCode() * 31);
    }
}
