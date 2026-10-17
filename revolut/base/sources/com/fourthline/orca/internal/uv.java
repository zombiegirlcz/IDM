package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class uv implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qv f34195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f34197c;
    private final e4m.e d;

    private uv(qv qvVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f34195a = qvVar;
        this.f34196b = eVar;
        this.f34197c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wd1 get() {
        return a(this.f34195a, (ts) this.f34196b.get(), (ry) this.f34197c.get(), (lz) this.d.get());
    }

    public static uv a(qv qvVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new uv(qvVar, eVar, eVar2, eVar3);
    }

    public static wd1 a(qv qvVar, ts tsVar, ry ryVar, lz lzVar) {
        wd1 wd1VarA = qvVar.a(tsVar, ryVar, lzVar);
        vc.s.k(wd1VarA);
        return wd1VarA;
    }
}
