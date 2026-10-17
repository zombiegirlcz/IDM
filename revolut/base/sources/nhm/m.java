package nhm;

/* JADX INFO: loaded from: classes14.dex */
public final class m extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f215603a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f215604b;

    public m(Object obj2) {
        this.f215604b = obj2;
    }

    @Override // nhm.a
    public final Object a() {
        this.f215603a = false;
        return this.f215604b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f215603a;
    }
}
