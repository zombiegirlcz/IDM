package r65;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f251638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f251639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f251640c;

    public f(TextLocalisedClause title, TextLocalisedClause subtitle, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f251638a = title;
        this.f251639b = subtitle;
        this.f251640c = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f251640c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f251638a.equals(fVar.f251638a) && this.f251639b.equals(fVar.f251639b) && this.f251640c.equals(fVar.f251640c);
    }

    public final int hashCode() {
        return this.f251640c.hashCode() + t61.a.a(this.f251638a.hashCode() * 31, 31, this.f251639b);
    }
}
