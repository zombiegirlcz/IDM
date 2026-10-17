package cl4;

import h93.j0;
import h93.l0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f24956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f24957b;

    public o(j0 j0Var, l0 revolutCardSubProductType) {
        Intrinsics.checkNotNullParameter(revolutCardSubProductType, "revolutCardSubProductType");
        this.f24956a = j0Var;
        this.f24957b = revolutCardSubProductType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f24956a == oVar.f24956a && this.f24957b == oVar.f24957b;
    }

    public final int hashCode() {
        j0 j0Var = this.f24956a;
        return this.f24957b.hashCode() + ((j0Var == null ? 0 : j0Var.hashCode()) * 31);
    }
}
