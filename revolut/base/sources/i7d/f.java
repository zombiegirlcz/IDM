package i7d;

import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f159268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f159269b;

    public f(TextClause title, String deeplink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f159268a = title;
        this.f159269b = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f159268a.equals(fVar.f159268a) && Intrinsics.f(this.f159269b, fVar.f159269b);
    }

    public final int hashCode() {
        return this.f159269b.hashCode() + (this.f159268a.hashCode() * 31);
    }
}
