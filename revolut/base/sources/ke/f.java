package ke;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class f implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final af.f f182932c = new af.f(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f182933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f182934b;

    public f(oe.c cVar) {
        this.f182933a = cVar;
        this.f182934b = f182932c;
    }

    @Override // ke.k
    public void a(j jVar, int i) throws IOException {
        int[] iArr = (int[]) this.f182934b;
        try {
            jVar.read((byte[]) this.f182933a, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            jVar.close();
        }
    }

    public f(byte[] bArr, int[] iArr) {
        this.f182933a = bArr;
        this.f182934b = iArr;
    }
}
