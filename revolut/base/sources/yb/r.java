package yb;

/* JADX INFO: loaded from: classes16.dex */
public final class r extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f312129a;

    public r(Integer num) {
        this.f312129a = num;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        Integer num = this.f312129a;
        r rVar = (r) ((d0) obj2);
        return num == null ? rVar.f312129a == null : num.equals(rVar.f312129a);
    }

    public final int hashCode() {
        Integer num = this.f312129a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f312129a + "}";
    }
}
