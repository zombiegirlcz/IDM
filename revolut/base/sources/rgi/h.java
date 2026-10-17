package rgi;

import cli.o;
import cli.q;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f254192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f254193b;

    public h(k request, Clause clause) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f254192a = request;
        this.f254193b = clause;
    }

    @Override // cli.o
    public final q a(o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        return new g(!Intrinsics.f(this.f254193b, ((h) oldState).f254193b));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f254192a, hVar.f254192a) && Intrinsics.f(this.f254193b, hVar.f254193b);
    }

    public final int hashCode() {
        int iHashCode = this.f254192a.hashCode() * 31;
        Clause clause = this.f254193b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
