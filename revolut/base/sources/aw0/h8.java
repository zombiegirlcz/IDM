package aw0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class h8 implements i8 {

    @NotNull
    public static final g8 Companion = new g8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f8 f10347b;

    public h8(ArrayList intros, f8 backgroundStrategy) {
        Intrinsics.checkNotNullParameter(intros, "intros");
        Intrinsics.checkNotNullParameter(backgroundStrategy, "backgroundStrategy");
        this.f10346a = intros;
        this.f10347b = backgroundStrategy;
        if (intros.isEmpty()) {
            throw new IllegalArgumentException("Sequence requires at least one intro");
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h8)) {
            return false;
        }
        h8 h8Var = (h8) obj2;
        return this.f10346a.equals(h8Var.f10346a) && this.f10347b.equals(h8Var.f10347b);
    }

    public final int hashCode() {
        return this.f10347b.hashCode() + (this.f10346a.hashCode() * 31);
    }
}
