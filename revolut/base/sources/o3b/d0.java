package o3b;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f221720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f221721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f221722c;
    public final boolean d;
    public final List e;

    public d0(TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause ctaText, List items, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(ctaText, "ctaText");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f221720a = title;
        this.f221721b = description;
        this.f221722c = ctaText;
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
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return this.f221720a.equals(d0Var.f221720a) && this.f221721b.equals(d0Var.f221721b) && this.f221722c.equals(d0Var.f221722c) && this.d == d0Var.d && Intrinsics.f(this.e, d0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(t61.a.a(t61.a.a(this.f221720a.hashCode() * 31, 31, this.f221721b), 31, this.f221722c), 31, this.d);
    }
}
