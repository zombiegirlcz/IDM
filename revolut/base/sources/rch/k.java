package rch;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f253278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f253279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f253280c;

    public k(aim.e items, TextLocalisedClause title, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f253278a = title;
        this.f253279b = description;
        this.f253280c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f253280c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f253278a.equals(kVar.f253278a) && this.f253279b.equals(kVar.f253279b) && Intrinsics.f(this.f253280c, kVar.f253280c);
    }

    public final int hashCode() {
        return this.f253280c.hashCode() + t61.a.a(this.f253278a.hashCode() * 31, 31, this.f253279b);
    }
}
