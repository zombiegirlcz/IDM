package bx8;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f19526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f19527c;
    public final boolean d;

    public o(ArrayList items, TextClause navBarTitleClause, TextLocalisedClause navBarDescriptionClause, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarTitleClause, "navBarTitleClause");
        Intrinsics.checkNotNullParameter(navBarDescriptionClause, "navBarDescriptionClause");
        this.f19525a = items;
        this.f19526b = navBarTitleClause;
        this.f19527c = navBarDescriptionClause;
        this.d = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f19525a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f19525a.equals(oVar.f19525a) && this.f19526b.equals(oVar.f19526b) && this.f19527c.equals(oVar.f19527c) && this.d == oVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + t61.a.a(v7.b(this.f19525a.hashCode() * 31, 31, this.f19526b), 31, this.f19527c);
    }
}
