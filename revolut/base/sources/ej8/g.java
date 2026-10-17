package ej8;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f126782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f126783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f126784c;

    public g(TextLocalisedClause ctaButtonClause, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(ctaButtonClause, "ctaButtonClause");
        this.f126782a = items;
        this.f126783b = ctaButtonClause;
        this.f126784c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f126782a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f126782a.equals(gVar.f126782a) && this.f126783b.equals(gVar.f126783b) && this.f126784c == gVar.f126784c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f126784c) + t61.a.a(this.f126782a.hashCode() * 31, 31, this.f126783b);
    }
}
