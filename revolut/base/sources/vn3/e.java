package vn3;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f290741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f290742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f290743c;

    public e(TextLocalisedClause titleClause, TextLocalisedClause descriptionClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(descriptionClause, "descriptionClause");
        this.f290741a = items;
        this.f290742b = titleClause;
        this.f290743c = descriptionClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f290741a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f290741a, eVar.f290741a) && this.f290742b.equals(eVar.f290742b) && this.f290743c.equals(eVar.f290743c);
    }

    public final int hashCode() {
        return this.f290743c.hashCode() + t61.a.a(this.f290741a.hashCode() * 31, 31, this.f290742b);
    }
}
