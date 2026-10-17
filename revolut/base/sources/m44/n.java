package m44;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f202658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f202659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f202660c;
    public final boolean d;
    public final TextLocalisedClause e;
    public final boolean f;

    public n(List items, h navBarUiConfiguration, TextLocalisedClause firstButtonText, boolean z, TextLocalisedClause secondButtonText, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarUiConfiguration, "navBarUiConfiguration");
        Intrinsics.checkNotNullParameter(firstButtonText, "firstButtonText");
        Intrinsics.checkNotNullParameter(secondButtonText, "secondButtonText");
        this.f202658a = items;
        this.f202659b = navBarUiConfiguration;
        this.f202660c = firstButtonText;
        this.d = z;
        this.e = secondButtonText;
        this.f = z3;
    }

    @Override // jki.n
    public final List c() {
        return this.f202658a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f202658a, nVar.f202658a) && Intrinsics.f(this.f202659b, nVar.f202659b) && this.f202660c.equals(nVar.f202660c) && this.d == nVar.d && this.e.equals(nVar.e) && this.f == nVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + t61.a.a(j6.a.c(t61.a.a((this.f202659b.hashCode() + (this.f202658a.hashCode() * 31)) * 31, 31, this.f202660c), 31, this.d), 31, this.e);
    }
}
