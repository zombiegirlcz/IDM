package i8;

import java.io.File;

/* JADX INFO: loaded from: classes16.dex */
public final class f0 implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f0 f159362b = new f0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159363a;

    public /* synthetic */ f0(int i) {
        this.f159363a = i;
    }

    @Override // i8.u
    public final t a(Object obj2, int i, int i2, c8.k kVar) {
        switch (this.f159363a) {
            case 0:
                return new t(new x8.e(obj2), new e(obj2, 1));
            default:
                File file = (File) obj2;
                return new t(new x8.e(file), new e(file, 0));
        }
    }

    @Override // i8.u
    public final boolean b(Object obj2) {
        switch (this.f159363a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}
