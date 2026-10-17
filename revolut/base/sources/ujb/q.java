package ujb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class q {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f280579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f280580c;
    public final long d;
    public final k e;

    public /* synthetic */ q(int i, String str, String str2, long j2, long j3, k kVar) {
        if (31 != (i & 31)) {
            j1.f(o.f280574a.getDescriptor(), i, 31);
            throw null;
        }
        this.f280578a = str;
        this.f280579b = str2;
        this.f280580c = j2;
        this.d = j3;
        this.e = kVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f280578a, qVar.f280578a) && Intrinsics.f(this.f280579b, qVar.f280579b) && this.f280580c == qVar.f280580c && this.d == qVar.d && Intrinsics.f(this.e, qVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + a0.d.c(a0.d.c(p.a.c(this.f280578a.hashCode() * 31, 31, this.f280579b), 31, this.f280580c), 31, this.d);
    }

    public q(String type, String title, long j2, long j3, k eligibility) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
        this.f280578a = type;
        this.f280579b = title;
        this.f280580c = j2;
        this.d = j3;
        this.e = eligibility;
    }
}
