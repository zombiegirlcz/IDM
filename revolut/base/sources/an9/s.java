package an9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f6600c;
    public final List d;

    public s(TextLocalisedClause continueButtonClause, List items, List menuItems, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(continueButtonClause, "continueButtonClause");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f6598a = items;
        this.f6599b = z;
        this.f6600c = continueButtonClause;
        this.d = menuItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f6598a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f6598a, sVar.f6598a) && this.f6599b == sVar.f6599b && this.f6600c.equals(sVar.f6600c) && Intrinsics.f(this.d, sVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.a(j6.a.c(this.f6598a.hashCode() * 31, 31, this.f6599b), 31, this.f6600c);
    }
}
