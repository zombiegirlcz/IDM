package n78;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import sf8.h;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f213040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final of8.b f213041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f213042c;

    public d(List tasks, of8.b products, h uiState) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        this.f213040a = tasks;
        this.f213041b = products;
        this.f213042c = uiState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f213040a, dVar.f213040a) && Intrinsics.f(this.f213041b, dVar.f213041b) && Intrinsics.f(this.f213042c, dVar.f213042c);
    }

    public final int hashCode() {
        return this.f213042c.hashCode() + ((this.f213041b.hashCode() + (this.f213040a.hashCode() * 31)) * 31);
    }
}
