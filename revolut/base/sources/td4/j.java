package td4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f269928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f269929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f269930c;
    public final TextLocalisedClause d;

    public j(TextLocalisedClause navBarTitle, TextLocalisedClause navBarDescription, TextLocalisedClause buttonText, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(navBarDescription, "navBarDescription");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f269928a = items;
        this.f269929b = navBarTitle;
        this.f269930c = navBarDescription;
        this.d = buttonText;
    }

    @Override // jki.n
    public final List c() {
        return this.f269928a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f269928a.equals(jVar.f269928a) && this.f269929b.equals(jVar.f269929b) && this.f269930c.equals(jVar.f269930c) && this.d.equals(jVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.a(t61.a.a(this.f269928a.hashCode() * 31, 31, this.f269929b), 31, this.f269930c);
    }
}
