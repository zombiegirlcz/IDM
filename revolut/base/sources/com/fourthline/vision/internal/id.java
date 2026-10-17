package com.fourthline.vision.internal;

import android.media.ImageReader;
import android.os.Handler;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes23.dex */
public final class id implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ed f36373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f36374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f36375c;
    private final e4m.e d;

    private id(ed edVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f36373a = edVar;
        this.f36374b = eVar;
        this.f36375c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public k7 get() {
        return a(this.f36373a, (ImageReader) this.f36374b.get(), (Handler) this.f36375c.get(), (CoroutineContext) this.d.get());
    }

    public static id a(ed edVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new id(edVar, eVar, eVar2, eVar3);
    }

    public static k7 a(ed edVar, ImageReader imageReader, Handler handler, CoroutineContext coroutineContext) {
        k7 k7VarProvideImageDataSource = edVar.provideImageDataSource(imageReader, handler, coroutineContext);
        vc.s.k(k7VarProvideImageDataSource);
        return k7VarProvideImageDataSource;
    }
}
