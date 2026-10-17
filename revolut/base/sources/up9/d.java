package up9;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f281924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f281925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f281926c;

    public d(Clause title, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f281924a = items;
        this.f281925b = title;
        this.f281926c = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f281924a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f281924a, dVar.f281924a) && Intrinsics.f(this.f281925b, dVar.f281925b) && this.f281926c == dVar.f281926c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f281926c) + p.a.a(this.f281924a.hashCode() * 31, 31, this.f281925b);
    }
}
