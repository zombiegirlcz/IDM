package d7j;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f112006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f112007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f112008c;
    public final List d;

    public i0(Clause subtitle, TextLocalisedClause title, List menuItems, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f112006a = title;
        this.f112007b = subtitle;
        this.f112008c = z;
        this.d = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return this.f112006a.equals(i0Var.f112006a) && this.f112007b.equals(i0Var.f112007b) && this.f112008c == i0Var.f112008c && Intrinsics.f(this.d, i0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(p.a.b(this.f112006a.hashCode() * 31, 31, this.f112007b), 31, this.f112008c);
    }
}
