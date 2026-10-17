package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class sl implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ol f33045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33046b;

    private sl(ol olVar, e4m.e eVar) {
        this.f33045a = olVar;
        this.f33046b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c80 get() {
        return a(this.f33045a, (ml) this.f33046b.get());
    }

    public static sl a(ol olVar, e4m.e eVar) {
        return new sl(olVar, eVar);
    }

    public static c80 a(ol olVar, ml mlVar) {
        c80 c80VarB = olVar.b(mlVar);
        vc.s.k(c80VarB);
        return c80VarB;
    }
}
