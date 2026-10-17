package com.fourthline.vision.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class md implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ed f36577a;

    private md(ed edVar) {
        this.f36577a = edVar;
    }

    public static a9 b(ed edVar) {
        a9 a9VarProvideMetadataRepository = edVar.provideMetadataRepository();
        vc.s.k(a9VarProvideMetadataRepository);
        return a9VarProvideMetadataRepository;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a9 get() {
        return b(this.f36577a);
    }

    public static md a(ed edVar) {
        return new md(edVar);
    }
}
