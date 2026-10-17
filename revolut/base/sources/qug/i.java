package qug;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f249448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f249449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f249450c;
    public final boolean d;
    public final List e;

    public i(TextLocalisedClause navBarTitle, TextLocalisedClause navBarDescription, TextLocalisedClause nextButtonText, List items, boolean z) {
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(navBarDescription, "navBarDescription");
        Intrinsics.checkNotNullParameter(nextButtonText, "nextButtonText");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f249448a = navBarTitle;
        this.f249449b = navBarDescription;
        this.f249450c = nextButtonText;
        this.d = z;
        this.e = items;
    }

    @Override // cli.p
    public final List c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f249448a.equals(iVar.f249448a) && this.f249449b.equals(iVar.f249449b) && this.f249450c.equals(iVar.f249450c) && this.d == iVar.d && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(t61.a.a(t61.a.a(this.f249448a.hashCode() * 31, 31, this.f249449b), 31, this.f249450c), 31, this.d);
    }
}
