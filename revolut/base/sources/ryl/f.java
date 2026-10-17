package ryl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f258430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v01.b f258431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f258432c;
    public p31.c d;
    public final p31.c e;
    public final p31.c f;

    public f(v01.b textStyle, p31.c cVar, int i) {
        cVar = (i & 16) != 0 ? wyl.b.f301310b : cVar;
        q31.d dVar = wyl.b.f301310b;
        Intrinsics.checkNotNullParameter("BOTTOM_DIALOG_TITLE_ID", "listId");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Intrinsics.checkNotNullParameter("BOTTOM_DIALOG_TITLE_ID", "listId");
        this.f258430a = "BOTTOM_DIALOG_TITLE_ID";
        this.f258431b = textStyle;
        this.f258432c = cVar;
        this.d = dVar;
        this.e = dVar;
        this.f = dVar;
    }

    @Override // ryl.a
    public final boolean a() {
        return false;
    }

    @Override // ryl.a, koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52148b() {
        return this.f258430a;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53367s() {
        return this.f258432c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53368t() {
        return this.d;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getV() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getU() {
        return this.e;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f258432c = cVar;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.d = cVar;
    }
}
