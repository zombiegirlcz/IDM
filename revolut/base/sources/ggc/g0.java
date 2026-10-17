package ggc;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f143627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f143628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f143629c;
    public final String d;
    public final ArrayList e;

    public g0(d0 type, boolean z, y merchant, String relevantPlanId, ArrayList previewPlanInfos) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        Intrinsics.checkNotNullParameter(relevantPlanId, "relevantPlanId");
        Intrinsics.checkNotNullParameter(previewPlanInfos, "previewPlanInfos");
        this.f143627a = type;
        this.f143628b = z;
        this.f143629c = merchant;
        this.d = relevantPlanId;
        this.e = previewPlanInfos;
    }

    public final h0 a() {
        for (h0 h0Var : this.e) {
            if (Intrinsics.f(h0Var.f143632b, this.d)) {
                return h0Var;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final boolean b() {
        return a().f143636j == cgc.o.STUDENT;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return this.f143627a == g0Var.f143627a && this.f143628b == g0Var.f143628b && this.f143629c.equals(g0Var.f143629c) && Intrinsics.f(this.d, g0Var.d) && this.e.equals(g0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c((this.f143629c.hashCode() + j6.a.c(this.f143627a.hashCode() * 31, 31, this.f143628b)) * 31, 31, this.d);
    }
}
