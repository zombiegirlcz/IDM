package g35;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f140193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f140194b;

    public g(Clause title, Data entryPoints) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(entryPoints, "entryPoints");
        this.f140193a = title;
        this.f140194b = entryPoints;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f140193a, gVar.f140193a) && Intrinsics.f(this.f140194b, gVar.f140194b);
    }

    public final int hashCode() {
        return this.f140194b.hashCode() + (this.f140193a.hashCode() * 31);
    }
}
