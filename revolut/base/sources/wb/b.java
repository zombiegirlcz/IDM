package wb;

/* JADX INFO: loaded from: classes16.dex */
public final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f295987a;

    public b(Integer num) {
        this.f295987a = num;
    }

    @Override // wb.f
    public final Integer a() {
        return this.f295987a;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        Integer num = this.f295987a;
        b bVar = (b) ((f) obj2);
        return num == null ? bVar.f295987a == null : num.equals(bVar.f295987a);
    }

    public final int hashCode() {
        Integer num = this.f295987a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.f295987a + "}";
    }
}
