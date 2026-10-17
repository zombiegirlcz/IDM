package gmk;

import cli.p;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f144880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f144881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f144882c;

    public i(TextClause headerClause, TextLocalisedClause buttonClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerClause, "headerClause");
        Intrinsics.checkNotNullParameter(buttonClause, "buttonClause");
        this.f144880a = items;
        this.f144881b = headerClause;
        this.f144882c = buttonClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f144880a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f144880a, iVar.f144880a) && this.f144881b.equals(iVar.f144881b) && this.f144882c.equals(iVar.f144882c);
    }

    public final int hashCode() {
        return this.f144882c.hashCode() + v7.b(this.f144880a.hashCode() * 31, 31, this.f144881b);
    }
}
