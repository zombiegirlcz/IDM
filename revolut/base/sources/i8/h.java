package i8;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes16.dex */
public final class h implements com.bumptech.glide.load.data.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources.Theme f159368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f159369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f159370c;
    public final int d;
    public Object e;

    public h(Resources.Theme theme, Resources resources, g gVar, int i) {
        this.f159368a = theme;
        this.f159369b = resources;
        this.f159370c = gVar;
        this.d = i;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f159370c.f159364a) {
            case 0:
                return AssetFileDescriptor.class;
            case 1:
                return Drawable.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final c8.a b() {
        return c8.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.d dVar) {
        Object objOpenRawResourceFd;
        try {
            g gVar = this.f159370c;
            Resources.Theme theme = this.f159368a;
            Resources resources = this.f159369b;
            int i = this.d;
            switch (gVar.f159364a) {
                case 0:
                    objOpenRawResourceFd = resources.openRawResourceFd(i);
                    break;
                case 1:
                    objOpenRawResourceFd = ebm.a.p(gVar.f159365b, i, theme);
                    break;
                default:
                    objOpenRawResourceFd = resources.openRawResource(i);
                    break;
            }
            this.e = objOpenRawResourceFd;
            dVar.d(objOpenRawResourceFd);
        } catch (Resources.NotFoundException e) {
            dVar.e(e);
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cleanup() {
        Object obj2 = this.e;
        if (obj2 != null) {
            try {
                switch (this.f159370c.f159364a) {
                    case 0:
                        ((AssetFileDescriptor) obj2).close();
                        break;
                    case 1:
                        break;
                    default:
                        ((InputStream) obj2).close();
                        break;
                }
            } catch (IOException unused) {
            }
        }
    }
}
