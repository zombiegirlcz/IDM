package aw0;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class c5 {

    @NotNull
    public static final b5 Companion = new b5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f10258b;

    public c5(Clause clause, List list) {
        this.f10257a = list;
        this.f10258b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c5)) {
            return false;
        }
        c5 c5Var = (c5) obj2;
        return Intrinsics.f(this.f10257a, c5Var.f10257a) && Intrinsics.f(this.f10258b, c5Var.f10258b);
    }

    public final int hashCode() {
        int iHashCode = this.f10257a.hashCode() * 31;
        Clause clause = this.f10258b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
