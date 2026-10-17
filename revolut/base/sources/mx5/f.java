package mx5;

import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f210212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f210213b;

    public f(Clause clause, boolean z) {
        this.f210212a = clause;
        this.f210213b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f210212a, fVar.f210212a) && this.f210213b == fVar.f210213b;
    }

    public final int hashCode() {
        Clause clause = this.f210212a;
        return Boolean.hashCode(this.f210213b) + ((clause == null ? 0 : clause.hashCode()) * 31);
    }
}
