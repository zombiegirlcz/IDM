package zrd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f324682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f324683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yld.c f324684c;

    public c(List groups, xi0.b defaultCurrency, yld.c chartStyle) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter(defaultCurrency, "defaultCurrency");
        Intrinsics.checkNotNullParameter(chartStyle, "chartStyle");
        this.f324682a = groups;
        this.f324683b = defaultCurrency;
        this.f324684c = chartStyle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f324682a, cVar.f324682a) && Intrinsics.f(this.f324683b, cVar.f324683b) && this.f324684c == cVar.f324684c;
    }

    public final int hashCode() {
        return this.f324684c.hashCode() + h30.l.j(this.f324683b, this.f324682a.hashCode() * 31, 31);
    }
}
