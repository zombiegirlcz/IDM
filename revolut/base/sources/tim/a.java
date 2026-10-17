package tim;

import java.util.Random;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a extends c {
    @Override // tim.c
    public final int a(int i) {
        return czi.c.K(h().nextInt(), i);
    }

    @Override // tim.c
    public final float b() {
        return h().nextFloat();
    }

    @Override // tim.c
    public final int c() {
        return h().nextInt();
    }

    @Override // tim.c
    public final int d(int i) {
        return h().nextInt(i);
    }

    @Override // tim.c
    public final long f() {
        return h().nextLong();
    }

    public abstract Random h();
}
