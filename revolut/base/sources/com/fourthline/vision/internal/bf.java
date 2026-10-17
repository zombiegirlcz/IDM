package com.fourthline.vision.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class bf implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final af f36025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f36026b;

    private bf(af afVar, e4m.e eVar) {
        this.f36025a = afVar;
        this.f36026b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public zf get() {
        return a(this.f36025a, (s) this.f36026b.get());
    }

    public static bf a(af afVar, e4m.e eVar) {
        return new bf(afVar, eVar);
    }

    public static zf a(af afVar, s sVar) {
        zf zfVarProvideImageProducer = afVar.provideImageProducer(sVar);
        vc.s.k(zfVarProvideImageProducer);
        return zfVarProvideImageProducer;
    }
}
