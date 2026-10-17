package xh;

/* JADX INFO: loaded from: classes17.dex */
public final class a extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f305781c;
    public final short d;

    public a(f fVar, int i, int i2) {
        super(fVar);
        this.f305781c = (short) i;
        this.d = (short) i2;
    }

    @Override // xh.f
    public final void a(yh.a aVar, byte[] bArr) {
        int i = 0;
        while (true) {
            short s2 = this.d;
            if (i >= s2) {
                return;
            }
            if (i == 0 || (i == 31 && s2 <= 62)) {
                aVar.b(31, 5);
                if (s2 > 62) {
                    aVar.b(s2 - 31, 16);
                } else if (i == 0) {
                    aVar.b(Math.min((int) s2, 31), 5);
                } else {
                    aVar.b(s2 - 31, 5);
                }
            }
            aVar.b(bArr[this.f305781c + i], 8);
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("<");
        sb6.append((int) this.f305781c);
        sb6.append("::");
        sb6.append((r1 + this.d) - 1);
        sb6.append('>');
        return sb6.toString();
    }
}
