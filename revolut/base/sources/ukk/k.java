package ukk;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f280778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f280779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f280780c;

    public k(List items, j jVar, Clause clause) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f280778a = items;
        this.f280779b = jVar;
        this.f280780c = clause;
    }

    @Override // cli.p
    public final List c() {
        return this.f280778a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f280778a, kVar.f280778a) && Intrinsics.f(this.f280779b, kVar.f280779b) && Intrinsics.f(this.f280780c, kVar.f280780c);
    }

    public final int hashCode() {
        int iHashCode = this.f280778a.hashCode() * 31;
        j jVar = this.f280779b;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Clause clause = this.f280780c;
        return iHashCode2 + (clause != null ? clause.hashCode() : 0);
    }
}
