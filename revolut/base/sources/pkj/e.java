package pkj;

import dej.q0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f237197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f237198b;

    public e() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f237197a, eVar.f237197a) && this.f237198b == eVar.f237198b;
    }

    public final int hashCode() {
        q0 q0Var = this.f237197a;
        return Boolean.hashCode(this.f237198b) + ((q0Var == null ? 0 : q0Var.hashCode()) * 31);
    }

    public /* synthetic */ e(int i) {
        this(null, false);
    }

    public e(q0 q0Var, boolean z) {
        this.f237197a = q0Var;
        this.f237198b = z;
    }
}
