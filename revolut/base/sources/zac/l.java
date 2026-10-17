package zac;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f320654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f320655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f320656c;

    public l(TextLocalisedClause title, TextLocalisedClause buttonText, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f320654a = title;
        this.f320655b = buttonText;
        this.f320656c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f320656c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f320654a.equals(lVar.f320654a) && this.f320655b.equals(lVar.f320655b) && Intrinsics.f(this.f320656c, lVar.f320656c);
    }

    public final int hashCode() {
        return this.f320656c.hashCode() + t61.a.a(this.f320654a.hashCode() * 31, 31, this.f320655b);
    }
}
