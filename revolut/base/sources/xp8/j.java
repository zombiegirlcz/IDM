package xp8;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f307908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f307909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f307910c;

    public j(TextLocalisedClause nextButtonText, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(nextButtonText, "nextButtonText");
        this.f307908a = items;
        this.f307909b = nextButtonText;
        this.f307910c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f307908a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f307908a, jVar.f307908a) && this.f307909b.equals(jVar.f307909b) && this.f307910c == jVar.f307910c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f307910c) + t61.a.a(this.f307908a.hashCode() * 31, 31, this.f307909b);
    }
}
