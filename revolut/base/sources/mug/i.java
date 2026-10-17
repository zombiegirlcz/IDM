package mug;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f209029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f209030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f209031c;
    public final boolean d;
    public final ArrayList e;

    public i(TextLocalisedClause navBarTitle, TextLocalisedClause navBarDescription, TextLocalisedClause buttonText, ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(navBarDescription, "navBarDescription");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f209029a = navBarTitle;
        this.f209030b = navBarDescription;
        this.f209031c = buttonText;
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
        return this.f209029a.equals(iVar.f209029a) && this.f209030b.equals(iVar.f209030b) && this.f209031c.equals(iVar.f209031c) && this.d == iVar.d && this.e.equals(iVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(t61.a.a(t61.a.a(this.f209029a.hashCode() * 31, 31, this.f209030b), 31, this.f209031c), 31, this.d);
    }
}
