package mx4;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dx4.a1 f210171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f210172b;

    public d(dx4.a1 icon, Clause contentDescription) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        this.f210171a = icon;
        this.f210172b = contentDescription;
    }

    @Override // mx4.b
    public final boolean a() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // mx4.b
    public final RowDelegate.Model.c b() {
        return new tf(new yy0.h(this.f210172b, this.f210171a.T1()));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f210171a == dVar.f210171a && this.f210172b.equals(dVar.f210172b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + p.a.b(this.f210171a.hashCode() * 31, 31, this.f210172b);
    }
}
