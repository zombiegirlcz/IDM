package wk4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f298238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f298239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f298240c;
    public final TextLocalisedClause d;
    public final TextLocalisedClause e;

    public e(TextLocalisedClause toolbarSecondDescription, TextLocalisedClause button, List items, List navBarMenuItems, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarMenuItems, "navBarMenuItems");
        Intrinsics.checkNotNullParameter(toolbarSecondDescription, "toolbarSecondDescription");
        Intrinsics.checkNotNullParameter(button, "button");
        this.f298238a = items;
        this.f298239b = z;
        this.f298240c = navBarMenuItems;
        this.d = toolbarSecondDescription;
        this.e = button;
    }

    @Override // jki.n
    public final List c() {
        return this.f298238a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f298238a.equals(eVar.f298238a) && this.f298239b == eVar.f298239b && Intrinsics.f(this.f298240c, eVar.f298240c) && this.d.equals(eVar.d) && this.e.equals(eVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + t61.a.a(p.a.d(j6.a.c(this.f298238a.hashCode() * 31, 31, this.f298239b), 31, this.f298240c), 31, this.d);
    }
}
