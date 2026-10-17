package l8;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements e8.e0, e8.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192720a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f192721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f192722c;

    public c(Bitmap bitmap, f8.a aVar) {
        y8.f.c(bitmap, "Bitmap must not be null");
        this.f192721b = bitmap;
        y8.f.c(aVar, "BitmapPool must not be null");
        this.f192722c = aVar;
    }

    public static c b(Resources resources, e8.e0 e0Var) {
        if (e0Var == null) {
            return null;
        }
        return new c(resources, e0Var);
    }

    public static c c(Bitmap bitmap, f8.a aVar) {
        if (bitmap == null) {
            return null;
        }
        return new c(bitmap, aVar);
    }

    @Override // e8.e0
    public final Class a() {
        switch (this.f192720a) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // e8.e0
    public final Object get() {
        switch (this.f192720a) {
            case 0:
                return (Bitmap) this.f192721b;
            default:
                return new BitmapDrawable((Resources) this.f192721b, (Bitmap) ((e8.e0) this.f192722c).get());
        }
    }

    @Override // e8.e0
    public final int getSize() {
        switch (this.f192720a) {
            case 0:
                return y8.l.c((Bitmap) this.f192721b);
            default:
                return ((e8.e0) this.f192722c).getSize();
        }
    }

    @Override // e8.b0
    public final void initialize() {
        switch (this.f192720a) {
            case 0:
                ((Bitmap) this.f192721b).prepareToDraw();
                break;
            default:
                e8.e0 e0Var = (e8.e0) this.f192722c;
                if (e0Var instanceof e8.b0) {
                    ((e8.b0) e0Var).initialize();
                }
                break;
        }
    }

    @Override // e8.e0
    public final void recycle() {
        switch (this.f192720a) {
            case 0:
                ((f8.a) this.f192722c).a((Bitmap) this.f192721b);
                break;
            default:
                ((e8.e0) this.f192722c).recycle();
                break;
        }
    }

    public c(Resources resources, e8.e0 e0Var) {
        y8.f.c(resources, "Argument must not be null");
        this.f192721b = resources;
        y8.f.c(e0Var, "Argument must not be null");
        this.f192722c = e0Var;
    }
}
