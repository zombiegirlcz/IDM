package nc1;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f214125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f214126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f214127c;
    public final List d;

    public f(List items, boolean z, TextLocalisedClause continueButtonText, aim.e menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(continueButtonText, "continueButtonText");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f214125a = items;
        this.f214126b = z;
        this.f214127c = continueButtonText;
        this.d = menuItems;
    }

    @Override // jki.n
    public final List c() {
        return this.f214125a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f214125a.equals(fVar.f214125a) && this.f214126b == fVar.f214126b && this.f214127c.equals(fVar.f214127c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.a(j6.a.c(this.f214125a.hashCode() * 31, 31, this.f214126b), 31, this.f214127c);
    }
}
