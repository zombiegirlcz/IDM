package uv6;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f283331a;

    public h(Clause clause) {
        this.f283331a = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f283331a, ((h) obj2).f283331a);
    }

    public final int hashCode() {
        Clause clause = this.f283331a;
        if (clause == null) {
            return 0;
        }
        return clause.hashCode();
    }
}
