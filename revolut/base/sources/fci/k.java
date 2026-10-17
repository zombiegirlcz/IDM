package fci;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f133786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f133787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f133788c;
    public final Object d;

    public k(Clause subTitle, TextLocalisedClause title, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        this.f133786a = items;
        this.f133787b = z;
        this.f133788c = title;
        this.d = subTitle;
    }

    @Override // cli.p
    public final List c() {
        return this.f133786a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f133786a, kVar.f133786a) && this.f133787b == kVar.f133787b && this.f133788c.equals(kVar.f133788c) && this.d.equals(kVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.a(j6.a.c(this.f133786a.hashCode() * 31, 31, this.f133787b), 31, this.f133788c);
    }
}
