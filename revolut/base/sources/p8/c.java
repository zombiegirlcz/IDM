package p8;

import android.content.Context;
import android.graphics.Bitmap;
import c8.o;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import e8.e0;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class c implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f233798a;

    public c(o oVar) {
        y8.f.c(oVar, "Argument must not be null");
        this.f233798a = oVar;
    }

    @Override // c8.g
    public final boolean equals(Object obj2) {
        if (obj2 instanceof c) {
            return this.f233798a.equals(((c) obj2).f233798a);
        }
        return false;
    }

    @Override // c8.g
    public final int hashCode() {
        return this.f233798a.hashCode();
    }

    @Override // c8.o
    public final e0 transform(Context context, e0 e0Var, int i, int i2) {
        GifDrawable gifDrawable = (GifDrawable) e0Var.get();
        e0 cVar = new l8.c(gifDrawable.f26125a.f233797a.c(), com.bumptech.glide.b.a(context).f26073b);
        o oVar = this.f233798a;
        e0 e0VarTransform = oVar.transform(context, cVar, i, i2);
        if (!cVar.equals(e0VarTransform)) {
            cVar.recycle();
        }
        gifDrawable.f26125a.f233797a.i(oVar, (Bitmap) e0VarTransform.get());
        return e0Var;
    }

    @Override // c8.g
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f233798a.updateDiskCacheKey(messageDigest);
    }
}
