package m4l;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4l.a f202770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f202771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f202772c;

    public k(l4l.a source, j jVar, ArrayList rules) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(rules, "rules");
        this.f202770a = source;
        this.f202771b = jVar;
        this.f202772c = rules;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f202770a == kVar.f202770a && Intrinsics.f(this.f202771b, kVar.f202771b) && this.f202772c.equals(kVar.f202772c);
    }

    public final int hashCode() {
        int iHashCode = this.f202770a.hashCode() * 31;
        j jVar = this.f202771b;
        return this.f202772c.hashCode() + ((iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31);
    }
}
