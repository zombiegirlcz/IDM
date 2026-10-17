package fi8;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ehe.n;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f135349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f135350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.e f135351c;
    public final List d;

    public i(TextLocalisedClause title, Clause clause, aw0.e eVar, aim.e items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f135349a = title;
        this.f135350b = clause;
        this.f135351c = eVar;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f135349a.equals(iVar.f135349a) && Intrinsics.f(this.f135350b, iVar.f135350b) && this.f135351c.equals(iVar.f135351c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f135349a.hashCode() * 31;
        Clause clause = this.f135350b;
        return this.d.hashCode() + n.c(this.f135351c, (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31);
    }
}
