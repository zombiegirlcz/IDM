package k8;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.util.Log;
import android.util.Size;
import c8.j;
import c8.k;
import c8.l;
import l8.n;
import l8.p;
import l8.v;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements ImageDecoder.OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f182072a = v.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f182073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f182074c;
    public final c8.b d;
    public final n e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f182075g;

    public b(int i, int i2, k kVar) {
        this.f182073b = i;
        this.f182074c = i2;
        this.d = (c8.b) kVar.a(p.f);
        this.e = (n) kVar.a(n.f);
        j jVar = p.i;
        this.f = kVar.a(jVar) != null && ((Boolean) kVar.a(jVar)).booleanValue();
        this.f182075g = (l) kVar.a(p.f192742g);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        v vVar = this.f182072a;
        int width = this.f182073b;
        int height = this.f182074c;
        if (vVar.c(width, height, this.f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == c8.b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size size = imageInfo.getSize();
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(size.getHeight() * fB);
        if (Log.isLoggable("ImageDecoder", 2)) {
            String str = "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fB;
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        l lVar = this.f182075g;
        if (lVar != null) {
            imageDecoder.setTargetColorSpace(ColorSpace.get((lVar == l.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        }
    }
}
