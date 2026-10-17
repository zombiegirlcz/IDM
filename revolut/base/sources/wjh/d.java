package wjh;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f298097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f298098c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(List portfolios, e state) {
        super("ROBO");
        Intrinsics.checkNotNullParameter(portfolios, "portfolios");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f298097b = portfolios;
        this.f298098c = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f298097b, dVar.f298097b) && this.f298098c == dVar.f298098c;
    }

    public final int hashCode() {
        return this.f298098c.hashCode() + (this.f298097b.hashCode() * 31);
    }
}
