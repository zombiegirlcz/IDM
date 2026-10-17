package n8;

import android.graphics.ImageDecoder;
import android.os.Build;
import c8.k;
import c8.m;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import cpi.g;
import e8.e0;
import f8.f;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f213175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f213176b;

    public /* synthetic */ a(g gVar, int i) {
        this.f213175a = i;
        this.f213176b = gVar;
    }

    @Override // c8.m
    public final boolean a(Object obj2, k kVar) throws IOException {
        switch (this.f213175a) {
            case 0:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeR = hb9.b.r((ArrayList) this.f213176b.f107954b, (ByteBuffer) obj2);
                if (imageHeaderParser$ImageTypeR == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeR == ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                }
                break;
            default:
                g gVar = this.f213176b;
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeQ = hb9.b.q((ArrayList) gVar.f107954b, (InputStream) obj2, (f) gVar.f107955c);
                if (imageHeaderParser$ImageTypeQ == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeQ == ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                }
                break;
        }
        return true;
    }

    @Override // c8.m
    public final e0 b(Object obj2, int i, int i2, k kVar) {
        switch (this.f213175a) {
            case 0:
                return g.m(ImageDecoder.createSource((ByteBuffer) obj2), i, i2, kVar);
            default:
                return g.m(ImageDecoder.createSource(y8.b.b((InputStream) obj2)), i, i2, kVar);
        }
    }
}
