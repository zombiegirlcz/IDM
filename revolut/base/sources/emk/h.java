package emk;

import cli.p;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f127680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f127681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f127682c;
    public final Clause d;
    public final AnimatedBackgroundType e;

    public h(List items, Clause clause, Clause clause2, Clause clause3, AnimatedBackgroundType background) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(background, "background");
        this.f127680a = items;
        this.f127681b = clause;
        this.f127682c = clause2;
        this.d = clause3;
        this.e = background;
    }

    @Override // cli.p
    public final List c() {
        return this.f127680a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f127680a, hVar.f127680a) && Intrinsics.f(this.f127681b, hVar.f127681b) && Intrinsics.f(this.f127682c, hVar.f127682c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f127680a.hashCode() * 31;
        Clause clause = this.f127681b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f127682c;
        int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (clause3 != null ? clause3.hashCode() : 0)) * 31);
    }
}
