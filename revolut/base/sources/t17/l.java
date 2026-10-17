package t17;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f267205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f267206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f267207c;

    public l(Clause title, Object obj2, String id10) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f267205a = title;
        this.f267206b = id10;
        this.f267207c = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f267205a.equals(lVar.f267205a) && Intrinsics.f(this.f267206b, lVar.f267206b) && Intrinsics.f(this.f267207c, lVar.f267207c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f267205a.hashCode() * 31, 31, this.f267206b);
        Object obj2 = this.f267207c;
        return iC + (obj2 == null ? 0 : obj2.hashCode());
    }
}
