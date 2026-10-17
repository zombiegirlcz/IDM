package u4c;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f277312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw0.a f277313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.e f277314c;

    public d(aw0.e footerModel, List items, lw0.a headerModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        Intrinsics.checkNotNullParameter(footerModel, "footerModel");
        this.f277312a = items;
        this.f277313b = headerModel;
        this.f277314c = footerModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f277312a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f277312a, dVar.f277312a) && this.f277313b.equals(dVar.f277313b) && this.f277314c.equals(dVar.f277314c);
    }

    public final int hashCode() {
        return this.f277314c.hashCode() + ((this.f277313b.hashCode() + (this.f277312a.hashCode() * 31)) * 31);
    }
}
