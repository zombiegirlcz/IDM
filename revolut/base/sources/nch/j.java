package nch;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f214191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f214192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f214193c;

    public j(i navBarConfig, TextLocalisedClause buttonTextClause, List items) {
        Intrinsics.checkNotNullParameter(navBarConfig, "navBarConfig");
        Intrinsics.checkNotNullParameter(buttonTextClause, "buttonTextClause");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f214191a = navBarConfig;
        this.f214192b = buttonTextClause;
        this.f214193c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f214193c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f214191a.equals(jVar.f214191a) && this.f214192b.equals(jVar.f214192b) && Intrinsics.f(this.f214193c, jVar.f214193c);
    }

    public final int hashCode() {
        return this.f214193c.hashCode() + t61.a.a(this.f214191a.hashCode() * 31, 31, this.f214192b);
    }
}
