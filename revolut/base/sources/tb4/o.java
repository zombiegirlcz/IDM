package tb4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f269447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f269448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f269449c;
    public final TextLocalisedClause d;
    public final Clause e;
    public final boolean f;

    public o(List items, TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause primaryButtonTitle, TextLocalisedClause textLocalisedClause, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButtonTitle, "primaryButtonTitle");
        this.f269447a = items;
        this.f269448b = title;
        this.f269449c = description;
        this.d = primaryButtonTitle;
        this.e = textLocalisedClause;
        this.f = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f269447a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f269447a, oVar.f269447a) && this.f269448b.equals(oVar.f269448b) && this.f269449c.equals(oVar.f269449c) && this.d.equals(oVar.d) && Intrinsics.f(this.e, oVar.e) && this.f == oVar.f;
    }

    public final int hashCode() {
        int iA = t61.a.a(t61.a.a(t61.a.a(this.f269447a.hashCode() * 31, 31, this.f269448b), 31, this.f269449c), 31, this.d);
        Clause clause = this.e;
        return Boolean.hashCode(this.f) + ((iA + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
