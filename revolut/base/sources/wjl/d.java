package wjl;

/* JADX INFO: loaded from: classes12.dex */
public final class d {
    private d() {
    }

    public static void a() {
        od0.a aVar = od0.a.f224253a;
        od0.a.i();
    }

    public static byte[] b() {
        od0.a aVar = od0.a.f224253a;
        if (!od0.a.i()) {
            return null;
        }
        byte[] bArr = new byte[32];
        int i = 0;
        while (i < 32) {
            int i2 = i + 1;
            bArr[i] = (byte) i2;
            i = i2;
        }
        return bArr;
    }
}
