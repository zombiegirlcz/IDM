package yj;

/* JADX INFO: loaded from: classes.dex */
public final class f implements xj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f314353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dfm.c f314354b;

    public f(String str, ie.a aVar) {
        this.f314353a = str;
        this.f314354b = (dfm.c) aVar.f;
    }

    @Override // xj.a
    public final Object getValue() {
        return this.f314353a;
    }

    @Override // xj.a
    public final byte[] serialize() {
        this.f314354b.getClass();
        byte[] bytes = this.f314353a.getBytes();
        byte[] bArr = new byte[bytes.length + 1];
        bArr[0] = -2;
        System.arraycopy(bytes, 0, bArr, 1, bytes.length);
        return bArr;
    }
}
