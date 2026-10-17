package i8;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e0 f159358b = new e0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159359a;

    public /* synthetic */ e0(int i) {
        this.f159359a = i;
    }

    @Override // i8.v
    public final u a(b0 b0Var) {
        switch (this.f159359a) {
            case 0:
                return f0.f159362b;
            case 1:
                return new b8.d(new c(0), 1);
            case 2:
                return new b8.d(new c(1), 1);
            case 3:
                return new f0(1);
            case 4:
                return new d0(b0Var.a(Uri.class, AssetFileDescriptor.class), 0);
            case 5:
                return new d0(b0Var.a(Uri.class, ParcelFileDescriptor.class), 0);
            case 6:
                return new d0(b0Var.a(Uri.class, InputStream.class), 0);
            default:
                return new i0(b0Var.a(k.class, InputStream.class));
        }
    }
}
