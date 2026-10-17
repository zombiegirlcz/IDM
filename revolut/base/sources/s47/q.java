package s47;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f259795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f259796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f259797c;

    public q(p headerState, o footerState, List items) {
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(footerState, "footerState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f259795a = headerState;
        this.f259796b = footerState;
        this.f259797c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f259797c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f259795a, qVar.f259795a) && Intrinsics.f(this.f259796b, qVar.f259796b) && Intrinsics.f(this.f259797c, qVar.f259797c);
    }

    public final int hashCode() {
        return this.f259797c.hashCode() + ((this.f259796b.hashCode() + (this.f259795a.hashCode() * 31)) * 31);
    }
}
