package tx8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends av1.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f275356c;
    public final List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(List docPages, List steps) {
        super("incode", 7);
        Intrinsics.checkNotNullParameter(docPages, "docPages");
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.f275356c = docPages;
        this.d = steps;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f275356c, mVar.f275356c) && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.f275356c.hashCode() * 31);
    }
}
