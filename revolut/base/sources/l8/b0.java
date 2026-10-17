package l8;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements c8.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192719a;

    public /* synthetic */ b0(int i) {
        this.f192719a = i;
    }

    @Override // c8.m
    public final /* bridge */ /* synthetic */ boolean a(Object obj2, c8.k kVar) {
        switch (this.f192719a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // c8.m
    public final e8.e0 b(Object obj2, int i, int i2, c8.k kVar) {
        switch (this.f192719a) {
            case 0:
                return new k8.c((Bitmap) obj2, 1);
            case 1:
                return n8.c.b((Drawable) obj2);
            default:
                return new o8.a((File) obj2);
        }
    }
}
