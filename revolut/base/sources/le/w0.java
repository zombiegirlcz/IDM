package le;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w0 extends b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f194408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f194409c;

    public w0(int i, String str, List list) {
        this.f194407a = str;
        this.f194408b = i;
        this.f194409c = list;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof b2) {
            w0 w0Var = (w0) ((b2) obj2);
            if (this.f194407a.equals(w0Var.f194407a) && this.f194408b == w0Var.f194408b && this.f194409c.equals(w0Var.f194409c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f194407a.hashCode() ^ 1000003) * 1000003) ^ this.f194408b) * 1000003) ^ this.f194409c.hashCode();
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Thread{name=");
        sb6.append(this.f194407a);
        sb6.append(", importance=");
        sb6.append(this.f194408b);
        sb6.append(", frames=");
        return t61.a.q("}", this.f194409c, sb6);
    }
}
