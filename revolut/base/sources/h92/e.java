package h92;

import cli.p;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f150087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f150088b;

    public e(aim.e items, TextClause title) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f150087a = items;
        this.f150088b = title;
    }

    @Override // cli.p
    public final List c() {
        return this.f150087a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f150087a, eVar.f150087a) && this.f150088b.equals(eVar.f150088b);
    }

    public final int hashCode() {
        return this.f150088b.hashCode() + (this.f150087a.hashCode() * 31);
    }
}
