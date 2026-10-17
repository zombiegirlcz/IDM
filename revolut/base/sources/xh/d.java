package xh;

/* JADX INFO: loaded from: classes17.dex */
public final class d extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f305786c;
    public final short d;

    public d(f fVar, int i, int i2) {
        super(fVar);
        this.f305786c = (short) i;
        this.d = (short) i2;
    }

    @Override // xh.f
    public final void a(yh.a aVar, byte[] bArr) {
        aVar.b(this.f305786c, this.d);
    }

    public final String toString() {
        short s2 = this.d;
        return "<" + Integer.toBinaryString((1 << s2) | (((1 << s2) - 1) & this.f305786c) | (1 << s2)).substring(1) + '>';
    }
}
