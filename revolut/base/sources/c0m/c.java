package c0m;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.j;
import com.bumptech.glide.n;
import java.io.File;
import u8.h;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends n {
    @Override // com.bumptech.glide.n
    public final j h(Class cls) {
        return new b(this.f26135a, this, cls, this.f26136b);
    }

    @Override // com.bumptech.glide.n
    public final j i() {
        return (b) super.i();
    }

    @Override // com.bumptech.glide.n
    public final j j() {
        return (b) h(Drawable.class);
    }

    @Override // com.bumptech.glide.n
    public final j k() {
        return (b) super.k();
    }

    @Override // com.bumptech.glide.n
    public final j l() {
        return (b) super.l();
    }

    @Override // com.bumptech.glide.n
    public final j o() {
        return (b) super.o();
    }

    @Override // com.bumptech.glide.n
    public final j p(Bitmap bitmap) {
        return (b) super.p(bitmap);
    }

    @Override // com.bumptech.glide.n
    public final j q(Drawable drawable) {
        return (b) super.q(drawable);
    }

    @Override // com.bumptech.glide.n
    public final j r(Uri uri2) {
        return (b) super.r(uri2);
    }

    @Override // com.bumptech.glide.n
    public final j s(File file) {
        return (b) super.s(file);
    }

    @Override // com.bumptech.glide.n
    public final j t(Object obj2) {
        return (b) super.t(obj2);
    }

    @Override // com.bumptech.glide.n
    public final j u(String str) {
        return (b) super.u(str);
    }

    @Override // com.bumptech.glide.n
    public final void x(h hVar) {
        if (hVar instanceof a) {
            super.x(hVar);
        } else {
            super.x(new a().N(hVar));
        }
    }
}
