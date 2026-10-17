package htj;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();
    public static final Lazy[] e = {yhm.j.c(yhm.k.PUBLICATION, new ht1.e(6)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f155394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f155396c;
    public final x d;

    public /* synthetic */ a0(int i, c0 c0Var, String str, String str2, x xVar) {
        if (15 != (i & 15)) {
            j1.f(y.f155448a.getDescriptor(), i, 15);
            throw null;
        }
        this.f155394a = c0Var;
        this.f155395b = str;
        this.f155396c = str2;
        this.d = xVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return this.f155394a == a0Var.f155394a && Intrinsics.f(this.f155395b, a0Var.f155395b) && Intrinsics.f(this.f155396c, a0Var.f155396c) && Intrinsics.f(this.d, a0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f155394a.hashCode() * 31;
        String str = this.f155395b;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f155396c);
        x xVar = this.d;
        return iC + (xVar != null ? xVar.hashCode() : 0);
    }

    public a0(c0 type, String str, String description, x xVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f155394a = type;
        this.f155395b = str;
        this.f155396c = description;
        this.d = xVar;
    }
}
