package se4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f262106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f262107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f262108c;

    public j(TextLocalisedClause title, TextLocalisedClause description, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f262106a = items;
        this.f262107b = title;
        this.f262108c = description;
    }

    @Override // cli.p
    public final List c() {
        return this.f262106a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f262106a, jVar.f262106a) && this.f262107b.equals(jVar.f262107b) && this.f262108c.equals(jVar.f262108c);
    }

    public final int hashCode() {
        return this.f262108c.hashCode() + t61.a.a(this.f262106a.hashCode() * 31, 31, this.f262107b);
    }
}
