package ky5;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f190630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f190631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CompositeClause f190632c;
    public final Clause d;
    public final LayeredImage e;

    public a(TextClause textClause, Clause clause, CompositeClause compositeClause, Clause clause2, LayeredImage layeredImage) {
        this.f190630a = textClause;
        this.f190631b = clause;
        this.f190632c = compositeClause;
        this.d = clause2;
        this.e = layeredImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f190630a.equals(aVar.f190630a) && Intrinsics.f(this.f190631b, aVar.f190631b) && this.f190632c.equals(aVar.f190632c) && Intrinsics.f(this.d, aVar.d) && this.e.equals(aVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f190630a.hashCode() * 31;
        Clause clause = this.f190631b;
        int iC = l.c(this.f190632c, (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31);
        Clause clause2 = this.d;
        return this.e.hashCode() + ((iC + (clause2 != null ? clause2.hashCode() : 0)) * 31);
    }
}
