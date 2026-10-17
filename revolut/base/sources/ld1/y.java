package ld1;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class y implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f194011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f194012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f194013c;

    public y(l lVar, d dVar) {
        this.f194011a = dVar;
        int i = 15;
        this.f194012b = e4m.b.b(new l9f.z(lVar, this, 1, i));
        this.f194013c = e4m.b.b(new l9f.z(lVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // sji.b
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
