package g7;

/* JADX INFO: loaded from: classes16.dex */
public final class g extends s7.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s7.c f141032c;

    public g(s7.c cVar) {
        this.f141032c = cVar;
    }

    @Override // s7.c
    public final Object a(s7.b bVar) {
        Float f = (Float) this.f141032c.a(bVar);
        if (f == null) {
            return null;
        }
        return Float.valueOf(f.floatValue() * 2.55f);
    }
}
