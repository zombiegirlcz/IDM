package oug;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f229875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f229876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f229877c;
    public final List d;

    public i(TextLocalisedClause navBarTitle, TextLocalisedClause nextButtonText, List items, boolean z) {
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(nextButtonText, "nextButtonText");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f229875a = navBarTitle;
        this.f229876b = nextButtonText;
        this.f229877c = z;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f229875a.equals(iVar.f229875a) && this.f229876b.equals(iVar.f229876b) && this.f229877c == iVar.f229877c && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(t61.a.a(this.f229875a.hashCode() * 31, 31, this.f229876b), 31, this.f229877c);
    }
}
