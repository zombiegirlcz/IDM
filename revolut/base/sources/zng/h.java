package zng;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f323822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f323823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f323824c;
    public final TextLocalisedClause d;
    public final boolean e;

    public h(Clause subtitle, TextLocalisedClause title, TextLocalisedClause largeButtonText, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(largeButtonText, "largeButtonText");
        this.f323822a = items;
        this.f323823b = title;
        this.f323824c = subtitle;
        this.d = largeButtonText;
        this.e = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f323822a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f323822a.equals(hVar.f323822a) && this.f323823b.equals(hVar.f323823b) && this.f323824c.equals(hVar.f323824c) && this.d.equals(hVar.d) && this.e == hVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + t61.a.a(p.a.b(t61.a.a(this.f323822a.hashCode() * 31, 31, this.f323823b), 31, this.f323824c), 31, this.d);
    }
}
