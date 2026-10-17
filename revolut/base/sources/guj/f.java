package guj;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f146967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f146968b;

    public f(Clause title, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f146967a = title;
        this.f146968b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f146968b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f146967a.equals(fVar.f146967a) && Intrinsics.f(this.f146968b, fVar.f146968b);
    }

    public final int hashCode() {
        return this.f146968b.hashCode() + (this.f146967a.hashCode() * 31);
    }
}
