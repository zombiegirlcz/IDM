package ttl;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f274465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f274466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f274467c;

    public r(TextLocalisedClause toolbarTitleClause, TextLocalisedClause nextButtonTextClause, List items) {
        Intrinsics.checkNotNullParameter(toolbarTitleClause, "toolbarTitleClause");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(nextButtonTextClause, "nextButtonTextClause");
        this.f274465a = toolbarTitleClause;
        this.f274466b = items;
        this.f274467c = nextButtonTextClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f274466b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f274465a.equals(rVar.f274465a) && Intrinsics.f(this.f274466b, rVar.f274466b) && this.f274467c.equals(rVar.f274467c);
    }

    public final int hashCode() {
        return this.f274467c.hashCode() + p.a.d(this.f274465a.hashCode() * 31, 31, this.f274466b);
    }
}
