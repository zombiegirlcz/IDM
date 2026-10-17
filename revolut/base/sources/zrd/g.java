package zrd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f324690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f324691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ipd.f f324692c;

    public g(List items, f fVar, ipd.f background) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(background, "background");
        this.f324690a = items;
        this.f324691b = fVar;
        this.f324692c = background;
    }

    @Override // cli.p
    public final List c() {
        return this.f324690a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f324690a, gVar.f324690a) && Intrinsics.f(this.f324691b, gVar.f324691b) && Intrinsics.f(this.f324692c, gVar.f324692c);
    }

    public final int hashCode() {
        int iHashCode = this.f324690a.hashCode() * 31;
        f fVar = this.f324691b;
        return this.f324692c.hashCode() + ((iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31);
    }

    public /* synthetic */ g(List list) {
        this(list, null, ipd.e.f167736a);
    }
}
