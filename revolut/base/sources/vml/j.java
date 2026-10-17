package vml;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f290623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f290624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f290625c;
    public final boolean d;
    public final Clause e;
    public final List f;

    public j(aim.e items, TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause primaryAction, TextLocalisedClause textLocalisedClause, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryAction, "primaryAction");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f290623a = title;
        this.f290624b = description;
        this.f290625c = primaryAction;
        this.d = z;
        this.e = textLocalisedClause;
        this.f = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f290623a.equals(jVar.f290623a) && this.f290624b.equals(jVar.f290624b) && this.f290625c.equals(jVar.f290625c) && this.d == jVar.d && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f);
    }

    public final int hashCode() {
        int iC = j6.a.c(t61.a.a(t61.a.a(this.f290623a.hashCode() * 31, 31, this.f290624b), 31, this.f290625c), 31, this.d);
        Clause clause = this.e;
        return this.f.hashCode() + ((iC + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
