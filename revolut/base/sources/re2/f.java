package re2;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f253493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f253494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f253495c;

    public f(TextLocalisedClause footerText, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footerText, "footerText");
        this.f253493a = items;
        this.f253494b = footerText;
        this.f253495c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f253493a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f253493a, fVar.f253493a) && this.f253494b.equals(fVar.f253494b) && this.f253495c == fVar.f253495c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f253495c) + t61.a.a(this.f253493a.hashCode() * 31, 31, this.f253494b);
    }
}
