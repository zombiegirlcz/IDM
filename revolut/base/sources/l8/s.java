package l8;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class s implements c8.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c8.o f192749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f192750b;

    public s(c8.o oVar, boolean z) {
        this.f192749a = oVar;
        this.f192750b = z;
    }

    @Override // c8.g
    public final boolean equals(Object obj2) {
        if (obj2 instanceof s) {
            return this.f192749a.equals(((s) obj2).f192749a);
        }
        return false;
    }

    @Override // c8.g
    public final int hashCode() {
        return this.f192749a.hashCode();
    }

    @Override // c8.o
    public final e8.e0 transform(Context context, e8.e0 e0Var, int i, int i2) {
        f8.a aVar = com.bumptech.glide.b.a(context).f26073b;
        Drawable drawable = (Drawable) e0Var.get();
        c cVarA = r.a(aVar, drawable, i, i2);
        if (cVarA != null) {
            e8.e0 e0VarTransform = this.f192749a.transform(context, cVarA, i, i2);
            if (!e0VarTransform.equals(cVarA)) {
                return c.b(context.getResources(), e0VarTransform);
            }
            e0VarTransform.recycle();
            return e0Var;
        }
        if (!this.f192750b) {
            return e0Var;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // c8.g
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f192749a.updateDiskCacheKey(messageDigest);
    }
}
