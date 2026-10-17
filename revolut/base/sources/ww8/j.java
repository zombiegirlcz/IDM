package ww8;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f300627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f300628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f300629c;
    public final TextLocalisedClause d;
    public final boolean e;

    public j(TextLocalisedClause toolbarDescription, TextLocalisedClause toolbarTitle, TextLocalisedClause continueButton, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarDescription, "toolbarDescription");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(continueButton, "continueButton");
        this.f300627a = items;
        this.f300628b = toolbarDescription;
        this.f300629c = toolbarTitle;
        this.d = continueButton;
        this.e = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f300627a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f300627a, jVar.f300627a) && this.f300628b.equals(jVar.f300628b) && this.f300629c.equals(jVar.f300629c) && this.d.equals(jVar.d) && this.e == jVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + t61.a.a(t61.a.a(t61.a.a(this.f300627a.hashCode() * 31, 31, this.f300628b), 31, this.f300629c), 31, this.d);
    }
}
