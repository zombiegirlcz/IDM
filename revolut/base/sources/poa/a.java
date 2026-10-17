package poa;

import bq.i;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pdfsave.ui.pdfnativesave.PdfNativeSaveContract$Configuration;
import e4m.e;
import fsi.g;
import gsi.h;
import java.util.Set;
import pa6.f;
import ty0.c;
import xoi.d;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f237946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h7a.a f237947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PdfNativeSaveContract$Configuration f237948c;
    public final e d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f237949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f237950h;

    public a(b bVar, d dVar, PdfNativeSaveContract$Configuration pdfNativeSaveContract$Configuration, h7a.a aVar) {
        this.f237946a = dVar;
        this.f237947b = aVar;
        this.f237948c = pdfNativeSaveContract$Configuration;
        int i = 19;
        this.d = e4m.b.b(new f(bVar, this, 0, i));
        this.e = e4m.b.b(new f(bVar, this, 1, i));
        this.f = e4m.b.b(new f(bVar, this, 3, i));
        this.f237949g = e4m.b.b(new f(bVar, this, 2, i));
        this.f237950h = e4m.b.b(new f(bVar, this, 4, i));
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return i.j(this.f237946a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f237946a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f237946a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f237946a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f237946a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f237946a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f237946a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f237946a);
    }

    @Override // gsi.a
    public final c b0() {
        return i.g(this.f237946a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f237946a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f237946a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f237946a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(4);
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(this.f237946a));
        builderBuilderWithExpectedSize.add(this.d.get());
        builderBuilderWithExpectedSize.add(this.e.get());
        return j6.a.g(this.f237949g, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f237946a);
    }
}
