package vpd;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f291180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f291181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f291182c;
    public final o d;

    public p(List items, TextLocalisedClause toolbarTitle, TextLocalisedClause toolbarSubtitle, o buttonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(toolbarSubtitle, "toolbarSubtitle");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f291180a = items;
        this.f291181b = toolbarTitle;
        this.f291182c = toolbarSubtitle;
        this.d = buttonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f291180a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f291180a, pVar.f291180a) && this.f291181b.equals(pVar.f291181b) && this.f291182c.equals(pVar.f291182c) && this.d.equals(pVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.a(t61.a.a(this.f291180a.hashCode() * 31, 31, this.f291181b), 31, this.f291182c);
    }
}
