package nhm;

/* JADX INFO: loaded from: classes14.dex */
public final class n extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f215605a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f215606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f215607c;

    public n(p pVar, String str) {
        this.f215606b = pVar;
        this.f215607c = str;
    }

    @Override // nhm.a
    public final Object a() {
        if (this.f215605a) {
            this.f215605a = false;
            return this.f215607c;
        }
        this.f215605a = true;
        return this.f215606b.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f215606b.hasNext();
    }
}
