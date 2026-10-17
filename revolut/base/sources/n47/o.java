package n47;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f212324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f212325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f212326c;

    public o(n headerState, m footerState, List items) {
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(footerState, "footerState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f212324a = headerState;
        this.f212325b = footerState;
        this.f212326c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f212326c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f212324a, oVar.f212324a) && Intrinsics.f(this.f212325b, oVar.f212325b) && Intrinsics.f(this.f212326c, oVar.f212326c);
    }

    public final int hashCode() {
        return this.f212326c.hashCode() + ((this.f212325b.hashCode() + (this.f212324a.hashCode() * 31)) * 31);
    }
}
