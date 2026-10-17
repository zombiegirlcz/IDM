package dbc;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f112709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f112710b;

    public f(TextLocalisedClause navBarTitle, List items) {
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f112709a = navBarTitle;
        this.f112710b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f112710b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f112709a.equals(fVar.f112709a) && Intrinsics.f(this.f112710b, fVar.f112710b);
    }

    public final int hashCode() {
        return this.f112710b.hashCode() + (this.f112709a.hashCode() * 31);
    }
}
