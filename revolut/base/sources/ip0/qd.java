package ip0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class qd extends com.revolut.core.ui_kit.delegates.a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f165964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rd f165965b;

    public qd(Clause text, rd style) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f165964a = text;
        this.f165965b = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof qd)) {
            return false;
        }
        qd qdVar = (qd) obj2;
        return Intrinsics.f(this.f165964a, qdVar.f165964a) && this.f165965b == qdVar.f165965b;
    }

    public final int hashCode() {
        return this.f165965b.hashCode() + (this.f165964a.hashCode() * 31);
    }
}
