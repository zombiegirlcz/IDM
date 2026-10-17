package bld;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;
import rp0.f1;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f16536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1 f16537b;

    public g(TextLocalisedClause message, f1 position) {
        Intrinsics.checkNotNullParameter("thanks_for_feedback", "toastId");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(position, "position");
        this.f16536a = message;
        this.f16537b = position;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f16536a.equals(gVar.f16536a) && this.f16537b == gVar.f16537b;
    }

    public final int hashCode() {
        return this.f16537b.hashCode() + t61.a.a(253925935, 31, this.f16536a);
    }
}
