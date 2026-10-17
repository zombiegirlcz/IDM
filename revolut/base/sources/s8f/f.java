package s8f;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.trading.managed_portfolios.impl.ui.top_holdings.a f260985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f260986b;

    public f(com.revolut.feature.trading.managed_portfolios.impl.ui.top_holdings.a toolbarModel, List items) {
        Intrinsics.checkNotNullParameter(toolbarModel, "toolbarModel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f260985a = toolbarModel;
        this.f260986b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f260986b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f260985a, fVar.f260985a) && Intrinsics.f(this.f260986b, fVar.f260986b);
    }

    public final int hashCode() {
        return this.f260986b.hashCode() + (this.f260985a.hashCode() * 31);
    }
}
