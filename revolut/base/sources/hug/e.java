package hug;

import cli.p;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f155648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f155649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f155650c;

    public e(TextClause navBarTitle, TextLocalisedClause buttonText, List items) {
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f155648a = navBarTitle;
        this.f155649b = buttonText;
        this.f155650c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f155650c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f155648a.equals(eVar.f155648a) && this.f155649b.equals(eVar.f155649b) && Intrinsics.f(this.f155650c, eVar.f155650c);
    }

    public final int hashCode() {
        return this.f155650c.hashCode() + t61.a.a(this.f155648a.hashCode() * 31, 31, this.f155649b);
    }
}
