package n8;

import a8.e;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.n;
import e8.b0;
import e8.e0;
import p8.g;
import y8.f;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements e0, b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f213177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f213178b;

    public c(Drawable drawable, int i) {
        this.f213178b = i;
        f.c(drawable, "Argument must not be null");
        this.f213177a = drawable;
    }

    public static c b(Drawable drawable) {
        if (drawable != null) {
            return new c(drawable, 0);
        }
        return null;
    }

    private final void c() {
    }

    @Override // e8.e0
    public final Class a() {
        switch (this.f213178b) {
            case 0:
                return this.f213177a.getClass();
            default:
                return GifDrawable.class;
        }
    }

    @Override // e8.e0
    public final Object get() {
        Drawable drawable = this.f213177a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    @Override // e8.e0
    public final int getSize() {
        switch (this.f213178b) {
            case 0:
                Drawable drawable = this.f213177a;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                g gVar = ((GifDrawable) this.f213177a).f26125a.f233797a;
                e eVar = gVar.f233801a;
                return (eVar.f1970j.length * 4) + eVar.d.limit() + eVar.i.length + gVar.f233809n;
        }
    }

    @Override // e8.b0
    public void initialize() {
        switch (this.f213178b) {
            case 1:
                ((GifDrawable) this.f213177a).f26125a.f233797a.c().prepareToDraw();
                break;
            default:
                Drawable drawable = this.f213177a;
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                } else if (drawable instanceof GifDrawable) {
                    ((GifDrawable) drawable).f26125a.f233797a.c().prepareToDraw();
                }
                break;
        }
    }

    @Override // e8.e0
    public final void recycle() {
        f8.f fVar;
        f8.f fVar2;
        f8.f fVar3;
        switch (this.f213178b) {
            case 0:
                break;
            default:
                GifDrawable gifDrawable = (GifDrawable) this.f213177a;
                gifDrawable.stop();
                gifDrawable.d = true;
                g gVar = gifDrawable.f26125a.f233797a;
                n nVar = gVar.d;
                gVar.f233803c.clear();
                Bitmap bitmap = gVar.f233807l;
                if (bitmap != null) {
                    gVar.e.a(bitmap);
                    gVar.f233807l = null;
                }
                gVar.f = false;
                p8.d dVar = gVar.i;
                if (dVar != null) {
                    nVar.m(dVar);
                    gVar.i = null;
                }
                p8.d dVar2 = gVar.k;
                if (dVar2 != null) {
                    nVar.m(dVar2);
                    gVar.k = null;
                }
                p8.d dVar3 = gVar.f233808m;
                if (dVar3 != null) {
                    nVar.m(dVar3);
                    gVar.f233808m = null;
                }
                e eVar = gVar.f233801a;
                cpi.g gVar2 = eVar.f1967c;
                eVar.f1971l = null;
                byte[] bArr = eVar.i;
                if (bArr != null && (fVar3 = (f8.f) gVar2.f107955c) != null) {
                    fVar3.g(bArr);
                }
                int[] iArr = eVar.f1970j;
                if (iArr != null && (fVar2 = (f8.f) gVar2.f107955c) != null) {
                    fVar2.g(iArr);
                }
                Bitmap bitmap2 = eVar.f1972m;
                if (bitmap2 != null) {
                    ((f8.a) gVar2.f107954b).a(bitmap2);
                }
                eVar.f1972m = null;
                eVar.d = null;
                eVar.f1977s = null;
                byte[] bArr2 = eVar.e;
                if (bArr2 != null && (fVar = (f8.f) gVar2.f107955c) != null) {
                    fVar.g(bArr2);
                }
                gVar.f233806j = true;
                break;
        }
    }
}
