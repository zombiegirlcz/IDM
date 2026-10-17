package yb;

/* JADX INFO: loaded from: classes16.dex */
public final class f implements ve.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f312093a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ve.b f312094b = ve.b.c("clearBlob");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.b f312095c = ve.b.c("encryptedBlob");

    @Override // ve.a
    public final void encode(Object obj2, Object obj3) {
        ve.d dVar = (ve.d) obj3;
        q qVar = (q) ((c0) obj2);
        dVar.add(f312094b, qVar.f312127a);
        dVar.add(f312095c, qVar.f312128b);
    }
}
