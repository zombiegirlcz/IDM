package ecm;

import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes13.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f124871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2 f124872b;

    public s(r rVar, g2 g2Var) {
        this.f124871a = (r) Preconditions.checkNotNull(rVar, "state is null");
        this.f124872b = (g2) Preconditions.checkNotNull(g2Var, "status is null");
    }

    public static s a(r rVar) {
        Preconditions.checkArgument(rVar != r.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new s(rVar, g2.e);
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f124871a.equals(sVar.f124871a) && this.f124872b.equals(sVar.f124872b);
    }

    public final int hashCode() {
        return this.f124871a.hashCode() ^ this.f124872b.hashCode();
    }

    public final String toString() {
        g2 g2Var = this.f124872b;
        boolean zE = g2Var.e();
        r rVar = this.f124871a;
        if (zE) {
            return rVar.toString();
        }
        return rVar + "(" + g2Var + ")";
    }
}
