package com.fourthline.vision.internal;

import android.media.ImageReader;

/* JADX INFO: loaded from: classes23.dex */
public final class jd implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ed f36422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f36423b;

    private jd(ed edVar, e4m.e eVar) {
        this.f36422a = edVar;
        this.f36423b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ImageReader get() {
        return a(this.f36422a, (b0) this.f36423b.get());
    }

    public static jd a(ed edVar, e4m.e eVar) {
        return new jd(edVar, eVar);
    }

    public static ImageReader a(ed edVar, b0 b0Var) {
        ImageReader imageReaderProvideImageReader = edVar.provideImageReader(b0Var);
        vc.s.k(imageReaderProvideImageReader);
        return imageReaderProvideImageReader;
    }
}
