package l8;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class e implements c8.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f192725b;

    public /* synthetic */ e(Object obj2, int i) {
        this.f192724a = i;
        this.f192725b = obj2;
    }

    @Override // c8.m
    public final boolean a(Object obj2, c8.k kVar) {
        switch (this.f192724a) {
            case 0:
                break;
            case 1:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj2;
                String str = Build.MANUFACTURER;
                if ((("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) && parcelFileDescriptor.getStatSize() > 536870912) || "robolectric".equals(Build.FINGERPRINT)) {
                }
                break;
            default:
                break;
        }
        return true;
    }

    @Override // c8.m
    public final e8.e0 b(Object obj2, int i, int i2, c8.k kVar) {
        switch (this.f192724a) {
            case 0:
                p pVar = (p) this.f192725b;
                return pVar.a(new k18.c((ByteBuffer) obj2, 2, pVar.d, pVar.f192747c), i, i2, kVar, p.f192744j);
            case 1:
                p pVar2 = (p) this.f192725b;
                return pVar2.a(new kbb.c((ParcelFileDescriptor) obj2, pVar2.d, pVar2.f192747c), i, i2, kVar, p.f192744j);
            default:
                return c.c(((a8.e) ((a8.a) obj2)).c(), (f8.a) this.f192725b);
        }
    }
}
