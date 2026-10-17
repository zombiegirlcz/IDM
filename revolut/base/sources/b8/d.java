package b8;

import c8.k;
import i8.p;
import i8.t;
import i8.u;
import java.io.File;
import ulm.o;
import x8.e;

/* JADX INFO: loaded from: classes16.dex */
public final class d implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13076b;

    public /* synthetic */ d(Object obj2, int i) {
        this.f13075a = i;
        this.f13076b = obj2;
    }

    @Override // i8.u
    public final t a(Object obj2, int i, int i2, k kVar) {
        switch (this.f13075a) {
            case 0:
                i8.k kVar2 = (i8.k) obj2;
                return new t(kVar2, new b((o) this.f13076b, kVar2));
            case 1:
                byte[] bArr = (byte[]) obj2;
                return new t(new e(bArr), new p(bArr, (i8.c) this.f13076b, 1));
            case 2:
                return new t(new e(obj2), new d8.b(1, obj2.toString(), (i8.d) this.f13076b));
            default:
                File file = (File) obj2;
                return new t(new e(file), new d8.b(2, file, (i8.d) this.f13076b));
        }
    }

    @Override // i8.u
    public final boolean b(Object obj2) {
        switch (this.f13075a) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return obj2.toString().startsWith("data:image");
            default:
                return true;
        }
    }
}
