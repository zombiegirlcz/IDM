package ft5;

import kotlin.jvm.internal.Intrinsics;
import tof.i7;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i7 f137935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f137936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f137937c;

    public a() {
        this(null, 7);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f137935a, aVar.f137935a) && this.f137936b == aVar.f137936b && this.f137937c == aVar.f137937c;
    }

    public final int hashCode() {
        i7 i7Var = this.f137935a;
        return Boolean.hashCode(this.f137937c) + j6.a.c((i7Var == null ? 0 : i7Var.hashCode()) * 31, 31, this.f137936b);
    }

    public /* synthetic */ a(i7 i7Var, int i) {
        this((i & 1) != 0 ? null : i7Var, false, false);
    }

    public a(i7 i7Var, boolean z, boolean z3) {
        this.f137935a = i7Var;
        this.f137936b = z;
        this.f137937c = z3;
    }
}
