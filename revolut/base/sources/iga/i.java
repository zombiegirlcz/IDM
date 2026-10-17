package iga;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f161106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.screen.unlock_benefits.a f161107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f161108c;

    public i(List items, com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.screen.unlock_benefits.a navBarState, aw0.i iVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarState, "navBarState");
        this.f161106a = items;
        this.f161107b = navBarState;
        this.f161108c = iVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f161106a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f161106a, iVar.f161106a) && Intrinsics.f(this.f161107b, iVar.f161107b) && Intrinsics.f(this.f161108c, iVar.f161108c);
    }

    public final int hashCode() {
        int iHashCode = (this.f161107b.hashCode() + (this.f161106a.hashCode() * 31)) * 31;
        aw0.i iVar = this.f161108c;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }
}
