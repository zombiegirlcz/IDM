package aw0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class d8 implements i8 {

    @NotNull
    public static final c8 Companion = new c8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l6 f10282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b8 f10283b;

    public d8(l6 product, b8 actions) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f10282a = product;
        this.f10283b = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d8)) {
            return false;
        }
        d8 d8Var = (d8) obj2;
        return Intrinsics.f(this.f10282a, d8Var.f10282a) && Intrinsics.f(this.f10283b, d8Var.f10283b);
    }

    public final int hashCode() {
        return this.f10283b.hashCode() + (this.f10282a.hashCode() * 31);
    }

    public /* synthetic */ d8(l6 l6Var) {
        this(l6Var, a8.f10234a);
    }
}
