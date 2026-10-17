package k8;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import e8.e0;
import y8.f;
import y8.l;

/* JADX INFO: loaded from: classes16.dex */
public class c implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f182077b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f182076a = i;
        this.f182077b = obj2;
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    @Override // e8.e0
    public final Class a() {
        switch (this.f182076a) {
            case 0:
                return this.f182077b.getClass();
            case 1:
                return Bitmap.class;
            case 2:
                return byte[].class;
            default:
                return Drawable.class;
        }
    }

    @Override // e8.e0
    public final Object get() {
        switch (this.f182076a) {
            case 0:
                return this.f182077b;
            case 1:
                return (Bitmap) this.f182077b;
            case 2:
                return (byte[]) this.f182077b;
            default:
                return (AnimatedImageDrawable) this.f182077b;
        }
    }

    @Override // e8.e0
    public final int getSize() {
        switch (this.f182076a) {
            case 0:
                return 1;
            case 1:
                return l.c((Bitmap) this.f182077b);
            case 2:
                return ((byte[]) this.f182077b).length;
            default:
                AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) this.f182077b;
                return l.d(Bitmap.Config.ARGB_8888) * animatedImageDrawable.getIntrinsicHeight() * animatedImageDrawable.getIntrinsicWidth() * 2;
        }
    }

    @Override // e8.e0
    public final void recycle() {
        switch (this.f182076a) {
            case 0:
            case 1:
            case 2:
                break;
            default:
                AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) this.f182077b;
                animatedImageDrawable.stop();
                animatedImageDrawable.clearAnimationCallbacks();
                break;
        }
    }

    public c(byte[] bArr) {
        this.f182076a = 2;
        f.c(bArr, "Argument must not be null");
        this.f182077b = bArr;
    }

    public c(Object obj2) {
        this.f182076a = 0;
        f.c(obj2, "Argument must not be null");
        this.f182077b = obj2;
    }
}
