package vz9;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f293426b;

    public d(Clause clause) {
        super(true);
        this.f293426b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f293426b, ((d) obj2).f293426b);
    }

    public final int hashCode() {
        Clause clause = this.f293426b;
        if (clause == null) {
            return 0;
        }
        return clause.hashCode();
    }
}
