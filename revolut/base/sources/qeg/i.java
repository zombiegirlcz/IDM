package qeg;

import aw0.o9;
import cli.o;
import cli.p;
import cli.q;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f245154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f245155b;

    public i(TextClause toolBarTitle, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolBarTitle, "toolBarTitle");
        this.f245154a = items;
        this.f245155b = toolBarTitle;
    }

    @Override // cli.o
    public final q a(o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (oldState instanceof i) {
            return new g(!Intrinsics.f(((i) oldState).f245155b, this.f245155b));
        }
        return null;
    }

    @Override // cli.p
    public final List c() {
        return this.f245154a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f245154a, iVar.f245154a) && Intrinsics.f(this.f245155b, iVar.f245155b);
    }

    public final int hashCode() {
        return this.f245155b.hashCode() + (this.f245154a.hashCode() * 31);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(List list) {
        this(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), list);
        m70.a.c(t0.f186434a);
    }
}
