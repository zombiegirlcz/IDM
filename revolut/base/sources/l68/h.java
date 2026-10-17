package l68;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f192366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f192367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f192368c;
    public final TextLocalisedClause d;

    public h(TextLocalisedClause title, TextLocalisedClause buttonLabel, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        this.f192366a = items;
        this.f192367b = title;
        this.f192368c = z;
        this.d = buttonLabel;
    }

    @Override // cli.p
    public final List c() {
        return this.f192366a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f192366a, hVar.f192366a) && this.f192367b.equals(hVar.f192367b) && this.f192368c == hVar.f192368c && this.d.equals(hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(t61.a.a(this.f192366a.hashCode() * 31, 31, this.f192367b), 31, this.f192368c);
    }
}
