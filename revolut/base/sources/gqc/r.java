package gqc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f145662c;

    public /* synthetic */ r(int i, String str, String str2, x xVar) {
        if (7 != (i & 7)) {
            j1.f(p.f145659a.getDescriptor(), i, 7);
            throw null;
        }
        this.f145660a = str;
        this.f145661b = str2;
        this.f145662c = xVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f145660a, rVar.f145660a) && Intrinsics.f(this.f145661b, rVar.f145661b) && Intrinsics.f(this.f145662c, rVar.f145662c);
    }

    public final int hashCode() {
        return this.f145662c.hashCode() + p.a.c(this.f145660a.hashCode() * 31, 31, this.f145661b);
    }
}
