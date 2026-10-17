package b4b;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f12250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f12251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12252c;
    public final boolean d;
    public final ArrayList e;

    public v(u navBarState, TextLocalisedClause nextButton, boolean z, boolean z3, ArrayList items) {
        Intrinsics.checkNotNullParameter(navBarState, "navBarState");
        Intrinsics.checkNotNullParameter(nextButton, "nextButton");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f12250a = navBarState;
        this.f12251b = nextButton;
        this.f12252c = z;
        this.d = z3;
        this.e = items;
    }

    @Override // cli.p
    public final List c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f12250a.equals(vVar.f12250a) && this.f12251b.equals(vVar.f12251b) && this.f12252c == vVar.f12252c && this.d == vVar.d && this.e.equals(vVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(j6.a.c(t61.a.a(this.f12250a.hashCode() * 31, 31, this.f12251b), 31, this.f12252c), 31, this.d);
    }
}
