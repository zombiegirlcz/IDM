package hp2;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f154390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f154391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f154392c;
    public final boolean d;
    public final boolean e;

    public h(List items, TextLocalisedClause title, String str, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f154390a = items;
        this.f154391b = title;
        this.f154392c = str;
        this.d = z;
        this.e = z3;
    }

    @Override // cli.p
    public final List c() {
        return this.f154390a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f154390a, hVar.f154390a) && this.f154391b.equals(hVar.f154391b) && Intrinsics.f(this.f154392c, hVar.f154392c) && this.d == hVar.d && this.e == hVar.e;
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f154390a.hashCode() * 31, 31, this.f154391b);
        String str = this.f154392c;
        return Boolean.hashCode(this.e) + j6.a.c((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }
}
