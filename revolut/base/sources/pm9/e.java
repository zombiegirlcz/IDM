package pm9;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f237486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f237487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f237488c;

    public e(TextLocalisedClause title, TextLocalisedClause description, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f237486a = items;
        this.f237487b = title;
        this.f237488c = description;
    }

    @Override // cli.p
    public final List c() {
        return this.f237486a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f237486a, eVar.f237486a) && this.f237487b.equals(eVar.f237487b) && this.f237488c.equals(eVar.f237488c);
    }

    public final int hashCode() {
        return this.f237488c.hashCode() + t61.a.a(this.f237486a.hashCode() * 31, 31, this.f237487b);
    }
}
