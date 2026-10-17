package dx4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class x implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f120823b;

    public x(String text, a action) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f120822a = text;
        this.f120823b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f120822a, xVar.f120822a) && Intrinsics.f(this.f120823b, xVar.f120823b);
    }

    public final int hashCode() {
        return this.f120823b.f120542a.hashCode() + (this.f120822a.hashCode() * 31);
    }
}
