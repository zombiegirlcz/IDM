package voi;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final class k implements sg0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ui0.l f290990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f290991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f290992c;

    public k(i iVar) {
        this.f290990a = iVar.b().e;
        this.f290991b = new a(iVar, 16);
        this.f290992c = new a(iVar, 17);
    }

    @Override // sg0.c
    public final ui0.l a() {
        return this.f290990a;
    }

    @Override // sg0.c
    public final Function0 b() {
        return this.f290992c;
    }

    @Override // sg0.c
    public final boolean c() {
        return true;
    }

    @Override // sg0.c
    public final Function0 d() {
        return this.f290991b;
    }
}
