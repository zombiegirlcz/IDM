package wbc;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends lk0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f296102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f296103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f296104c;

    public b(int i, Integer num, Integer num2) {
        this.f296102a = num;
        this.f296103b = num2;
        this.f296104c = i;
    }

    @Override // lk0.f
    public final int a() {
        return this.f296104c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f296102a.equals(bVar.f296102a) && this.f296103b.equals(bVar.f296103b) && this.f296104c == bVar.f296104c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f296104c) + ((this.f296103b.hashCode() + (this.f296102a.hashCode() * 31)) * 31);
    }
}
