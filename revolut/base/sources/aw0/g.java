package aw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n6 f10315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n6 f10316c;
    public final Clause d;
    public final f e;

    public g(boolean z, n6 primaryButton, n6 secondaryButton, Clause clause, f layoutType) {
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
        this.f10314a = z;
        this.f10315b = primaryButton;
        this.f10316c = secondaryButton;
        this.d = clause;
        this.e = layoutType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f10314a == gVar.f10314a && Intrinsics.f(this.f10315b, gVar.f10315b) && Intrinsics.f(this.f10316c, gVar.f10316c) && Intrinsics.f(this.d, gVar.d) && this.e == gVar.e;
    }

    public final int hashCode() {
        int iHashCode = (this.f10316c.hashCode() + ((this.f10315b.hashCode() + (Boolean.hashCode(this.f10314a) * 31)) * 31)) * 31;
        Clause clause = this.d;
        return this.e.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }

    public /* synthetic */ g(n6 n6Var, n6 n6Var2, Clause clause, f fVar, int i) {
        this((i & 1) == 0, n6Var, n6Var2, (i & 8) != 0 ? null : clause, (i & 16) != 0 ? f.EQUAL_BUTTONS : fVar);
    }
}
