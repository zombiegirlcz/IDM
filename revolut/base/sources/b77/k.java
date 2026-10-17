package b77;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f12928c;
    public final TextLocalisedClause d;

    public k(TextLocalisedClause buttonClause, TextLocalisedClause titleClause, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonClause, "buttonClause");
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        this.f12926a = items;
        this.f12927b = z;
        this.f12928c = buttonClause;
        this.d = titleClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f12926a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f12926a, kVar.f12926a) && this.f12927b == kVar.f12927b && this.f12928c.equals(kVar.f12928c) && this.d.equals(kVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.a(j6.a.c(this.f12926a.hashCode() * 31, 31, this.f12927b), 31, this.f12928c);
    }
}
