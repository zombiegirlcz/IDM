package d7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f111669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f111670b;

    public g0(j jVar) {
        this.f111669a = jVar;
        this.f111670b = null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        j jVar = this.f111669a;
        if (jVar != null && jVar.equals(g0Var.f111669a)) {
            return true;
        }
        Throwable th10 = this.f111670b;
        if (th10 == null || g0Var.f111670b == null) {
            return false;
        }
        return th10.toString().equals(th10.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f111669a, this.f111670b});
    }

    public g0(Throwable th10) {
        this.f111670b = th10;
        this.f111669a = null;
    }
}
