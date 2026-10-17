package xod;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f307812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f307813b;

    public l(Clause text, k resourcesConfig) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(resourcesConfig, "resourcesConfig");
        this.f307812a = text;
        this.f307813b = resourcesConfig;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f307812a, lVar.f307812a) && Intrinsics.f(this.f307813b, lVar.f307813b);
    }

    public final int hashCode() {
        return this.f307813b.hashCode() + (this.f307812a.hashCode() * 31);
    }
}
