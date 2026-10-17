package y54;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f310987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f310988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f310989c;

    public k(TextLocalisedClause title, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f310987a = items;
        this.f310988b = z;
        this.f310989c = title;
    }

    @Override // jki.n
    public final List c() {
        return this.f310987a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f310987a, kVar.f310987a) && this.f310988b == kVar.f310988b && this.f310989c.equals(kVar.f310989c);
    }

    public final int hashCode() {
        return this.f310989c.hashCode() + j6.a.c(this.f310987a.hashCode() * 31, 31, this.f310988b);
    }
}
