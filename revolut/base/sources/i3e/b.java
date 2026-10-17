package i3e;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f158181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f158182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f158183c;
    public final int d;

    public b(int i, TextLocalisedClause title, TextLocalisedClause toolbarTitle, TextLocalisedClause hint) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.f158181a = title;
        this.f158182b = toolbarTitle;
        this.f158183c = hint;
        this.d = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f158181a.equals(bVar.f158181a) && this.f158182b.equals(bVar.f158182b) && this.f158183c.equals(bVar.f158183c) && this.d == bVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + j6.a.c(j6.a.b(this.d, t61.a.a(t61.a.a(this.f158181a.hashCode() * 31, 31, this.f158182b), 31, this.f158183c), 31), 31, true);
    }
}
