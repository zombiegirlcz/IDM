package li8;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f195432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.e f195433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f195434c;

    public k(TextLocalisedClause title, aw0.e eVar, aim.e items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f195432a = title;
        this.f195433b = eVar;
        this.f195434c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f195434c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f195432a.equals(kVar.f195432a) && this.f195433b.equals(kVar.f195433b) && Intrinsics.f(this.f195434c, kVar.f195434c);
    }

    public final int hashCode() {
        return this.f195434c.hashCode() + ehe.n.c(this.f195433b, this.f195432a.hashCode() * 31, 31);
    }
}
