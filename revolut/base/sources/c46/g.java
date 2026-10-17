package c46;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f21090b;

    public g(List items, f headerState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        this.f21089a = items;
        this.f21090b = headerState;
    }

    @Override // cli.p
    public final List c() {
        return this.f21089a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f21089a, gVar.f21089a) && Intrinsics.f(this.f21090b, gVar.f21090b);
    }

    public final int hashCode() {
        return this.f21090b.hashCode() + (this.f21089a.hashCode() * 31);
    }
}
