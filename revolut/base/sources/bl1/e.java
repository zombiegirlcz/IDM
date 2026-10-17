package bl1;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f16458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f16459b;

    public e(TextLocalisedClause title, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f16458a = title;
        this.f16459b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f16459b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f16458a.equals(eVar.f16458a) && Intrinsics.f(this.f16459b, eVar.f16459b);
    }

    public final int hashCode() {
        return this.f16459b.hashCode() + (this.f16458a.hashCode() * 31);
    }
}
