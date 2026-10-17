package o07;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f221161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f221162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f221163c;

    public c(TextLocalisedClause toolbarTitle, List items, a buttonState) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f221161a = toolbarTitle;
        this.f221162b = items;
        this.f221163c = buttonState;
    }

    @Override // jki.n
    public final List c() {
        return this.f221162b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f221161a.equals(cVar.f221161a) && Intrinsics.f(this.f221162b, cVar.f221162b) && this.f221163c.equals(cVar.f221163c);
    }

    public final int hashCode() {
        return this.f221163c.hashCode() + p.a.d(this.f221161a.hashCode() * 31, 31, this.f221162b);
    }
}
