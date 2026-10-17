package aj6;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements cli.p {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f5424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f5425c;
    public final boolean d;
    public final NavBarMenuItem e;

    public /* synthetic */ r(List list, k kVar) {
        this(list, kVar, null, false, null);
    }

    @Override // cli.p
    public final List c() {
        return this.f5423a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f5423a, rVar.f5423a) && Intrinsics.f(this.f5424b, rVar.f5424b) && Intrinsics.f(this.f5425c, rVar.f5425c) && this.d == rVar.d && Intrinsics.f(this.e, rVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f5424b.hashCode() + (this.f5423a.hashCode() * 31)) * 31;
        Clause clause = this.f5425c;
        int iC = j6.a.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d);
        NavBarMenuItem navBarMenuItem = this.e;
        return iC + (navBarMenuItem != null ? navBarMenuItem.hashCode() : 0);
    }

    public r(List items, k header, Clause clause, boolean z, TextNavBarMenuItem textNavBarMenuItem) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f5423a = items;
        this.f5424b = header;
        this.f5425c = clause;
        this.d = z;
        this.e = textNavBarMenuItem;
    }
}
