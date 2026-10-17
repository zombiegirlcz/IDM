package sug;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f265762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f265763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f265764c;
    public final boolean d;
    public final ArrayList e;

    public j(TextLocalisedClause navBarTitle, TextLocalisedClause navBarDescription, TextLocalisedClause buttonText, ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(navBarDescription, "navBarDescription");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f265762a = navBarTitle;
        this.f265763b = navBarDescription;
        this.f265764c = buttonText;
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
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f265762a.equals(jVar.f265762a) && this.f265763b.equals(jVar.f265763b) && this.f265764c.equals(jVar.f265764c) && this.d == jVar.d && this.e.equals(jVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(t61.a.a(t61.a.a(this.f265762a.hashCode() * 31, 31, this.f265763b), 31, this.f265764c), 31, this.d);
    }
}
